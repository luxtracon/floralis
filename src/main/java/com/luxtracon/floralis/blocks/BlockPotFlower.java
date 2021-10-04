package com.luxtracon.floralis.blocks;

import com.luxtracon.floralis.Main;
import com.luxtracon.floralis.inits.BlockInit;
import com.luxtracon.floralis.utilities.TileEntityPlantPot;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ChunkCache;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;

import java.util.Random;

public class BlockPotFlower extends BlockContainer
{
    public static final PropertyEnum<EnumFlowerType> CONTENTS = PropertyEnum.create("contents", EnumFlowerType.class);

    public static final AxisAlignedBB AABB = new AxisAlignedBB(0.25D, 0.0D, 0.25D, 0.75D, 0.5D, 0.75D);

    public BlockPotFlower(String name, Material material)
    {
        super(material);
        setRegistryName(name);
        setTranslationKey(name);
        setCreativeTab(Main.MODTAB);
        setSoundType(SoundType.STONE);
        this.setDefaultState(this.blockState.getBaseState().withProperty(CONTENTS, EnumFlowerType.EMPTY));
    }

    public int getMetaFromState(IBlockState state)
    {
        return 0;
    }

    public boolean removedByPlayer(IBlockState state, World world, BlockPos pos, EntityPlayer player, boolean willHarvest)
    {
        if(willHarvest) return true;

        return super.removedByPlayer(state, world, pos, player, willHarvest);
    }

    public boolean canBePotted(ItemStack stack)
    {
        Block block = Block.getBlockFromItem(stack.getItem());

        return block == BlockInit.flowerWhite || block == BlockInit.flowerOrange || block == BlockInit.flowerMagenta || block == BlockInit.flowerLightBlue || block == BlockInit.flowerYellow || block == BlockInit.flowerLime || block == BlockInit.flowerPink || block == BlockInit.flowerGray || block == BlockInit.flowerLightGray || block == BlockInit.flowerCyan || block == BlockInit.flowerPurple || block == BlockInit.flowerBlue || block == BlockInit.flowerBrown || block == BlockInit.flowerGreen || block == BlockInit.flowerRed || block == BlockInit.flowerBlack;
    }

    public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
    {
        super.getDrops(drops, world, pos, state, fortune);

        TileEntityPlantPot tileentity = world.getTileEntity(pos) instanceof TileEntityPlantPot ? (TileEntityPlantPot)world.getTileEntity(pos) : null;

        if(tileentity != null && tileentity.getFlowerPotItem() != null)
        {
            drops.add(new ItemStack(tileentity.getFlowerPotItem(), 1, tileentity.getFlowerPotData()));
        }
    }

    public void onBlockHarvested(World world, BlockPos pos, IBlockState state, EntityPlayer player)
    {
        super.onBlockHarvested(world, pos, state, player);

        if(player.capabilities.isCreativeMode)
        {
            TileEntityPlantPot tileentityflowerpot = this.getTileEntity(world, pos);

            if(tileentityflowerpot != null)
            {
                tileentityflowerpot.setItemStack(ItemStack.EMPTY);
            }
        }
    }

    @SuppressWarnings("deprecation")
    public boolean isFullCube(IBlockState state)
    {
        return false;
    }

    @SuppressWarnings("deprecation")
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

    @Override
    public void breakBlock(World world, BlockPos pos, IBlockState state)
    {
        super.breakBlock(world, pos, state);
    }

    @Override
    public void harvestBlock(World world, EntityPlayer player, BlockPos pos, IBlockState state, TileEntity tileentity, ItemStack tool)
    {
        super.harvestBlock(world, player, pos, state, tileentity, tool);

        world.setBlockToAir(pos);
    }

    @SuppressWarnings("deprecation")
    public boolean canPlaceBlockAt(World world, BlockPos pos)
    {
        IBlockState downState = world.getBlockState(pos.down());

        return super.canPlaceBlockAt(world, pos) && (downState.isTopSolid() || downState.getBlockFaceShape(world, pos.down(), EnumFacing.UP) == BlockFaceShape.SOLID);
    }

