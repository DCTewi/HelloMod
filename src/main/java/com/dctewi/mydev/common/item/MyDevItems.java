package com.dctewi.mydev.common.item;

import com.dctewi.mydev.common.block.MyDevBlocks;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

public class MyDevItems
{
    public static ItemTewiIngot itemTewiIngot = new ItemTewiIngot();
    public static ItemTewiSword itemTewiSword = new ItemTewiSword();
    public static ItemTewiPickaxe itemTewiPickaxe = new ItemTewiPickaxe();
    public static ItemTewiAxe itemTewiAxe = new ItemTewiAxe();
    public static ItemTewiShovel itemTewiShovel = new ItemTewiShovel();

    public static void init()
    {
        ForgeRegistries.ITEMS.register(itemTewiIngot);
        ForgeRegistries.ITEMS.register(itemTewiSword);
        ForgeRegistries.ITEMS.register(itemTewiPickaxe);
        ForgeRegistries.ITEMS.register(itemTewiAxe);
        ForgeRegistries.ITEMS.register(itemTewiShovel);

        OreDictionary.registerOre("ingotTewi", itemTewiIngot);
    }

    @SideOnly(Side.CLIENT)
    public static void ClientInit()
    {
        ModelLoader.setCustomModelResourceLocation(itemTewiIngot, 0,
                new ModelResourceLocation(itemTewiIngot.getRegistryName(), "inventory"));

        ModelLoader.setCustomModelResourceLocation(itemTewiSword, 0,
                new ModelResourceLocation(itemTewiSword.getRegistryName(), "inventory"));

        ModelLoader.setCustomModelResourceLocation(itemTewiPickaxe, 0,
                new ModelResourceLocation(itemTewiPickaxe.getRegistryName(), "inventory"));

        ModelLoader.setCustomModelResourceLocation(itemTewiAxe, 0,
                new ModelResourceLocation(itemTewiAxe.getRegistryName(), "inventory"));

        ModelLoader.setCustomModelResourceLocation(itemTewiShovel, 0,
                new ModelResourceLocation(itemTewiShovel.getRegistryName(), "inventory"));
    }

    public static void addSmelting()
    {
        GameRegistry.addSmelting(MyDevBlocks.blockTewiOre, new ItemStack(itemTewiIngot), 0.5f);
    }
}
