package com.dctewi.mydev.common.CreativeTab;

import com.dctewi.mydev.common.item.MyDevItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;


public class CreativeTabsMyDev extends CreativeTabs
{
    public static CreativeTabsMyDev tabMyDev = new CreativeTabsMyDev();

    public CreativeTabsMyDev()
    {
        super("mydev");
        setBackgroundImageName("mydev.png");
    }

    public ItemStack getTabIconItem()
    {
        return new ItemStack(MyDevItems.itemTewiSword);
    }
}
