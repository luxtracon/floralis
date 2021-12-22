package com.luxtracon.floralis.blocks;

import com.luxtracon.floralis.Main;
import com.luxtracon.floralis.inits.BlockInit;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.List;

public class BlockDyedDust extends BlockFalling
{
    public BlockDyedDust(String name, Material material, float hardness, float resistance, String tool, int miningLevel)
    {
        super(material);
        setRegistryName(name);
        setTranslationKey(name);
        setHardness(hardness);
        setResistance(resistance);
        setHarvestLevel(tool, miningLevel);
        setCreativeTab(Main.MODTAB);
        setSoundType(SoundType.SAND);
    }

    @SuppressWarnings("deprecation")
    @Override
    public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos)
    {
        if(state.getBlock() == BlockInit.blockDyeBlack)
        {
            return MapColor.BLACK;
        }

        if(state.getBlock() == BlockInit.blockDyeBlue)
        {
            return MapColor.BLUE;
        }

        if(state.getBlock() == BlockInit.blockDyeBrown)
        {
            return MapColor.BROWN;
        }

        if(state.getBlock() == BlockInit.blockDyeCyan)
        {
            return MapColor.CYAN;
        }

        if(state.getBlock() == BlockInit.blockDyeGray)
        {
            return MapColor.GRAY;
        }

        if(state.getBlock() == BlockInit.blockDyeGreen)
        {
            return MapColor.GREEN;
        }

        if(state.getBlock() == BlockInit.blockDyeLightBlue)
        {
            return MapColor.LIGHT_BLUE;
        }

        if(state.getBlock() == BlockInit.blockDyeLightGray)
        {
            return MapColor.SILVER;
        }

        if(state.getBlock() == BlockInit.blockDyeLime)
        {
            return MapColor.LIME;
        }

        if(state.getBlock() == BlockInit.blockDyeMagenta)
        {
            return MapColor.MAGENTA;
        }

        if(state.getBlock() == BlockInit.blockDyeOrange)
        {
            return MapColor.ADOBE;
        }

        if(state.getBlock() == BlockInit.blockDyePink)
        {
            return MapColor.PINK;
        }

        if(state.getBlock() == BlockInit.blockDyePurple)
        {
            return MapColor.PURPLE;
        }

        if(state.getBlock() == BlockInit.blockDyeRed)
        {
            return MapColor.RED;
        }

        if(state.getBlock() == BlockInit.blockDyeWhite)
        {
            return MapColor.SNOW;
        }

        if(state.getBlock() == BlockInit.blockDyeYellow)
        {
            return MapColor.YELLOW;
        }

        return null;
    }

    @Override
    public void addInformation(ItemStack stack, World world, List<String> tooltip, ITooltipFlag flags)
    {
        super.addInformation(stack, world, tooltip, flags);
        tooltip.add(I18n.format(getTooltipTranslationKey()));
    }

    public String getTooltipTranslationKey()
    {
        return "tile.dyeblock.desc";
    }
}