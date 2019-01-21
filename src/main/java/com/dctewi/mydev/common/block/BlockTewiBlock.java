package com.dctewi.mydev.common.block;

import com.dctewi.mydev.common.CreativeTab.CreativeTabsMyDev;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockTewiBlock extends Block
{
    public BlockTewiBlock()
    {
        super(Material.IRON);

        setSoundType(SoundType.METAL);
        setHardness(15.0f);
        setHarvestLevel("pickaxe", 2);
        setLightLevel(10);

        setUnlocalizedName("tewiBlock");
        setRegistryName("tewi_block");
        setCreativeTab(CreativeTabsMyDev.tabMyDev);
    }
}
