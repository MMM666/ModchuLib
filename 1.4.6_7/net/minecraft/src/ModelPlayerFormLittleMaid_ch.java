package net.minecraft.src;

public class ModelPlayerFormLittleMaid_ch extends ModelPlayerFormLittleMaid_SR2
{
    public Modchu_ModelRenderer Headwear;
    public Modchu_ModelRenderer HairR1;
    public Modchu_ModelRenderer HairR2;
    public Modchu_ModelRenderer HairR3;
    public Modchu_ModelRenderer HairR4;
    public Modchu_ModelRenderer HairR5;
    public Modchu_ModelRenderer HairR6;
    public Modchu_ModelRenderer HairL1;
    public Modchu_ModelRenderer HairL2;
    public Modchu_ModelRenderer HairL3;
    public Modchu_ModelRenderer HairL4;
    public Modchu_ModelRenderer HairL5;
    public Modchu_ModelRenderer HairL6;
    public Modchu_ModelRenderer Skirt1;
    public Modchu_ModelRenderer LegR1;
    public Modchu_ModelRenderer LegR2;
    public Modchu_ModelRenderer LegR3;
    public Modchu_ModelRenderer LegR4;
    public Modchu_ModelRenderer LegR5;
    public Modchu_ModelRenderer HornR;
    public Modchu_ModelRenderer WheelR;
    public Modchu_ModelRenderer LegL1;
    public Modchu_ModelRenderer LegL2;
    public Modchu_ModelRenderer LegL3;
    public Modchu_ModelRenderer LegL4;
    public Modchu_ModelRenderer LegL5;
    public Modchu_ModelRenderer HornL;
    public Modchu_ModelRenderer WheelL;
    public Modchu_ModelRenderer Cheek_R;
    public Modchu_ModelRenderer Cheek_L;
    public Modchu_ModelRenderer Okan_a;
    public Modchu_ModelRenderer Okan_b1;
    public Modchu_ModelRenderer Okan_b2;
    public Modchu_ModelRenderer Okan_b3;
    public Modchu_ModelRenderer Okan_b4;
    public Modchu_ModelRenderer Okan_b5;
    public Modchu_ModelRenderer Okan_b6;
    public Modchu_ModelRenderer Okan_b7;
    public Modchu_ModelRenderer Okan_b8;
    public Modchu_ModelRenderer Okan_c1;
    public Modchu_ModelRenderer Okan_c2;
    public Modchu_ModelRenderer Okan_c3;
    public Modchu_ModelRenderer Okan_c4;
    public Modchu_ModelRenderer Okan_c5;
    public Modchu_ModelRenderer Okan_c6;
    public Modchu_ModelRenderer Okan_c7;
    public Modchu_ModelRenderer Okan_c8;
    public Modchu_ModelRenderer Okan_d1;
    public Modchu_ModelRenderer Okan_d2;
    public Modchu_ModelRenderer Okan_d3;
    public Modchu_ModelRenderer Okan_d4;
    public Modchu_ModelRenderer Okan_d5;
    public Modchu_ModelRenderer Okan_d6;
    public Modchu_ModelRenderer Okan_e1;
    public Modchu_ModelRenderer Okan_e2;
    public Modchu_ModelRenderer Okan_e3;
    public Modchu_ModelRenderer Okan_e4;
    public Modchu_ModelRenderer Okan_e5;
    public Modchu_ModelRenderer Okan_e6;
    public Modchu_ModelRenderer Okan_e7;
    public Modchu_ModelRenderer Okan_e8;

    public ModelPlayerFormLittleMaid_ch()
    {
        this(0.0F);
    }

    public ModelPlayerFormLittleMaid_ch(float f)
    {
        this(f, 0.0F);
    }

    public ModelPlayerFormLittleMaid_ch(float f, float f1)
    {
		// 132deletesuper(f, f1);
//-@-132
		this(f, f1 , 64, 64);
	}

	public ModelPlayerFormLittleMaid_ch(float f, float f1, int i, int j) {
		super(f, f1, i, j);
//@-@132
	}

