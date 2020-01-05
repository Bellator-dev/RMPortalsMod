package com.bellatorhd.rmportalsmod.items;

import com.bellatorhd.rmportalsmod.RMPortalsMod;
import net.minecraft.item.Item;

public class IsotopeNugget extends Item {

    public IsotopeNugget() {
        super(new Item.Properties()
                .maxStackSize(16)
                .group(RMPortalsMod.setup.itemGroup));
        setRegistryName("isotopenugget");
    }

}
