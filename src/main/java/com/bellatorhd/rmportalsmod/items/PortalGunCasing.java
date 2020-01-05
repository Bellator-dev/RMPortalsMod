package com.bellatorhd.rmportalsmod.items;

import com.bellatorhd.rmportalsmod.RMPortalsMod;
import net.minecraft.item.Item;

public class PortalGunCasing extends Item {

    public PortalGunCasing() {
        super(new Item.Properties()
                .maxStackSize(1)
                .group(RMPortalsMod.setup.itemGroup));
        setRegistryName("portalgun_casing");
    }
}
