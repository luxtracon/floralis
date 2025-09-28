package com.luxtracon.floralis.data.provider;

import com.luxtracon.floralis.common.registry.FloralisConstants;
import com.luxtracon.floralis.common.registry.FloralisItems;

import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisRecipeProvider extends RecipeProvider {
	public FloralisRecipeProvider(HolderLookup.Provider pProvider, RecipeOutput pRecipeOutput) {
		super(pProvider, pRecipeOutput);
	}

	@Override
	public void buildRecipes() {
		this.shaped();
		this.shapeless();
		this.smelting();
	}

	public void shaped() {
		this.shaped(1, FloralisItems.WHITE_DYE_BLOCK.get(), Items.WHITE_DYE);
		this.shaped(1, FloralisItems.LIGHT_GRAY_DYE_BLOCK.get(), Items.LIGHT_GRAY_DYE);
		this.shaped(1, FloralisItems.GRAY_DYE_BLOCK.get(), Items.GRAY_DYE);
		this.shaped(1, FloralisItems.BLACK_DYE_BLOCK.get(), Items.BLACK_DYE);
		this.shaped(1, FloralisItems.BROWN_DYE_BLOCK.get(), Items.BROWN_DYE);
		this.shaped(1, FloralisItems.RED_DYE_BLOCK.get(), Items.RED_DYE);
		this.shaped(1, FloralisItems.ORANGE_DYE_BLOCK.get(), Items.ORANGE_DYE);
		this.shaped(1, FloralisItems.YELLOW_DYE_BLOCK.get(), Items.YELLOW_DYE);
		this.shaped(1, FloralisItems.LIME_DYE_BLOCK.get(), Items.LIME_DYE);
		this.shaped(1, FloralisItems.GREEN_DYE_BLOCK.get(), Items.GREEN_DYE);
		this.shaped(1, FloralisItems.CYAN_DYE_BLOCK.get(), Items.CYAN_DYE);
		this.shaped(1, FloralisItems.LIGHT_BLUE_DYE_BLOCK.get(), Items.LIGHT_BLUE_DYE);
		this.shaped(1, FloralisItems.BLUE_DYE_BLOCK.get(), Items.BLUE_DYE);
		this.shaped(1, FloralisItems.PURPLE_DYE_BLOCK.get(), Items.PURPLE_DYE);
		this.shaped(1, FloralisItems.MAGENTA_DYE_BLOCK.get(), Items.MAGENTA_DYE);
		this.shaped(1, FloralisItems.PINK_DYE_BLOCK.get(), Items.PINK_DYE);
		this.shaped(1, FloralisItems.PLANT_FIBERS_BLOCK.get(), FloralisItems.PLANT_FIBERS.get());
	}

	public void shapeless() {
		this.shapeless(9, Items.WHITE_DYE, FloralisItems.WHITE_DYE_BLOCK.get());
		this.shapeless(9, Items.LIGHT_GRAY_DYE, FloralisItems.LIGHT_GRAY_DYE_BLOCK.get());
		this.shapeless(9, Items.GRAY_DYE, FloralisItems.GRAY_DYE_BLOCK.get());
		this.shapeless(9, Items.BLACK_DYE, FloralisItems.BLACK_DYE_BLOCK.get());
		this.shapeless(9, Items.BROWN_DYE, FloralisItems.BROWN_DYE_BLOCK.get());
		this.shapeless(9, Items.RED_DYE, FloralisItems.RED_DYE_BLOCK.get());
		this.shapeless(9, Items.ORANGE_DYE, FloralisItems.ORANGE_DYE_BLOCK.get());
		this.shapeless(9, Items.YELLOW_DYE, FloralisItems.YELLOW_DYE_BLOCK.get());
		this.shapeless(9, Items.LIME_DYE, FloralisItems.LIME_DYE_BLOCK.get());
		this.shapeless(9, Items.GREEN_DYE, FloralisItems.GREEN_DYE_BLOCK.get());
		this.shapeless(9, Items.CYAN_DYE, FloralisItems.CYAN_DYE_BLOCK.get());
		this.shapeless(9, Items.LIGHT_BLUE_DYE, FloralisItems.LIGHT_BLUE_DYE_BLOCK.get());
		this.shapeless(9, Items.BLUE_DYE, FloralisItems.BLUE_DYE_BLOCK.get());
		this.shapeless(9, Items.PURPLE_DYE, FloralisItems.PURPLE_DYE_BLOCK.get());
		this.shapeless(9, Items.MAGENTA_DYE, FloralisItems.MAGENTA_DYE_BLOCK.get());
		this.shapeless(9, Items.PINK_DYE, FloralisItems.PINK_DYE_BLOCK.get());
		this.shapeless(9, FloralisItems.PLANT_FIBERS.get(), FloralisItems.PLANT_FIBERS_BLOCK.get());
	}

	public void smelting() {
		this.smelting(0.1F, 200, Items.WHITE_DYE, FloralisItems.WHITE_PETALS.get());
		this.smelting(0.1F, 200, Items.LIGHT_GRAY_DYE, FloralisItems.LIGHT_GRAY_PETALS.get());
		this.smelting(0.1F, 200, Items.GRAY_DYE, FloralisItems.GRAY_PETALS.get());
		this.smelting(0.1F, 200, Items.BLACK_DYE, FloralisItems.BLACK_PETALS.get());
		this.smelting(0.1F, 200, Items.BROWN_DYE, FloralisItems.BROWN_PETALS.get());
		this.smelting(0.1F, 200, Items.RED_DYE, FloralisItems.RED_PETALS.get());
		this.smelting(0.1F, 200, Items.ORANGE_DYE, FloralisItems.ORANGE_PETALS.get());
		this.smelting(0.1F, 200, Items.YELLOW_DYE, FloralisItems.YELLOW_PETALS.get());
		this.smelting(0.1F, 200, Items.LIME_DYE, FloralisItems.LIME_PETALS.get());
		this.smelting(0.1F, 200, Items.GREEN_DYE, FloralisItems.GREEN_PETALS.get());
		this.smelting(0.1F, 200, Items.CYAN_DYE, FloralisItems.CYAN_PETALS.get());
		this.smelting(0.1F, 200, Items.LIGHT_BLUE_DYE, FloralisItems.LIGHT_BLUE_PETALS.get());
		this.smelting(0.1F, 200, Items.BLUE_DYE, FloralisItems.BLUE_PETALS.get());
		this.smelting(0.1F, 200, Items.PURPLE_DYE, FloralisItems.PURPLE_PETALS.get());
		this.smelting(0.1F, 200, Items.MAGENTA_DYE, FloralisItems.MAGENTA_PETALS.get());
		this.smelting(0.1F, 200, Items.PINK_DYE, FloralisItems.PINK_PETALS.get());
	}

	public void shaped(int pAmount, Item pResult, Item pResource) {
		this.shaped(RecipeCategory.MISC, pResult, pAmount)
			.define('A', pResource)
			.pattern("AAA")
			.pattern("AAA")
			.pattern("AAA")
			.unlockedBy(this.name(pResource), this.has(pResource))
			.save(this.output, this.key(pResult, pResource));
	}

	public void shapeless(int pAmount, Item pResult, Item pResource) {
		this.shapeless(RecipeCategory.MISC, pResult, pAmount)
			.requires(pResource)
			.unlockedBy(this.name(pResource), this.has(pResource))
			.save(this.output, this.key(pResult, pResource));
	}

	public void smelting(float pExperience, int pTime, Item pResult, Item pResource) {
		SimpleCookingRecipeBuilder.smelting((Ingredient.of(pResource)), RecipeCategory.MISC, pResult, pExperience, pTime)
			.unlockedBy(this.name(pResource), this.has(pResource))
			.save(this.output, this.key("smelting", pResult));
	}

	public ResourceKey<Recipe<?>> key(Item pResult, Item pResource) {
		return ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(FloralisConstants.FLORALIS, BuiltInRegistries.ITEM.getKey(pResult).getPath() + "_" + "from" + "_" + BuiltInRegistries.ITEM.getKey(pResource).getPath()));
	}

	public ResourceKey<Recipe<?>> key(String pFrom, Item pResult) {
		return ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(FloralisConstants.FLORALIS, BuiltInRegistries.ITEM.getKey(pResult).getPath() + "_" + "from" + "_" + pFrom));
	}

	public String name(Item pItem) {
		return "has" + "_" + pItem;
	}
}
