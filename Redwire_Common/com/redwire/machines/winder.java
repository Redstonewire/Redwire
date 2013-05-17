package com.redwire.machines;

import com.redwire.Redwire;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class winder extends Block {  
    
    public winder() {    
        super(Redwire.winderID, Material.grass);    
        setCreativeTab(Redwire.Redtab);  
        setUnlocalizedName("Redstone Wire");    
        setHardness(0.5F);    
        setStepSound(Block.soundGrassFootstep);    
        GameRegistry.registerBlock(Redwire.Winder, getUnlocalizedName());
        LanguageRegistry.addName(Redwire.Winder, getUnlocalizedName2()); 
       }    
   }
