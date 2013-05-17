package com.redwire.items;

import com.redwire.Redwire;

import net.minecraft.item.Item;

public class spools extends Item {

    public spools(int id)
    {
        super(id);
        setFull3D();
        setMaxStackSize(1);
        setMaxDamage(256);
        setUnlocalizedName("Wire Spool");
        setCreativeTab(Redwire.Redtab);
    }

}
