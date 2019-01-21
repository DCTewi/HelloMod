package com.dctewi.mydev.common.item;

import com.dctewi.mydev.common.CreativeTab.CreativeTabsMyDev;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ItemTewiSword extends ItemSword
{
    public ItemTewiSword()
    {
        super(EnumHelper.addToolMaterial("TEWISWORD", 4, 1561, 9.0f, 8, 14));

        setUnlocalizedName("tewiSword");
        setRegistryName("tewi_sword");
        setCreativeTab(CreativeTabsMyDev.tabMyDev);
    }
}
