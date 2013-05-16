package com.redwire.wires;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class redwire extends Block {  
    
    public redwire(int id, CreativeTabs tabName) {  
     super(id, Material.cloth);  
     setCreativeTab(tabName);
     setUnlocalizedName("Redstone Wire");  
     setHardness(0.5F);  
     setStepSound(Block.soundClothFootstep);  
    }  
}
