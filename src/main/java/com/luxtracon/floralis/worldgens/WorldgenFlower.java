package com.luxtracon.floralis.worldgens;

import com.luxtracon.floralis.inits.BlockInit;
import com.luxtracon.floralis.utilities.Config;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;

import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class WorldgenFlower implements IWorldGenerator
{
    private static final Block[] FLOWERS =
    {
        BlockInit.flowerWhite,
        BlockInit.flowerOrange,
        BlockInit.flowerMagenta,
        BlockInit.flowerLightBlue,
        BlockInit.flowerYellow,
        BlockInit.flowerLime,
        BlockInit.flowerPink,
        BlockInit.flowerGray,
        BlockInit.flowerLightGray,
        BlockInit.flowerCyan,
        BlockInit.flowerPurple,
        BlockInit.flowerBlue,
        BlockInit.flowerBrown,
        BlockInit.flowerGreen,
        BlockInit.flowerRed,
        BlockInit.flowerBlack
    };

    private static final Block[][] GROUPS =
    {
        { BlockInit.flowerBlack },
        { BlockInit.flowerBlue, BlockInit.flowerLightBlue },
        { BlockInit.flowerBrown },
        { BlockInit.flowerCyan },
        { BlockInit.flowerGray, BlockInit.flowerLightGray },
        { BlockInit.flowerGreen },
        { BlockInit.flowerLime },
        { BlockInit.flowerMagenta },
        { BlockInit.flowerOrange },
        { BlockInit.flowerPink },
        { BlockInit.flowerPurple },
        { BlockInit.flowerRed },
        { BlockInit.flowerWhite },
        { BlockInit.flowerYellow }
    };

    private static int getFlowerTries(Block flower)
    {
        for (int index = 0; index < FLOWERS.length; index++)
        {
            if (FLOWERS[index] == flower)
            {
                return Config.flowerTries[index];
            }
        }

        return 64;
    }

    private void placeFlower(World world, Random random, BlockPos position, Block flower)
    {
        IBlockState state = flower.getDefaultState();
        int tries = getFlowerTries(flower);

        for (int i = 0; i < tries; i++)
        {
            BlockPos blockpos = position.add(
                    random.nextInt(8) - random.nextInt(8),
                    random.nextInt(8) - random.nextInt(8),
                    random.nextInt(8) - random.nextInt(8)
            );

            if (world.isAirBlock(blockpos) && flower.canPlaceBlockAt(world, blockpos))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }
    }

    private void generateGroup(World world, Random random, int posX, int posZ, Block... flowers)
    {
        if (random.nextInt(8) == 0)
        {
            int xPos = posX + random.nextInt(16);
            int yPos = random.nextInt(255);
            int zPos = posZ + random.nextInt(16);

            BlockPos newPos = new BlockPos(xPos, yPos, zPos);

            for (Block flower : flowers)
            {
                placeFlower(world, random, newPos, flower);
            }
        }
    }

    public boolean BlackFlower(World world, Random random, BlockPos position)
    {
        placeFlower(world, random, position, BlockInit.flowerBlack);
        return true;
    }

    public boolean BlueFlower(World world, Random random, BlockPos position)
    {
        placeFlower(world, random, position, BlockInit.flowerBlue);
        return true;
    }

    public boolean BrownFlower(World world, Random random, BlockPos position)
    {
        placeFlower(world, random, position, BlockInit.flowerBrown);
        return true;
    }

    public boolean CyanFlower(World world, Random random, BlockPos position)
    {
        placeFlower(world, random, position, BlockInit.flowerCyan);
        return true;
    }

    public boolean GrayFlower(World world, Random random, BlockPos position)
    {
        placeFlower(world, random, position, BlockInit.flowerGray);
        return true;
    }

    public boolean GreenFlower(World world, Random random, BlockPos position)
    {
        placeFlower(world, random, position, BlockInit.flowerGreen);
        return true;
    }

    public boolean LightBlueFlower(World world, Random random, BlockPos position)
    {
        placeFlower(world, random, position, BlockInit.flowerLightBlue);
        return true;
    }

    public boolean LightGrayFlower(World world, Random random, BlockPos position)
    {
        placeFlower(world, random, position, BlockInit.flowerLightGray);
        return true;
    }

    public boolean LimeFlower(World world, Random random, BlockPos position)
    {
        placeFlower(world, random, position, BlockInit.flowerLime);
        return true;
    }

    public boolean MagentaFlower(World world, Random random, BlockPos position)
    {
        placeFlower(world, random, position, BlockInit.flowerMagenta);
        return true;
    }

    public boolean OrangeFlower(World world, Random random, BlockPos position)
    {
        placeFlower(world, random, position, BlockInit.flowerOrange);
        return true;
    }

    public boolean PinkFlower(World world, Random random, BlockPos position)
    {
        placeFlower(world, random, position, BlockInit.flowerPink);
        return true;
    }

    public boolean PurpleFlower(World world, Random random, BlockPos position)
    {
        placeFlower(world, random, position, BlockInit.flowerPurple);
        return true;
    }

    public boolean RedFlower(World world, Random random, BlockPos position)
    {
        placeFlower(world, random, position, BlockInit.flowerRed);
        return true;
    }

    public boolean WhiteFlower(World world, Random random, BlockPos position)
    {
        placeFlower(world, random, position, BlockInit.flowerWhite);
        return true;
    }

    public boolean YellowFlower(World world, Random random, BlockPos position)
    {
        placeFlower(world, random, position, BlockInit.flowerYellow);
        return true;
    }

    public void groups(Random random, int chunkX, int chunkZ, World world)
    {
        int posX = chunkX * 16 + 8;
        int posZ = chunkZ * 16 + 8;

        if (world.getWorldType() != WorldType.FLAT)
        {
            for (Block[] group : GROUPS)
            {
                generateGroup(world, random, posX, posZ, group);
            }
        }
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
    {
        if (world.provider.getDimensionType() != DimensionType.OVERWORLD)
        {
            return;
        }

        this.groups(random, chunkX, chunkZ, world);
    }
}