package com.redwire.machines;

import com.redwire.Redwire;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Insulator extends Block {

  public Insulator() {
    super(Redwire.insulatorID, Material.grass);
    setCreativeTab(Redwire.Redtab);
    setUnlocalizedName("Wire Insulator");
    setHardness(0.5F);
    setStepSound(Block.soundGrassFootstep);
  }
}
