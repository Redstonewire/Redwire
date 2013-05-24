package com.redwire.wires;

import com.redwire.Redwire;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Wire extends Block {

  public Wire() {
    super(Redwire.redwireID, Material.cloth);
    setCreativeTab(Redwire.Redtab);
    setUnlocalizedName("Redwire:RedMetalWire");
    setHardness(0.5F);
    setStepSound(Block.soundClothFootstep);
  }
}
