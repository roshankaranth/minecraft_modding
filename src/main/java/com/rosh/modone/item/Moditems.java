package com.rosh.modone.item;

import com.mojang.brigadier.LiteralMessage;
import com.rosh.modone.modone;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.EventBus;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS=
            DeferredRegister.create(ForgeRegistries.ITEMS, modone.MODID);

    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine",
            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> RAW_CITRINE = ITEMS.register("raw_citrine",
            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
