package com.bellatorhd.rmportalsmod.items;

import com.bellatorhd.rmportalsmod.RMPortalsMod;
import net.minecraft.item.Item;

public class PortalFluidBucket extends Item {

    public PortalFluidBucket() {
        super(new Item.Properties()
                .maxStackSize(1)
                .group(RMPortalsMod.setup.itemGroup));
        setRegistryName("portalfluid_bucket");

    }
}
