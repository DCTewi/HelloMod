package com.dctewi.mydev.common.skill;

import com.dctewi.mydev.MyDev;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.http.config.RegistryBuilder;

@Mod.EventBusSubscriber(modid = MyDev.MODID)
public class SkillManager
{
    private static RegistryBuilder<Skill> REGISTER;

    public static void register(Skill skill)
    {
        REGISTER.register(skill.getName().toString(), skill);
    }

    @SubscribeEvent
    public static void onNewRegistery(RegistryEvent.NewRegistry event)
    {
        REGISTER = RegistryBuilder.create();
    }
}