	@Override
	public void initModel(float f, float f1) {
		textureWidth = 64;
		textureHeight = 64;
		f1 += 8F;
		bipedHead = new Modchu_ModelRenderer(this, 0, 0);
		bipedHead.addBox(-4F, -8F, -4F, 8, 8, 8, f);
		bipedHead.setRotationPoint(0.0F, 0.5F, 0.0F);
		Headwear = new Modchu_ModelRenderer(this, 0, 46);
		Headwear.addBox(-5.5F, 0.0F, 1.2F, 11, 6, 3, f);
		Headwear.setRotationPoint(0.0F, 0.0F, 0.0F);
		Headwear.setRotateAngleX(0.244546F);
		bipedBody = new Modchu_ModelRenderer(this, 32, 8);
		bipedBody.addBox(-3.0F, -3.5F, -2.0F, 6, 7, 4, f);
		bipedBody.setRotationPoint(0.0F, -3.0F, 0.0F);
		bipedRightArm = new Modchu_ModelRenderer(this, 48, 0);
		bipedRightArm.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, f);
		bipedRightArm.setRotationPoint(-3.0F, -3.5F + f1, 0.0F);
		bipedBody.addChild(bipedRightArm);
		bipedLeftArm = new Modchu_ModelRenderer(this, 56, 0);
		bipedLeftArm.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, f);
		bipedLeftArm.setRotationPoint(3.0F, -3.5F + f1, 0.0F);
		bipedBody.addChild(bipedLeftArm);
		bipedRightLeg = new Modchu_ModelRenderer(this, 32, 19);
		bipedRightLeg.addBox(-1.5F, 0.0F, -2.0F, 3, 9, 4, f);
		bipedRightLeg.setRotationPoint(-1.5F, 7F + f1, 0.0F);
		bipedBody.addChild(bipedRightLeg);
		bipedLeftLeg = new Modchu_ModelRenderer(this, 32, 19);
		bipedLeftLeg.mirror = true;
		bipedLeftLeg.addBox(-1.5F, 0.0F, -2.0F, 3, 9, 4, f);
		bipedLeftLeg.setRotationPoint(1.5F, 7F + f1, 0.0F);
		bipedBody.addChild(bipedLeftLeg);
		Skirt = new Modchu_ModelRenderer(this, 0, 16);
		Skirt.addBoxLM(-3.5F, -2F, -2.5F, 7, 2, 5, f + 0.2F);
		Skirt.setRotationPoint(0.0F, 13F, 0.0F);
		Skirt1 = new Modchu_ModelRenderer(this, 0, 23);
		Skirt1.addBoxLM(-3.5F, -1.5F, -2.5F, 7, 2, 5, f);
		Skirt1.setRotationPointLM(0.0F, -8F + f1, 0.0F);
		HairL1 = new Modchu_ModelRenderer(this, 48, 33);
		HairL1.addBoxLM(4.8F, -2F, -3F, 1, 2, 7, f);
		HairL1.setRotationPointLM(0.0F, 0.0F, 0.0F);
		HairL1.setRotateAngleZ(-0.5235987F);
		HairL2 = new Modchu_ModelRenderer(this, 48, 33);
		HairL2.addBoxLM(4F, -3F, -3F, 1, 3, 7, f);
		HairL2.setRotationPointLM(0.0F, 0.0F, 0.0F);
		HairL3 = new Modchu_ModelRenderer(this, 58, 34);
		HairL3.addBoxLM(4F, 0.0F, -3F, 1, 4, 2, f);
		HairL3.setRotationPointLM(0.0F, 0.0F, 0.0F);
		HairL3.setRotateAngleX(-0.2967059F);
		HairL4 = new Modchu_ModelRenderer(this, 58, 34);
		HairL4.addBoxLM(5F, 1.0F, 0.0F, 1, 3, 1, f);
		HairL4.setRotationPointLM(0.0F, 0.0F, 0.0F);
		HairL4.setRotateAngleZ(-0.959131F);
		HairL5 = new Modchu_ModelRenderer(this, 47, 32);
		HairL5.addBoxLM(4.6F, -1.7F, 1.0F, 1, 5, 3, f);
		HairL5.setRotationPointLM(0.0F, 0.0F, 0.0F);
		HairL5.setRotateAngleZ(-0.244346F);
		HairL6 = new Modchu_ModelRenderer(this, 58, 34);
		HairL6.addBoxLM(3F, 0.0F, -4F, 1, 2, 2, f);
		HairL6.setRotationPointLM(0.0F, 0.0F, 0.0F);
		HairR1 = new Modchu_ModelRenderer(this, 48, 33);
		HairR1.addBoxLM(-5.8F, -2F, -3F, 1, 2, 7, f);
		HairR1.setRotationPointLM(0.0F, 0.0F, 0.0F);
		HairR1.setRotateAngleZ(0.5235987F);
		HairR2 = new Modchu_ModelRenderer(this, 48, 33);
		HairR2.addBoxLM(-5F, -3F, -3F, 1, 3, 7, f);
		HairR2.setRotationPointLM(0.0F, 0.0F, 0.0F);
		HairR3 = new Modchu_ModelRenderer(this, 58, 34);
		HairR3.addBoxLM(-5F, 0.0F, -3F, 1, 4, 2, f);
		HairR3.setRotationPointLM(0.0F, 0.0F, 0.0F);
		HairR3.setRotateAngleX(-0.2967059F);
		HairR4 = new Modchu_ModelRenderer(this, 58, 34);
		HairR4.addBoxLM(-6F, 1.0F, 0.0F, 1, 3, 1, f);
		HairR4.setRotationPointLM(0.0F, 0.0F, 0.0F);
		HairR4.setRotateAngleZ(0.959131F);
		HairR5 = new Modchu_ModelRenderer(this, 47, 32);
		HairR5.addBoxLM(-5.6F, -1.7F, 1.0F, 1, 5, 3, f);
		HairR5.setRotationPointLM(0.0F, 0.0F, 0.0F);
		HairR5.setRotateAngleZ(0.244346F);
		HairR6 = new Modchu_ModelRenderer(this, 58, 34);
		HairR6.addBoxLM(-4F, 0.0F, -4F, 1, 2, 2, f);
		HairR6.setRotationPointLM(0.0F, 0.0F, 0.0F);
		LegL1 = new Modchu_ModelRenderer(this, 0, 56);
		LegL1.addBox(-2F, -1.5F, -3F, 3, 1, 1, f);
		LegL1.setRotationPointLM(1.0F, 2.0F, 0.0F);
		LegL2 = new Modchu_ModelRenderer(this, 10, 59);
		LegL2.addBox(1.0F, 1.9F, -2F, 1, 1, 4, f);
		LegL2.setRotationPointLM(1.0F, -1F, 0.0F);
		LegL2.setRotateAngleZ(((float)Math.PI / 10F));
		LegL3 = new Modchu_ModelRenderer(this, 0, 59);
		LegL3.addBox(-2F, 2.0F, -3.5F, 3, 2, 2, f);
		LegL3.setRotationPointLM(1.0F, -1F, 0.0F);
		LegL3.setRotateAngleX(0.2967059F);
		LegL4 = new Modchu_ModelRenderer(this, 48, 52);
		LegL4.addBox(-1F, 4.5F, 0.5F, 3, 2, 4, f);
		LegL4.setRotationPointLM(1.0F, -1F, 0.0F);
		LegL4.setRotateAngleX(-0.1396263F);
		LegL4.setRotateAngleY(0.1745329F);
		LegL5 = new Modchu_ModelRenderer(this, 28, 50);
		LegL5.addBox(-1F, 6F, -3F, 3, 2, 6, f);
		LegL5.setRotationPointLM(1.0F, -1F, 0.0F);
		LegL5.setRotateAngleX(0.122173F);
		LegL5.setRotateAngleY(0.1745329F);
		WheelL = new Modchu_ModelRenderer(this, 32, 58);
		WheelL.addBox(-0.5F, 6F, -3F, 1, 3, 3, f);
		WheelL.setRotationPointLM(1.0F, -1F, 0.0F);
		WheelL.setRotateAngleY(0.1745329F);
		HornL = new Modchu_ModelRenderer(this, 0, 0);
		HornL.addBox(1.9F, 7F, -2F, 1, 1, 1, f - 0.1F);
		HornL.setRotationPointLM(1.0F, -1F, 0.0F);
		HornL.setRotateAngleY(0.1745329F);
		LegR1 = new Modchu_ModelRenderer(this, 0, 56);
		LegR1.addBox(-3F, -1.5F, -3F, 3, 1, 1, f);
		LegR1.setRotationPointLM(1.0F, 2.0F, 0.0F);
		LegR2 = new Modchu_ModelRenderer(this, 10, 59);
		LegR2.addBox(-2F, 1.9F, -2F, 1, 1, 4, f);
		LegR2.setRotationPointLM(-1F, -1F, 0.0F);
		LegR2.setRotateAngleZ(-((float)Math.PI / 10F));
		LegR3 = new Modchu_ModelRenderer(this, 0, 59);
		LegR3.addBox(-3F, 2.0F, -3.5F, 3, 2, 2, f);
		LegR3.setRotationPointLM(1.0F, -1F, 0.0F);
		LegR3.setRotateAngleX(0.2967059F);
		LegR4 = new Modchu_ModelRenderer(this, 48, 52);
		LegR4.addBox(-4F, 4.5F, 0.5F, 3, 2, 4, f);
		LegR4.setRotationPointLM(1.0F, -1F, 0.0F);
		LegR4.setRotateAngleX(-0.1396263F);
		LegR4.setRotateAngleY(-0.1745329F);
		LegR5 = new Modchu_ModelRenderer(this, 28, 50);
		LegR5.addBox(-4F, 6F, -3F, 3, 2, 6, f);
		LegR5.setRotationPointLM(1.0F, -1F, 0.0F);
		LegR5.setRotateAngleX(0.122173F);
		LegR5.setRotateAngleY(-0.1745329F);
		WheelR = new Modchu_ModelRenderer(this, 32, 58);
		WheelR.addBox(-2.5F, 6F, -3F, 1, 3, 3, f);
		WheelR.setRotationPointLM(1.0F, -1F, 0.0F);
		WheelR.setRotateAngleY(-0.1745329F);
		HornR = new Modchu_ModelRenderer(this, 0, 0);
		HornR.addBox(-4.9F, 7F, -2F, 1, 1, 1, f - 0.1F);
		HornR.setRotationPointLM(1.0F, -1F, 0.0F);
		HornR.setRotateAngleY(-0.1745329F);
		eyeR = new Modchu_ModelRenderer(this, 0, 4);
		eyeR.addPlate(-4F, -4.9F, -4.001F, 4, 4, 0, f);
		eyeR.setRotationPointLM(0.0F, -8F + f1, 0.0F);
		eyeL = new Modchu_ModelRenderer(this, 4, 4);
		eyeL.addPlate(0.0F, -4.9F, -4.001F, 4, 4, 0, f);
		eyeL.setRotationPointLM(0.0F, -8F + f1, 0.0F);
		Cheek_R = new Modchu_ModelRenderer(this, 32, 8);
		Cheek_R.addPlate(-4.5F, -4.5F, -4.002F, 4, 4, 0, f);
		Cheek_R.setRotationPointLM(0.0F, -7F + f1, 0.0F);
		Cheek_L = new Modchu_ModelRenderer(this, 32, 19);
		Cheek_L.addPlate(0.5F, -4.5F, -4.002F, 4, 4, 0, f);
		Cheek_L.setRotationPointLM(0.0F, -7F + f1, 0.0F);
		Okan_a = new Modchu_ModelRenderer(this, 0, 38);
		Okan_a.addBox(-0.5F, -11F, -4.7F, 1, 5, 1, f);
		Okan_a.setRotationPointLM(0.0F, 0.0F, 0.0F);
		Okan_a.setRotateAngleX(0.1396263F);
		bipedHead.addChild(Okan_a);
		Okan_b1 = new Modchu_ModelRenderer(this, 0, 38);
		Okan_b1.addBox(-2.6F, -10F, -4.7F, 1, 4, 1, f);
		Okan_b1.setRotationPointLM(0.0F, 0.0F, 0.0F);
		Okan_b1.setRotateAngleX(0.1396263F);
		Okan_b1.setRotateAngleZ(-0.0523599F);
		bipedHead.addChild(Okan_b1);
		Okan_b2 = new Modchu_ModelRenderer(this, 0, 38);
		Okan_b2.addBox(-4.5F, -9.3F, -4.3F, 1, 4, 1, f);
		Okan_b2.setRotationPointLM(0.0F, 0.0F, 0.0F);
		Okan_b2.setRotateAngleZ(-0.1047198F);
		bipedHead.addChild(Okan_b2);
		Okan_b3 = new Modchu_ModelRenderer(this, 0, 38);
		Okan_b3.addBox(-4.5F, -9.3F, -1.5F, 1, 4, 1, f);
		Okan_b3.setRotationPointLM(0.0F, 0.0F, 0.0F);
		Okan_b3.setRotateAngleZ(-0.1396263F);
		bipedHead.addChild(Okan_b3);
		Okan_b4 = new Modchu_ModelRenderer(this, 0, 38);
		Okan_b4.addBox(-4.5F, -9.3F, 1.5F, 1, 4, 1, f);
		Okan_b4.setRotationPointLM(0.0F, 0.0F, 0.0F);
		Okan_b4.setRotateAngleZ(-0.1396263F);
		bipedHead.addChild(Okan_b4);
		Okan_b5 = new Modchu_ModelRenderer(this, 0, 38);
		Okan_b5.addBox(3.5F, -9.3F, 1.5F, 1, 4, 1, f);
		Okan_b5.setRotationPointLM(0.0F, 0.0F, 0.0F);
		Okan_b5.setRotateAngleZ(0.1396263F);
		bipedHead.addChild(Okan_b5);
		Okan_b6 = new Modchu_ModelRenderer(this, 0, 38);
		Okan_b6.addBox(3.5F, -9.3F, -1.5F, 1, 4, 1, f);
		Okan_b6.setRotationPointLM(0.0F, 0.0F, 0.0F);
		Okan_b6.setRotateAngleZ(0.1396263F);
		bipedHead.addChild(Okan_b6);
		Okan_b7 = new Modchu_ModelRenderer(this, 0, 38);
		Okan_b7.addBox(3.5F, -9.3F, -4.3F, 1, 4, 1, f);
		Okan_b7.setRotationPointLM(0.0F, 0.0F, 0.0F);
		Okan_b7.setRotateAngleZ(0.1047198F);
		bipedHead.addChild(Okan_b7);
		Okan_b8 = new Modchu_ModelRenderer(this, 0, 38);
		Okan_b8.addBox(1.6F, -10F, -4.7F, 1, 4, 1, f);
		Okan_b8.setRotationPointLM(0.0F, 0.0F, 0.0F);
		Okan_b8.setRotateAngleX(0.1396263F);
		Okan_b8.setRotateAngleZ(0.0523599F);
		bipedHead.addChild(Okan_b8);
		Okan_c1 = new Modchu_ModelRenderer(this, 0, 38);
		Okan_c1.addBox(-2F, -7.5F, -4.5F, 2, 1, 1, f);
		Okan_c1.setRotationPointLM(0.0F, 0.0F, 0.0F);
		Okan_c1.setRotateAngleX(0.1396263F);
		bipedHead.addChild(Okan_c1);
		Okan_c2 = new Modchu_ModelRenderer(this, 0, 38);
		Okan_c2.addBox(-1.9F, -7.5F, -5.1F, 2, 1, 1, f);
		Okan_c2.setRotationPointLM(0.0F, 0.0F, 0.0F);
		Okan_c2.setRotateAngleX(0.1396263F);
		Okan_c2.setRotateAngleY(0.5235988F);
		bipedHead.addChild(Okan_c2);
		Okan_c3 = new Modchu_ModelRenderer(this, 0, 38);
		Okan_c3.addBox(-4F, -7.5F, 3F, 2, 1, 1, f);
		Okan_c3.setRotationPointLM(0.0F, 0.0F, 0.0F);
		Okan_c3.setRotateAngleX(-0.1396263F);
		bipedHead.addChild(Okan_c3);
		Okan_c4 = new Modchu_ModelRenderer(this, 0, 38);
		Okan_c4.addBox(-2F, -7.5F, 3F, 2, 1, 1, f);
		Okan_c4.setRotationPointLM(0.0F, 0.0F, 0.0F);
		Okan_c4.setRotateAngleX(-0.1396263F);
		bipedHead.addChild(Okan_c4);
		Okan_c5 = new Modchu_ModelRenderer(this, 0, 38);
		Okan_c5.addBox(0.0F, -7.5F, 3F, 2, 1, 1, f);
		Okan_c5.setRotationPointLM(0.0F, 0.0F, 0.0F);
		Okan_c5.setRotateAngleX(-0.1396263F);
		bipedHead.addChild(Okan_c5);
		Okan_c6 = new Modchu_ModelRenderer(this, 0, 38);
		Okan_c6.addBox(2.0F, -7.5F, 3F, 2, 1, 1, f);
		Okan_c6.setRotationPointLM(0.0F, 0.0F, 0.0F);
		Okan_c6.setRotateAngleX(-0.1396263F);
		bipedHead.addChild(Okan_c6);
		Okan_c7 = new Modchu_ModelRenderer(this, 0, 38);
		Okan_c7.addBox(-0.1F, -7.5F, -5.1F, 2, 1, 1, f);
		Okan_c7.setRotationPointLM(0.0F, 0.0F, 0.0F);
		Okan_c7.setRotateAngleX(0.1396263F);
		Okan_c7.setRotateAngleY(-0.5235988F);
		bipedHead.addChild(Okan_c7);
		Okan_c8 = new Modchu_ModelRenderer(this, 0, 38);
		Okan_c8.addBox(0.0F, -7.5F, -4.5F, 2, 1, 1, f);
		Okan_c8.setRotationPointLM(0.0F, 0.0F, 0.0F);
		Okan_c8.setRotateAngleX(0.1396263F);
		bipedHead.addChild(Okan_c8);
		Okan_d1 = new Modchu_ModelRenderer(this, 0, 38);
		Okan_d1.addBox(-4.3F, -7.5F, -3.5F, 1, 1, 2, f);
		Okan_d1.setRotationPointLM(0.0F, 0.0F, 0.0F);
		Okan_d1.setRotateAngleZ(-0.1396263F);
		bipedHead.addChild(Okan_d1);
		Okan_d2 = new Modchu_ModelRenderer(this, 0, 38);
		Okan_d2.addBox(-4.3F, -7.5F, -0.5F, 1, 1, 2, f);
		Okan_d2.setRotationPointLM(0.0F, 0.0F, 0.0F);
		Okan_d2.setRotateAngleZ(-0.1396263F);
		bipedHead.addChild(Okan_d2);
		Okan_d3 = new Modchu_ModelRenderer(this, 0, 38);
		Okan_d3.addBox(-5F, -7.5F, 0.0F, 1, 1, 2, f);
		Okan_d3.setRotationPointLM(0.0F, 0.0F, 0.0F);
		Okan_d3.setRotateAngleY(0.4363323F);
		Okan_d3.setRotateAngleZ(-0.1396263F);
		bipedHead.addChild(Okan_d3);
		Okan_d4 = new Modchu_ModelRenderer(this, 0, 38);
		Okan_d4.addBox(4F, -7.5F, 0.0F, 1, 1, 2, f);
		Okan_d4.setRotationPointLM(0.0F, 0.0F, 0.0F);
		Okan_d4.setRotateAngleY(-0.4363323F);
		Okan_d4.setRotateAngleZ(0.1396263F);
		bipedHead.addChild(Okan_d4);
		Okan_d5 = new Modchu_ModelRenderer(this, 0, 38);
		Okan_d5.addBox(3.3F, -7.5F, -0.5F, 1, 1, 2, f);
		Okan_d5.setRotationPointLM(0.0F, 0.0F, 0.0F);
		Okan_d5.setRotateAngleZ(0.1396263F);
		bipedHead.addChild(Okan_d5);
		Okan_d6 = new Modchu_ModelRenderer(this, 0, 38);
		Okan_d6.addBox(3.3F, -7.5F, -3.5F, 1, 1, 2, f);
		Okan_d6.setRotationPointLM(0.0F, 0.0F, 0.0F);
		Okan_d6.setRotateAngleZ(0.1396263F);
		bipedHead.addChild(Okan_d6);
		Okan_e1 = new Modchu_ModelRenderer(this, 0, 38);
		Okan_e1.addBox(-4F, -8F, 3.6F, 1, 2, 1, f);
		Okan_e1.setRotationPointLM(0.0F, 0.0F, 0.0F);
		Okan_e1.setRotateAngleX(-0.1396263F);
		Okan_e1.setRotateAngleY(-0.1570796F);
		bipedHead.addChild(Okan_e1);
		Okan_e2 = new Modchu_ModelRenderer(this, 0, 38);
		Okan_e2.addBox(-3.5F, -8F, 3.2F, 1, 2, 1, f);
		Okan_e2.setRotationPointLM(0.0F, 0.0F, 0.0F);
		Okan_e2.setRotateAngleX(-0.1396263F);
		bipedHead.addChild(Okan_e2);
		Okan_e3 = new Modchu_ModelRenderer(this, 0, 38);
		Okan_e3.addBox(-2F, -8F, 3.2F, 1, 2, 1, f);
		Okan_e3.setRotationPointLM(0.0F, 0.0F, 0.0F);
		Okan_e3.setRotateAngleX(-0.1396263F);
		bipedHead.addChild(Okan_e3);
		Okan_e4 = new Modchu_ModelRenderer(this, 0, 38);
		Okan_e4.addBox(-0.5F, -8F, 3.2F, 1, 2, 1, f);
		Okan_e4.setRotationPointLM(0.0F, 0.0F, 0.0F);
		Okan_e4.setRotateAngleX(-0.1396263F);
		bipedHead.addChild(Okan_e4);
		Okan_e5 = new Modchu_ModelRenderer(this, 0, 38);
		Okan_e5.addBox(1.0F, -8F, 3.2F, 1, 2, 1, f);
		Okan_e5.setRotationPointLM(0.0F, 0.0F, 0.0F);
		Okan_e5.setRotateAngleX(-0.1396263F);
		bipedHead.addChild(Okan_e5);
		Okan_e6 = new Modchu_ModelRenderer(this, 0, 38);
		Okan_e6.addBox(2.5F, -8F, 3.2F, 1, 2, 1, f);
		Okan_e6.setRotationPointLM(0.0F, 0.0F, 0.0F);
		Okan_e6.setRotateAngleX(-0.1396263F);
		bipedHead.addChild(Okan_e6);
		Okan_e7 = new Modchu_ModelRenderer(this, 0, 38);
		Okan_e7.addBox(3F, -8F, 3.6F, 1, 2, 1, f);
		Okan_e7.setRotationPointLM(0.0F, 0.0F, 0.0F);
		Okan_e7.setRotateAngleX(-0.1396263F);
		Okan_e7.setRotateAngleY(0.1570796F);
		mainFrame = new Modchu_ModelRenderer(this, 0, 0);
		mainFrame.setRotationPoint(0F, 0F + f1, 0F);
		mainFrame.addChild(bipedHead);
		mainFrame.addChild(bipedBody);
		bipedHead.addChild(Okan_e7);
		bipedHead.addChild(Headwear);
		bipedHead.addChild(HairR1);
		bipedHead.addChild(HairR2);
		bipedHead.addChild(HairR3);
		bipedHead.addChild(HairR4);
		bipedHead.addChild(HairR5);
		bipedHead.addChild(HairR6);
		bipedHead.addChild(HairL1);
		bipedHead.addChild(HairL2);
		bipedHead.addChild(HairL3);
		bipedHead.addChild(HairL4);
		bipedHead.addChild(HairL5);
		bipedHead.addChild(HairL6);
		bipedHead.addChild(eyeR);
		bipedHead.addChild(eyeL);
		bipedHead.addChild(Cheek_R);
		bipedHead.addChild(Cheek_L);
		bipedRightLeg.addChild(LegR1);
		bipedRightLeg.addChild(LegR2);
		bipedRightLeg.addChild(LegR3);
		bipedRightLeg.addChild(LegR4);
		bipedRightLeg.addChild(LegR5);
		bipedRightLeg.addChild(WheelR);
		bipedRightLeg.addChild(HornR);
		bipedLeftLeg.addChild(LegL1);
		bipedLeftLeg.addChild(LegL2);
		bipedLeftLeg.addChild(LegL3);
		bipedLeftLeg.addChild(LegL4);
		bipedLeftLeg.addChild(LegL5);
		bipedLeftLeg.addChild(WheelL);
		bipedLeftLeg.addChild(HornL);
		Skirt.addChild(Skirt1);
		actionPartsInit(f, f1);
	}

    public void setLivingAnimationsLM(EntityLiving entityliving, float f, float f1, float f2)
    {
    	super.setLivingAnimationsLM(entityliving, f, f1, f2);
    	if ((entityliving instanceof EntityPlayer)
    			&& !getaimedBow())
    	{
    		EntityPlayer entityplayer = (EntityPlayer) entityliving;
    		float f3 = (float)entityplayer.ticksExisted + f2 + ((float)entityplayer.entityId * 70);

    		float f4 = 0.0F;
    		ItemStack itemstack2 = entityplayer.inventory.getCurrentItem();
    		boolean flag = false;
    		if (itemstack2 != null) {
    			Item item = itemstack2.getItem();
    			if (item == Item.sugar) {
    				flag = true;
    			}
    		}
    		if (flag) {
    			f3 *= 8F;
    			f4 = -0.2F;
    			Cheek_R.setVisible(true);
    			Cheek_L.setVisible(true);
    		}
    		else
    		{
    			float f5 = (1.0F - (float)entityplayer.health / 20F) * 0.5F;
    			Cheek_R.setVisible(false);
    			Cheek_L.setVisible(false);
    		}
    	}
    }

    @Override
    public void settingShowParts() {
    	super.settingShowParts();
    	//GUI パーツ表示・非表示初期設定
    	//前回の項目最後から8個上書きして設定
    	overridePartsNumber = 8;
    	int k = getPartsNumber() - overridePartsNumber;
    	if(k < 0) k = 0;
    	if(getPartsSetFlag() == 2) {
    		String s[] = {
    				"eyeR", "eyeL", "HairR" ,"HairL" ,"HornR",
    				"HornL", "WheelR", "WheelL", "Okan", "Cheek"
    		};
    		setParts(s, k);
    		//Cheek Default off
    		setGuiShowModel(k + 7, false);
    		setPartsSetFlag(3);
    	}

    	//GUI パーツ表示・非表示反映
    	if(getShowModelFlag() == 1) {
    		boolean b = getGuiShowModel(k);
    		eyeR.setVisible(b);
    		k++;
    		b = getGuiShowModel(k);
    		eyeL.setVisible(b);
    		k++;
    		b = getGuiShowModel(k);
    		HairR1.setVisible(b);
    		HairR2.setVisible(b);
    		HairR3.setVisible(b);
    		k++;
    		HairL1.setVisible(b);
    		HairL2.setVisible(b);
    		HairL3.setVisible(b);
    		k++;
    		HornR.setVisible(b);
    		k++;
    		HornL.setVisible(b);
    		k++;
    		WheelR.setVisible(b);
    		k++;
    		WheelL.setVisible(b);
    		k++;
    		Okan_a.setVisible(b);
    		Okan_b1.setVisible(b);
    		Okan_b2.setVisible(b);
    		Okan_b3.setVisible(b);
    		Okan_b4.setVisible(b);
    		Okan_b5.setVisible(b);
    		Okan_b6.setVisible(b);
    		Okan_b7.setVisible(b);
    		Okan_b8.setVisible(b);
    		Okan_c1.setVisible(b);
    		Okan_c2.setVisible(b);
    		Okan_c3.setVisible(b);
    		Okan_c4.setVisible(b);
    		Okan_c5.setVisible(b);
    		Okan_c6.setVisible(b);
    		Okan_c7.setVisible(b);
    		Okan_c8.setVisible(b);
    		Okan_d1.setVisible(b);
    		Okan_d2.setVisible(b);
    		Okan_d3.setVisible(b);
    		Okan_d4.setVisible(b);
    		Okan_d5.setVisible(b);
    		Okan_d6.setVisible(b);
    		Okan_e1.setVisible(b);
    		Okan_e2.setVisible(b);
    		Okan_e3.setVisible(b);
    		Okan_e4.setVisible(b);
    		Okan_e5.setVisible(b);
    		Okan_e6.setVisible(b);
    		Okan_e6.setVisible(b);
    		Okan_e7.setVisible(b);
    		k++;
    		Cheek_R.setVisible(b);
    		Cheek_L.setVisible(b);
    		setShowModelFlag(2);
    	}
    }
}
