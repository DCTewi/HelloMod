package com.dctewi.mydev.common.block;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

public class MyDevBlocks
{
    public static BlockTewiOre blockTewiOre = new BlockTewiOre();
    public static BlockTewiBlock blockTewiBlock = new BlockTewiBlock();

    public static void init()
    {
        ForgeRegistries.BLOCKS.register(blockTewiOre);
        ForgeRegistries.BLOCKS.register(blockTewiBlock);
        ForgeRegistries.ITEMS.register(new ItemBlock(blockTewiOre).setRegistryName(blockTewiOre.getRegistryName()));
        ForgeRegistries.ITEMS.register(new ItemBlock(blockTewiBlock).setRegistryName(blockTewiBlock.getRegistryName()));

        OreDictionary.registerOre("oreTewi", blockTewiOre);
        OreDictionary.registerOre("blockTewi", blockTewiBlock);
    }

    @SideOnly(Side.CLIENT)
    public static void ClientInit()
    {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockTewiOre), 0,
                new ModelResourceLocation(blockTewiOre.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockTewiBlock), 0,
                new ModelResourceLocation(blockTewiBlock.getRegistryName(), "inventory"));
    }
}
