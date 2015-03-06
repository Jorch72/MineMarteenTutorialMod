package com.gr8pefish.advancedmod;

import com.gr8pefish.advancedmod.init.ModBlocks;
import com.gr8pefish.advancedmod.proxy.CommonProxy;
import com.gr8pefish.advancedmod.reference.Reference;
import com.gr8pefish.advancedmod.utility.Log;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class AdvancedMod{

    @Mod.Instance(Reference.MOD_ID)
    public static AdvancedMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ModBlocks.init();
        proxy.preInit();
        Log.info("Pre Initialization Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        proxy.init();
        Log.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit();
        Log.info("Post Initialization Complete!");
    }
}
