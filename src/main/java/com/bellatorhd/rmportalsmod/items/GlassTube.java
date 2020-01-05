package com.bellatorhd.rmportalsmod.items;

import com.bellatorhd.rmportalsmod.RMPortalsMod;
import net.minecraft.item.Item;

public class GlassTube extends Item {

    public GlassTube() {
        super(new Item.Properties()
                .maxStackSize(16)
                .group(RMPortalsMod.setup.itemGroup));
        setRegistryName("glass_tube");
    }
}
