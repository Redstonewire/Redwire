package com.redwire.wires;

import com.redwire.Redwire;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Wire extends Block {

  public Wire() {
    super(Redwire.redwireID, Material.cloth);
    setCreativeTab(Redwire.Redtab);
    setUnlocalizedName("Red-Metal Wire");
    setHardness(0.5F);
    setStepSound(Block.soundClothFootstep);
  }
}
