package com.redwire.machines;

import com.redwire.Redwire;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Dyer extends Block {

  public Dyer() {
    super(Redwire.dyerID, Material.cloth);
    setCreativeTab(Redwire.Redtab);
    setUnlocalizedName("Wire Dyeing Machine");
    setHardness(0.5F);
    setStepSound(Block.soundClothFootstep);
  }
}
