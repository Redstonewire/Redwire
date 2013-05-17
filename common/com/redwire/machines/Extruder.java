package com.redwire.machines;

import com.redwire.Redwire;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Extruder extends Block {

  public Extruder() {
    super(Redwire.extruderID, Material.grass);
    setCreativeTab(Redwire.Redtab);
    setUnlocalizedName("Wire Extruder");
    setHardness(0.5F);
    setStepSound(Block.soundGrassFootstep);
  }
}
