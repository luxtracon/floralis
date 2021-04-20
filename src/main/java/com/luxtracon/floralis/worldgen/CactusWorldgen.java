package com.luxtracon.floralis.worldgen;

import com.luxtracon.floralis.init.CactusInit;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;

import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class CactusWorldgen implements IWorldGenerator
{
    public boolean BlackCactus(World world, Random random, BlockPos position)
    {
        IBlockState state = CactusInit.cactusBlack.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && CactusInit.cactusBlack.canBlockStay(world, blockpos))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean BlueCactus(World world, Random random, BlockPos position)
    {
        IBlockState state = CactusInit.cactusBlue.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && CactusInit.cactusBlue.canBlockStay(world, blockpos))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean BrownCactus(World world, Random random, BlockPos position)
    {
        IBlockState state = CactusInit.cactusBrown.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && CactusInit.cactusBrown.canBlockStay(world, blockpos))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean CyanCactus(World world, Random random, BlockPos position)
    {
        IBlockState state = CactusInit.cactusCyan.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && CactusInit.cactusCyan.canBlockStay(world, blockpos))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean GrayCactus(World world, Random random, BlockPos position)
    {
        IBlockState state = CactusInit.cactusGray.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && CactusInit.cactusGray.canBlockStay(world, blockpos))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean GreenCactus(World world, Random random, BlockPos position)
    {
        IBlockState state = CactusInit.cactusGreen.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && CactusInit.cactusGreen.canBlockStay(world, blockpos))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean LightBlueCactus(World world, Random random, BlockPos position)
    {
        IBlockState state = CactusInit.cactusLightBlue.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && CactusInit.cactusLightBlue.canBlockStay(world, blockpos))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean LightGrayCactus(World world, Random random, BlockPos position)
    {
        IBlockState state = CactusInit.cactusLightGray.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && CactusInit.cactusLightGray.canBlockStay(world, blockpos))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean LimeCactus(World world, Random random, BlockPos position)
    {
        IBlockState state = CactusInit.cactusLime.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && CactusInit.cactusLime.canBlockStay(world, blockpos))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean MagentaCactus(World world, Random random, BlockPos position)
    {
        IBlockState state = CactusInit.cactusMagenta.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && CactusInit.cactusMagenta.canBlockStay(world, blockpos))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean OrangeCactus(World world, Random random, BlockPos position)
    {
        IBlockState state = CactusInit.cactusOrange.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && CactusInit.cactusOrange.canBlockStay(world, blockpos))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean PinkCactus(World world, Random random, BlockPos position)
    {
        IBlockState state = CactusInit.cactusPink.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && CactusInit.cactusPink.canBlockStay(world, blockpos))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean PurpleCactus(World world, Random random, BlockPos position)
    {
        IBlockState state = CactusInit.cactusPurple.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && CactusInit.cactusPurple.canBlockStay(world, blockpos))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean RedCactus(World world, Random random, BlockPos position)
    {
        IBlockState state = CactusInit.cactusRed.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && CactusInit.cactusRed.canBlockStay(world, blockpos))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean WhiteCactus(World world, Random random, BlockPos position)
    {
        IBlockState state = CactusInit.cactusWhite.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && CactusInit.cactusWhite.canBlockStay(world, blockpos))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean YellowCactus(World world, Random random, BlockPos position)
    {
        IBlockState state = CactusInit.cactusYellow.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && CactusInit.cactusYellow.canBlockStay(world, blockpos))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public void groups(Random random, int chunkX, int chunkZ, World world)
    {
        int posX = chunkX * 16 + 8;
        int posZ = chunkZ * 16 + 8;

        if(world.provider.getDimension() == 0)
        {
            if (random.nextInt(8) == 0)
            {
                final int xPos = posX + random.nextInt(16);
                final int yPos = random.nextInt(255);
                final int zPos = posZ + random.nextInt(16);

                final BlockPos newPos = new BlockPos(xPos, yPos, zPos);

                if (newPos != null)
                {
                    this.BlackCactus(world, random, newPos);
                }
            }

            //blue group
            if (random.nextInt(8) == 0)
            {
                final int xPos = posX + random.nextInt(16);
                final int yPos = random.nextInt(255);
                final int zPos = posZ + random.nextInt(16);

                final BlockPos newPos = new BlockPos(xPos, yPos, zPos);

                if (newPos != null)
                {
                    this.BlueCactus(world, random, newPos);
                    this.LightBlueCactus(world, random, newPos);
                }
            }

            if (random.nextInt(8) == 0)
            {
                final int xPos = posX + random.nextInt(16);
                final int yPos = random.nextInt(255);
                final int zPos = posZ + random.nextInt(16);

                final BlockPos newPos = new BlockPos(xPos, yPos, zPos);

                if (newPos != null)
                {
                    this.BrownCactus(world, random, newPos);
                }
            }

            if (random.nextInt(8) == 0)
            {
                final int xPos = posX + random.nextInt(16);
                final int yPos = random.nextInt(255);
                final int zPos = posZ + random.nextInt(16);

                final BlockPos newPos = new BlockPos(xPos, yPos, zPos);

                if (newPos != null)
                {
                    this.CyanCactus(world, random, newPos);
                }
            }

            //gray group
            if (random.nextInt(8) == 0)
            {
                final int xPos = posX + random.nextInt(16);
                final int yPos = random.nextInt(255);
                final int zPos = posZ + random.nextInt(16);

                final BlockPos newPos = new BlockPos(xPos, yPos, zPos);

                if (newPos != null)
                {
                    this.GrayCactus(world, random, newPos);
                    this.LightGrayCactus(world, random, newPos);
                }
            }

            if (random.nextInt(8) == 0)
            {
                final int xPos = posX + random.nextInt(16);
                final int yPos = random.nextInt(255);
                final int zPos = posZ + random.nextInt(16);

                final BlockPos newPos = new BlockPos(xPos, yPos, zPos);

                if (newPos != null)
                {
                    this.GreenCactus(world, random, newPos);
                }
            }

            if (random.nextInt(8) == 0)
            {
                final int xPos = posX + random.nextInt(16);
                final int yPos = random.nextInt(255);
                final int zPos = posZ + random.nextInt(16);

                final BlockPos newPos = new BlockPos(xPos, yPos, zPos);

                if (newPos != null)
                {
                    this.LimeCactus(world, random, newPos);
                }
            }

            if (random.nextInt(8) == 0)
            {
                final int xPos = posX + random.nextInt(16);
                final int yPos = random.nextInt(255);
                final int zPos = posZ + random.nextInt(16);

                final BlockPos newPos = new BlockPos(xPos, yPos, zPos);

                if (newPos != null)
                {
                    this.MagentaCactus(world, random, newPos);
                }
            }

            if (random.nextInt(8) == 0)
            {
                final int xPos = posX + random.nextInt(16);
                final int yPos = random.nextInt(255);
                final int zPos = posZ + random.nextInt(16);

                final BlockPos newPos = new BlockPos(xPos, yPos, zPos);

                if (newPos != null)
                {
                    this.OrangeCactus(world, random, newPos);
                }
            }

            if (random.nextInt(8) == 0)
            {
                final int xPos = posX + random.nextInt(16);
                final int yPos = random.nextInt(255);
                final int zPos = posZ + random.nextInt(16);

                final BlockPos newPos = new BlockPos(xPos, yPos, zPos);

                if (newPos != null)
                {
                    this.PinkCactus(world, random, newPos);
                }
            }

            if (random.nextInt(8) == 0)
            {
                final int xPos = posX + random.nextInt(16);
                final int yPos = random.nextInt(255);
                final int zPos = posZ + random.nextInt(16);

                final BlockPos newPos = new BlockPos(xPos, yPos, zPos);

                if (newPos != null)
                {
                    this.PurpleCactus(world, random, newPos);
                }
            }

            if (random.nextInt(8) == 0)
            {
                final int xPos = posX + random.nextInt(16);
                final int yPos = random.nextInt(255);
                final int zPos = posZ + random.nextInt(16);

                final BlockPos newPos = new BlockPos(xPos, yPos, zPos);

                if (newPos != null)
                {
                    this.RedCactus(world, random, newPos);
                }
            }

            if (random.nextInt(8) == 0)
            {
                final int xPos = posX + random.nextInt(16);
                final int yPos = random.nextInt(255);
                final int zPos = posZ + random.nextInt(16);

                final BlockPos newPos = new BlockPos(xPos, yPos, zPos);

                if (newPos != null)
                {
                    this.WhiteCactus(world, random, newPos);
                }
            }

            if (random.nextInt(8) == 0)
            {
                final int xPos = posX + random.nextInt(16);
                final int yPos = random.nextInt(255);
                final int zPos = posZ + random.nextInt(16);

                final BlockPos newPos = new BlockPos(xPos, yPos, zPos);

                if (newPos != null)
                {
                    this.YellowCactus(world, random, newPos);
                }
            }
        }
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
    {
        this.groups(random, chunkX, chunkZ, world);
    }
}