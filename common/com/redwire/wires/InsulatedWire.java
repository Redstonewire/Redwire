package com.redwire.wires;

import com.redwire.Redwire;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class InsulatedWire extends Block {

  public InsulatedWire() {
    super(Redwire.insulatedWireID, Material.cloth);
    setCreativeTab(Redwire.Redtab);
    setUnlocalizedName("Redwire:InsulatedRedMetalWire");
    setHardness(0.5F);
    setStepSound(Block.soundClothFootstep);
  }
}
