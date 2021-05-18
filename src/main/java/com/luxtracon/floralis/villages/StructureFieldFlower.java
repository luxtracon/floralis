package com.luxtracon.floralis.villages;

import java.util.List;
import java.util.Random;

import com.luxtracon.floralis.blocks.BlockCropFlower;
import com.luxtracon.floralis.inits.BlockInit;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.gen.structure.StructureBoundingBox;
import net.minecraft.world.gen.structure.StructureComponent;
import net.minecraft.world.gen.structure.StructureVillagePieces;

public class StructureFieldFlower extends StructureVillagePieces.Village
{
    private final BlockCropFlower crop;

    public StructureFieldFlower(StructureVillagePieces.Start start, int type, Random random, StructureBoundingBox box, EnumFacing facing)
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

        IBlockState state = this.getBiomeSpecificBlockState(Blocks.LOG.getDefaultState());

        this.fillWithBlocks(world, box, 0, 1, 0, 6, 4, 8, Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState(), false);
        this.fillWithBlocks(world, box, 1, 0, 1, 2, 0, 7, Blocks.FARMLAND.getDefaultState(), Blocks.FARMLAND.getDefaultState(), false);
        this.fillWithBlocks(world, box, 4, 0, 1, 5, 0, 7, Blocks.FARMLAND.getDefaultState(), Blocks.FARMLAND.getDefaultState(), false);
        this.fillWithBlocks(world, box, 0, 0, 0, 0, 0, 8, state, state, false);
        this.fillWithBlocks(world, box, 6, 0, 0, 6, 0, 8, state, state, false);
        this.fillWithBlocks(world, box, 1, 0, 0, 5, 0, 0, state, state, false);
        this.fillWithBlocks(world, box, 1, 0, 8, 5, 0, 8, state, state, false);
        this.fillWithBlocks(world, box, 3, 0, 1, 3, 0, 7, Blocks.WATER.getDefaultState(), Blocks.WATER.getDefaultState(), false);

        if(crop != null)
        {
            for (int i = 1; i <= 7; ++i)
            {
                this.setBlockState(world, crop.getDefaultState().withProperty(BlockCropFlower.AGE, MathHelper.getInt(random, 0, 2)), 1, 1, i, box);
                this.setBlockState(world, crop.getDefaultState().withProperty(BlockCropFlower.AGE, MathHelper.getInt(random, 0, 2)), 2, 1, i, box);
                this.setBlockState(world, crop.getDefaultState().withProperty(BlockCropFlower.AGE, MathHelper.getInt(random, 0, 2)), 4, 1, i, box);
                this.setBlockState(world, crop.getDefaultState().withProperty(BlockCropFlower.AGE, MathHelper.getInt(random, 0, 2)), 5, 1, i, box);
            }
        }

        for (int i = 0; i < 9; ++i)
        {
            for (int j = 0; j < 7; ++j)
            {
                this.clearCurrentPositionBlocksUpwards(world, j, 4, i, box);
                this.replaceAirAndLiquidDownwards(world, Blocks.DIRT.getDefaultState(), j, -1, i, box);
            }
        }

        return true;
    }

    public static StructureFieldFlower createPiece(StructureVillagePieces.Start start, List<StructureComponent> list, Random random, int x, int y, int z, EnumFacing facing, int type)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.getComponentToAddBoundingBox(x, y, z, 0, 0, 0, 7, 4, 9, facing);
        return canVillageGoDeeper(structureboundingbox) && StructureComponent.findIntersecting(list, structureboundingbox) == null ? new StructureFieldFlower(start, type, random, structureboundingbox, facing) : null;
    }

    private BlockCropFlower getRandomCropType(Random random)
    {
        switch (random.nextInt(16))
        {
            case 0:
                return BlockInit.cropFlowerBlack;
            case 1:
                return BlockInit.cropFlowerBlue;
            case 2:
                return BlockInit.cropFlowerBrown;
            case 3:
                return BlockInit.cropFlowerCyan;
            case 4:
                return BlockInit.cropFlowerGray;
            case 5:
                return BlockInit.cropFlowerGreen;
            case 6:
                return BlockInit.cropFlowerLightBlue;
            case 7:
                return BlockInit.cropFlowerLightGray;
            case 8:
                return BlockInit.cropFlowerLime;
            case 9:
                return BlockInit.cropFlowerMagenta;
            case 10:
                return BlockInit.cropFlowerOrange;
            case 11:
                return BlockInit.cropFlowerPink;
            case 12:
                return BlockInit.cropFlowerPurple;
            case 13:
                return BlockInit.cropFlowerRed;
            case 14:
                return BlockInit.cropFlowerWhite;
            case 15:
                return BlockInit.cropFlowerYellow;
        }

        return null;
    }
}