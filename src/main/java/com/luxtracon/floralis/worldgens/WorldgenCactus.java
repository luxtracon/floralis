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

public class WorldgenCactus implements IWorldGenerator
{
    private static final Block[] CACTI =
    {
        BlockInit.cactusWhite,
        BlockInit.cactusOrange,
        BlockInit.cactusMagenta,
        BlockInit.cactusLightBlue,
        BlockInit.cactusYellow,
        BlockInit.cactusLime,
        BlockInit.cactusPink,
        BlockInit.cactusGray,
        BlockInit.cactusLightGray,
        BlockInit.cactusCyan,
        BlockInit.cactusPurple,
        BlockInit.cactusBlue,
        BlockInit.cactusBrown,
        BlockInit.cactusGreen,
        BlockInit.cactusRed,
        BlockInit.cactusBlack
    };

    private static final Block[][] GROUPS =
    {
        { BlockInit.cactusBlack },
        { BlockInit.cactusBlue, BlockInit.cactusLightBlue },
        { BlockInit.cactusBrown },
        { BlockInit.cactusCyan },
        { BlockInit.cactusGray, BlockInit.cactusLightGray },
        { BlockInit.cactusGreen },
        { BlockInit.cactusLime },
        { BlockInit.cactusMagenta },
        { BlockInit.cactusOrange },
        { BlockInit.cactusPink },
        { BlockInit.cactusPurple },
        { BlockInit.cactusRed },
        { BlockInit.cactusWhite },
        { BlockInit.cactusYellow }
    };

    private static int getCactusTries(Block cactus)
    {
        for (int index = 0; index < CACTI.length; index++)
        {
            if (CACTI[index] == cactus)
            {
                return Config.cactusTries[index];
            }
        }

        return 64;
    }

    private void placeCactus(World world, Random random, BlockPos position, Block cactus)
    {
        IBlockState state = cactus.getDefaultState();
        int tries = getCactusTries(cactus);

        for (int i = 0; i < tries; i++)
        {
            BlockPos blockpos = position.add(
                    random.nextInt(8) - random.nextInt(8),
                    random.nextInt(8) - random.nextInt(8),
                    random.nextInt(8) - random.nextInt(8)
            );

            if (world.isAirBlock(blockpos) && cactus.canPlaceBlockAt(world, blockpos))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }
    }

    private void generateGroup(World world, Random random, int posX, int posZ, Block... cacti)
    {
        if (random.nextInt(8) == 0)
        {
            int xPos = posX + random.nextInt(16);
            int yPos = random.nextInt(255);
            int zPos = posZ + random.nextInt(16);

            BlockPos newPos = new BlockPos(xPos, yPos, zPos);

            for (Block cactus : cacti)
            {
                placeCactus(world, random, newPos, cactus);
            }
        }
    }

    public boolean BlackCactus(World world, Random random, BlockPos position)
    {
        placeCactus(world, random, position, BlockInit.cactusBlack);
        return true;
    }

    public boolean BlueCactus(World world, Random random, BlockPos position)
    {
        placeCactus(world, random, position, BlockInit.cactusBlue);
        return true;
    }

    public boolean BrownCactus(World world, Random random, BlockPos position)
    {
        placeCactus(world, random, position, BlockInit.cactusBrown);
        return true;
    }

    public boolean CyanCactus(World world, Random random, BlockPos position)
    {
        placeCactus(world, random, position, BlockInit.cactusCyan);
        return true;
    }

    public boolean GrayCactus(World world, Random random, BlockPos position)
    {
        placeCactus(world, random, position, BlockInit.cactusGray);
        return true;
    }

    public boolean GreenCactus(World world, Random random, BlockPos position)
    {
        placeCactus(world, random, position, BlockInit.cactusGreen);
        return true;
    }

    public boolean LightBlueCactus(World world, Random random, BlockPos position)
    {
        placeCactus(world, random, position, BlockInit.cactusLightBlue);
        return true;
    }

    public boolean LightGrayCactus(World world, Random random, BlockPos position)
    {
        placeCactus(world, random, position, BlockInit.cactusLightGray);
        return true;
    }

    public boolean LimeCactus(World world, Random random, BlockPos position)
    {
        placeCactus(world, random, position, BlockInit.cactusLime);
        return true;
    }

    public boolean MagentaCactus(World world, Random random, BlockPos position)
    {
        placeCactus(world, random, position, BlockInit.cactusMagenta);
        return true;
    }

    public boolean OrangeCactus(World world, Random random, BlockPos position)
    {
        placeCactus(world, random, position, BlockInit.cactusOrange);
        return true;
    }

    public boolean PinkCactus(World world, Random random, BlockPos position)
    {
        placeCactus(world, random, position, BlockInit.cactusPink);
        return true;
    }

    public boolean PurpleCactus(World world, Random random, BlockPos position)
    {
        placeCactus(world, random, position, BlockInit.cactusPurple);
        return true;
    }

    public boolean RedCactus(World world, Random random, BlockPos position)
    {
        placeCactus(world, random, position, BlockInit.cactusRed);
        return true;
    }

    public boolean WhiteCactus(World world, Random random, BlockPos position)
    {
        placeCactus(world, random, position, BlockInit.cactusWhite);
        return true;
    }

    public boolean YellowCactus(World world, Random random, BlockPos position)
    {
        placeCactus(world, random, position, BlockInit.cactusYellow);
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