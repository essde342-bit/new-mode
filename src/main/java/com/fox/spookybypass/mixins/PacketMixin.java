package com.fox.spookybypass.mixins;

import net.minecraft.network.ClientConnection;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(ClientConnection.class)
public abstract class PacketMixin {
    // Intentionally empty scaffold.
    // No packet manipulation is performed here.
}
