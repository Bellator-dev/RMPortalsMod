package com.bellatorhd.rmportalsmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Isotope322 extends Block {

    public Isotope322() {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(4.0f)

        );
        setRegistryName("isotope322");
    }
}
