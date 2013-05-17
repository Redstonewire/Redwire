package com.redwire.wires;

import com.redwire.Redwire;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class redwire extends Block {  
    
    public redwire() {    
        super(Redwire.redwireID, Material.cloth);    
        setCreativeTab(Redwire.Redtab);  
        setUnlocalizedName("Redstone Wire");    
        setHardness(0.5F);    
        setStepSound(Block.soundClothFootstep);    
        GameRegistry.registerBlock(Redwire.Redwire, getUnlocalizedName());  
        LanguageRegistry.addName(Redwire.Redwire, getUnlocalizedName2());  
       }    
   }
