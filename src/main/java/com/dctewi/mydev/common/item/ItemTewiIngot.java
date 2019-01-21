package com.dctewi.mydev.common.item;

import com.dctewi.mydev.common.CreativeTab.CreativeTabsMyDev;
import net.minecraft.item.Item;

public class ItemTewiIngot extends Item
{
    public ItemTewiIngot()
    {
        super();
        setUnlocalizedName("tewiIngot");
        setRegistryName("tewi_ingot");
        setCreativeTab(CreativeTabsMyDev.tabMyDev);
    }
}
