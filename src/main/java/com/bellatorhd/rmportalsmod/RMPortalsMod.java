package com.bellatorhd.rmportalsmod;

import com.bellatorhd.rmportalsmod.blocks.Isotope322;
import com.bellatorhd.rmportalsmod.blocks.ModBlocks;
import com.bellatorhd.rmportalsmod.entities.MrMeeseeksEntity;
import com.bellatorhd.rmportalsmod.items.*;
import com.bellatorhd.rmportalsmod.setup.ClientProxy;
import com.bellatorhd.rmportalsmod.setup.IProxy;
import com.bellatorhd.rmportalsmod.setup.ModSetup;
import com.bellatorhd.rmportalsmod.setup.ServerProxy;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("rmportalsmod")
public class RMPortalsMod {

    public static final String MODID = "rmportalsmod";

    public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());

    public static ModSetup setup = new ModSetup();

    public static final Logger LOGGER = LogManager.getLogger();
    public static jdk.internal.instrumentation.Logger logger;

    public RMPortalsMod() {

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

    }

    private void setup(final FMLCommonSetupEvent event) {
        setup.init();
        proxy.init();

    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            event.getRegistry().register(new Isotope322());
        }
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties()
                    .group(setup.itemGroup);
            event.getRegistry().register(new BlockItem(ModBlocks.ISOTOPE322, properties).setRegistryName("isotope322"));
            event.getRegistry().register(new IsotopeNugget());
            event.getRegistry().register(new GlassTube());
            event.getRegistry().register(new PortalGunCasing());
            event.getRegistry().register(new PortalFluidBucket());
            event.getRegistry().register(new PortalFluidTube());
            event.getRegistry().register(new PortalGun().setRegistryName("portalgun"));
            event.getRegistry().register(new SimpleRickCookies().setRegistryName("simplerick_cookies"));
            event.getRegistry().register(new MeeseeksBox());
            event.getRegistry().register(new Battery());
        }

        @SubscribeEvent
        public static void onEntityRegistry(final RegistryEvent.Register<EntityType<?>> event) {
            event.getRegistry().register(EntityType.Builder.create(MrMeeseeksEntity::new, EntityClassification.CREATURE)
                .size(1, 2)
                .setShouldReceiveVelocityUpdates(false)
                .build("mrmeeseeks").setRegistryName(RMPortalsMod.MODID, "mrmeeseeks"));
        }

    }
}