package com.redwire.machines;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class dyer extends Block {  
    
    public dyer(int id, CreativeTabs tabName) {  
     super(id, Material.grass);  
     setCreativeTab(tabName);  
     setUnlocalizedName("Insualtion Dyer");  
     setHardness(0.5F);  
     setStepSound(Block.soundGrassFootstep);  
    }  
}
