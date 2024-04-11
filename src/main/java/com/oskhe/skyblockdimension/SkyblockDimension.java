package com.oskhe.skyblockdimension;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SkyblockDimension implements ModInitializer {
    private static Logger LOGGER;

    @Override
    public void onInitialize() {
        ModContainer mod = FabricLoader.getInstance()
                .getModContainer("skyblockdimension")
                .orElseThrow(NullPointerException::new);

        LOGGER = LoggerFactory.getLogger(mod.getMetadata().getName());

        LOGGER.info("Initializing {}", mod.getMetadata().getName());
    }
}
