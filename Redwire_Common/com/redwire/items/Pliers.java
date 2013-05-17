package com.redwire.items;

import com.redwire.Redwire;

public class Pliers extends RWItem {
  
  public Pliers(int id) {
    super(id);
    setFull3D();
    setMaxStackSize(1);
    setUnlocalizedName("Pliers");
    setCreativeTab(Redwire.Redtab);
  }

}
