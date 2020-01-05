package com.bellatorhd.rmportalsmod.setup;

import net.minecraft.world.World;

public interface IProxy {

    void init();

    World getClientWorld();
}
