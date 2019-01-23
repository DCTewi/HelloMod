package com.dctewi.mydev.common.event;

import com.dctewi.mydev.MyDev;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventBus;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = MyDev.MODID)
public class MyDevEventHandler
{
    public static final EventBus EVENT_BUS = new EventBus();

    public static void init()
    {
        EVENT_BUS.register(MyDevEventHandler.class);
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void onLivingJump(LivingEvent.LivingJumpEvent event)
    {
        if (!(event.getEntityLiving() instanceof EntityPlayer)) return;
        EVENT_BUS.post(new PlayerJumpEvent((EntityPlayer)event.getEntityLiving()));
        /*
            EventBus#post(event) can Post the Event to Subscribers.
         */
    }

    @SubscribeEvent
    public static void onPlayerJump(PlayerJumpEvent event)
    {
        if (event.getEntityLiving().getEntityWorld().isRemote) return;
        MyDev.instance.getLogger().info("Player " + event.getEntityLiving().getName() + " Jumped");
    }

    /*
    @SubscribeEvent
    public static void onPlayerInteract(PlayerInteractEvent event)
    {
        if (event.getWorld().isRemote) return;

        event.setCanceled(true);
    }
    */
}
