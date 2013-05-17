package com.redwire.lib;

import net.minecraft.item.Item;

public class RWItem extends Item {

  private String Name;

  public RWItem(int ID) {
    super(ID);
  }

  public RWItem setUnlocalizedName(String par1Str)
  {
      super.setUnlocalizedName(par1Str);
      this.Name = par1Str;
      return this;
  }
  
  public String getUnlocalizedName2() {
    return this.Name;
  }

}
