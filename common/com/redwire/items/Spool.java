package com.redwire.items;

import com.redwire.Redwire;
import com.redwire.lib.RWItem;

public class Spool extends RWItem {

  public Spool(int id) {
    super(id);
    setFull3D();
    setMaxStackSize(1);
    setMaxDamage(256);
    setUnlocalizedName("Redwire:Spool");
    setCreativeTab(Redwire.Redtab);
  }

}
