package net.mcreator.rubiesandrabies.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.rubiesandrabies.entity.MummyEntity;
import net.mcreator.rubiesandrabies.client.model.Modelmummy;

public class MummyRenderer extends MobRenderer<MummyEntity, LivingEntityRenderState, Modelmummy> {
	private final Identifier entityTexture = Identifier.parse("rubies_and_rabies:textures/entities/mummy2.png");

	public MummyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmummy(context.bakeLayer(Modelmummy.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(MummyEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}