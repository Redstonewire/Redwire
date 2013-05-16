package com.redwire;

import net.minecraft.block.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;

import com.redwire.items.dopedingots;
import com.redwire.items.pliers;
import com.redwire.items.spools;
import com.redwire.lib.Redtab;
import com.redwire.lib.reference;
import com.redwire.machines.extruder;
import com.redwire.machines.dyer;
import com.redwire.machines.insulator;
import com.redwire.machines.winder;
import com.redwire.wires.insulatedwire;
import com.redwire.wires.redwire;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(
     modid = reference.MOD_ID,
     name = reference.MOD_NAME,
     version = reference.VERSION
     )

public class Redwire
{
  
   public static CreativeTabs Redtab = new Redtab(CreativeTabs.getNextID(), "RedTab");
     public static int extruderID;
     public static int redwireID;
     public static int dopedingotID;
     public static int insulatedwireID;
     public static int spoolID;
     public static int dyerID;
     public static int winderID;
     public static int insulatorID;
     public static int pliersID;
        
   //Blocks
      
      public static Block Extruder;
      public static Block Redwire; 
      public static Block Insulatedwire;
      public static Block Dyer;
      public static Block Winder;
      public static Block Insulator;
 
  //Items
      
      public static Item Dopedingot;
      public static Item Pliers;
      public static Item Spools;
      
   @PreInit
    public void preInit(FMLPreInitializationEvent event) 
   {
            Configuration config = new Configuration(event.getSuggestedConfigurationFile());

            config.load();
            //Blockids
            extruderID = config.getBlock("Extruder", 3000).getInt();
            dyerID = config.getBlock("Dyer", 3001).getInt();
            winderID = config.getBlock("Winder", 3002).getInt();
            insulatorID = config.getBlock("Insulator", 3003).getInt();
            insulatedwireID = config.getBlock("Insulatedwire", 3004).getInt();
            redwireID = config.getBlock("Redwire", 3005).getInt();
            //itemids
            dopedingotID = config.getItem("dopedingot", 2100).getInt();
            pliersID = config.getItem("pliers", 2101).getInt();
            spoolID = config.getItem("Spool", 2102).getInt();
            config.save();
    }

    @Init
    public void Init(FMLInitializationEvent event)
    {
        
        //Blocks
        
        Extruder = new extruder(extruderID, Redtab);
        
        GameRegistry.registerBlock(Extruder, "Extruder");
        LanguageRegistry.addName(Extruder, "Wire Extruder");
        
        Dyer = new dyer(dyerID, Redtab);
        
        GameRegistry.registerBlock(Dyer, "Dyer");
        LanguageRegistry.addName(Dyer, "Insulation Dyer");
        
        Winder = new winder(winderID, Redtab);
        
        GameRegistry.registerBlock(Winder, "Winder");
        LanguageRegistry.addName(Winder, "Spool Winder");
        
        Insulator = new insulator(insulatorID, Redtab);
        
        GameRegistry.registerBlock(Insulator, "Insualtor");
        LanguageRegistry.addName(Insulator, "Wire Insulator");
        
        Insulatedwire = new insulatedwire(insulatedwireID, Redtab);
        
        GameRegistry.registerBlock(Insulatedwire, "Insulatedwire");
        LanguageRegistry.addName(Insulatedwire, "Insulated Redstone wire");
        
        Redwire = new redwire(redwireID, Redtab);
        
        GameRegistry.registerBlock(Redwire, "Redwire");
        LanguageRegistry.addName(Redwire, "Redstone Wire");
        
        //Items
        
        Dopedingot = new dopedingots(dopedingotID).setMaxStackSize(64).setFull3D().setUnlocalizedName("dopedingot").setCreativeTab(Redtab);
        
        GameRegistry.registerItem(Dopedingot, "Dopedingot");
        LanguageRegistry.addName(Dopedingot, "Redstone doped ingot");
        
        Pliers = new pliers(pliersID).setFull3D().setMaxStackSize(1).setUnlocalizedName("Pliers").setCreativeTab(Redtab);
        
        GameRegistry.registerItem(Pliers, "Pliers");
        LanguageRegistry.addName(Pliers, "Clipping pliers");
        
        Spools = new spools(spoolID).setFull3D().setMaxStackSize(1).setMaxDamage(256).setUnlocalizedName("Spool").setCreativeTab(Redtab);
        
        GameRegistry.registerItem(Spools, "Spool");
        LanguageRegistry.addName(Spools, "Wire Spool");
    }
    
    @PostInit
    public void postInit(FMLPostInitializationEvent event) 
    {
            
    }

}