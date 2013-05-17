package com.redwire.items;
import com.redwire.Redwire;

import net.minecraft.item.Item;

public class dopedingots extends Item
{

    public dopedingots(int id)
    {
        super(id);
        setFull3D();
        setMaxStackSize(16);
        setUnlocalizedName("Doped Ingot");
        setCreativeTab(Redwire.Redtab);
    }

}