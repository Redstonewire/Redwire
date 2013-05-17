package com.redwire.machines;

import com.redwire.Redwire;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class dyer extends Block {  
    
    public dyer() {    
        super(Redwire.dyerID, Material.cloth);    
        setCreativeTab(Redwire.Redtab);  
        setUnlocalizedName("Redstone Wire");    
        setHardness(0.5F);    
        setStepSound(Block.soundClothFootstep);    
        GameRegistry.registerBlock(Redwire.Dyer, getUnlocalizedName());  
        LanguageRegistry.addName(Redwire.Redwire, getUnlocalizedName2());  
       }    
   }
