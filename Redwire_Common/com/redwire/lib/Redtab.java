package com.redwire.lib;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Redtab extends CreativeTabs {

  public Redtab(String redwiretab) {
    super(redwiretab);
  }

  @SideOnly(Side.CLIENT)
  public int getTabIconItemIndex() {
    return Item.redstoneRepeater.itemID;
  }

  public String getTranslatedTabLabel() {
    return "Redwire Tab";
  }

}
