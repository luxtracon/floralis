package com.luxtracon.floralis.worldgens;

import com.luxtracon.floralis.inits.BlockInit;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;

import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class WorldgenCactus implements IWorldGenerator
{
    public boolean BlackCactus(World world, Random random, BlockPos position)
    {
        IBlockState state = BlockInit.cactusBlack.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && BlockInit.cactusBlack.canBlockStay(world, blockpos))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean BlueCactus(World world, Random random, BlockPos position)
    {
        IBlockState state = BlockInit.cactusBlue.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && BlockInit.cactusBlue.canBlockStay(world, blockpos))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean BrownCactus(World world, Random random, BlockPos position)
    {
        IBlockState state = BlockInit.cactusBrown.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && BlockInit.cactusBrown.canBlockStay(world, blockpos))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean CyanCactus(World world, Random random, BlockPos position)
    {
        IBlockState state = BlockInit.cactusCyan.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && BlockInit.cactusCyan.canBlockStay(world, blockpos))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean GrayCactus(World world, Random random, BlockPos position)
    {
        IBlockState state = BlockInit.cactusGray.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && BlockInit.cactusGray.canBlockStay(world, blockpos))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean GreenCactus(World world, Random random, BlockPos position)
    {
        IBlockState state = BlockInit.cactusGreen.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && BlockInit.cactusGreen.canBlockStay(world, blockpos))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean LightBlueCactus(World world, Random random, BlockPos position)
    {
        IBlockState state = BlockInit.cactusLightBlue.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && BlockInit.cactusLightBlue.canBlockStay(world, blockpos))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean LightGrayCactus(World world, Random random, BlockPos position)
    {
        IBlockState state = BlockInit.cactusLightGray.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && BlockInit.cactusLightGray.canBlockStay(world, blockpos))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean LimeCactus(World world, Random random, BlockPos position)
    {
        IBlockState state = BlockInit.cactusLime.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && BlockInit.cactusLime.canBlockStay(world, blockpos))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean MagentaCactus(World world, Random random, BlockPos position)
    {
        IBlockState state = BlockInit.cactusMagenta.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && BlockInit.cactusMagenta.canBlockStay(world, blockpos))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean OrangeCactus(World world, Random random, BlockPos position)
    {
        IBlockState state = BlockInit.cactusOrange.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && BlockInit.cactusOrange.canBlockStay(world, blockpos))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean PinkCactus(World world, Random random, BlockPos position)
    {
        IBlockState state = BlockInit.cactusPink.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && BlockInit.cactusPink.canBlockStay(world, blockpos))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean PurpleCactus(World world, Random random, BlockPos position)
    {
        IBlockState state = BlockInit.cactusPurple.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && BlockInit.cactusPurple.canBlockStay(world, blockpos))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean RedCactus(World world, Random random, BlockPos position)
    {
        IBlockState state = BlockInit.cactusRed.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && BlockInit.cactusRed.canBlockStay(world, blockpos))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean WhiteCactus(World world, Random random, BlockPos position)
    {
        IBlockState state = BlockInit.cactusWhite.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && BlockInit.cactusWhite.canBlockStay(world, blockpos))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean YellowCactus(World world, Random random, BlockPos position)
    {
        IBlockState state = BlockInit.cactusYellow.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && BlockInit.cactusYellow.canBlockStay(world, blockpos))
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

        if(world.provider.getDimension() == 0 && world.getWorldType() != WorldType.FLAT)
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