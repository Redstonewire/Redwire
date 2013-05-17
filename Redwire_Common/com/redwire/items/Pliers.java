package com.redwire.items;

import com.redwire.Redwire;

import net.minecraft.item.Item;

public class Pliers extends Item {
  static final private String NAME = "Pliers";

  public Pliers(int id) {
    super(id);
    setFull3D();
    setMaxStackSize(1);
    setUnlocalizedName(NAME);
    setCreativeTab(Redwire.Redtab);
  }

  public String getUnlocalizedName2() {
    return NAME;
  }
}
