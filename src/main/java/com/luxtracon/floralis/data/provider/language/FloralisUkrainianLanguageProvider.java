package com.luxtracon.floralis.data.provider.language;

import com.luxtracon.floralis.common.registry.FloralisBlocks;
import com.luxtracon.floralis.common.registry.FloralisConstants;
import com.luxtracon.floralis.common.registry.FloralisItems;
import com.luxtracon.floralis.data.provider.tags.FloralisBiomeTagsProvider;
import com.luxtracon.floralis.data.provider.tags.FloralisBlockTagsProvider;
import com.luxtracon.floralis.data.provider.tags.FloralisItemTagsProvider;

import com.mojang.logging.annotations.MethodsReturnNonnullByDefault;

import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.data.PackOutput;

import net.neoforged.neoforge.common.data.LanguageProvider;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisUkrainianLanguageProvider extends LanguageProvider {
	public FloralisUkrainianLanguageProvider(PackOutput pPackOutput, String pId, String pLanguage) {
		super(pPackOutput, pId, pLanguage);
	}

	@Override
	public void addTranslations() {
		this.add(FloralisBlocks.WHITE_DYE_BLOCK.get(), "Блок білого барвника");
		this.add(FloralisBlocks.LIGHT_GRAY_DYE_BLOCK.get(), "Блок світло-сірого барвника");
		this.add(FloralisBlocks.GRAY_DYE_BLOCK.get(), "Блок сірого барвника");
		this.add(FloralisBlocks.BLACK_DYE_BLOCK.get(), "Блок чорного барвника");
		this.add(FloralisBlocks.BROWN_DYE_BLOCK.get(), "Блок коричневого барвника");
		this.add(FloralisBlocks.RED_DYE_BLOCK.get(), "Блок червоного барвника");
		this.add(FloralisBlocks.ORANGE_DYE_BLOCK.get(), "Блок помаранчевого барвника");
		this.add(FloralisBlocks.YELLOW_DYE_BLOCK.get(), "Блок жовтого барвника");
		this.add(FloralisBlocks.LIME_DYE_BLOCK.get(), "Блок лаймового барвника");
		this.add(FloralisBlocks.GREEN_DYE_BLOCK.get(), "Блок зеленого барвника");
		this.add(FloralisBlocks.CYAN_DYE_BLOCK.get(), "Блок бірюзового барвника");
		this.add(FloralisBlocks.LIGHT_BLUE_DYE_BLOCK.get(), "Блок блакитного барвника");
		this.add(FloralisBlocks.BLUE_DYE_BLOCK.get(), "Блок синього барвника");
		this.add(FloralisBlocks.PURPLE_DYE_BLOCK.get(), "Блок фіолетового барвника");
		this.add(FloralisBlocks.MAGENTA_DYE_BLOCK.get(), "Блок пурпурового барвника");
		this.add(FloralisBlocks.PINK_DYE_BLOCK.get(), "Блок рожевого барвника");
		this.add(FloralisBlocks.PLANT_FIBERS_BLOCK.get(), "Блок рослинних волокон");
		this.add(FloralisBlocks.WHITE_CACTUS.get(), "Білий кактус");
		this.add(FloralisBlocks.LIGHT_GRAY_CACTUS.get(), "Світло-сірий кактус");
		this.add(FloralisBlocks.GRAY_CACTUS.get(), "Сірий кактус");
		this.add(FloralisBlocks.BLACK_CACTUS.get(), "Чорний кактус");
		this.add(FloralisBlocks.BROWN_CACTUS.get(), "Коричневий кактус");
		this.add(FloralisBlocks.RED_CACTUS.get(), "Червоний кактус");
		this.add(FloralisBlocks.ORANGE_CACTUS.get(), "Помаранчевий кактус");
		this.add(FloralisBlocks.YELLOW_CACTUS.get(), "Жовтий кактус");
		this.add(FloralisBlocks.LIME_CACTUS.get(), "Лаймовий кактус");
		this.add(FloralisBlocks.GREEN_CACTUS.get(), "Зелений кактус");
		this.add(FloralisBlocks.CYAN_CACTUS.get(), "Бірюзовий кактус");
		this.add(FloralisBlocks.LIGHT_BLUE_CACTUS.get(), "Блакитний кактус");
		this.add(FloralisBlocks.BLUE_CACTUS.get(), "Синій кактус");
		this.add(FloralisBlocks.PURPLE_CACTUS.get(), "Фіолетовий кактус");
		this.add(FloralisBlocks.MAGENTA_CACTUS.get(), "Пурпуровий кактус");
		this.add(FloralisBlocks.PINK_CACTUS.get(), "Рожевий кактус");
		this.add(FloralisBlocks.WHITE_FLOWER.get(), "Біла квітка");
		this.add(FloralisBlocks.LIGHT_GRAY_FLOWER.get(), "Світло-сіра квітка");
		this.add(FloralisBlocks.GRAY_FLOWER.get(), "Сіра квітка");
		this.add(FloralisBlocks.BLACK_FLOWER.get(), "Чорна квітка");
		this.add(FloralisBlocks.BROWN_FLOWER.get(), "Коричнева квітка");
		this.add(FloralisBlocks.RED_FLOWER.get(), "Червона квітка");
		this.add(FloralisBlocks.ORANGE_FLOWER.get(), "Помаранчева квітка");
		this.add(FloralisBlocks.YELLOW_FLOWER.get(), "Жовта квітка");
		this.add(FloralisBlocks.LIME_FLOWER.get(), "Лаймова квітка");
		this.add(FloralisBlocks.GREEN_FLOWER.get(), "Зелена квітка");
		this.add(FloralisBlocks.CYAN_FLOWER.get(), "Бірюзова квітка");
		this.add(FloralisBlocks.LIGHT_BLUE_FLOWER.get(), "Блакитна квітка");
		this.add(FloralisBlocks.BLUE_FLOWER.get(), "Синя квітка");
		this.add(FloralisBlocks.PURPLE_FLOWER.get(), "Фіолетова квітка");
		this.add(FloralisBlocks.MAGENTA_FLOWER.get(), "Пурпурова квітка");
		this.add(FloralisBlocks.PINK_FLOWER.get(), "Рожева квітка");

		this.add(FloralisItems.WHITE_CACTUS_SEEDS.get(), "Насіння білого кактуса");
		this.add(FloralisItems.LIGHT_GRAY_CACTUS_SEEDS.get(), "Насіння світло-сірого кактуса");
		this.add(FloralisItems.GRAY_CACTUS_SEEDS.get(), "Насіння сірого кактуса");
		this.add(FloralisItems.BLACK_CACTUS_SEEDS.get(), "Насіння чорного кактуса");
		this.add(FloralisItems.BROWN_CACTUS_SEEDS.get(), "Насіння коричневого кактуса");
		this.add(FloralisItems.RED_CACTUS_SEEDS.get(), "Насіння червоного кактуса");
		this.add(FloralisItems.ORANGE_CACTUS_SEEDS.get(), "Насіння помаранчевого кактуса");
		this.add(FloralisItems.YELLOW_CACTUS_SEEDS.get(), "Насіння жовтого кактуса");
		this.add(FloralisItems.LIME_CACTUS_SEEDS.get(), "Насіння лаймового кактуса");
		this.add(FloralisItems.GREEN_CACTUS_SEEDS.get(), "Насіння зеленого кактуса");
		this.add(FloralisItems.CYAN_CACTUS_SEEDS.get(), "Насіння бірюзового кактуса");
		this.add(FloralisItems.LIGHT_BLUE_CACTUS_SEEDS.get(), "Насіння блакитного кактуса");
		this.add(FloralisItems.BLUE_CACTUS_SEEDS.get(), "Насіння синього кактуса");
		this.add(FloralisItems.PURPLE_CACTUS_SEEDS.get(), "Насіння фіолетового кактуса");
		this.add(FloralisItems.MAGENTA_CACTUS_SEEDS.get(), "Насіння пурпурового кактуса");
		this.add(FloralisItems.PINK_CACTUS_SEEDS.get(), "Насіння рожевого кактуса");
		this.add(FloralisItems.WHITE_FLOWER_SEEDS.get(), "Насіння білої квітки");
		this.add(FloralisItems.LIGHT_GRAY_FLOWER_SEEDS.get(), "Насіння світло-сірої квітки");
		this.add(FloralisItems.GRAY_FLOWER_SEEDS.get(), "Насіння сірої квітки");
		this.add(FloralisItems.BLACK_FLOWER_SEEDS.get(), "Насіння чорної квітки");
		this.add(FloralisItems.BROWN_FLOWER_SEEDS.get(), "Насіння коричневої квітки");
		this.add(FloralisItems.RED_FLOWER_SEEDS.get(), "Насіння червоної квітки");
		this.add(FloralisItems.ORANGE_FLOWER_SEEDS.get(), "Насіння помаранчевої квітки");
		this.add(FloralisItems.YELLOW_FLOWER_SEEDS.get(), "Насіння жовтої квітки");
		this.add(FloralisItems.LIME_FLOWER_SEEDS.get(), "Насіння лаймової квітки");
		this.add(FloralisItems.GREEN_FLOWER_SEEDS.get(), "Насіння зеленої квітки");
		this.add(FloralisItems.CYAN_FLOWER_SEEDS.get(), "Насіння бірюзової квітки");
		this.add(FloralisItems.LIGHT_BLUE_FLOWER_SEEDS.get(), "Насіння блакитної квітки");
		this.add(FloralisItems.BLUE_FLOWER_SEEDS.get(), "Насіння синьої квітки");
		this.add(FloralisItems.PURPLE_FLOWER_SEEDS.get(), "Насіння фіолетової квітки");
		this.add(FloralisItems.MAGENTA_FLOWER_SEEDS.get(), "Насіння пурпурової квітки");
		this.add(FloralisItems.PINK_FLOWER_SEEDS.get(), "Насіння рожевої квітки");
		this.add(FloralisItems.WHITE_PETALS.get(), "Білі пелюстки");
		this.add(FloralisItems.LIGHT_GRAY_PETALS.get(), "Світло-сірі пелюстки");
		this.add(FloralisItems.GRAY_PETALS.get(), "Сірі пелюстки");
		this.add(FloralisItems.BLACK_PETALS.get(), "Чорні пелюстки");
		this.add(FloralisItems.BROWN_PETALS.get(), "Коричневі пелюстки");
		this.add(FloralisItems.RED_PETALS.get(), "Червоні пелюстки");
		this.add(FloralisItems.ORANGE_PETALS.get(), "Помаранчеві пелюстки");
		this.add(FloralisItems.YELLOW_PETALS.get(), "Жовті пелюстки");
		this.add(FloralisItems.LIME_PETALS.get(), "Лаймові пелюстки");
		this.add(FloralisItems.GREEN_PETALS.get(), "Зелені пелюстки");
		this.add(FloralisItems.CYAN_PETALS.get(), "Бірюзові пелюстки");
		this.add(FloralisItems.LIGHT_BLUE_PETALS.get(), "Блакитні пелюстки");
		this.add(FloralisItems.BLUE_PETALS.get(), "Сині пелюстки");
		this.add(FloralisItems.PURPLE_PETALS.get(), "Фіолетові пелюстки");
		this.add(FloralisItems.MAGENTA_PETALS.get(), "Пурпурові пелюстки");
		this.add(FloralisItems.PINK_PETALS.get(), "Рожеві пелюстки");
		this.add(FloralisItems.PLANT_FIBERS.get(), "Рослинні волокна");

		this.add(FloralisBiomeTagsProvider.HAS_CACTUS, "Has Cactus");
		this.add(FloralisBiomeTagsProvider.HAS_FLOWER, "Has Flower");

		this.add(FloralisBlockTagsProvider.STORAGE_BLOCKS_DYE, "Dye Storage Blocks");
		this.add(FloralisBlockTagsProvider.STORAGE_BLOCKS_PLANT_FIBERS, "Plant Fibers Storage Blocks");

		this.add(FloralisItemTagsProvider.SEEDS_CACTUS, "Cactus Seeds");
		this.add(FloralisItemTagsProvider.SEEDS_FLOWER, "Flower Seeds");
		this.add(FloralisItemTagsProvider.STORAGE_BLOCKS_DYE, "Dye Storage Blocks");
		this.add(FloralisItemTagsProvider.STORAGE_BLOCKS_PLANT_FIBERS, "Plant Fibers Storage Blocks");

		this.add("tab" + "." + FloralisConstants.FLORALIS + "." + "item_group", "Floralis");

		this.add("tip" + "." + FloralisConstants.FLORALIS + "." + "plant_fibers", "Використовується, як кісткове борошно або добриво");
	}

	@Override
	public String getName() {
		return "Ukrainian";
	}
}
