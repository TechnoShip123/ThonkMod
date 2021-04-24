package com.thonk.thonkmod;

import com.thonk.thonkmod.core.init.ItemInit;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("thonkmod")
public class thonkmod
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "thonkmod";
    public static final String VERSION = "1.0.0";
    // public static final ItemGroup THONKMOD_TAB = new thonkmodTab("thonkmodtab");

    public thonkmod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);

        ItemInit.ITEMS.register(bus);
        // BlockInit.BLOCKS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    /*
    private void doClientStuff(final FMLClientSetupEvent event) {
        // Does something that can only be done on the client
        LOGGER.info(" Got game settings {}", event.getMinecraftSupplier().get().options);
        LOGGER.info("Mod Loaded! Mod ID is - {}", MOD_ID);
    } */

    /*
    // Creative Tab for the mod
    public static class thonkmodTab extends ItemGroup {

        public thonkmodTab(String label) {
            super(label);
        }

        // @Override
        @Nonnull
        public ItemStack makeIcon() {
            // Get the default instance of the following item and make it the icon.
            return ItemInit.thonkitem.get().getDefaultInstance();
        }

        /*
        @Override
        public void fill(NonNullList<ItemStack> items) {
            items.add(item)
        }


    } */

}
