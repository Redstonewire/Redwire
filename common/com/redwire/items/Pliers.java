package com.redwire.items;

import com.redwire.Redwire;
import com.redwire.lib.RWItem;

public class Pliers extends RWItem {
  
  public Pliers(int id) {
    super(id);
    setFull3D();
    setMaxStackSize(1);
    setUnlocalizedName("Redwire:Pliers");
    setCreativeTab(Redwire.Redtab);
  }

}
