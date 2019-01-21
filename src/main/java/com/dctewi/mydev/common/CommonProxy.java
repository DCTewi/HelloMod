package com.dctewi.mydev.common;

import com.dctewi.mydev.common.block.MyDevBlocks;
import com.dctewi.mydev.common.item.MyDevItems;
import com.dctewi.mydev.common.world.gen.OreGenEventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
        MyDevBlocks.init();
        MyDevItems.init();
    }

    public void init(FMLInitializationEvent event)
    {
        MyDevItems.addSmelting();
        OreGenEventHandler.init();
    }
}
