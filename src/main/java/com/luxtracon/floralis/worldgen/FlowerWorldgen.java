package com.luxtracon.floralis.worldgen;

import com.luxtracon.floralis.init.FlowerInit;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;

import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class FlowerWorldgen implements IWorldGenerator
{
    public boolean BlackFlower(World world, Random random, BlockPos position)
    {
        IBlockState state = FlowerInit.flowerBlack.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && FlowerInit.flowerBlack.canBlockStay(world, blockpos, state))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean BlueFlower(World world, Random random, BlockPos position)
    {
        IBlockState state = FlowerInit.flowerBlue.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && FlowerInit.flowerBlue.canBlockStay(world, blockpos, state))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean BrownFlower(World world, Random random, BlockPos position)
    {
        IBlockState state = FlowerInit.flowerBrown.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && FlowerInit.flowerBrown.canBlockStay(world, blockpos, state))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean CyanFlower(World world, Random random, BlockPos position)
    {
        IBlockState state = FlowerInit.flowerCyan.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && FlowerInit.flowerCyan.canBlockStay(world, blockpos, state))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean GrayFlower(World world, Random random, BlockPos position)
    {
        IBlockState state = FlowerInit.flowerGray.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && FlowerInit.flowerGray.canBlockStay(world, blockpos, state))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean GreenFlower(World world, Random random, BlockPos position)
    {
        IBlockState state = FlowerInit.flowerGreen.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && FlowerInit.flowerGreen.canBlockStay(world, blockpos, state))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean LightBlueFlower(World world, Random random, BlockPos position)
    {
        IBlockState state = FlowerInit.flowerLightBlue.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && FlowerInit.flowerLightBlue.canBlockStay(world, blockpos, state))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean LightGrayFlower(World world, Random random, BlockPos position)
    {
        IBlockState state = FlowerInit.flowerLightGray.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && FlowerInit.flowerLightGray.canBlockStay(world, blockpos, state))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean LimeFlower(World world, Random random, BlockPos position)
    {
        IBlockState state = FlowerInit.flowerLime.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && FlowerInit.flowerLime.canBlockStay(world, blockpos, state))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean MagentaFlower(World world, Random random, BlockPos position)
    {
        IBlockState state = FlowerInit.flowerMagenta.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && FlowerInit.flowerMagenta.canBlockStay(world, blockpos, state))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean OrangeFlower(World world, Random random, BlockPos position)
    {
        IBlockState state = FlowerInit.flowerOrange.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && FlowerInit.flowerOrange.canBlockStay(world, blockpos, state))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean PinkFlower(World world, Random random, BlockPos position)
    {
        IBlockState state = FlowerInit.flowerPink.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && FlowerInit.flowerPink.canBlockStay(world, blockpos, state))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean PurpleFlower(World world, Random random, BlockPos position)
    {
        IBlockState state = FlowerInit.flowerPurple.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && FlowerInit.flowerPurple.canBlockStay(world, blockpos, state))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean RedFlower(World world, Random random, BlockPos position)
    {
        IBlockState state = FlowerInit.flowerRed.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && FlowerInit.flowerRed.canBlockStay(world, blockpos, state))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean WhiteFlower(World world, Random random, BlockPos position)
    {
        IBlockState state = FlowerInit.flowerWhite.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && FlowerInit.flowerWhite.canBlockStay(world, blockpos, state))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }

        return true;
    }

    public boolean YellowFlower(World world, Random random, BlockPos position)
    {
        IBlockState state = FlowerInit.flowerYellow.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && FlowerInit.flowerYellow.canBlockStay(world, blockpos, state))
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

        if (random.nextInt(8) == 0)
        {
            final int xPos = posX + random.nextInt(16);
            final int yPos = random.nextInt(255);
            final int zPos = posZ + random.nextInt(16);

            final BlockPos newPos = new BlockPos(xPos, yPos, zPos);

            if (newPos != null)
            {
                this.BlackFlower(world, random, newPos);
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
                this.BlueFlower(world, random, newPos);
                this.LightBlueFlower(world, random, newPos);
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
                this.BrownFlower(world, random, newPos);
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
                this.CyanFlower(world, random, newPos);
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
                this.GrayFlower(world, random, newPos);
                this.LightGrayFlower(world, random, newPos);
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
                this.GreenFlower(world, random, newPos);
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
                this.LimeFlower(world, random, newPos);
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
                this.MagentaFlower(world, random, newPos);
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
                this.OrangeFlower(world, random, newPos);
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
                this.PinkFlower(world, random, newPos);
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
                this.PurpleFlower(world, random, newPos);
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
                this.RedFlower(world, random, newPos);
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
                this.WhiteFlower(world, random, newPos);
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
                this.YellowFlower(world, random, newPos);
            }
        }
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
    {
        this.groups(random, chunkX, chunkZ, world);
    }
}