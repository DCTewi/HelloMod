package com.dctewi.mydev.common.event;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class PlayerJumpEvent extends PlayerEvent
{
    public PlayerJumpEvent(EntityPlayer player)
    {
        super(player);
    }
}
