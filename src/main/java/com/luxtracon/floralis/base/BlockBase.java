package com.luxtracon.floralis.base;

import com.luxtracon.floralis.Main;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

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

    /*@Override
    public void addInformation(ItemStack stack, World world, List<String> tooltip, ITooltipFlag flags) {
        super.addInformation(stack, world, tooltip, flags);
        tooltip.add(I18n.format(getTranslationKey() + ".tooltip"));
    }*/

    @Override
    public void addInformation(ItemStack stack, World world, List<String> tooltip, ITooltipFlag flags) {
        super.addInformation(stack, world, tooltip, flags);
        tooltip.add(I18n.format(getTooltipTranslationKey()));
    }

    public String getTooltipTranslationKey() {
        return "tile.dyeblock.tooltip";
    }
}