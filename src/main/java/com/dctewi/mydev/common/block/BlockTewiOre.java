package com.dctewi.mydev.common.block;

import com.dctewi.mydev.common.CreativeTab.CreativeTabsMyDev;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockTewiOre extends Block
{
    public BlockTewiOre()
    {
        super(Material.ROCK);

        setSoundType(SoundType.STONE);
        setHardness(15.0f);
        setHarvestLevel("pickaxe", 2);

        setUnlocalizedName("tewiOre");
        setRegistryName("tewi_ore");
        setCreativeTab(CreativeTabsMyDev.tabMyDev);
    }
}
