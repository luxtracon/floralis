package com.luxtracon.floralis.blocks;

import com.luxtracon.floralis.Main;
import com.luxtracon.floralis.inits.BlockInit;
import com.luxtracon.floralis.utilities.TileEntityPlantPot;
import com.luxtracon.floralis.utilities.Config;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.DamageSource;
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

public class BlockPotCactus extends BlockContainer
{
    public static final PropertyEnum<EnumCactusType> CONTENTS = PropertyEnum.create("contents", EnumCactusType.class);

    public static final AxisAlignedBB AABB = new AxisAlignedBB(0.25D, 0.0D, 0.25D, 0.75D, 0.5D, 0.75D);

    public BlockPotCactus(String name, Material material)
    {
        super(material);
        setRegistryName(name);
        setTranslationKey(name);
        setCreativeTab(Main.MODTAB);
        setSoundType(SoundType.STONE);
        setDefaultState(this.blockState.getBaseState().withProperty(CONTENTS, EnumCactusType.EMPTY));
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

        return block == BlockInit.cactusWhite || block == BlockInit.cactusOrange || block == BlockInit.cactusMagenta || block == BlockInit.cactusLightBlue || block == BlockInit.cactusYellow || block == BlockInit.cactusLime || block == BlockInit.cactusPink || block == BlockInit.cactusGray || block == BlockInit.cactusLightGray || block == BlockInit.cactusCyan || block == BlockInit.cactusPurple || block == BlockInit.cactusBlue || block == BlockInit.cactusBrown || block == BlockInit.cactusGreen || block == BlockInit.cactusRed || block == BlockInit.cactusBlack;
    }

    public void onEntityCollision(World world, BlockPos pos, IBlockState state, Entity entity)
    {
        TileEntityPlantPot tileentity = this.getTileEntity(world, pos);

        ItemStack itemstack = tileentity.getFlowerItemStack();

        if(!itemstack.isEmpty() && Config.cactidamage)
        {
            entity.attackEntityFrom(DamageSource.CACTUS, 1.0F);
        }
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
        if(state.getBlock() == BlockInit.potCactusBlack)
        {
            return MapColor.BLACK_STAINED_HARDENED_CLAY;
        }

        if(state.getBlock() == BlockInit.potCactusBlue)
        {
            return MapColor.BLUE_STAINED_HARDENED_CLAY;
        }

        if(state.getBlock() == BlockInit.potCactusBrown)
        {
            return MapColor.BROWN_STAINED_HARDENED_CLAY;
        }

        if(state.getBlock() == BlockInit.potCactusCyan)
        {
            return MapColor.CYAN_STAINED_HARDENED_CLAY;
        }

        if(state.getBlock() == BlockInit.potCactusGray)
        {
            return MapColor.GRAY_STAINED_HARDENED_CLAY;
        }

        if(state.getBlock() == BlockInit.potCactusGreen)
        {
            return MapColor.GREEN_STAINED_HARDENED_CLAY;
        }

        if(state.getBlock() == BlockInit.potCactusLightBlue)
        {
            return MapColor.LIGHT_BLUE_STAINED_HARDENED_CLAY;
        }

        if(state.getBlock() == BlockInit.potCactusLightGray)
        {
            return MapColor.SILVER_STAINED_HARDENED_CLAY;
        }

        if(state.getBlock() == BlockInit.potCactusLime)
        {
            return MapColor.LIME_STAINED_HARDENED_CLAY;
        }

        if(state.getBlock() == BlockInit.potCactusMagenta)
        {
            return MapColor.MAGENTA_STAINED_HARDENED_CLAY;
        }

        if(state.getBlock() == BlockInit.potCactusOrange)
        {
            return MapColor.ORANGE_STAINED_HARDENED_CLAY;
        }

        if(state.getBlock() == BlockInit.potCactusPink)
        {
            return MapColor.PINK_STAINED_HARDENED_CLAY;
        }

        if(state.getBlock() == BlockInit.potCactusPurple)
        {
            return MapColor.PURPLE_STAINED_HARDENED_CLAY;
        }

        if(state.getBlock() == BlockInit.potCactusRed)
        {
            return MapColor.RED_STAINED_HARDENED_CLAY;
        }

        if(state.getBlock() == BlockInit.potCactusWhite)
        {
            return MapColor.WHITE_STAINED_HARDENED_CLAY;
        }

        if(state.getBlock() == BlockInit.potCactusYellow)
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

        else if(state.getBlock() == BlockInit.potCactusBlack)
        {
            return new ItemStack(BlockInit.potCactusBlack);
        }

        else if(state.getBlock() == BlockInit.potCactusBlue)
        {
            return new ItemStack(BlockInit.potCactusBlue);
        }

        else if(state.getBlock() == BlockInit.potCactusBrown)
        {
            return new ItemStack(BlockInit.potCactusBrown);
        }

        else if(state.getBlock() == BlockInit.potCactusCyan)
        {
            return new ItemStack(BlockInit.potCactusCyan);
        }

        else if(state.getBlock() == BlockInit.potCactusGray)
        {
            return new ItemStack(BlockInit.potCactusGray);
        }

        else if(state.getBlock() == BlockInit.potCactusGreen)
        {
            return new ItemStack(BlockInit.potCactusGreen);
        }

        else if(state.getBlock() == BlockInit.potCactusLightBlue)
        {
            return new ItemStack(BlockInit.potCactusLightBlue);
        }

        else if(state.getBlock() == BlockInit.potCactusLightGray)
        {
            return new ItemStack(BlockInit.potCactusLightGray);
        }

        else if(state.getBlock() == BlockInit.potCactusLime)
        {
            return new ItemStack(BlockInit.potCactusLime);
        }

        else if(state.getBlock() == BlockInit.potCactusMagenta)
        {
            return new ItemStack(BlockInit.potCactusMagenta);
        }

        else if(state.getBlock() == BlockInit.potCactusOrange)
        {
            return new ItemStack(BlockInit.potCactusOrange);
        }

        else if(state.getBlock() == BlockInit.potCactusPink)
        {
            return new ItemStack(BlockInit.potCactusPink);
        }

        else if(state.getBlock() == BlockInit.potCactusPurple)
        {
            return new ItemStack(BlockInit.potCactusPurple);
        }

        else if(state.getBlock() == BlockInit.potCactusRed)
        {
            return new ItemStack(BlockInit.potCactusRed);
        }

        else if(state.getBlock() == BlockInit.potCactusWhite)
        {
            return new ItemStack(BlockInit.potCactusWhite);
        }

        else if(state.getBlock() == BlockInit.potCactusYellow)
        {
            return new ItemStack(BlockInit.potCactusYellow);
        }

        return null;
    }

