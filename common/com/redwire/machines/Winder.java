package com.redwire.machines;

import com.redwire.Redwire;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Winder extends Block {

  public Winder() {
    super(Redwire.winderID, Material.grass);
    setCreativeTab(Redwire.Redtab);
    setUnlocalizedName("Redwire:WireWinder");
    setHardness(0.5F);
    setStepSound(Block.soundGrassFootstep);
  }
}
