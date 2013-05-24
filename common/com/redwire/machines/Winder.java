package com.redwire.machines;

import com.redwire.Redwire;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class Winder extends BlockContainer {

  public Winder()
  {
    super(Redwire.winderID, Material.grass);
    setCreativeTab(Redwire.Redtab);
    setUnlocalizedName("Redwire:WireWinder");
    setHardness(0.5F);
    setStepSound(Block.soundGrassFootstep);
  }

  @SideOnly(Side.CLIENT)
  private Icon WireWinderinputside;
  @SideOnly(Side.CLIENT)
  private Icon WireWinderFront;

   public void onBlockAdded(World par1World, int par2, int par3, int par4)
  {
      super.onBlockAdded(par1World, par2, par3, par4);
      this.setDefaultDirection(par1World, par2, par3, par4);
  }

  private void setDefaultDirection(World par1World, int par2, int par3, int par4)
  {
      if (!par1World.isRemote)
      {
          int l = par1World.getBlockId(par2, par3, par4 - 1);
          int i1 = par1World.getBlockId(par2, par3, par4 + 1);
          int j1 = par1World.getBlockId(par2 - 1, par3, par4);
          int k1 = par1World.getBlockId(par2 + 1, par3, par4);
          byte b0 = 3;

          if (Block.opaqueCubeLookup[l] && !Block.opaqueCubeLookup[i1])
          {
              b0 = 3;
          }

          if (Block.opaqueCubeLookup[i1] && !Block.opaqueCubeLookup[l])
          {
              b0 = 2;
          }

          if (Block.opaqueCubeLookup[j1] && !Block.opaqueCubeLookup[k1])
          {
              b0 = 5;
          }

          if (Block.opaqueCubeLookup[k1] && !Block.opaqueCubeLookup[j1])
          {
              b0 = 4;
          }

          par1World.setBlockMetadataWithNotify(par2, par3, par4, b0, 2);
      }
  }

  @SideOnly(Side.CLIENT)

  public Icon getIcon(int par1, int par2)
  {
      return par1 == 1 ? this.WireWinderinputside : (par1 == 0 ? this.WireWinderinputside : (par1 != par2 ? this.blockIcon : this.WireWinderFront));
  }

  @SideOnly(Side.CLIENT)

  public void registerIcons(IconRegister par1IconRegister)
  {
      this.blockIcon = par1IconRegister.registerIcon("Redwire:WireWindersides");
      this.WireWinderFront = par1IconRegister.registerIcon("Redwire:WireWinderFront");
      this.WireWinderinputside = par1IconRegister.registerIcon("Redwire:WireWinderinputside");
  }
  
@Override
public TileEntity createNewTileEntity(World world) {
    // TODO Auto-generated method stub
    return null;
}
}
