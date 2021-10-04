package com.luxtracon.floralis.blocks;

import com.luxtracon.floralis.Main;
import com.luxtracon.floralis.inits.BlockInit;

import net.minecraft.block.Block;
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

public class BlockDyedClay extends Block
{
    public BlockDyedClay(String name, Material material, float hardness, float resistance, String tool, int miningLevel)
    {
        super(material);
        setRegistryName(name);
        setTranslationKey(name);
        setHardness(hardness);
        setResistance(resistance);
        setHarvestLevel(tool, miningLevel);
        setCreativeTab(Main.MODTAB);
        setSoundType(SoundType.GROUND);
    }

    @SuppressWarnings("deprecation")
    @Override
    public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos)
    {
        if(state.getBlock() == BlockInit.blockClayBlack)
        {
            return MapColor.BLACK;
        }

        if(state.getBlock() == BlockInit.blockClayBlue)
        {
            return MapColor.BLUE;
        }

        if(state.getBlock() == BlockInit.blockClayBrown)
        {
            return MapColor.BROWN;
        }

        if(state.getBlock() == BlockInit.blockClayCyan)
        {
            return MapColor.CYAN;
        }

        if(state.getBlock() == BlockInit.blockClayGray)
        {
            return MapColor.GRAY;
        }

        if(state.getBlock() == BlockInit.blockClayGreen)
        {
            return MapColor.GREEN;
        }

        if(state.getBlock() == BlockInit.blockClayLightBlue)
        {
            return MapColor.LIGHT_BLUE;
        }

        if(state.getBlock() == BlockInit.blockClayLightGray)
        {
            return MapColor.SILVER;
        }

        if(state.getBlock() == BlockInit.blockClayLime)
        {
            return MapColor.LIME;
        }

        if(state.getBlock() == BlockInit.blockClayMagenta)
        {
            return MapColor.MAGENTA;
        }

        if(state.getBlock() == BlockInit.blockClayOrange)
        {
            return MapColor.ADOBE;
        }

        if(state.getBlock() == BlockInit.blockClayPink)
        {
            return MapColor.PINK;
        }

        if(state.getBlock() == BlockInit.blockClayPurple)
        {
            return MapColor.PURPLE;
        }

        if(state.getBlock() == BlockInit.blockClayRed)
        {
            return MapColor.RED;
        }

        if(state.getBlock() == BlockInit.blockClayWhite)
        {
            return MapColor.SNOW;
        }

        if(state.getBlock() == BlockInit.blockClayYellow)
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
        return "tile.clayblock.tooltip";
    }
}