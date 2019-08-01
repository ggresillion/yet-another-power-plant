package com.cacatoes.yapp;

import com.cacatoes.yapp.init.RegistryEventHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import org.apache.logging.log4j.Logger;

@Mod(modid = YAPP.MOD_ID, name = YAPP.NAME, version = YAPP.VERSION)
public class YAPP {

    public static final String MOD_ID = "yapp";
    static final String NAME = "Yet Another Power Plant";
    static final String VERSION = "1.0.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        logger.info("YAPP initlialised :" + NAME);
        logger.info(ForgeRegistries.BLOCKS.getEntries());
    }
}
