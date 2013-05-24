package com.redwire.machines;

import com.redwire.Redwire;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Extruder extends BlockContainer {

  public Extruder()
  {
    super(Redwire.extruderID, Material.grass);
    setCreativeTab(Redwire.Redtab);
    setUnlocalizedName("Redwire:WireExtruder");
    setHardness(0.5F);
    setStepSound(Block.soundGrassFootstep);
  }

@Override
public TileEntity createNewTileEntity(World world) {
    // TODO Auto-generated method stub
    return null;
}
}
