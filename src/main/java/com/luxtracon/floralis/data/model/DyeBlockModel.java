package com.luxtracon.floralis.data.model;

import com.luxtracon.floralis.common.registry.FloralisConstants;
import com.luxtracon.floralis.common.registry.FloralisTextureSlots;
import com.luxtracon.floralis.data.provider.model.FloralisModelProvider;

import net.minecraft.core.Direction;

import net.neoforged.neoforge.client.model.generators.template.ExtendedModelTemplate;
import net.neoforged.neoforge.client.model.generators.template.ExtendedModelTemplateBuilder;

import org.jspecify.annotations.NullMarked;

@NullMarked

public class DyeBlockModel {

	public static ExtendedModelTemplate template() {
		return ExtendedModelTemplateBuilder.builder().parent(FloralisModelProvider.blockFile(FloralisConstants.MINECRAFT, "block"))
			.element(elementBuilder -> elementBuilder.from(0.0000F, 0.0000F, 0.0000F).to(16.0000F, 16.0000F, 16.0000F)
				.rotation(rotationBuilder -> rotationBuilder.eulerXYZ(0.0000F, 0.0000F, 0.0000F).origin(0.0000F, 0.0000F, 0.0000F))
				.face(Direction.NORTH, faceBuilder -> faceBuilder.uvs(0.0000F, 0.0000F, 16.0000F, 16.0000F).texture(FloralisTextureSlots.TEXTURE))
				.face(Direction.EAST, faceBuilder -> faceBuilder.uvs(0.0000F, 0.0000F, 16.0000F, 16.0000F).texture(FloralisTextureSlots.TEXTURE))
				.face(Direction.SOUTH, faceBuilder -> faceBuilder.uvs(0.0000F, 0.0000F, 16.0000F, 16.0000F).texture(FloralisTextureSlots.TEXTURE))
				.face(Direction.WEST, faceBuilder -> faceBuilder.uvs(0.0000F, 0.0000F, 16.0000F, 16.0000F).texture(FloralisTextureSlots.TEXTURE))
				.face(Direction.UP, faceBuilder -> faceBuilder.uvs(0.0000F, 0.0000F, 16.0000F, 16.0000F).texture(FloralisTextureSlots.TEXTURE))
				.face(Direction.DOWN, faceBuilder -> faceBuilder.uvs(0.0000F, 0.0000F, 16.0000F, 16.0000F).texture(FloralisTextureSlots.TEXTURE)))
			.build();
	}
}
