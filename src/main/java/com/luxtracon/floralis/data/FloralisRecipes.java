package com.luxtracon.floralis.data;

import com.luxtracon.floralis.registry.FloralisConstants;
import com.luxtracon.floralis.registry.FloralisItems;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.concurrent.CompletableFuture;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault

public class FloralisRecipes extends RecipeProvider {
	public FloralisRecipes(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pProvider) {
		super(pOutput, pProvider);
	}

	@Override
	protected void buildRecipes(RecipeOutput pOutput) {
		this.craftingRecipe(pOutput, FloralisItems.WHITE_DYE_BLOCK.get(), Items.WHITE_DYE);
		this.craftingRecipe(pOutput, FloralisItems.LIGHT_GRAY_DYE_BLOCK.get(), Items.LIGHT_GRAY_DYE);
		this.craftingRecipe(pOutput, FloralisItems.GRAY_DYE_BLOCK.get(), Items.GRAY_DYE);
		this.craftingRecipe(pOutput, FloralisItems.BLACK_DYE_BLOCK.get(), Items.BLACK_DYE);
		this.craftingRecipe(pOutput, FloralisItems.BROWN_DYE_BLOCK.get(), Items.BROWN_DYE);
		this.craftingRecipe(pOutput, FloralisItems.RED_DYE_BLOCK.get(), Items.RED_DYE);
		this.craftingRecipe(pOutput, FloralisItems.ORANGE_DYE_BLOCK.get(), Items.ORANGE_DYE);
		this.craftingRecipe(pOutput, FloralisItems.YELLOW_DYE_BLOCK.get(), Items.YELLOW_DYE);
		this.craftingRecipe(pOutput, FloralisItems.LIME_DYE_BLOCK.get(), Items.LIME_DYE);
		this.craftingRecipe(pOutput, FloralisItems.GREEN_DYE_BLOCK.get(), Items.GREEN_DYE);
		this.craftingRecipe(pOutput, FloralisItems.CYAN_DYE_BLOCK.get(), Items.CYAN_DYE);
		this.craftingRecipe(pOutput, FloralisItems.LIGHT_BLUE_DYE_BLOCK.get(), Items.LIGHT_BLUE_DYE);
		this.craftingRecipe(pOutput, FloralisItems.BLUE_DYE_BLOCK.get(), Items.BLUE_DYE);
		this.craftingRecipe(pOutput, FloralisItems.PURPLE_DYE_BLOCK.get(), Items.PURPLE_DYE);
		this.craftingRecipe(pOutput, FloralisItems.MAGENTA_DYE_BLOCK.get(), Items.MAGENTA_DYE);
		this.craftingRecipe(pOutput, FloralisItems.PINK_DYE_BLOCK.get(), Items.PINK_DYE);

		this.craftingRecipe(pOutput, FloralisItems.PLANT_FIBERS_BLOCK.get(), FloralisItems.PLANT_FIBERS.get());

		this.smeltingRecipe(pOutput, FloralisItems.WHITE_PETALS.get(), Items.WHITE_DYE, 0.1F, 200);
		this.smeltingRecipe(pOutput, FloralisItems.LIGHT_GRAY_PETALS.get(), Items.LIGHT_GRAY_DYE, 0.1F, 200);
		this.smeltingRecipe(pOutput, FloralisItems.GRAY_PETALS.get(), Items.GRAY_DYE, 0.1F, 200);
		this.smeltingRecipe(pOutput, FloralisItems.BLACK_PETALS.get(), Items.BLACK_DYE, 0.1F, 200);
		this.smeltingRecipe(pOutput, FloralisItems.BROWN_PETALS.get(), Items.BROWN_DYE, 0.1F, 200);
		this.smeltingRecipe(pOutput, FloralisItems.RED_PETALS.get(), Items.RED_DYE, 0.1F, 200);
		this.smeltingRecipe(pOutput, FloralisItems.ORANGE_PETALS.get(), Items.ORANGE_DYE, 0.1F, 200);
		this.smeltingRecipe(pOutput, FloralisItems.YELLOW_PETALS.get(), Items.YELLOW_DYE, 0.1F, 200);
		this.smeltingRecipe(pOutput, FloralisItems.LIME_PETALS.get(), Items.LIME_DYE, 0.1F, 200);
		this.smeltingRecipe(pOutput, FloralisItems.GREEN_PETALS.get(), Items.GREEN_DYE, 0.1F, 200);
		this.smeltingRecipe(pOutput, FloralisItems.CYAN_PETALS.get(), Items.CYAN_DYE, 0.1F, 200);
		this.smeltingRecipe(pOutput, FloralisItems.LIGHT_BLUE_PETALS.get(), Items.LIGHT_BLUE_DYE, 0.1F, 200);
		this.smeltingRecipe(pOutput, FloralisItems.BLUE_PETALS.get(), Items.BLUE_DYE, 0.1F, 200);
		this.smeltingRecipe(pOutput, FloralisItems.PURPLE_PETALS.get(), Items.PURPLE_DYE, 0.1F, 200);
		this.smeltingRecipe(pOutput, FloralisItems.MAGENTA_PETALS.get(), Items.MAGENTA_DYE, 0.1F, 200);
		this.smeltingRecipe(pOutput, FloralisItems.PINK_PETALS.get(), Items.PINK_DYE, 0.1F, 200);
	}

	public void craftingRecipe(RecipeOutput pOutput, Item pBlock, Item pItem) {
		ShapelessRecipeBuilder
			.shapeless(RecipeCategory.MISC, pBlock, 1)
			.requires(pItem, 9)
			.unlockedBy(RecipeProvider.getHasName(pItem), RecipeProvider.has(pItem))
			.save(pOutput, FloralisConstants.FLORALIS + ":" + RecipeProvider.getItemName(pBlock) + "_" + "from" + "_" + RecipeProvider.getItemName(pItem));

		ShapelessRecipeBuilder
			.shapeless(RecipeCategory.MISC, pItem, 9)
			.requires(pBlock, 1)
			.unlockedBy(RecipeProvider.getHasName(pBlock), RecipeProvider.has(pBlock))
			.save(pOutput, FloralisConstants.FLORALIS + ":" + RecipeProvider.getItemName(pItem) + "_" + "from" + "_" + RecipeProvider.getItemName(pBlock));
	}

	public void smeltingRecipe(RecipeOutput pOutput, Item pResource, Item pResult, float pExperience, int pTime) {
		SimpleCookingRecipeBuilder
			.smelting(Ingredient.of(pResource), RecipeCategory.MISC, pResult, pExperience, pTime)
			.unlockedBy(RecipeProvider.getHasName(pResource), RecipeProvider.has(pResource))
			.save(pOutput, FloralisConstants.FLORALIS + ":" + RecipeProvider.getItemName(pResult) + "_" + "from" + "_" + "smelting" + "_" + RecipeProvider.getItemName(pResource));
	}
}
