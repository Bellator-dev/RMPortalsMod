package com.bellatorhd.rmportalsmod.items;

import com.bellatorhd.rmportalsmod.RMPortalsMod;
import net.minecraft.item.Item;

public class MeeseeksBox extends Item {

    public MeeseeksBox() {
        super(new Item.Properties()
                .maxStackSize(1)
                .group(RMPortalsMod.setup.itemGroup));
        setRegistryName("meeseeks_box");

    }
}
