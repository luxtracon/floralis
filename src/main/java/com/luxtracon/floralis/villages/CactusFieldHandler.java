package com.luxtracon.floralis.villages;

import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.gen.structure.StructureComponent;
import net.minecraft.world.gen.structure.StructureVillagePieces.PieceWeight;
import net.minecraft.world.gen.structure.StructureVillagePieces.Start;
import net.minecraft.world.gen.structure.StructureVillagePieces.Village;
import net.minecraftforge.fml.common.registry.VillagerRegistry.IVillageCreationHandler;

import java.util.List;
import java.util.Random;

public class CactusFieldHandler implements IVillageCreationHandler
{
    @Override
    public PieceWeight getVillagePieceWeight(Random random, int type)
    {
        return new PieceWeight(getComponentClass(), MathHelper.getInt(random, 1, 3), MathHelper.getInt(random, 1, 3));
    }

    @Override
    public Class<? extends Village> getComponentClass()
    {
        return CactusFieldStructure.class;
    }

    @Override
    public Village buildComponent(PieceWeight piece, Start start, List<StructureComponent> pieces, Random random, int x, int y, int z, EnumFacing facing, int type)
    {
        return CactusFieldStructure.createPiece(start, pieces, random, x, y, z, facing, type);
    }
}