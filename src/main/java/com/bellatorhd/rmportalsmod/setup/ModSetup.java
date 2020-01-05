package com.bellatorhd.rmportalsmod.setup;

import com.bellatorhd.rmportalsmod.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {

    public ItemGroup itemGroup = new ItemGroup("rmportalsmod") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.ISOTOPE322);
        }
    };

    public void init() {


    }

}
