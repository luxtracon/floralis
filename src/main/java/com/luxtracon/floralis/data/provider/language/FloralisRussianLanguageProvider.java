package com.luxtracon.floralis.data.provider.language;

import com.luxtracon.floralis.common.registry.FloralisBlocks;
import com.luxtracon.floralis.common.registry.FloralisConstants;
import com.luxtracon.floralis.common.registry.FloralisItems;
import com.luxtracon.floralis.data.provider.tags.FloralisBiomeTagsProvider;
import com.luxtracon.floralis.data.provider.tags.FloralisBlockTagsProvider;
import com.luxtracon.floralis.data.provider.tags.FloralisItemTagsProvider;

import javax.annotation.ParametersAreNonnullByDefault;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.data.PackOutput;

import net.neoforged.neoforge.common.data.LanguageProvider;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault

public class FloralisRussianLanguageProvider extends LanguageProvider {
	public FloralisRussianLanguageProvider(PackOutput pPackOutput, String pId, String pLanguage) {
		super(pPackOutput, pId, pLanguage);
	}

	@Override
	public void addTranslations() {
		this.add(FloralisBlocks.WHITE_DYE_BLOCK.get(), "Блок Белого Красителя");
		this.add(FloralisBlocks.LIGHT_GRAY_DYE_BLOCK.get(), "Блок Светло-Серого Красителя");
		this.add(FloralisBlocks.GRAY_DYE_BLOCK.get(), "Блок Серого Красителя");
		this.add(FloralisBlocks.BLACK_DYE_BLOCK.get(), "Блок Чёрного Красителя");
		this.add(FloralisBlocks.BROWN_DYE_BLOCK.get(), "Блок Коричневого Красителя");
		this.add(FloralisBlocks.RED_DYE_BLOCK.get(), "Блок Красного Красителя");
		this.add(FloralisBlocks.ORANGE_DYE_BLOCK.get(), "Блок Оранжевого Красителя");
		this.add(FloralisBlocks.YELLOW_DYE_BLOCK.get(), "Блок Жёлтого Красителя");
		this.add(FloralisBlocks.LIME_DYE_BLOCK.get(), "Блок Лаймового Красителя");
		this.add(FloralisBlocks.GREEN_DYE_BLOCK.get(), "Блок Зелёного Красителя");
		this.add(FloralisBlocks.CYAN_DYE_BLOCK.get(), "Блок Бирюзового Красителя");
		this.add(FloralisBlocks.LIGHT_BLUE_DYE_BLOCK.get(), "Блок Голубого Красителя");
		this.add(FloralisBlocks.BLUE_DYE_BLOCK.get(), "Блок Синего Красителя");
		this.add(FloralisBlocks.PURPLE_DYE_BLOCK.get(), "Блок Фиолетового Красителя");
		this.add(FloralisBlocks.MAGENTA_DYE_BLOCK.get(), "Блок Пурпурного Красителя");
		this.add(FloralisBlocks.PINK_DYE_BLOCK.get(), "Блок Розового Красителя");
		this.add(FloralisBlocks.PLANT_FIBERS_BLOCK.get(), "Блок Растительных Волокон");
		this.add(FloralisBlocks.WHITE_CACTUS.get(), "Белый Кактус");
		this.add(FloralisBlocks.LIGHT_GRAY_CACTUS.get(), "Светло-Серый Кактус");
		this.add(FloralisBlocks.GRAY_CACTUS.get(), "Серый Кактус");
		this.add(FloralisBlocks.BLACK_CACTUS.get(), "Чёрный Кактус");
		this.add(FloralisBlocks.BROWN_CACTUS.get(), "Коричневый Кактус");
		this.add(FloralisBlocks.RED_CACTUS.get(), "Красный Кактус");
		this.add(FloralisBlocks.ORANGE_CACTUS.get(), "Оранжевый Кактус");
		this.add(FloralisBlocks.YELLOW_CACTUS.get(), "Жёлтый Кактус");
		this.add(FloralisBlocks.LIME_CACTUS.get(), "Лаймовый Кактус");
		this.add(FloralisBlocks.GREEN_CACTUS.get(), "Зелёный Кактус");
		this.add(FloralisBlocks.CYAN_CACTUS.get(), "Бирюзовый Кактус");
		this.add(FloralisBlocks.LIGHT_BLUE_CACTUS.get(), "Голубой Кактус");
		this.add(FloralisBlocks.BLUE_CACTUS.get(), "Синий Кактус");
		this.add(FloralisBlocks.PURPLE_CACTUS.get(), "Фиолетовый Кактус");
		this.add(FloralisBlocks.MAGENTA_CACTUS.get(), "Пурпурный Кактус");
		this.add(FloralisBlocks.PINK_CACTUS.get(), "Розовый Кактус");
		this.add(FloralisBlocks.WHITE_FLOWER.get(), "Белый Цветок");
		this.add(FloralisBlocks.LIGHT_GRAY_FLOWER.get(), "Светло-Серый Цветок");
		this.add(FloralisBlocks.GRAY_FLOWER.get(), "Серый Цветок");
		this.add(FloralisBlocks.BLACK_FLOWER.get(), "Чёрный Цветок");
		this.add(FloralisBlocks.BROWN_FLOWER.get(), "Коричневый Цветок");
		this.add(FloralisBlocks.RED_FLOWER.get(), "Красный Цветок");
		this.add(FloralisBlocks.ORANGE_FLOWER.get(), "Оранжевый Цветок");
		this.add(FloralisBlocks.YELLOW_FLOWER.get(), "Жёлтый Цветок");
		this.add(FloralisBlocks.LIME_FLOWER.get(), "Лаймовый Цветок");
		this.add(FloralisBlocks.GREEN_FLOWER.get(), "Зелёный Цветок");
		this.add(FloralisBlocks.CYAN_FLOWER.get(), "Бирюзовый Цветок");
		this.add(FloralisBlocks.LIGHT_BLUE_FLOWER.get(), "Голубой Цветок");
		this.add(FloralisBlocks.BLUE_FLOWER.get(), "Синий Цветок");
		this.add(FloralisBlocks.PURPLE_FLOWER.get(), "Фиолетовый Цветок");
		this.add(FloralisBlocks.MAGENTA_FLOWER.get(), "Пурпурный Цветок");
		this.add(FloralisBlocks.PINK_FLOWER.get(), "Розовый Цветок");

		this.add(FloralisItems.WHITE_CACTUS_SEEDS.get(), "Семена Белого Кактуса");
		this.add(FloralisItems.LIGHT_GRAY_CACTUS_SEEDS.get(), "Семена Светло-Серого Кактуса");
		this.add(FloralisItems.GRAY_CACTUS_SEEDS.get(), "Семена Серого Кактуса");
		this.add(FloralisItems.BLACK_CACTUS_SEEDS.get(), "Семена Чёрного Кактуса");
		this.add(FloralisItems.BROWN_CACTUS_SEEDS.get(), "Семена Коричневого Кактуса");
		this.add(FloralisItems.RED_CACTUS_SEEDS.get(), "Семена Красного Кактуса");
		this.add(FloralisItems.ORANGE_CACTUS_SEEDS.get(), "Семена Оранжевого Кактуса");
		this.add(FloralisItems.YELLOW_CACTUS_SEEDS.get(), "Семена Жёлтого Кактуса");
		this.add(FloralisItems.LIME_CACTUS_SEEDS.get(), "Семена Лаймового Кактуса");
		this.add(FloralisItems.GREEN_CACTUS_SEEDS.get(), "Семена Зелёного Кактуса");
		this.add(FloralisItems.CYAN_CACTUS_SEEDS.get(), "Семена Бирюзового Кактуса");
		this.add(FloralisItems.LIGHT_BLUE_CACTUS_SEEDS.get(), "Семена Голубого Кактуса");
		this.add(FloralisItems.BLUE_CACTUS_SEEDS.get(), "Семена Синего Кактуса");
		this.add(FloralisItems.PURPLE_CACTUS_SEEDS.get(), "Семена Фиолетового Кактуса");
		this.add(FloralisItems.MAGENTA_CACTUS_SEEDS.get(), "Семена Пурпурного Кактуса");
		this.add(FloralisItems.PINK_CACTUS_SEEDS.get(), "Семена Розового Кактуса");
		this.add(FloralisItems.WHITE_FLOWER_SEEDS.get(), "Семена Белого Цветка");
		this.add(FloralisItems.LIGHT_GRAY_FLOWER_SEEDS.get(), "Семена Светло-Серого Цветка");
		this.add(FloralisItems.GRAY_FLOWER_SEEDS.get(), "Семена Серого Цветка");
		this.add(FloralisItems.BLACK_FLOWER_SEEDS.get(), "Семена Чёрного Цветка");
		this.add(FloralisItems.BROWN_FLOWER_SEEDS.get(), "Семена Коричневого Цветка");
		this.add(FloralisItems.RED_FLOWER_SEEDS.get(), "Семена Красного Цветка");
		this.add(FloralisItems.ORANGE_FLOWER_SEEDS.get(), "Семена Оранжевого Цветка");
		this.add(FloralisItems.YELLOW_FLOWER_SEEDS.get(), "Семена Жёлтого Цветка");
		this.add(FloralisItems.LIME_FLOWER_SEEDS.get(), "Семена Лаймового Цветка");
		this.add(FloralisItems.GREEN_FLOWER_SEEDS.get(), "Семена Зелёного Цветка");
		this.add(FloralisItems.CYAN_FLOWER_SEEDS.get(), "Семена Бирюзового Цветка");
		this.add(FloralisItems.LIGHT_BLUE_FLOWER_SEEDS.get(), "Семена Голубого Цветка");
		this.add(FloralisItems.BLUE_FLOWER_SEEDS.get(), "Семена Синего Цветка");
		this.add(FloralisItems.PURPLE_FLOWER_SEEDS.get(), "Семена Фиолетового Цветка");
		this.add(FloralisItems.MAGENTA_FLOWER_SEEDS.get(), "Семена Пурпурного Цветка");
		this.add(FloralisItems.PINK_FLOWER_SEEDS.get(), "Семена Розового Цветка");
		this.add(FloralisItems.WHITE_PETALS.get(), "Белые Лепестки");
		this.add(FloralisItems.LIGHT_GRAY_PETALS.get(), "Светло-Серые Лепестки");
		this.add(FloralisItems.GRAY_PETALS.get(), "Серые Лепестки");
		this.add(FloralisItems.BLACK_PETALS.get(), "Чёрные Лепестки");
		this.add(FloralisItems.BROWN_PETALS.get(), "Коричневые Лепестки");
		this.add(FloralisItems.RED_PETALS.get(), "Красные Лепестки");
		this.add(FloralisItems.ORANGE_PETALS.get(), "Оранжевые Лепестки");
		this.add(FloralisItems.YELLOW_PETALS.get(), "Жёлтые Лепестки");
		this.add(FloralisItems.LIME_PETALS.get(), "Лаймовые Лепестки");
		this.add(FloralisItems.GREEN_PETALS.get(), "Зелёные Лепестки");
		this.add(FloralisItems.CYAN_PETALS.get(), "Бирюзовые Лепестки");
		this.add(FloralisItems.LIGHT_BLUE_PETALS.get(), "Голубые Лепестки");
		this.add(FloralisItems.BLUE_PETALS.get(), "Синие Лепестки");
		this.add(FloralisItems.PURPLE_PETALS.get(), "Фиолетовые Лепестки");
		this.add(FloralisItems.MAGENTA_PETALS.get(), "Пурпурные Лепестки");
		this.add(FloralisItems.PINK_PETALS.get(), "Розовые Лепестки");
		this.add(FloralisItems.PLANT_FIBERS.get(), "Растительные Волокна");

		this.add(FloralisBiomeTagsProvider.HAS_CACTUS, "Has Cactus");

		this.add(FloralisBlockTagsProvider.STORAGE_BLOCKS_DYE, "Dye Storage Blocks");
		this.add(FloralisBlockTagsProvider.STORAGE_BLOCKS_PLANT_FIBERS, "Plant Fibers Storage Blocks");

		this.add(FloralisItemTagsProvider.SEEDS_CACTUS, "Cactus Seeds");
		this.add(FloralisItemTagsProvider.SEEDS_FLOWER, "Flower Seeds");
		this.add(FloralisItemTagsProvider.STORAGE_BLOCKS_DYE, "Dye Storage Blocks");
		this.add(FloralisItemTagsProvider.STORAGE_BLOCKS_PLANT_FIBERS, "Plant Fibers Storage Blocks");

		this.add("tab" + "." + FloralisConstants.FLORALIS + "." + "item_group", "Floralis");

		this.add("tip" + "." + FloralisConstants.FLORALIS + "." + "plant_fibers", "Используются в качестве костной муки или удобрения");
	}

	@Override
	public String getName() {
		return "Russian";
	}
}
