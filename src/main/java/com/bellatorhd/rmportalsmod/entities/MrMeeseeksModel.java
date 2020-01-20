package com.bellatorhd.rmportalsmod.entities;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;

public class MrMeeseeksModel extends EntityModel<MrMeeseeksEntity> {

    public RendererModel body;

    public MrMeeseeksModel() {
        body = new RendererModel(this, 0, 0);
        body.addBox(-3, -3, -3, 6, 6, 6);
    }

    @Override
    public void render(MrMeeseeksEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        setRotationAngels(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        body.render(scale);
    }

    @Override
    public void setRotationAngels(MrMeeseeksEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) {

    }
}


