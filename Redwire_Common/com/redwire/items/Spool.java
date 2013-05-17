package com.redwire.items;

import com.redwire.Redwire;

public class Spool extends RWItem {

  public Spool(int id) {
    super(id);
    setFull3D();
    setMaxStackSize(1);
    setMaxDamage(256);
    setUnlocalizedName("Wire Spool");
    setCreativeTab(Redwire.Redtab);
  }

}
