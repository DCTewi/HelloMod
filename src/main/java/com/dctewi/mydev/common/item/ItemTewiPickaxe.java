package com.dctewi.mydev.common.item;

import com.dctewi.mydev.common.CreativeTab.CreativeTabsMyDev;
import net.minecraft.item.ItemPickaxe;

public class ItemTewiPickaxe extends ItemPickaxe
{
    public ItemTewiPickaxe()
    {
        super(ToolMaterial.DIAMOND);

        setUnlocalizedName("tewiPickaxe");
        setRegistryName("tewi_pickaxe");
        setCreativeTab(CreativeTabsMyDev.tabMyDev);
    }
}
