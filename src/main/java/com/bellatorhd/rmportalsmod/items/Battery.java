package com.bellatorhd.rmportalsmod.items;

import com.bellatorhd.rmportalsmod.RMPortalsMod;
import net.minecraft.item.Item;

public class Battery extends Item {

    public Battery() {
        super(new Item.Properties()
                .maxStackSize(1)
                .group(RMPortalsMod.setup.itemGroup));
        setRegistryName("battery");
    }
}

