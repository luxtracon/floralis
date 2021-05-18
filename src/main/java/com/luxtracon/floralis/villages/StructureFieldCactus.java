package com.luxtracon.floralis.villages;

import com.luxtracon.floralis.blocks.BlockCropCactus;
import com.luxtracon.floralis.inits.BlockInit;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.gen.structure.StructureBoundingBox;
import net.minecraft.world.gen.structure.StructureComponent;
import net.minecraft.world.gen.structure.StructureVillagePieces;

import java.util.List;
import java.util.Random;

public class StructureFieldCactus extends StructureVillagePieces.Village
{
    private final BlockCropCactus crop;

    public StructureFieldCactus(StructureVillagePieces.Start start, int type, Random random, StructureBoundingBox box, EnumFacing facing)
    {
        super(start, type);
        this.setCoordBaseMode(facing);
        this.boundingBox = box;
        this.crop = this.getRandomCropType(random);
    }

    @Override
    public boolean addComponentParts(World world, Random random, StructureBoundingBox box)
    {
        if (this.averageGroundLvl < 0)
        {
            this.averageGroundLvl = this.getAverageGroundLevel(world, box);

            if (this.averageGroundLvl < 0)
            {
                return true;
            }

            this.boundingBox.offset(0, this.averageGroundLvl - this.boundingBox.maxY + 3, 0);
        }

        IBlockState state = this.getBiomeSpecificBlockState(Blocks.COBBLESTONE.getDefaultState());

        this.fillWithBlocks(world, box, 0, 1, 0, 6, 4, 8, Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState(), false);
        this.fillWithBlocks(world, box, 1, 0, 1, 2, 0, 7, Blocks.SAND.getDefaultState(), Blocks.SAND.getDefaultState(), false);
        this.fillWithBlocks(world, box, 4, 0, 1, 5, 0, 7, Blocks.SAND.getDefaultState(), Blocks.SAND.getDefaultState(), false);
        this.fillWithBlocks(world, box, 0, 0, 0, 0, 0, 8, state, state, false);
        this.fillWithBlocks(world, box, 6, 0, 0, 6, 0, 8, state, state, false);
        this.fillWithBlocks(world, box, 1, 0, 0, 5, 0, 0, state, state, false);
        this.fillWithBlocks(world, box, 1, 0, 8, 5, 0, 8, state, state, false);
        this.fillWithBlocks(world, box, 3, 0, 1, 3, 0, 7, Blocks.SANDSTONE.getDefaultState(), Blocks.SANDSTONE.getDefaultState(), false);

        if(crop != null)
        {
            for (int i = 1; i <= 7; ++i)
            {
                this.setBlockState(world, crop.getDefaultState().withProperty(BlockCropCactus.AGE, MathHelper.getInt(random, 0, 2)), 1, 1, i, box);
                this.setBlockState(world, crop.getDefaultState().withProperty(BlockCropCactus.AGE, MathHelper.getInt(random, 0, 2)), 2, 1, i, box);
                this.setBlockState(world, crop.getDefaultState().withProperty(BlockCropCactus.AGE, MathHelper.getInt(random, 0, 2)), 4, 1, i, box);
                this.setBlockState(world, crop.getDefaultState().withProperty(BlockCropCactus.AGE, MathHelper.getInt(random, 0, 2)), 5, 1, i, box);
            }
        }

        for (int i = 0; i < 9; ++i)
        {
            for (int j = 0; j < 7; ++j)
            {
                this.clearCurrentPositionBlocksUpwards(world, j, 4, i, box);
                this.replaceAirAndLiquidDownwards(world, state, j, -1, i, box);
            }
        }

        return true;
    }

    public static StructureFieldCactus createPiece(StructureVillagePieces.Start start, List<StructureComponent> list, Random random, int x, int y, int z, EnumFacing facing, int type)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.getComponentToAddBoundingBox(x, y, z, 0, 0, 0, 7, 4, 9, facing);
        return canVillageGoDeeper(structureboundingbox) && StructureComponent.findIntersecting(list, structureboundingbox) == null ? new StructureFieldCactus(start, type, random, structureboundingbox, facing) : null;
    }

    private BlockCropCactus getRandomCropType(Random random)
    {
        switch (random.nextInt(16))
        {
            case 0:
                return BlockInit.cropCactusBlack;
            case 1:
                return BlockInit.cropCactusBlue;
            case 2:
                return BlockInit.cropCactusBrown;
            case 3:
                return BlockInit.cropCactusCyan;
            case 4:
                return BlockInit.cropCactusGray;
            case 5:
                return BlockInit.cropCactusGreen;
            case 6:
                return BlockInit.cropCactusLightBlue;
            case 7:
                return BlockInit.cropCactusLightGray;
            case 8:
                return BlockInit.cropCactusLime;
            case 9:
                return BlockInit.cropCactusMagenta;
            case 10:
                return BlockInit.cropCactusOrange;
            case 11:
                return BlockInit.cropCactusPink;
            case 12:
                return BlockInit.cropCactusPurple;
            case 13:
                return BlockInit.cropCactusRed;
            case 14:
                return BlockInit.cropCactusWhite;
            case 15:
                return BlockInit.cropCactusYellow;
        }

        return null;
    }
}