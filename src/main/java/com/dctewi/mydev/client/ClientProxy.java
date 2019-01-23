package com.dctewi.mydev.client;

import com.dctewi.mydev.client.event.MyDevClientEventHandler;
import com.dctewi.mydev.common.CommonProxy;
import com.dctewi.mydev.common.block.MyDevBlocks;
import com.dctewi.mydev.common.item.MyDevItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy
{
    @Override
    public void preInit(FMLPreInitializationEvent event)
    {
        super.preInit(event);
        MyDevItems.ClientInit();
        MyDevBlocks.ClientInit();
    }

    @Override
    public void init(FMLInitializationEvent event)
    {
        super.init(event);
        MyDevClientEventHandler.init();
    }
}
