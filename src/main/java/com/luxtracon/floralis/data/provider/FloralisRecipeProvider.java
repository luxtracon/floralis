package com.luxtracon.floralis.data.provider;

import com.luxtracon.floralis.common.registry.FloralisConstants;
import com.luxtracon.floralis.common.registry.FloralisItems;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;

import org.jspecify.annotations.NullMarked;

@NullMarked

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
		this.shaped(1, FloralisItems.WHITE_DYE_BLOCK.get(), Items.DYE.white());
		this.shaped(1, FloralisItems.LIGHT_GRAY_DYE_BLOCK.get(), Items.DYE.lightGray());
		this.shaped(1, FloralisItems.GRAY_DYE_BLOCK.get(), Items.DYE.gray());
		this.shaped(1, FloralisItems.BLACK_DYE_BLOCK.get(), Items.DYE.black());
		this.shaped(1, FloralisItems.BROWN_DYE_BLOCK.get(), Items.DYE.brown());
		this.shaped(1, FloralisItems.RED_DYE_BLOCK.get(), Items.DYE.red());
		this.shaped(1, FloralisItems.ORANGE_DYE_BLOCK.get(), Items.DYE.orange());
		this.shaped(1, FloralisItems.YELLOW_DYE_BLOCK.get(), Items.DYE.yellow());
		this.shaped(1, FloralisItems.LIME_DYE_BLOCK.get(), Items.DYE.lime());
		this.shaped(1, FloralisItems.GREEN_DYE_BLOCK.get(), Items.DYE.green());
		this.shaped(1, FloralisItems.CYAN_DYE_BLOCK.get(), Items.DYE.cyan());
		this.shaped(1, FloralisItems.LIGHT_BLUE_DYE_BLOCK.get(), Items.DYE.lightBlue());
		this.shaped(1, FloralisItems.BLUE_DYE_BLOCK.get(), Items.DYE.blue());
		this.shaped(1, FloralisItems.PURPLE_DYE_BLOCK.get(), Items.DYE.purple());
		this.shaped(1, FloralisItems.MAGENTA_DYE_BLOCK.get(), Items.DYE.magenta());
		this.shaped(1, FloralisItems.PINK_DYE_BLOCK.get(), Items.DYE.pink());
		this.shaped(1, FloralisItems.PLANT_FIBERS_BLOCK.get(), FloralisItems.PLANT_FIBERS.get());
	}

	public void shapeless() {
		this.shapeless(9, Items.DYE.white(), FloralisItems.WHITE_DYE_BLOCK.get());
		this.shapeless(9, Items.DYE.lightGray(), FloralisItems.LIGHT_GRAY_DYE_BLOCK.get());
		this.shapeless(9, Items.DYE.gray(), FloralisItems.GRAY_DYE_BLOCK.get());
		this.shapeless(9, Items.DYE.black(), FloralisItems.BLACK_DYE_BLOCK.get());
		this.shapeless(9, Items.DYE.brown(), FloralisItems.BROWN_DYE_BLOCK.get());
		this.shapeless(9, Items.DYE.red(), FloralisItems.RED_DYE_BLOCK.get());
		this.shapeless(9, Items.DYE.orange(), FloralisItems.ORANGE_DYE_BLOCK.get());
		this.shapeless(9, Items.DYE.yellow(), FloralisItems.YELLOW_DYE_BLOCK.get());
		this.shapeless(9, Items.DYE.lime(), FloralisItems.LIME_DYE_BLOCK.get());
		this.shapeless(9, Items.DYE.green(), FloralisItems.GREEN_DYE_BLOCK.get());
		this.shapeless(9, Items.DYE.cyan(), FloralisItems.CYAN_DYE_BLOCK.get());
		this.shapeless(9, Items.DYE.lightBlue(), FloralisItems.LIGHT_BLUE_DYE_BLOCK.get());
		this.shapeless(9, Items.DYE.blue(), FloralisItems.BLUE_DYE_BLOCK.get());
		this.shapeless(9, Items.DYE.purple(), FloralisItems.PURPLE_DYE_BLOCK.get());
		this.shapeless(9, Items.DYE.magenta(), FloralisItems.MAGENTA_DYE_BLOCK.get());
		this.shapeless(9, Items.DYE.pink(), FloralisItems.PINK_DYE_BLOCK.get());
		this.shapeless(9, FloralisItems.PLANT_FIBERS.get(), FloralisItems.PLANT_FIBERS_BLOCK.get());
	}

	public void smelting() {
		this.smelting(0.1F, 200, Items.DYE.white(), FloralisItems.WHITE_PETALS.get());
		this.smelting(0.1F, 200, Items.DYE.lightGray(), FloralisItems.LIGHT_GRAY_PETALS.get());
		this.smelting(0.1F, 200, Items.DYE.gray(), FloralisItems.GRAY_PETALS.get());
		this.smelting(0.1F, 200, Items.DYE.black(), FloralisItems.BLACK_PETALS.get());
		this.smelting(0.1F, 200, Items.DYE.brown(), FloralisItems.BROWN_PETALS.get());
		this.smelting(0.1F, 200, Items.DYE.red(), FloralisItems.RED_PETALS.get());
		this.smelting(0.1F, 200, Items.DYE.orange(), FloralisItems.ORANGE_PETALS.get());
		this.smelting(0.1F, 200, Items.DYE.yellow(), FloralisItems.YELLOW_PETALS.get());
		this.smelting(0.1F, 200, Items.DYE.lime(), FloralisItems.LIME_PETALS.get());
		this.smelting(0.1F, 200, Items.DYE.green(), FloralisItems.GREEN_PETALS.get());
		this.smelting(0.1F, 200, Items.DYE.cyan(), FloralisItems.CYAN_PETALS.get());
		this.smelting(0.1F, 200, Items.DYE.lightBlue(), FloralisItems.LIGHT_BLUE_PETALS.get());
		this.smelting(0.1F, 200, Items.DYE.blue(), FloralisItems.BLUE_PETALS.get());
		this.smelting(0.1F, 200, Items.DYE.purple(), FloralisItems.PURPLE_PETALS.get());
		this.smelting(0.1F, 200, Items.DYE.magenta(), FloralisItems.MAGENTA_PETALS.get());
		this.smelting(0.1F, 200, Items.DYE.pink(), FloralisItems.PINK_PETALS.get());
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
		SimpleCookingRecipeBuilder.smelting((Ingredient.of(pResource)), RecipeCategory.MISC, CookingBookCategory.MISC, pResult, pExperience, pTime)
			.unlockedBy(this.name(pResource), this.has(pResource))
			.save(this.output, this.key("smelting", pResult));
	}

	public ResourceKey<Recipe<?>> key(Item pResult, Item pResource) {
		return ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(FloralisConstants.FLORALIS, BuiltInRegistries.ITEM.getKey(pResult).getPath() + "_" + "from" + "_" + BuiltInRegistries.ITEM.getKey(pResource).getPath()));
	}

	public ResourceKey<Recipe<?>> key(String pFrom, Item pResult) {
		return ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(FloralisConstants.FLORALIS, BuiltInRegistries.ITEM.getKey(pResult).getPath() + "_" + "from" + "_" + pFrom));
	}

	public String name(Item pItem) {
		return "has" + "_" + pItem;
	}
}
