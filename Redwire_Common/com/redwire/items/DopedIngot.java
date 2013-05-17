package com.redwire.items;

import com.redwire.Redwire;

import net.minecraft.item.Item;

public class DopedIngot extends Item {
  static final private String NAME = "Doped Ingot";

  public DopedIngot(int id) {
    super(id);
    setFull3D();
    setMaxStackSize(16);
    setUnlocalizedName(NAME);
    setCreativeTab(Redwire.Redtab);
  }

  public String getUnlocalizedName2() {
    return NAME;
  }
};
