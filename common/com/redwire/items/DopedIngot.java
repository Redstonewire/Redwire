package com.redwire.items;

import com.redwire.Redwire;
import com.redwire.lib.RWItem;

public class DopedIngot extends RWItem {
  
  public DopedIngot(int id) {
    super(id);
    setFull3D();
    setMaxStackSize(16);
    setUnlocalizedName("Doped Ingot");
    setCreativeTab(Redwire.Redtab);
  }

};
