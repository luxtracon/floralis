package com.luxtracon.floralis.world;

import com.luxtracon.floralis.init.InitFlower;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;

import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class CustomWorldgen implements IWorldGenerator
{
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
    {
        this.groups(random, chunkX, chunkZ, world);
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

    public boolean BlackFlower(World world, Random random, BlockPos position)
    {
        IBlockState state = InitFlower.flowerBlack.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && InitFlower.flowerBlack.canBlockStay(world, blockpos, state))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }
        return true;
    }

    public boolean BlueFlower(World world, Random random, BlockPos position)
    {
        IBlockState state = InitFlower.flowerBlue.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && InitFlower.flowerBlue.canBlockStay(world, blockpos, state))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }
        return true;
    }

    public boolean BrownFlower(World world, Random random, BlockPos position)
    {
        IBlockState state = InitFlower.flowerBrown.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && InitFlower.flowerBrown.canBlockStay(world, blockpos, state))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }
        return true;
    }

    public boolean CyanFlower(World world, Random random, BlockPos position)
    {
        IBlockState state = InitFlower.flowerCyan.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && InitFlower.flowerCyan.canBlockStay(world, blockpos, state))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }
        return true;
    }

    public boolean GrayFlower(World world, Random random, BlockPos position)
    {
        IBlockState state = InitFlower.flowerGray.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && InitFlower.flowerGray.canBlockStay(world, blockpos, state))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }
        return true;
    }

    public boolean GreenFlower(World world, Random random, BlockPos position)
    {
        IBlockState state = InitFlower.flowerGreen.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && InitFlower.flowerGreen.canBlockStay(world, blockpos, state))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }
        return true;
    }

    public boolean LightBlueFlower(World world, Random random, BlockPos position)
    {
        IBlockState state = InitFlower.flowerLightBlue.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && InitFlower.flowerLightBlue.canBlockStay(world, blockpos, state))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }
        return true;
    }

    public boolean LightGrayFlower(World world, Random random, BlockPos position)
    {
        IBlockState state = InitFlower.flowerLightGray.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && InitFlower.flowerLightGray.canBlockStay(world, blockpos, state))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }
        return true;
    }

    public boolean LimeFlower(World world, Random random, BlockPos position)
    {
        IBlockState state = InitFlower.flowerLime.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && InitFlower.flowerLime.canBlockStay(world, blockpos, state))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }
        return true;
    }

    public boolean MagentaFlower(World world, Random random, BlockPos position)
    {
        IBlockState state = InitFlower.flowerMagenta.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && InitFlower.flowerMagenta.canBlockStay(world, blockpos, state))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }
        return true;
    }

    public boolean OrangeFlower(World world, Random random, BlockPos position)
    {
        IBlockState state = InitFlower.flowerOrange.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && InitFlower.flowerOrange.canBlockStay(world, blockpos, state))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }
        return true;
    }

    public boolean PinkFlower(World world, Random random, BlockPos position)
    {
        IBlockState state = InitFlower.flowerPink.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && InitFlower.flowerPink.canBlockStay(world, blockpos, state))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }
        return true;
    }

    public boolean PurpleFlower(World world, Random random, BlockPos position)
    {
        IBlockState state = InitFlower.flowerPurple.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && InitFlower.flowerPurple.canBlockStay(world, blockpos, state))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }
        return true;
    }

    public boolean RedFlower(World world, Random random, BlockPos position)
    {
        IBlockState state = InitFlower.flowerRed.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && InitFlower.flowerRed.canBlockStay(world, blockpos, state))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }
        return true;
    }

    public boolean WhiteFlower(World world, Random random, BlockPos position)
    {
        IBlockState state = InitFlower.flowerWhite.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && InitFlower.flowerWhite.canBlockStay(world, blockpos, state))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }
        return true;
    }

    public boolean YellowFlower(World world, Random random, BlockPos position)
    {
        IBlockState state = InitFlower.flowerYellow.getDefaultState();

        for (int tries = 0; tries < 64; tries++)
        {
            BlockPos blockpos = position.add(random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8), random.nextInt(8) - random.nextInt(8));

            if (world.isAirBlock(blockpos) && InitFlower.flowerYellow.canBlockStay(world, blockpos, state))
            {
                world.setBlockState(blockpos, state, 2);
            }
        }
        return true;
    }
}