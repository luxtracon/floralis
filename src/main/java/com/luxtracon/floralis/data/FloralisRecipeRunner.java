package com.luxtracon.floralis.data;

import com.luxtracon.floralis.data.provider.FloralisRecipeProvider;

import java.util.concurrent.CompletableFuture;

import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisRecipeRunner extends RecipeProvider.Runner {
	public FloralisRecipeRunner(PackOutput pPackOutput, CompletableFuture<HolderLookup.Provider> pProvider) {
		super(pPackOutput, pProvider);
	}

	@Override
	public RecipeProvider createRecipeProvider(HolderLookup.Provider pProvider, RecipeOutput pRecipeOutput) {
		return new FloralisRecipeProvider(pProvider, pRecipeOutput);
	}

	@Override
	public String getName() {
		return "Recipes";
	}
}
