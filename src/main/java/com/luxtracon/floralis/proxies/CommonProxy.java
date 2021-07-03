package com.luxtracon.floralis.proxies;

import com.luxtracon.floralis.Main;
import com.luxtracon.floralis.utilities.TileEntityPlantPot;

import net.minecraft.util.ResourceLocation;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy
{
    public void init()
    {
        GameRegistry.registerTileEntity(TileEntityPlantPot.class, new ResourceLocation(Main.MODID, "pot"));
    }
}