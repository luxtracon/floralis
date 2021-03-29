package com.luxtracon.floralis.villages;

import java.util.List;
import java.util.Random;

import com.luxtracon.floralis.base.BaseCrop;
import com.luxtracon.floralis.init.InitCrop;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.gen.structure.StructureBoundingBox;
import net.minecraft.world.gen.structure.StructureComponent;
import net.minecraft.world.gen.structure.StructureVillagePieces;

public class CustomField extends StructureVillagePieces.Village
{
    private BaseCrop crop;

    public CustomField(StructureVillagePieces.Start start, int type, Random rand, StructureBoundingBox box, EnumFacing facing)
    {
        super(start, type);
        this.setCoordBaseMode(facing);
        this.boundingBox = box;
        this.crop = this.getRandomCropType(rand);
    }

    private BaseCrop getRandomCropType(Random rand)
    {
        switch (rand.nextInt(16))
        {
            case 0:
                return (BaseCrop) InitCrop.cropBlack;
            case 1:
                return (BaseCrop) InitCrop.cropBlue;
            case 2:
                return (BaseCrop) InitCrop.cropBrown;
            case 3:
                return (BaseCrop) InitCrop.cropCyan;
            case 4:
                return (BaseCrop) InitCrop.cropGray;
            case 5:
                return (BaseCrop) InitCrop.cropGreen;
            case 6:
                return (BaseCrop) InitCrop.cropLightBlue;
            case 7:
                return (BaseCrop) InitCrop.cropLightGray;
            case 8:
                return (BaseCrop) InitCrop.cropLime;
            case 9:
                return (BaseCrop) InitCrop.cropMagenta;
            case 10:
                return (BaseCrop) InitCrop.cropOrange;
            case 11:
                return (BaseCrop) InitCrop.cropPink;
            case 12:
                return (BaseCrop) InitCrop.cropPurple;
            case 13:
                return (BaseCrop) InitCrop.cropRed;
            case 14:
                return (BaseCrop) InitCrop.cropWhite;
            case 15:
                return (BaseCrop) InitCrop.cropYellow;
        }
        return null;
    }

    @Override
    public boolean addComponentParts(World worldIn, Random rand, StructureBoundingBox box)
    {
        if (this.averageGroundLvl < 0)
        {
            this.averageGroundLvl = this.getAverageGroundLevel(worldIn, box);

            if (this.averageGroundLvl < 0)
            {
                return true;
            }

            this.boundingBox.offset(0, this.averageGroundLvl - this.boundingBox.maxY + 2, 0);
        }

        IBlockState state = this.getBiomeSpecificBlockState(Blocks.LOG.getDefaultState());

        this.fillWithBlocks(worldIn, box, 0, 1, 0, 6, 4, 8, Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState(), false);
        this.fillWithBlocks(worldIn, box, 1, 0, 1, 2, 0, 7, Blocks.FARMLAND.getDefaultState(), Blocks.FARMLAND.getDefaultState(), false);
        this.fillWithBlocks(worldIn, box, 4, 0, 1, 5, 0, 7, Blocks.FARMLAND.getDefaultState(), Blocks.FARMLAND.getDefaultState(), false);
        this.fillWithBlocks(worldIn, box, 0, 0, 0, 0, 0, 8, state, state, false);
        this.fillWithBlocks(worldIn, box, 6, 0, 0, 6, 0, 8, state, state, false);
        this.fillWithBlocks(worldIn, box, 1, 0, 0, 5, 0, 0, state, state, false);
        this.fillWithBlocks(worldIn, box, 1, 0, 8, 5, 0, 8, state, state, false);
        this.fillWithBlocks(worldIn, box, 3, 0, 1, 3, 0, 7, Blocks.WATER.getDefaultState(), Blocks.WATER.getDefaultState(), false);

        if(crop != null)
        {
            for (int i = 1; i <= 7; ++i)
            {
                this.setBlockState(worldIn, crop.getDefaultState().withProperty(BaseCrop.AGE, MathHelper.getInt(rand, 0, 2)), 1, 1, i, box);
                this.setBlockState(worldIn, crop.getDefaultState().withProperty(BaseCrop.AGE, MathHelper.getInt(rand, 0, 2)), 2, 1, i, box);
                this.setBlockState(worldIn, crop.getDefaultState().withProperty(BaseCrop.AGE, MathHelper.getInt(rand, 0, 2)), 4, 1, i, box);
                this.setBlockState(worldIn, crop.getDefaultState().withProperty(BaseCrop.AGE, MathHelper.getInt(rand, 0, 2)), 5, 1, i, box);
            }
        }

        for (int i = 0; i < 9; ++i)
        {
            for (int j = 0; j < 7; ++j)
            {
                this.clearCurrentPositionBlocksUpwards(worldIn, j, 4, i, box);
                this.replaceAirAndLiquidDownwards(worldIn, Blocks.DIRT.getDefaultState(), j, -1, i, box);
            }
        }

        return true;
    }

    public static CustomField createPiece(StructureVillagePieces.Start start, List<StructureComponent> list, Random rand, int x, int y, int z, EnumFacing facing, int type)
    {
        StructureBoundingBox structureboundingbox = StructureBoundingBox.getComponentToAddBoundingBox(x, y, z, 0, 0, 0, 7, 4, 9, facing);
        return canVillageGoDeeper(structureboundingbox) && StructureComponent.findIntersecting(list, structureboundingbox) == null ? new CustomField(start, type, rand, structureboundingbox, facing) : null;
    }
}