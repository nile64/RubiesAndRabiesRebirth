package net.mcreator.rubiesandrabies.client.model;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

// Made with Blockbench 5.2.0
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelarch_blaze extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(Identifier.fromNamespaceAndPath("rubies_and_rabies", "modelarch_blaze"), "main");
	public final ModelPart crown;
	public final ModelPart rodsupperouter;
	public final ModelPart rodslowerouter;
	public final ModelPart rodslowerinner;
	public final ModelPart rodsupperinner;

	public Modelarch_blaze(ModelPart root) {
		super(root);
		this.crown = root.getChild("crown");
		this.rodsupperouter = root.getChild("rodsupperouter");
		this.rodslowerouter = root.getChild("rodslowerouter");
		this.rodslowerinner = root.getChild("rodslowerinner");
		this.rodsupperinner = root.getChild("rodsupperinner");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition crown = partdefinition.addOrReplaceChild("crown", CubeListBuilder.create(), PartPose.offset(0.2F, -4.6F, 0.0F));
		PartDefinition head_r1 = crown.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -5.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.6F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition base_r1 = crown.addOrReplaceChild("base_r1", CubeListBuilder.create().texOffs(20, 26).addBox(2.0F, 1.0F, -4.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1F, -6.0F, 3.3F, -1.5708F, -0.7854F, 1.5708F));
		PartDefinition base_r2 = crown.addOrReplaceChild("base_r2", CubeListBuilder.create().texOffs(0, 26).addBox(2.0F, 1.0F, -4.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2F, -7.0F, -4.6F, -1.5708F, -0.7854F, 1.5708F));
		PartDefinition base_r3 = crown.addOrReplaceChild("base_r3", CubeListBuilder.create().texOffs(0, 16).addBox(2.0F, 1.0F, -4.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition base_r4 = crown.addOrReplaceChild("base_r4", CubeListBuilder.create().texOffs(20, 16).addBox(2.0F, 1.0F, -4.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.7F, -6.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition head_r2 = crown.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(48, 18).addBox(-2.0F, -6.0F, -2.1716F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.8F, -2.9F, -1.75F, 0.7854F, -1.0908F, 0.0F));
		PartDefinition head_r3 = crown.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(48, 48).addBox(-1.0F, -3.5529F, -6.5529F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1F, -2.5F, -2.55F, -0.0258F, -1.1706F, -0.5948F));
		PartDefinition head_r4 = crown.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(48, 10).addBox(-1.0F, -6.0F, -2.1716F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2F, -2.9F, -1.75F, 0.7854F, 1.0908F, 0.0F));
		PartDefinition head_r5 = crown.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(40, 48).addBox(-1.0F, -3.5529F, -6.5529F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -2.5F, -2.55F, -0.0258F, 1.1706F, 0.5948F));
		PartDefinition head_r6 = crown.addOrReplaceChild("head_r6", CubeListBuilder.create().texOffs(48, 0).addBox(-4.0F, -3.0F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.2F, -2.4F, 1.0F, 0.0F, -3.1416F, 0.0F));
		PartDefinition head_r7 = crown.addOrReplaceChild("head_r7", CubeListBuilder.create().texOffs(40, 38).addBox(3.0F, -3.0F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.8F, -2.4F, 1.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition head_r8 = crown.addOrReplaceChild("head_r8", CubeListBuilder.create().texOffs(40, 28).addBox(3.0F, -3.0F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2F, -2.4F, 1.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition rodsupperouter = partdefinition.addOrReplaceChild("rodsupperouter", CubeListBuilder.create(), PartPose.offset(0.0F, 11.0F, 0.0F));
		PartDefinition rod4_r1 = rodsupperouter.addOrReplaceChild("rod4_r1", CubeListBuilder.create().texOffs(0, 36).addBox(6.9316F, -14.0442F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition rod3_r1 = rodsupperouter.addOrReplaceChild("rod3_r1", CubeListBuilder.create().texOffs(0, 36).addBox(6.9316F, -14.0442F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 1.4399F, 1.5708F));
		PartDefinition rod2_r1 = rodsupperouter.addOrReplaceChild("rod2_r1", CubeListBuilder.create().texOffs(0, 36).addBox(-8.9696F, -13.6972F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition rod1_r1 = rodsupperouter.addOrReplaceChild("rod1_r1", CubeListBuilder.create().texOffs(0, 36).addBox(-8.9696F, -13.6972F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 1.4835F, -1.5708F));
		PartDefinition rodslowerouter = partdefinition.addOrReplaceChild("rodslowerouter", CubeListBuilder.create(), PartPose.offset(0.0F, 11.0F, 0.0F));
		PartDefinition rod8_r1 = rodslowerouter.addOrReplaceChild("rod8_r1", CubeListBuilder.create().texOffs(8, 36).addBox(-8.9696F, -12.6972F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, -0.0797F, 0.7383F, -0.1181F));
		PartDefinition rod7_r1 = rodslowerouter.addOrReplaceChild("rod7_r1", CubeListBuilder.create().texOffs(8, 36).addBox(-8.9696F, -12.6972F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, -3.0468F, 0.8249F, -3.0128F));
		PartDefinition rod6_r1 = rodslowerouter.addOrReplaceChild("rod6_r1", CubeListBuilder.create().texOffs(8, 36).addBox(6.9316F, -13.0442F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, 3.0001F, 0.8197F, 2.9491F));
		PartDefinition rod5_r1 = rodslowerouter.addOrReplaceChild("rod5_r1", CubeListBuilder.create().texOffs(8, 36).addBox(6.9316F, -13.0442F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, 0.119F, 0.734F, 0.1767F));
		PartDefinition rodslowerinner = partdefinition.addOrReplaceChild("rodslowerinner", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition rod12_r1 = rodslowerinner.addOrReplaceChild("rod12_r1", CubeListBuilder.create().texOffs(0, 51).addBox(3.9572F, -7.6526F, -1.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -15.0F, -1.6F, -3.0118F, -0.7769F, -0.1841F));
		PartDefinition rod11_r1 = rodslowerinner.addOrReplaceChild("rod11_r1", CubeListBuilder.create().texOffs(0, 51).addBox(-5.4791F, -7.4794F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, -15.0F, -1.6F, -3.0547F, 0.7816F, 0.1231F));
		PartDefinition rod10_r1 = rodslowerinner.addOrReplaceChild("rod10_r1", CubeListBuilder.create().texOffs(0, 51).addBox(-4.981F, -7.4358F, -1.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, -15.0F, 0.4F, 3.0547F, -0.7816F, 0.1231F));
		PartDefinition rod9_r1 = rodslowerinner.addOrReplaceChild("rod9_r1", CubeListBuilder.create().texOffs(0, 51).addBox(3.4615F, -7.5874F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -15.0F, 0.4F, 3.0118F, 0.7769F, -0.1841F));
		PartDefinition rodsupperinner = partdefinition.addOrReplaceChild("rodsupperinner", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition rod16_r1 = rodsupperinner.addOrReplaceChild("rod16_r1", CubeListBuilder.create().texOffs(0, 51).addBox(3.4615F, -7.5874F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -17.0F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition rod15_r1 = rodsupperinner.addOrReplaceChild("rod15_r1", CubeListBuilder.create().texOffs(0, 51).addBox(-4.981F, -7.4358F, -1.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -17.0F, -1.0F, -1.5708F, 1.4835F, -1.5708F));
		PartDefinition rod14_r1 = rodsupperinner.addOrReplaceChild("rod14_r1", CubeListBuilder.create().texOffs(0, 51).addBox(-5.4791F, -7.4794F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, -17.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
		PartDefinition rod13_r1 = rodsupperinner.addOrReplaceChild("rod13_r1", CubeListBuilder.create().texOffs(0, 51).addBox(3.9572F, -7.6526F, -1.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -17.0F, 1.0F, 1.5708F, 1.4399F, 1.5708F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.crown.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.crown.xRot = headPitch / (180F / (float) Math.PI);
	}
}