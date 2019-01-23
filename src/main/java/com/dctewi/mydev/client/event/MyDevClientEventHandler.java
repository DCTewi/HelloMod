package com.dctewi.mydev.client.event;

import com.dctewi.mydev.MyDev;
import com.dctewi.mydev.common.network.MyDevNetworkHandler;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.relauncher.Side;
import org.lwjgl.input.Keyboard;

@Mod.EventBusSubscriber(modid = MyDev.MODID, value = Side.CLIENT)
public class MyDevClientEventHandler
{
    private static KeyBinding keyUseSkill = new KeyBinding("mydev.useskill", Keyboard.KEY_M, "mydev.key");

    public static void init()
    {
        ClientRegistry.registerKeyBinding(keyUseSkill);
    }

    @SubscribeEvent
    public static void onKeyInput(InputEvent.KeyInputEvent event)
    {
        if (keyUseSkill.isPressed())
        {
            MyDevNetworkHandler.useSkill();
        }
    }
}
