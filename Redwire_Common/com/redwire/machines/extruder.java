package com.redwire.machines;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class extruder extends Block {  
    
    public extruder(int id, CreativeTabs tabName) {  
     super(id, Material.grass);  
     setCreativeTab(tabName);  
     setUnlocalizedName("Wire extruder");  
     setHardness(0.5F);  
     setStepSound(Block.soundGrassFootstep);  
    }  
}
