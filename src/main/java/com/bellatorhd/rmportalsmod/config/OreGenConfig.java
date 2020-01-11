package com.bellatorhd.rmportalsmod.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class OreGenConfig {
    public static ForgeConfigSpec.IntValue isotope322_chance;
    public static void init(ForgeConfigSpec.Builder server, ForgeConfigSpec.Builder client) {

        server.comment("Oregen Config");

        isotope322_chance = server
                .comment("Maximum number of ore veins of the Isotope 322 ore that can spawn in one chunk")
                .defineInRange("oregen.isotope322_chance", 1, 1, 2);

    }
}
