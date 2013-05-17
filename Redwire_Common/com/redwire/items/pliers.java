package com.redwire.items;

import com.redwire.Redwire;

import net.minecraft.item.Item;

public class pliers extends Item
{
    public pliers(int id)
    {
        super(id);
        setFull3D();
        setMaxStackSize(1);
        setUnlocalizedName("pliers");
        setCreativeTab(Redwire.Redtab);
    }

}
