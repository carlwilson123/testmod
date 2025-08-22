package com.example.examplemod;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;

public class CustomSword extends SwordItem{
    public CustomSword(){

        super(Tiers.NETHERITE, 0, 10F, new Item.Properties().tab(CreativeModeTabs.COMBAT));

    }
}
