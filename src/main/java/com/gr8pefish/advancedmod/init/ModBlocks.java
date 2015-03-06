package com.gr8pefish.advancedmod.init;

import com.gr8pefish.advancedmod.reference.Reference;
import com.gr8pefish.advancedmod.utility.Log;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks{

    public static void init(){
        Log.info("Modblocks initialized");
    }
}