package com.redwire.machines;

import com.redwire.Redwire;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class extruder extends Block {  
    
    public extruder() {    
        super(Redwire.extruderID, Material.grass);    
        setCreativeTab(Redwire.Redtab);  
        setUnlocalizedName("Wire Extruder");    
        setHardness(0.5F);    
        setStepSound(Block.soundGrassFootstep);    
        GameRegistry.registerBlock(Redwire.Extruder, getUnlocalizedName());  
        LanguageRegistry.addName(Redwire.Extruder, getUnlocalizedName2());  
       }    
   }
