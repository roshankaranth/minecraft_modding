package com.rosh.modone.block;

import com.rosh.modone.item.Moditems;
import com.rosh.modone.modone;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;



public class Modblocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, modone.MODID);

    public static final RegistryObject<Block> CITRINE_BLOCK = registerBlocks("citrine_block",()->new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<Block> CITRINE_ORE = registerBlocks("citrine_ore",()->new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<Block> DEEPSLATE_CITRINE_ORE = registerBlocks("deepslate_citrine_ore",()->new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<Block> ENDSTONE_CITRINE_ORE = registerBlocks("endstone_citrine_ore",()->new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<Block> NETHERRACK_CITRINE_ORE= registerBlocks("netherrack_citrine_ore",()->new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()),CreativeModeTab.TAB_MISC);
    public static final RegistryObject<Block> RAW_CITRINE_BLOCK = registerBlocks("raw_citrine_block",()->new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()),CreativeModeTab.TAB_MISC);

    private static<T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return Moditems.ITEMS.register(name,()->new BlockItem(block.get(),new Item.Properties().tab(tab)));
    }

    private static<T extends Block> RegistryObject<T> registerBlocks(String name, Supplier<T> block,CreativeModeTab tab){
        RegistryObject<T> toReturn =  BLOCKS.register(name,block);
        registerBlockItem(name,toReturn,tab);
        return toReturn;
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