    @SuppressWarnings("deprecation")
    public IBlockState getActualState(IBlockState state, IBlockAccess world, BlockPos pos)
    {
        EnumCactusType blockflowerpot$enumflowertype = EnumCactusType.EMPTY;

        TileEntity tileentity = world instanceof ChunkCache ? ((ChunkCache)world).getTileEntity(pos, Chunk.EnumCreateEntityType.CHECK) : world.getTileEntity(pos);

        if(tileentity instanceof TileEntityPlantPot)
        {
            TileEntityPlantPot tileentityflowerpot = (TileEntityPlantPot)tileentity;

            Item item = tileentityflowerpot.getFlowerPotItem();

            if(item instanceof ItemBlock)
            {
                Block block = Block.getBlockFromItem(item);

                if(block == BlockInit.cactusWhite)
                {
                    blockflowerpot$enumflowertype = EnumCactusType.WHITE;
                }

                else if(block == BlockInit.cactusOrange)
                {
                    blockflowerpot$enumflowertype = EnumCactusType.ORANGE;
                }

                else if(block == BlockInit.cactusMagenta)
                {
                    blockflowerpot$enumflowertype = EnumCactusType.MAGENTA;
                }

                else if(block == BlockInit.cactusLightBlue)
                {
                    blockflowerpot$enumflowertype = EnumCactusType.LIGHTBLUE;
                }

                else if(block == BlockInit.cactusYellow)
                {
                    blockflowerpot$enumflowertype = EnumCactusType.YELLOW;
                }

                else if(block == BlockInit.cactusLime)
                {
                    blockflowerpot$enumflowertype = EnumCactusType.LIME;
                }

                else if(block == BlockInit.cactusPink)
                {
                    blockflowerpot$enumflowertype = EnumCactusType.PINK;
                }

                else if(block == BlockInit.cactusGray)
                {
                    blockflowerpot$enumflowertype = EnumCactusType.GRAY;
                }

                else if(block == BlockInit.cactusLightGray)
                {
                    blockflowerpot$enumflowertype = EnumCactusType.LIGHTGRAY;
                }

                else if(block == BlockInit.cactusCyan)
                {
                    blockflowerpot$enumflowertype = EnumCactusType.CYAN;
                }

                else if(block == BlockInit.cactusPurple)
                {
                    blockflowerpot$enumflowertype = EnumCactusType.PURPLE;
                }

                else if(block == BlockInit.cactusBlue)
                {
                    blockflowerpot$enumflowertype = EnumCactusType.BLUE;
                }

                else if(block == BlockInit.cactusBrown)
                {
                    blockflowerpot$enumflowertype = EnumCactusType.BROWN;
                }

                else if(block == BlockInit.cactusGreen)
                {
                    blockflowerpot$enumflowertype = EnumCactusType.GREEN;
                }

                else if(block == BlockInit.cactusRed)
                {
                    blockflowerpot$enumflowertype = EnumCactusType.RED;
                }

                else if(block == BlockInit.cactusBlack)
                {
                    blockflowerpot$enumflowertype = EnumCactusType.BLACK;
                }
            }
        }

        return state.withProperty(CONTENTS, blockflowerpot$enumflowertype);
    }

    public enum EnumCactusType implements IStringSerializable
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

        EnumCactusType(String name)
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