package com.dctewi.mydev.common.network;

import com.dctewi.mydev.MyDev;
import com.dctewi.mydev.common.network.message.MessageSkill;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MyDevNetworkHandler
{
    private static SimpleNetworkWrapper networkWrapper = NetworkRegistry.INSTANCE.newSimpleChannel(MyDev.MODID);

    public static void init()
    {
        networkWrapper.registerMessage(MessageSkill::onMessage, MessageSkill.class, 0, Side.SERVER);
    }

    @SideOnly(Side.CLIENT)
    public static void useSkill()
    {
        networkWrapper.sendToServer(new MessageSkill());
    }
}