    @SuppressWarnings("deprecation")
    public void neighborChanged(IBlockState state, World world, BlockPos pos, Block block, BlockPos fromPos)
    {
        IBlockState downState = world.getBlockState(pos.down());

        if(!downState.isTopSolid() && downState.getBlockFaceShape(world, pos.down(), EnumFacing.UP) != BlockFaceShape.SOLID)
        {
            this.dropBlockAsItem(world, pos, state, 0);

            world.setBlockToAir(pos);
        }
    }

    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        ItemStack stackhand = player.getHeldItem(hand);

        TileEntityPlantPot tileentity = this.getTileEntity(world, pos);

        if(tileentity == null)
        {
            return false;
        }

        else
        {
            ItemStack stacktile = tileentity.getFlowerItemStack();

            if(stacktile.isEmpty())
            {
                if(!this.canBePotted(stackhand))
                {
                    return false;
                }

                tileentity.setItemStack(stackhand);

                player.addStat(StatList.FLOWER_POTTED);
                player.playSound(SoundEvents.BLOCK_GRASS_PLACE, 1.0F, 1.0F);

                if(!player.capabilities.isCreativeMode)
                {
                    stackhand.shrink(1);
                }
            }

            else
            {
                if(stackhand.isEmpty())
                {
                    player.setHeldItem(hand, stacktile);
                }

                else if(!player.addItemStackToInventory(stacktile))
                {
                    player.dropItem(stacktile, false);
                }

                tileentity.setItemStack(ItemStack.EMPTY);
            }

            tileentity.markDirty();

            world.notifyBlockUpdate(pos, state, state, 3);

            return true;
        }
    }

    public BlockRenderLayer getRenderLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }

    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(this);
    }

    public BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, CONTENTS);
    }

    public TileEntity createNewTileEntity(World world, int meta)
    {
        return new TileEntityPlantPot(Item.getItemFromBlock(null), 0);
    }

    private TileEntityPlantPot getTileEntity(World world, BlockPos pos)
    {
        TileEntity tileentity = world.getTileEntity(pos);

        return tileentity instanceof TileEntityPlantPot ? (TileEntityPlantPot)tileentity : null;
    }

    @SuppressWarnings("deprecation")
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return AABB;
    }

    @SuppressWarnings("deprecation")
    public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing face)
    {
        return BlockFaceShape.UNDEFINED;
    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState state)
    {
        return EnumBlockRenderType.MODEL;
    }

    @SuppressWarnings("deprecation")
    @Override
    public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos)
    {
        if(state.getBlock() == BlockInit.potFlowerBlack)
        {
            return MapColor.BLACK_STAINED_HARDENED_CLAY;
        }

        if(state.getBlock() == BlockInit.potFlowerBlue)
        {
            return MapColor.BLUE_STAINED_HARDENED_CLAY;
        }

        if(state.getBlock() == BlockInit.potFlowerBrown)
        {
            return MapColor.BROWN_STAINED_HARDENED_CLAY;
        }

        if(state.getBlock() == BlockInit.potFlowerCyan)
        {
            return MapColor.CYAN_STAINED_HARDENED_CLAY;
        }

        if(state.getBlock() == BlockInit.potFlowerGray)
        {
            return MapColor.GRAY_STAINED_HARDENED_CLAY;
        }

        if(state.getBlock() == BlockInit.potFlowerGreen)
        {
            return MapColor.GREEN_STAINED_HARDENED_CLAY;
        }

        if(state.getBlock() == BlockInit.potFlowerLightBlue)
        {
            return MapColor.LIGHT_BLUE_STAINED_HARDENED_CLAY;
        }

        if(state.getBlock() == BlockInit.potFlowerLightGray)
        {
            return MapColor.SILVER_STAINED_HARDENED_CLAY;
        }

        if(state.getBlock() == BlockInit.potFlowerLime)
        {
            return MapColor.LIME_STAINED_HARDENED_CLAY;
        }

        if(state.getBlock() == BlockInit.potFlowerMagenta)
        {
            return MapColor.MAGENTA_STAINED_HARDENED_CLAY;
        }

        if(state.getBlock() == BlockInit.potFlowerOrange)
        {
            return MapColor.ORANGE_STAINED_HARDENED_CLAY;
        }

        if(state.getBlock() == BlockInit.potFlowerPink)
        {
            return MapColor.PINK_STAINED_HARDENED_CLAY;
        }

        if(state.getBlock() == BlockInit.potFlowerPurple)
        {
            return MapColor.PURPLE_STAINED_HARDENED_CLAY;
        }

        if(state.getBlock() == BlockInit.potFlowerRed)
        {
            return MapColor.RED_STAINED_HARDENED_CLAY;
        }

        if(state.getBlock() == BlockInit.potFlowerWhite)
        {
            return MapColor.WHITE_STAINED_HARDENED_CLAY;
        }

        if(state.getBlock() == BlockInit.potFlowerYellow)
        {
            return MapColor.YELLOW_STAINED_HARDENED_CLAY;
        }

        return null;
    }

    @SuppressWarnings("deprecation")
    public ItemStack getItem(World world, BlockPos pos, IBlockState state)
    {
        TileEntityPlantPot tileentity = this.getTileEntity(world, pos);

        ItemStack itemstack = tileentity.getFlowerItemStack();

        if(tileentity != null && !itemstack.isEmpty())
        {
            return itemstack;
        }

        else if(state.getBlock() == BlockInit.potFlowerBlack)
        {
            return new ItemStack(BlockInit.potFlowerBlack);
        }

        else if(state.getBlock() == BlockInit.potFlowerBlue)
        {
            return new ItemStack(BlockInit.potFlowerBlue);
        }

        else if(state.getBlock() == BlockInit.potFlowerBrown)
        {
            return new ItemStack(BlockInit.potFlowerBrown);
        }

        else if(state.getBlock() == BlockInit.potFlowerCyan)
        {
            return new ItemStack(BlockInit.potFlowerCyan);
        }

        else if(state.getBlock() == BlockInit.potFlowerGray)
        {
            return new ItemStack(BlockInit.potFlowerGray);
        }

        else if(state.getBlock() == BlockInit.potFlowerGreen)
        {
            return new ItemStack(BlockInit.potFlowerGreen);
        }

        else if(state.getBlock() == BlockInit.potFlowerLightBlue)
        {
            return new ItemStack(BlockInit.potFlowerLightBlue);
        }

        else if(state.getBlock() == BlockInit.potFlowerLightGray)
        {
            return new ItemStack(BlockInit.potFlowerLightGray);
        }

        else if(state.getBlock() == BlockInit.potFlowerLime)
        {
            return new ItemStack(BlockInit.potFlowerLime);
        }

        else if(state.getBlock() == BlockInit.potFlowerMagenta)
        {
            return new ItemStack(BlockInit.potFlowerMagenta);
        }

        else if(state.getBlock() == BlockInit.potFlowerOrange)
        {
            return new ItemStack(BlockInit.potFlowerOrange);
        }

        else if(state.getBlock() == BlockInit.potFlowerPink)
        {
            return new ItemStack(BlockInit.potFlowerPink);
        }

        else if(state.getBlock() == BlockInit.potFlowerPurple)
        {
            return new ItemStack(BlockInit.potFlowerPurple);
        }

        else if(state.getBlock() == BlockInit.potFlowerRed)
        {
            return new ItemStack(BlockInit.potFlowerRed);
        }

        else if(state.getBlock() == BlockInit.potFlowerWhite)
        {
            return new ItemStack(BlockInit.potFlowerWhite);
        }

        else if(state.getBlock() == BlockInit.potFlowerYellow)
        {
            return new ItemStack(BlockInit.potFlowerYellow);
        }

        return null;
    }

    @SuppressWarnings("deprecation")
    public IBlockState getActualState(IBlockState state, IBlockAccess world, BlockPos pos)
    {
        EnumFlowerType blockflowerpot$enumflowertype = EnumFlowerType.EMPTY;

        TileEntity tileentity = world instanceof ChunkCache ? ((ChunkCache)world).getTileEntity(pos, Chunk.EnumCreateEntityType.CHECK) : world.getTileEntity(pos);

        if(tileentity instanceof TileEntityPlantPot)
        {
            TileEntityPlantPot tileentityflowerpot = (TileEntityPlantPot)tileentity;

            Item item = tileentityflowerpot.getFlowerPotItem();

            if(item instanceof ItemBlock)
            {
                Block block = Block.getBlockFromItem(item);

                if(block == BlockInit.flowerWhite)
                {
                    blockflowerpot$enumflowertype = EnumFlowerType.WHITE;
                }

                else if(block == BlockInit.flowerOrange)
                {
                    blockflowerpot$enumflowertype = EnumFlowerType.ORANGE;
                }

                else if(block == BlockInit.flowerMagenta)
                {
                    blockflowerpot$enumflowertype = EnumFlowerType.MAGENTA;
                }

                else if(block == BlockInit.flowerLightBlue)
                {
                    blockflowerpot$enumflowertype = EnumFlowerType.LIGHTBLUE;
                }

                else if(block == BlockInit.flowerYellow)
                {
                    blockflowerpot$enumflowertype = EnumFlowerType.YELLOW;
                }

                else if(block == BlockInit.flowerLime)
                {
                    blockflowerpot$enumflowertype = EnumFlowerType.LIME;
                }

                else if(block == BlockInit.flowerPink)
                {
                    blockflowerpot$enumflowertype = EnumFlowerType.PINK;
                }

                else if(block == BlockInit.flowerGray)
                {
                    blockflowerpot$enumflowertype = EnumFlowerType.GRAY;
                }

                else if(block == BlockInit.flowerLightGray)
                {
                    blockflowerpot$enumflowertype = EnumFlowerType.LIGHTGRAY;
                }

                else if(block == BlockInit.flowerCyan)
                {
                    blockflowerpot$enumflowertype = EnumFlowerType.CYAN;
                }

                else if(block == BlockInit.flowerPurple)
                {
                    blockflowerpot$enumflowertype = EnumFlowerType.PURPLE;
                }

                else if(block == BlockInit.flowerBlue)
                {
                    blockflowerpot$enumflowertype = EnumFlowerType.BLUE;
                }

                else if(block == BlockInit.flowerBrown)
                {
                    blockflowerpot$enumflowertype = EnumFlowerType.BROWN;
                }

                else if(block == BlockInit.flowerGreen)
                {
                    blockflowerpot$enumflowertype = EnumFlowerType.GREEN;
                }

                else if(block == BlockInit.flowerRed)
                {
                    blockflowerpot$enumflowertype = EnumFlowerType.RED;
                }

                else if(block == BlockInit.flowerBlack)
                {
                    blockflowerpot$enumflowertype = EnumFlowerType.BLACK;
                }
            }
        }

        return state.withProperty(CONTENTS, blockflowerpot$enumflowertype);
    }

    public enum EnumFlowerType implements IStringSerializable
    {
        EMPTY("empty"),
        WHITE("white"),
        ORANGE("orange"),
        MAGENTA("magenta"),
        LIGHTBLUE("lightblue"),
        YELLOW("yellow"),
        LIME("lime"),
        PINK("pink"),
        GRAY("gray"),
        LIGHTGRAY("lightgray"),
        CYAN("cyan"),
        PURPLE("purple"),
        BLUE("blue"),
        BROWN("brown"),
        GREEN("green"),
        RED("red"),
        BLACK("black");

        private final String name;

        EnumFlowerType(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return this.name;
        }

        public String getName()
        {
            return this.name;
        }
    }
}