package com.dctewi.mydev.common.item;

import com.dctewi.mydev.common.CreativeTab.CreativeTabsMyDev;
import net.minecraft.item.ItemSpade;

public class ItemTewiShovel extends ItemSpade
{
    public ItemTewiShovel()
    {
        super(ToolMaterial.DIAMOND);

        setUnlocalizedName("tewiShovel");
        setRegistryName("tewi_shovel");
        setCreativeTab(CreativeTabsMyDev.tabMyDev);
    }
}
