package com.redwire;

//import net.minecraft.block.*;
//import net.minecraft.creativetab.CreativeTabs;
//import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;

import com.redwire.items.DopedIngot;
import com.redwire.items.Pliers;
import com.redwire.items.Spool;
import com.redwire.lib.Redtab;
import com.redwire.lib.Reference;
import com.redwire.machines.Extruder;
import com.redwire.machines.Dyer;
import com.redwire.machines.Insulator;
import com.redwire.machines.Winder;
import com.redwire.wires.InsulatedWire;
import com.redwire.wires.Wire;

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
    modid = Reference.MOD_ID,
    name = Reference.MOD_NAME,
    version = Reference.VERSION
    )

public class Redwire
{

  public static Redtab Redtab = new Redtab("RedTab");
  public static int extruderID;
  public static int redwireID;
  public static int dopedingotID;
  public static int insulatedWireID;
  public static int spoolID;
  public static int dyerID;
  public static int winderID;
  public static int insulatorID;
  public static int pliersID;

  //Blocks

  public static Extruder extruder;
  public static Wire wire; 
  public static InsulatedWire insulatedWire;
  public static Dyer dyer;
  public static Winder winder;
  public static Insulator insulator;

  //Items

  public static DopedIngot dopedIngot;
  public static Pliers pliers;
  public static Spool spool;

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
    insulatedWireID = config.getBlock("Insulatedwire", 3004).getInt();
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

    extruder = new Extruder();
    GameRegistry.registerBlock(extruder, extruder.getUnlocalizedName());  
    LanguageRegistry.addName(extruder, extruder.getUnlocalizedName2());  

    dyer = new Dyer();
    GameRegistry.registerBlock(dyer, dyer.getUnlocalizedName());  
    LanguageRegistry.addName(dyer, dyer.getUnlocalizedName2());  

    winder = new Winder();
    GameRegistry.registerBlock(winder, winder.getUnlocalizedName());  
    LanguageRegistry.addName(winder, winder.getUnlocalizedName2());  

    insulator = new Insulator();
    GameRegistry.registerBlock(insulator, insulator.getUnlocalizedName());  
    LanguageRegistry.addName(insulator, insulator.getUnlocalizedName2());  

    insulatedWire = new InsulatedWire();
    GameRegistry.registerBlock(insulatedWire, insulatedWire.getUnlocalizedName());  
    LanguageRegistry.addName(insulatedWire, insulatedWire.getUnlocalizedName2());  

    wire = new Wire();
    GameRegistry.registerBlock(wire, wire.getUnlocalizedName());  
    LanguageRegistry.addName(wire, wire.getUnlocalizedName2());  

    //Items

    dopedIngot = new DopedIngot(dopedingotID);
    GameRegistry.registerItem(dopedIngot, dopedIngot.getUnlocalizedName());  
    LanguageRegistry.addName(dopedIngot, dopedIngot.getUnlocalizedName2());  

    pliers = new Pliers(pliersID);
    GameRegistry.registerItem(pliers, pliers.getUnlocalizedName());  
    LanguageRegistry.addName(pliers, pliers.getUnlocalizedName2());  

    spool = new Spool(spoolID);
    GameRegistry.registerItem(spool, spool.getUnlocalizedName());  
    LanguageRegistry.addName(spool, spool.getUnlocalizedName2());  

  }

  @PostInit
  public void postInit(FMLPostInitializationEvent event) 
  {

  }

}