package com.luxtracon.floralis.base;

import com.luxtracon.floralis.Main;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockBase extends BlockFalling {

    public BlockBase(String name, Material material, float hardness, float resistance, String tool, int miningLevel) {
        super(material);
        setRegistryName(name);
        setTranslationKey(name);
        setHardness(hardness);
        setResistance(resistance);
        setHarvestLevel(tool, miningLevel);
        setSoundType(SoundType.SAND);
        setCreativeTab(Main.MODTAB);
    }
}