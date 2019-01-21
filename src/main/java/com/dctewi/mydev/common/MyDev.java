package com.dctewi.mydev;

import com.dctewi.mydev.common.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = MyDev.MODID, name = MyDev.NAME, version = MyDev.VERSION)
public class MyDev
{
    public static final String MODID = "mydev";
    public static final String NAME = "DCTewi's DevMod";
    public static final String VERSION = "1.0";

    @SidedProxy(clientSide = "com.dctewi.mydev.client.ClientProxy", serverSide = "com.dctewi.mydev.common.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance(MODID)
    public static MyDev instance;

    private Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    public Logger getLogger()
    {
        return logger;
    }
}
