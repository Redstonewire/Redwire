package com.redwire.machines;

import com.redwire.Redwire;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class insulator extends Block {  
    
    public insulator() {    
        super(Redwire.insulatorID, Material.grass);    
        setCreativeTab(Redwire.Redtab);  
        setUnlocalizedName("Wire Insulator");    
        setHardness(0.5F);    
        setStepSound(Block.soundGrassFootstep);    
        GameRegistry.registerBlock(Redwire.Insulator, this.getUnlocalizedName());  
        LanguageRegistry.addName(Redwire.Insulator, this.getUnlocalizedName2());  
       }    
   }
