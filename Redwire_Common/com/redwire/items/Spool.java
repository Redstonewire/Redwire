package com.redwire.items;

import com.redwire.Redwire;

import net.minecraft.item.Item;

public class Spool extends Item {

  static final private String NAME = "Wire Spool";

  public Spool(int id) {
    super(id);
    setFull3D();
    setMaxStackSize(1);
    setMaxDamage(256);
    setUnlocalizedName(NAME);
    setCreativeTab(Redwire.Redtab);
  }

  public String getUnlocalizedName2() {
    return NAME;
  }
}
