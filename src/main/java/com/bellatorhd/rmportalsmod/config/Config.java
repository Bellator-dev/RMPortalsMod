package com.bellatorhd.rmportalsmod.config;

import com.bellatorhd.rmportalsmod.RMPortalsMod;
import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

import java.io.File;

@Mod.EventBusSubscriber
public class Config {
   private static final ForgeConfigSpec.Builder server_builder = new ForgeConfigSpec.Builder();
    public static ForgeConfigSpec server_config;

    private static final ForgeConfigSpec.Builder client_builder = new ForgeConfigSpec.Builder();
    public static ForgeConfigSpec client_config;


    static {
        server_config = server_builder.build();
        client_config = client_builder.build();
    }

    public static void LoadConfig(ForgeConfigSpec config, String path) {
        RMPortalsMod.logger.info("Loading config: " + path);
        final CommentedFileConfig file = CommentedFileConfig.builder(new File(path)).sync().autosave().writingMode(WritingMode.REPLACE).build();
        RMPortalsMod.logger.info("Built config: " + path);
        file.load();
        RMPortalsMod.logger.info("Loaded config: " + path);
        config.setConfig(file);

    }
}
