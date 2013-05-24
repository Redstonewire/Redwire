package com.redwire.machines;

import com.redwire.Redwire;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Dyer extends BlockContainer
{

  public Dyer()
  {
    super(Redwire.dyerID, Material.cloth);
    setCreativeTab(Redwire.Redtab);
    setUnlocalizedName("Redwire:Dyer");
    setHardness(0.5F);
    setStepSound(Block.soundClothFootstep);
  }

@Override
public TileEntity createNewTileEntity(World world)
  {
    // TODO Auto-generated method stub
    return null;
  }
}