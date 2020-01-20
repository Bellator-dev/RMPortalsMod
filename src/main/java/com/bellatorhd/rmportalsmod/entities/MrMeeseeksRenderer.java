package com.bellatorhd.rmportalsmod.entities;

import com.bellatorhd.rmportalsmod.RMPortalsMod;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class MrMeeseeksRenderer extends MobRenderer<MrMeeseeksEntity, MrMeeseeksModel> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(RMPortalsMod.MODID, "textures/entity/meeseeks.png");

    public MrMeeseeksRenderer(EntityRendererManager manager) {
        super(manager, new MrMeeseeksModel(), 0,5f);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(MrMeeseeksEntity entity) {
        return TEXTURE;
    }


}
