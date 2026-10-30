package com.luxtracon.floralis.recipes;

import com.luxtracon.floralis.Main;
import com.luxtracon.floralis.inits.BlockInit;
import com.luxtracon.floralis.inits.ItemInit;
import com.luxtracon.floralis.utilities.Config;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreIngredient;

public class CraftingRecipes
{
    public static void init()
    {
        if(Config.potload)
        {
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "block/pot/flower/white"), null, new ItemStack(BlockInit.potFlowerWhite), Ingredient.fromItem(Item.getItemFromBlock(Blocks.DIRT)), Ingredient.fromItem(ItemInit.potFiredWhite));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "block/pot/flower/orange"), null, new ItemStack(BlockInit.potFlowerOrange), Ingredient.fromItem(Item.getItemFromBlock(Blocks.DIRT)), Ingredient.fromItem(ItemInit.potFiredOrange));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "block/pot/flower/magenta"), null, new ItemStack(BlockInit.potFlowerMagenta), Ingredient.fromItem(Item.getItemFromBlock(Blocks.DIRT)), Ingredient.fromItem(ItemInit.potFiredMagenta));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "block/pot/flower/lightblue"), null, new ItemStack(BlockInit.potFlowerLightBlue), Ingredient.fromItem(Item.getItemFromBlock(Blocks.DIRT)), Ingredient.fromItem(ItemInit.potFiredLightBlue));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "block/pot/flower/yellow"), null, new ItemStack(BlockInit.potFlowerYellow), Ingredient.fromItem(Item.getItemFromBlock(Blocks.DIRT)), Ingredient.fromItem(ItemInit.potFiredYellow));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "block/pot/flower/lime"), null, new ItemStack(BlockInit.potFlowerLime), Ingredient.fromItem(Item.getItemFromBlock(Blocks.DIRT)), Ingredient.fromItem(ItemInit.potFiredLime));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "block/pot/flower/pink"), null, new ItemStack(BlockInit.potFlowerPink), Ingredient.fromItem(Item.getItemFromBlock(Blocks.DIRT)), Ingredient.fromItem(ItemInit.potFiredPink));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "block/pot/flower/gray"), null, new ItemStack(BlockInit.potFlowerGray), Ingredient.fromItem(Item.getItemFromBlock(Blocks.DIRT)), Ingredient.fromItem(ItemInit.potFiredGray));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "block/pot/flower/lightgray"), null, new ItemStack(BlockInit.potFlowerLightGray), Ingredient.fromItem(Item.getItemFromBlock(Blocks.DIRT)), Ingredient.fromItem(ItemInit.potFiredLightGray));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "block/pot/flower/cyan"), null, new ItemStack(BlockInit.potFlowerCyan), Ingredient.fromItem(Item.getItemFromBlock(Blocks.DIRT)), Ingredient.fromItem(ItemInit.potFiredCyan));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "block/pot/flower/purple"), null, new ItemStack(BlockInit.potFlowerPurple), Ingredient.fromItem(Item.getItemFromBlock(Blocks.DIRT)), Ingredient.fromItem(ItemInit.potFiredPurple));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "block/pot/flower/blue"), null, new ItemStack(BlockInit.potFlowerBlue), Ingredient.fromItem(Item.getItemFromBlock(Blocks.DIRT)), Ingredient.fromItem(ItemInit.potFiredBlue));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "block/pot/flower/brown"), null, new ItemStack(BlockInit.potFlowerBrown), Ingredient.fromItem(Item.getItemFromBlock(Blocks.DIRT)), Ingredient.fromItem(ItemInit.potFiredBrown));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "block/pot/flower/green"), null, new ItemStack(BlockInit.potFlowerGreen), Ingredient.fromItem(Item.getItemFromBlock(Blocks.DIRT)), Ingredient.fromItem(ItemInit.potFiredGreen));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "block/pot/flower/red"), null, new ItemStack(BlockInit.potFlowerRed), Ingredient.fromItem(Item.getItemFromBlock(Blocks.DIRT)), Ingredient.fromItem(ItemInit.potFiredRed));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "block/pot/flower/black"), null, new ItemStack(BlockInit.potFlowerBlack), Ingredient.fromItem(Item.getItemFromBlock(Blocks.DIRT)), Ingredient.fromItem(ItemInit.potFiredBlack));

            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "block/pot/cactus/white"), null, new ItemStack(BlockInit.potCactusWhite), Ingredient.fromItem(Item.getItemFromBlock(Blocks.SAND)), Ingredient.fromItem(ItemInit.potFiredWhite));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "block/pot/cactus/orange"), null, new ItemStack(BlockInit.potCactusOrange), Ingredient.fromItem(Item.getItemFromBlock(Blocks.SAND)), Ingredient.fromItem(ItemInit.potFiredOrange));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "block/pot/cactus/magenta"), null, new ItemStack(BlockInit.potCactusMagenta), Ingredient.fromItem(Item.getItemFromBlock(Blocks.SAND)), Ingredient.fromItem(ItemInit.potFiredMagenta));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "block/pot/cactus/lightblue"), null, new ItemStack(BlockInit.potCactusLightBlue), Ingredient.fromItem(Item.getItemFromBlock(Blocks.SAND)), Ingredient.fromItem(ItemInit.potFiredLightBlue));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "block/pot/cactus/yellow"), null, new ItemStack(BlockInit.potCactusYellow), Ingredient.fromItem(Item.getItemFromBlock(Blocks.SAND)), Ingredient.fromItem(ItemInit.potFiredYellow));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "block/pot/cactus/lime"), null, new ItemStack(BlockInit.potCactusLime), Ingredient.fromItem(Item.getItemFromBlock(Blocks.SAND)), Ingredient.fromItem(ItemInit.potFiredLime));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "block/pot/cactus/pink"), null, new ItemStack(BlockInit.potCactusPink), Ingredient.fromItem(Item.getItemFromBlock(Blocks.SAND)), Ingredient.fromItem(ItemInit.potFiredPink));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "block/pot/cactus/gray"), null, new ItemStack(BlockInit.potCactusGray), Ingredient.fromItem(Item.getItemFromBlock(Blocks.SAND)), Ingredient.fromItem(ItemInit.potFiredGray));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "block/pot/cactus/lightgray"), null, new ItemStack(BlockInit.potCactusLightGray), Ingredient.fromItem(Item.getItemFromBlock(Blocks.SAND)), Ingredient.fromItem(ItemInit.potFiredLightGray));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "block/pot/cactus/cyan"), null, new ItemStack(BlockInit.potCactusCyan), Ingredient.fromItem(Item.getItemFromBlock(Blocks.SAND)), Ingredient.fromItem(ItemInit.potFiredCyan));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "block/pot/cactus/purple"), null, new ItemStack(BlockInit.potCactusPurple), Ingredient.fromItem(Item.getItemFromBlock(Blocks.SAND)), Ingredient.fromItem(ItemInit.potFiredPurple));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "block/pot/cactus/blue"), null, new ItemStack(BlockInit.potCactusBlue), Ingredient.fromItem(Item.getItemFromBlock(Blocks.SAND)), Ingredient.fromItem(ItemInit.potFiredBlue));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "block/pot/cactus/brown"), null, new ItemStack(BlockInit.potCactusBrown), Ingredient.fromItem(Item.getItemFromBlock(Blocks.SAND)), Ingredient.fromItem(ItemInit.potFiredBrown));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "block/pot/cactus/green"), null, new ItemStack(BlockInit.potCactusGreen), Ingredient.fromItem(Item.getItemFromBlock(Blocks.SAND)), Ingredient.fromItem(ItemInit.potFiredGreen));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "block/pot/cactus/red"), null, new ItemStack(BlockInit.potCactusRed), Ingredient.fromItem(Item.getItemFromBlock(Blocks.SAND)), Ingredient.fromItem(ItemInit.potFiredRed));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "block/pot/cactus/black"), null, new ItemStack(BlockInit.potCactusBlack), Ingredient.fromItem(Item.getItemFromBlock(Blocks.SAND)), Ingredient.fromItem(ItemInit.potFiredBlack));
        }

        if(Config.potload && !Config.coloredclay)
        {
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/item/firedpot/white"), null, new ItemStack(ItemInit.potFiredWhite), Ingredient.fromItem(Items.FLOWER_POT), Ingredient.fromItem(ItemInit.dyeWhite));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/item/firedpot/orange"), null, new ItemStack(ItemInit.potFiredOrange), Ingredient.fromItem(Items.FLOWER_POT), Ingredient.fromItem(ItemInit.dyeOrange));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/item/firedpot/magenta"), null, new ItemStack(ItemInit.potFiredMagenta), Ingredient.fromItem(Items.FLOWER_POT), Ingredient.fromItem(ItemInit.dyeMagenta));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/item/firedpot/lightblue"), null, new ItemStack(ItemInit.potFiredLightBlue), Ingredient.fromItem(Items.FLOWER_POT), Ingredient.fromItem(ItemInit.dyeLightBlue));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/item/firedpot/yellow"), null, new ItemStack(ItemInit.potFiredYellow), Ingredient.fromItem(Items.FLOWER_POT), Ingredient.fromItem(ItemInit.dyeYellow));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/item/firedpot/lime"), null, new ItemStack(ItemInit.potFiredLime), Ingredient.fromItem(Items.FLOWER_POT), Ingredient.fromItem(ItemInit.dyeLime));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/item/firedpot/pink"), null, new ItemStack(ItemInit.potFiredPink), Ingredient.fromItem(Items.FLOWER_POT), Ingredient.fromItem(ItemInit.dyePink));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/item/firedpot/gray"), null, new ItemStack(ItemInit.potFiredGray), Ingredient.fromItem(Items.FLOWER_POT), Ingredient.fromItem(ItemInit.dyeGray));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/item/firedpot/lightgray"), null, new ItemStack(ItemInit.potFiredLightGray), Ingredient.fromItem(Items.FLOWER_POT), Ingredient.fromItem(ItemInit.dyeLightGray));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/item/firedpot/cyan"), null, new ItemStack(ItemInit.potFiredCyan), Ingredient.fromItem(Items.FLOWER_POT), Ingredient.fromItem(ItemInit.dyeCyan));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/item/firedpot/purple"), null, new ItemStack(ItemInit.potFiredPurple), Ingredient.fromItem(Items.FLOWER_POT), Ingredient.fromItem(ItemInit.dyePurple));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/item/firedpot/blue"), null, new ItemStack(ItemInit.potFiredBlue), Ingredient.fromItem(Items.FLOWER_POT), Ingredient.fromItem(ItemInit.dyeBlue));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/item/firedpot/brown"), null, new ItemStack(ItemInit.potFiredBrown), Ingredient.fromItem(Items.FLOWER_POT), Ingredient.fromItem(ItemInit.dyeBrown));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/item/firedpot/green"), null, new ItemStack(ItemInit.potFiredGreen), Ingredient.fromItem(Items.FLOWER_POT), Ingredient.fromItem(ItemInit.dyeGreen));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/item/firedpot/red"), null, new ItemStack(ItemInit.potFiredRed), Ingredient.fromItem(Items.FLOWER_POT), Ingredient.fromItem(ItemInit.dyeRed));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/item/firedpot/black"), null, new ItemStack(ItemInit.potFiredBlack), Ingredient.fromItem(Items.FLOWER_POT), Ingredient.fromItem(ItemInit.dyeBlack));
        }

        if(Config.potload && Config.coloredclay)
        {
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "item/item/pot/white"), null, new ItemStack(ItemInit.potUnfiredWhite), "   ", "C C", " C ", 'C', ItemInit.clayWhite);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "item/item/pot/orange"), null, new ItemStack(ItemInit.potUnfiredOrange), "   ", "C C", " C ", 'C', ItemInit.clayOrange);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "item/item/pot/magenta"), null, new ItemStack(ItemInit.potUnfiredMagenta), "   ", "C C", " C ", 'C', ItemInit.clayMagenta);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "item/item/pot/lightblue"), null, new ItemStack(ItemInit.potUnfiredLightBlue), "   ", "C C", " C ", 'C', ItemInit.clayLightBlue);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "item/item/pot/yellow"), null, new ItemStack(ItemInit.potUnfiredYellow), "   ", "C C", " C ", 'C', ItemInit.clayYellow);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "item/item/pot/lime"), null, new ItemStack(ItemInit.potUnfiredLime), "   ", "C C", " C ", 'C', ItemInit.clayLime);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "item/item/pot/pink"), null, new ItemStack(ItemInit.potUnfiredPink), "   ", "C C", " C ", 'C', ItemInit.clayPink);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "item/item/pot/gray"), null, new ItemStack(ItemInit.potUnfiredGray), "   ", "C C", " C ", 'C', ItemInit.clayGray);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "item/item/pot/lightgray"), null, new ItemStack(ItemInit.potUnfiredLightGray), "   ", "C C", " C ", 'C', ItemInit.clayLightGray);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "item/item/pot/cyan"), null, new ItemStack(ItemInit.potUnfiredCyan), "   ", "C C", " C ", 'C', ItemInit.clayCyan);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "item/item/pot/purple"), null, new ItemStack(ItemInit.potUnfiredPurple), "   ", "C C", " C ", 'C', ItemInit.clayPurple);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "item/item/pot/blue"), null, new ItemStack(ItemInit.potUnfiredBlue), "   ", "C C", " C ", 'C', ItemInit.clayBlue);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "item/item/pot/brown"), null, new ItemStack(ItemInit.potUnfiredBrown), "   ", "C C", " C ", 'C', ItemInit.clayBrown);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "item/item/pot/green"), null, new ItemStack(ItemInit.potUnfiredGreen), "   ", "C C", " C ", 'C', ItemInit.clayGreen);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "item/item/pot/red"), null, new ItemStack(ItemInit.potUnfiredRed), "   ", "C C", " C ", 'C', ItemInit.clayRed);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "item/item/pot/black"), null, new ItemStack(ItemInit.potUnfiredBlack), "   ", "C C", " C ", 'C', ItemInit.clayBlack);
        }

        if(Config.coloredclay)
        {
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/item/clay/white"), null, new ItemStack(ItemInit.clayWhite), new OreIngredient("dyeWhite"), Ingredient.fromItem(Items.CLAY_BALL));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/item/clay/orange"), null, new ItemStack(ItemInit.clayOrange), new OreIngredient("dyeOrange"), Ingredient.fromItem(Items.CLAY_BALL));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/item/clay/magenta"), null, new ItemStack(ItemInit.clayMagenta), new OreIngredient("dyeMagenta"), Ingredient.fromItem(Items.CLAY_BALL));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/item/clay/lightblue"), null, new ItemStack(ItemInit.clayLightBlue), new OreIngredient("dyeLightBlue"), Ingredient.fromItem(Items.CLAY_BALL));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/item/clay/yellow"), null, new ItemStack(ItemInit.clayYellow), new OreIngredient("dyeYellow"), Ingredient.fromItem(Items.CLAY_BALL));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/item/clay/lime"), null, new ItemStack(ItemInit.clayLime), new OreIngredient("dyeLime"), Ingredient.fromItem(Items.CLAY_BALL));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/item/clay/pink"), null, new ItemStack(ItemInit.clayPink), new OreIngredient("dyePink"), Ingredient.fromItem(Items.CLAY_BALL));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/item/clay/gray"), null, new ItemStack(ItemInit.clayGray), new OreIngredient("dyeGray"), Ingredient.fromItem(Items.CLAY_BALL));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/item/clay/lightgray"), null, new ItemStack(ItemInit.clayLightGray), new OreIngredient("dyeLightGray"), Ingredient.fromItem(Items.CLAY_BALL));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/item/clay/cyan"), null, new ItemStack(ItemInit.clayCyan), new OreIngredient("dyeCyan"), Ingredient.fromItem(Items.CLAY_BALL));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/item/clay/purple"), null, new ItemStack(ItemInit.clayPurple), new OreIngredient("dyePurple"), Ingredient.fromItem(Items.CLAY_BALL));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/item/clay/blue"), null, new ItemStack(ItemInit.clayBlue), new OreIngredient("dyeBlue"), Ingredient.fromItem(Items.CLAY_BALL));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/item/clay/brown"), null, new ItemStack(ItemInit.clayBrown), new OreIngredient("dyeBrown"), Ingredient.fromItem(Items.CLAY_BALL));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/item/clay/green"), null, new ItemStack(ItemInit.clayGreen), new OreIngredient("dyeGreen"), Ingredient.fromItem(Items.CLAY_BALL));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/item/clay/red"), null, new ItemStack(ItemInit.clayRed), new OreIngredient("dyeRed"), Ingredient.fromItem(Items.CLAY_BALL));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/item/clay/black"), null, new ItemStack(ItemInit.clayBlack), new OreIngredient("dyeBlack"), Ingredient.fromItem(Items.CLAY_BALL));

            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "block/block/clay/white"), null, new ItemStack(BlockInit.blockClayWhite), "CCC", "CCC", "CCC", 'C', ItemInit.clayWhite);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "block/block/clay/orange"), null, new ItemStack(BlockInit.blockClayOrange), "CCC", "CCC", "CCC", 'C', ItemInit.clayOrange);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "block/block/clay/magenta"), null, new ItemStack(BlockInit.blockClayMagenta), "CCC", "CCC", "CCC", 'C', ItemInit.clayMagenta);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "block/block/clay/lightblue"), null, new ItemStack(BlockInit.blockClayLightBlue), "CCC", "CCC", "CCC", 'C', ItemInit.clayLightBlue);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "block/block/clay/yellow"), null, new ItemStack(BlockInit.blockClayYellow), "CCC", "CCC", "CCC", 'C', ItemInit.clayYellow);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "block/block/clay/lime"), null, new ItemStack(BlockInit.blockClayLime), "CCC", "CCC", "CCC", 'C', ItemInit.clayLime);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "block/block/clay/pink"), null, new ItemStack(BlockInit.blockClayPink), "CCC", "CCC", "CCC", 'C', ItemInit.clayPink);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "block/block/clay/gray"), null, new ItemStack(BlockInit.blockClayGray), "CCC", "CCC", "CCC", 'C', ItemInit.clayGray);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "block/block/clay/lightgray"), null, new ItemStack(BlockInit.blockClayLightGray), "CCC", "CCC", "CCC", 'C', ItemInit.clayLightGray);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "block/block/clay/cyan"), null, new ItemStack(BlockInit.blockClayCyan), "CCC", "CCC", "CCC", 'C', ItemInit.clayCyan);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "block/block/clay/purple"), null, new ItemStack(BlockInit.blockClayPurple), "CCC", "CCC", "CCC", 'C', ItemInit.clayPurple);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "block/block/clay/blue"), null, new ItemStack(BlockInit.blockClayBlue), "CCC", "CCC", "CCC", 'C', ItemInit.clayBlue);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "block/block/clay/brown"), null, new ItemStack(BlockInit.blockClayBrown), "CCC", "CCC", "CCC", 'C', ItemInit.clayBrown);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "block/block/clay/green"), null, new ItemStack(BlockInit.blockClayGreen), "CCC", "CCC", "CCC", 'C', ItemInit.clayGreen);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "block/block/clay/red"), null, new ItemStack(BlockInit.blockClayRed), "CCC", "CCC", "CCC", 'C', ItemInit.clayRed);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "block/block/clay/black"), null, new ItemStack(BlockInit.blockClayBlack), "CCC", "CCC", "CCC", 'C', ItemInit.clayBlack);

            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/block/clay/white"), null, new ItemStack(ItemInit.clayWhite, 9), Ingredient.fromItem(Item.getItemFromBlock(BlockInit.blockClayWhite)));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/block/clay/orange"), null, new ItemStack(ItemInit.clayOrange, 9), Ingredient.fromItem(Item.getItemFromBlock(BlockInit.blockClayOrange)));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/block/clay/magenta"), null, new ItemStack(ItemInit.clayMagenta, 9), Ingredient.fromItem(Item.getItemFromBlock(BlockInit.blockClayMagenta)));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/block/clay/lightblue"), null, new ItemStack(ItemInit.clayLightBlue, 9), Ingredient.fromItem(Item.getItemFromBlock(BlockInit.blockClayLightBlue)));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/block/clay/yellow"), null, new ItemStack(ItemInit.clayYellow, 9), Ingredient.fromItem(Item.getItemFromBlock(BlockInit.blockClayYellow)));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/block/clay/lime"), null, new ItemStack(ItemInit.clayLime, 9), Ingredient.fromItem(Item.getItemFromBlock(BlockInit.blockClayLime)));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/block/clay/pink"), null, new ItemStack(ItemInit.clayPink, 9), Ingredient.fromItem(Item.getItemFromBlock(BlockInit.blockClayPink)));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/block/clay/gray"), null, new ItemStack(ItemInit.clayGray, 9), Ingredient.fromItem(Item.getItemFromBlock(BlockInit.blockClayGray)));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/block/clay/lightgray"), null, new ItemStack(ItemInit.clayLightGray, 9), Ingredient.fromItem(Item.getItemFromBlock(BlockInit.blockClayLightGray)));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/block/clay/cyan"), null, new ItemStack(ItemInit.clayCyan, 9), Ingredient.fromItem(Item.getItemFromBlock(BlockInit.blockClayCyan)));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/block/clay/purple"), null, new ItemStack(ItemInit.clayPurple, 9), Ingredient.fromItem(Item.getItemFromBlock(BlockInit.blockClayPurple)));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/block/clay/blue"), null, new ItemStack(ItemInit.clayBlue, 9), Ingredient.fromItem(Item.getItemFromBlock(BlockInit.blockClayBlue)));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/block/clay/brown"), null, new ItemStack(ItemInit.clayBrown, 9), Ingredient.fromItem(Item.getItemFromBlock(BlockInit.blockClayBrown)));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/block/clay/green"), null, new ItemStack(ItemInit.clayGreen, 9), Ingredient.fromItem(Item.getItemFromBlock(BlockInit.blockClayGreen)));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/block/clay/red"), null, new ItemStack(ItemInit.clayRed, 9), Ingredient.fromItem(Item.getItemFromBlock(BlockInit.blockClayRed)));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/block/clay/black"), null, new ItemStack(ItemInit.clayBlack, 9), Ingredient.fromItem(Item.getItemFromBlock(BlockInit.blockClayBlack)));
        }

        if(Config.cosmeticblocks)
        {
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "block/block/dye/white"), null, new ItemStack(BlockInit.blockDyeWhite), "DDD", "DDD", "DDD", 'D', ItemInit.dyeWhite);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "block/block/dye/orange"), null, new ItemStack(BlockInit.blockDyeOrange), "DDD", "DDD", "DDD", 'D', ItemInit.dyeOrange);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "block/block/dye/magenta"), null, new ItemStack(BlockInit.blockDyeMagenta), "DDD", "DDD", "DDD", 'D', ItemInit.dyeMagenta);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "block/block/dye/lightblue"), null, new ItemStack(BlockInit.blockDyeLightBlue), "DDD", "DDD", "DDD", 'D', ItemInit.dyeLightBlue);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "block/block/dye/yellow"), null, new ItemStack(BlockInit.blockDyeYellow), "DDD", "DDD", "DDD", 'D', ItemInit.dyeYellow);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "block/block/dye/lime"), null, new ItemStack(BlockInit.blockDyeLime), "DDD", "DDD", "DDD", 'D', ItemInit.dyeLime);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "block/block/dye/pink"), null, new ItemStack(BlockInit.blockDyePink), "DDD", "DDD", "DDD", 'D', ItemInit.dyePink);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "block/block/dye/gray"), null, new ItemStack(BlockInit.blockDyeGray), "DDD", "DDD", "DDD", 'D', ItemInit.dyeGray);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "block/block/dye/lightgray"), null, new ItemStack(BlockInit.blockDyeLightGray), "DDD", "DDD", "DDD", 'D', ItemInit.dyeLightGray);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "block/block/dye/cyan"), null, new ItemStack(BlockInit.blockDyeCyan), "DDD", "DDD", "DDD", 'D', ItemInit.dyeCyan);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "block/block/dye/purple"), null, new ItemStack(BlockInit.blockDyePurple), "DDD", "DDD", "DDD", 'D', ItemInit.dyePurple);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "block/block/dye/blue"), null, new ItemStack(BlockInit.blockDyeBlue), "DDD", "DDD", "DDD", 'D', ItemInit.dyeBlue);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "block/block/dye/brown"), null, new ItemStack(BlockInit.blockDyeBrown), "DDD", "DDD", "DDD", 'D', ItemInit.dyeBrown);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "block/block/dye/green"), null, new ItemStack(BlockInit.blockDyeGreen), "DDD", "DDD", "DDD", 'D', ItemInit.dyeGreen);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "block/block/dye/red"), null, new ItemStack(BlockInit.blockDyeRed), "DDD", "DDD", "DDD", 'D', ItemInit.dyeRed);
            GameRegistry.addShapedRecipe(new ResourceLocation(Main.MODID, "block/block/dye/black"), null, new ItemStack(BlockInit.blockDyeBlack), "DDD", "DDD", "DDD", 'D', ItemInit.dyeBlack);

            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/block/dye/white"), null, new ItemStack(ItemInit.dyeWhite, 9), Ingredient.fromItem(Item.getItemFromBlock(BlockInit.blockDyeWhite)));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/block/dye/orange"), null, new ItemStack(ItemInit.dyeOrange, 9), Ingredient.fromItem(Item.getItemFromBlock(BlockInit.blockDyeOrange)));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/block/dye/magenta"), null, new ItemStack(ItemInit.dyeMagenta, 9), Ingredient.fromItem(Item.getItemFromBlock(BlockInit.blockDyeMagenta)));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/block/dye/lightblue"), null, new ItemStack(ItemInit.dyeLightBlue, 9), Ingredient.fromItem(Item.getItemFromBlock(BlockInit.blockDyeLightBlue)));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/block/dye/yellow"), null, new ItemStack(ItemInit.dyeYellow, 9), Ingredient.fromItem(Item.getItemFromBlock(BlockInit.blockDyeYellow)));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/block/dye/lime"), null, new ItemStack(ItemInit.dyeLime, 9), Ingredient.fromItem(Item.getItemFromBlock(BlockInit.blockDyeLime)));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/block/dye/pink"), null, new ItemStack(ItemInit.dyePink, 9), Ingredient.fromItem(Item.getItemFromBlock(BlockInit.blockDyePink)));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/block/dye/gray"), null, new ItemStack(ItemInit.dyeGray, 9), Ingredient.fromItem(Item.getItemFromBlock(BlockInit.blockDyeGray)));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/block/dye/lightgray"), null, new ItemStack(ItemInit.dyeLightGray, 9), Ingredient.fromItem(Item.getItemFromBlock(BlockInit.blockDyeLightGray)));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/block/dye/cyan"), null, new ItemStack(ItemInit.dyeCyan, 9), Ingredient.fromItem(Item.getItemFromBlock(BlockInit.blockDyeCyan)));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/block/dye/purple"), null, new ItemStack(ItemInit.dyePurple, 9), Ingredient.fromItem(Item.getItemFromBlock(BlockInit.blockDyePurple)));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/block/dye/blue"), null, new ItemStack(ItemInit.dyeBlue, 9), Ingredient.fromItem(Item.getItemFromBlock(BlockInit.blockDyeBlue)));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/block/dye/brown"), null, new ItemStack(ItemInit.dyeBrown, 9), Ingredient.fromItem(Item.getItemFromBlock(BlockInit.blockDyeBrown)));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/block/dye/green"), null, new ItemStack(ItemInit.dyeGreen, 9), Ingredient.fromItem(Item.getItemFromBlock(BlockInit.blockDyeGreen)));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/block/dye/red"), null, new ItemStack(ItemInit.dyeRed, 9), Ingredient.fromItem(Item.getItemFromBlock(BlockInit.blockDyeRed)));
            GameRegistry.addShapelessRecipe(new ResourceLocation(Main.MODID, "item/block/dye/black"), null, new ItemStack(ItemInit.dyeBlack, 9), Ingredient.fromItem(Item.getItemFromBlock(BlockInit.blockDyeBlack)));
        }
    }
}