package com.redwire.machines;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.*;

public class winder extends Block {  
    
    public winder(int id, CreativeTabs tabName) {  
     super(id, Material.grass);  
     setCreativeTab(tabName);  
     setUnlocalizedName("Spool Winder");  
     setHardness(0.5F);  
     setStepSound(Block.soundClothFootstep);  
    }  
}
