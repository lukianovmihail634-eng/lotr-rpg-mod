package com.lotrpg;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafxmod.FXModLoadingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod("lotrpgmod")
public class LotRRpgMod {
    public static final String MOD_ID = "lotrpgmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public LotRRpgMod() {
        IEventBus modEventBus = FXModLoadingContext.getInstance().getModEventBus();
        modEventBus.addListener(this::commonSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("LotR RPG Mod loaded successfully!");
    }
}
