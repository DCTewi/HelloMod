package com.dctewi.mydev.common.item;

import com.dctewi.mydev.common.CreativeTab.CreativeTabsMyDev;
import net.minecraft.item.ItemAxe;

public class ItemTewiAxe extends ItemAxe
{
    public ItemTewiAxe()
    {
        super(ToolMaterial.DIAMOND);

        setUnlocalizedName("tewiAxe");
        setRegistryName("tewi_axe");
        setCreativeTab(CreativeTabsMyDev.tabMyDev);
    }
}
