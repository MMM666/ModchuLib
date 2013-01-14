package net.minecraft.src;

import org.lwjgl.opengl.GL11;

public class ModelPlayerFormLittleMaid_QB extends ModelPlayerFormLittleMaid {

	public Modchu_ModelRenderer rightLeg;
	public Modchu_ModelRenderer leftLeg;
	public Modchu_ModelRenderer rightear;
	public Modchu_ModelRenderer leftear;
	public Modchu_ModelRenderer rightLegbottom;
	public Modchu_ModelRenderer leftLegbottom;
	public Modchu_ModelRenderer rightearhair;
	public Modchu_ModelRenderer leftearhair;
	public Modchu_ModelRenderer tail1;
	public Modchu_ModelRenderer tail2;
	public Modchu_ModelRenderer tail3;
	public Modchu_ModelRenderer ringR;
	public Modchu_ModelRenderer ringL;

	public ModelPlayerFormLittleMaid_QB() {
		this(0.0F);
	}

	public ModelPlayerFormLittleMaid_QB(float f) {
		this(f, 0.0F);
	}

	public ModelPlayerFormLittleMaid_QB(float f, float f1) {
		// 132deletesuper(f, f1);
//-@-132
		this(f, f1 , 64, 32);
	}

	public ModelPlayerFormLittleMaid_QB(float f, float f1, int i, int j) {
		super(f, f1, i, j);
//@-@132
    	HeadMount.setRotationPoint(0F, 2.51F, 0F);
	}

    @Override
    public void initModel(float f, float f1) {
    	f1 += 8F;
    	bipedHead = new Modchu_ModelRenderer(this, 0, 0);
    	bipedHead.addBox(-3.0F, -2.5F, -2.0F, 6, 5, 4, f);
    	bipedHead.setRotationPoint(-2.5F, 0.0F, 0.0F);
    	bipedBody = new Modchu_ModelRenderer(this, 0, 9);
    	bipedBody.addBox(-2.5F, -1.0F, -3.0F, 5, 2, 6, f);
    	bipedBody.setRotationPoint(0.5F, 0.0F, 1.0F);
    	bipedRightArm = new Modchu_ModelRenderer(this, 0, 17);
    	bipedRightArm.addBox(-1.001F, 0.0F, -1.001F, 2, 4, 2, f);
    	bipedRightArm.setRotationPoint(0.0F, 0.0F, 2.0F);
    	bipedBody.addChild(bipedRightArm);
    	bipedLeftArm = new Modchu_ModelRenderer(this, 0, 17);
    	bipedLeftArm.mirror = true;
    	bipedLeftArm.addBox(-0.999F, 0.0F, -1.001F, 2, 4, 2, f);
    	bipedLeftArm.setRotationPoint(3.0F, 0.0F, 2.0F);
    	bipedBody.addChild(bipedLeftArm);
    	rightLeg = new Modchu_ModelRenderer(this, 8, 17);
    	rightLeg.addBox(-1.001F, -1.5F, -1.501F, 2, 3, 3, f);
    	rightLeg.setRotationPoint(0.0F, 0.0F, 0.0F);
    	bipedBody.addChild(rightLeg);
    	leftLeg = new Modchu_ModelRenderer(this, 8, 17);
    	leftLeg.addBox(-0.999F, -1.5F, -1.501F, 2, 3, 3, f);
    	leftLeg.setRotationPoint(0.0F, 0.0F, 0.0F);
    	leftLeg.mirror = true;
    	bipedBody.addChild(leftLeg);
    	rightLegbottom = new Modchu_ModelRenderer(this, 0, 23);
    	rightLegbottom.addBox(-1.001F, -0.5F, -2.001F, 2, 1, 4, f);
    	rightLegbottom.setRotationPoint(0.0F, 0.0F, 0.0F);
    	rightLeg.addChild(rightLegbottom);
    	leftLegbottom = new Modchu_ModelRenderer(this, 0, 23);
    	leftLegbottom.addBox(-0.999F, -0.5F, -2.001F, 2, 1, 4, f);
    	leftLegbottom.setRotationPoint(0.0F, 0.0F, 0.0F);
    	leftLegbottom.mirror = true;
    	leftLeg.addChild(leftLegbottom);
    	rightearhair = new Modchu_ModelRenderer(this, 12, 23);
    	rightearhair.addBox(-0.5F, 0.0F, -0.5F, 1, 7, 1, f);
    	rightearhair.setRotationPoint(-1.0F, 1.0F, 1.0F);
    	bipedHead.addChild(rightearhair);
    	leftearhair = new Modchu_ModelRenderer(this, 12, 23);
    	leftearhair.addBox(-0.5F, 0.0F, -0.5F, 1, 7, 1, f);
    	leftearhair.setRotationPoint(4.0F, 1.0F, 1.0F);
    	leftearhair.mirror = true;
    	bipedHead.addChild(leftearhair);
    	rightear = new Modchu_ModelRenderer(this, 16, 0);
    	rightear.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, f);
    	rightear.setRotationPoint(-1.0F, -1.0F, 1.0F);
    	bipedHead.addChild(rightear);
    	leftear = new Modchu_ModelRenderer(this, 16, 0);
    	leftear.mirror = true;
    	leftear.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, f);
    	leftear.setRotationPoint(3.0F, -1.0F, 1.0F);
    	bipedHead.addChild(leftear);
    	tail1 = new Modchu_ModelRenderer(this, 24, 0);
    	tail1.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 3, f);
    	tail1.setRotationPoint(0.0F, 0.0F, 0.0F);
    	bipedBody.addChild(tail1);
    	tail2 = new Modchu_ModelRenderer(this, 20, 5);
    	tail2.addBox(-1.5F, -1.5F, -2.5F, 3, 3, 5, f);
    	tail2.setRotationPoint(0.0F, 0.0F, 0.0F);
    	tail1.addChild(tail2);
    	tail3 = new Modchu_ModelRenderer(this, 22, 13);
    	tail3.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, f);
    	tail3.setRotationPoint(0.0F, 0.0F, 0.0F);
    	tail2.addChild(tail3);
    	ringR = new Modchu_ModelRenderer(this, 8, 23);
    	ringR.addPlate(-1.5F, -1.5F, 0.0F, 3, 3, 0);
    	ringR.setRotationPoint(0.0F, 0.0F, 0.0F);
    	bipedHead.addChild(ringR);
    	ringL = new Modchu_ModelRenderer(this, 8, 23);
    	ringL.addPlate(-1.5F, -1.5F, 0.0F, 3, 3, 0);
    	ringL.setRotationPoint(0.0F, 0.0F, 0.0F);
    	bipedHead.addChild(ringL);
    	mainFrame = new Modchu_ModelRenderer(this, 0, 0);
    	mainFrame.setRotationPoint(0F, 0F + f1, 0F);
    	mainFrame.addChild(bipedHead);
    	mainFrame.addChild(bipedBody);
    }

    @Override
    public void setRotationAnglesLM(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
    	float ff1 = mh_sin(f2 * 0.09F) * 0.05F;
    	bipedHead.rotateAngleY = f3 / 57.29578F;
    	bipedHead.rotateAngleX = f4 / 57.29578F;
    	bipedHead.rotateAngleZ = 0.0F;
    	bipedBody.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F
    			* f1 * 0.1F;
    	bipedBody.rotateAngleZ = 0.0F;
    	bipedBody.rotationPointX = 0.0F;
    	bipedBody.rotationPointZ = 2.0F;
    	bipedRightArm.rotationPointY = bipedLeftArm.rotationPointY = 0.0F;
    	bipedRightArm.rotationPointZ = bipedLeftArm.rotationPointZ = -2.0F;
    	rightLeg.rotationPointY = leftLeg.rotationPointY = 1.5F;
    	rightLeg.rotationPointZ = leftLeg.rotationPointZ = 2.5F;
    	rightLegbottom.rotationPointY = leftLegbottom.rotationPointY = 2.0F;
    	rightLegbottom.rotationPointZ = leftLegbottom.rotationPointZ = -1.0F;
    	rightLeg.rotationPointX = -2.0F;
    	leftLeg.rotationPointX = 2.0F;
    	tail1.rotationPointX = 0.0F;
    	tail2.rotationPointX = 0.0F;
    	tail3.rotationPointX = 0.0F;
    	tail1.rotationPointY = 0.5F;
    	tail2.rotationPointY = 0.5F;
    	tail3.rotationPointY = 0.0F;
    	tail1.rotationPointZ = 4.0F;
    	tail2.rotationPointZ = 4.5F;
    	tail3.rotationPointZ = 3.5F;
    	tail2.rotateAngleX = tail3.rotateAngleX = 0.0F;
    	tail1.rotateAngleY = tail2.rotateAngleY = tail3.rotateAngleY = 0.0F;
    	tail1.rotateAngleZ = tail2.rotateAngleZ = tail3.rotateAngleZ = 0.0F;
    	rightLeg.rotateAngleX = leftLeg.rotateAngleX = bipedBody.rotateAngleX * 2.5F;
    	rightLeg.rotateAngleY = leftLeg.rotateAngleY = 0.0F;
    	rightLeg.rotateAngleZ = leftLeg.rotateAngleZ = 0.0F;
    	bipedRightArm.rotateAngleX = bipedLeftArm.rotateAngleX = 0.0F;
    	bipedRightArm.rotateAngleY = bipedLeftArm.rotateAngleY = 0.0F;
    	bipedRightArm.rotateAngleZ = bipedLeftArm.rotateAngleZ = 0.0F;
    	tail1.rotateAngleX = -0.2F;
    	if (getIsRiding()) {
    		// 乗り物に乗っている
    		float f15 = 1.5F;
    		if (getIsSitting()) f15 = 1.0F;
    		float f9 = MathHelper.cos(f * 0.3F);
    		if (f9 < 0) {
    			f9 = -f9 * 2;
    		}
    		float f11 = f9 * 3.0F;
    		bipedBody.rotateAngleX = MathHelper.cos(f * 0.6662F) * 3.3F
    				* f1 + 4.8F;

    		bipedRightArm.rotateAngleX = bipedLeftArm.rotateAngleX = -MathHelper.cos(f * 0.6662F) * 1.4F
    				* f1;
    		bipedBody.rotationPointY = f11 * f1 - f1 * 3F + 5F + f15;
    		bipedBody.rotationPointZ = -f11 * f1 - f1 * 1.5F + 3F;
    		bipedHead.rotationPointY = 0.5F + f15;
    		rightLeg.rotationPointX = -3.0F;
    		leftLeg.rotationPointX = 3.0F;
    		rightLeg.rotationPointY = leftLeg.rotationPointY = 2.0F;
    		rightLeg.rotationPointZ = leftLeg.rotationPointZ = 2.0F;
    		if (!isSneak) {
    			tail1.rotationPointX = 0.0F;
    			tail1.rotationPointY = -1.0F;
    			tail1.rotationPointZ = 2.5F;
    			tail2.rotationPointY = 0.0F;
    			tail2.rotationPointX = 0.0F;
    			tail2.rotationPointZ -= 0.5F;
    			bipedHead.rotationPointY = 0.0F + f15;
    			bipedHead.rotationPointZ = 2.5F;
    			tail1.rotateAngleX = bipedBody.rotateAngleX + 2.0F;
    			tail1.rotateAngleY = 2.0F - ff1;
    			tail1.rotateAngleZ = -ff1;
    			tail2.rotateAngleX = -0.6F - ff1;
    			tail2.rotateAngleY = -ff1 * 0.5F;
    			tail2.rotateAngleZ = 0.5F - ff1;
    			tail3.rotateAngleY = -ff1 * 0.5F;
    		} else {
    			bipedHead.rotationPointY = 0.0F + f15;
    			bipedHead.rotationPointZ = bipedBody.rotationPointZ - 2.0F;
    		}
    		bipedBody.rotateAngleX = bipedBody.rotateAngleX < 5.2F && f > 0 ? 5.2F : bipedBody.rotateAngleX;
    		bipedRightArm.rotateAngleX = bipedLeftArm.rotateAngleX = bipedRightArm.rotateAngleX > 0.0F ? 0.5F : bipedRightArm.rotateAngleX;
    	} else {
    		bipedHead.rotationPointZ = bipedBody.rotationPointZ - 2.0F;
    	}
    	if (getIsSneak()) {
    		// しゃがみ
    		float f12 = getIsRiding() ? -5F : 0F;
    		bipedHead.rotationPointY = 6.0F + f12;
    		bipedBody.rotationPointY = 10.0F + f12;
    		bipedBody.rotateAngleX = 0.1F;
    		rightLeg.rotationPointY = 1.0F;
    		leftLeg.rotationPointY = 1.0F;
    		if (getIsRiding()) {
    			bipedBody.rotationPointY += 1.8F;
    			bipedHead.rotationPointY += 2.8F;
    			rightLeg.rotationPointX += 1.0F;
    			leftLeg.rotationPointX -= 1.0F;
    		}
    	}
    	if (!getIsRiding()) {
    		bipedHead.rotationPointY = 9F;
    		bipedBody.rotationPointY = 12F;
    		bipedRightArm.rotateAngleX = bipedLeftArm.rotateAngleX = MathHelper
    				.cos(f * 0.6662F + 3.141593F) * 2.0F * f1 * 0.5F;
    	}
    	float f10 = bipedRightArm.rotateAngleX;
    	if (getOnGround() > -9990F && !getaimedBow()) {
    		// 腕振り
    		float f6 = getOnGround();
    		float f7 = MathHelper.sin(f6 * 3.141593F);
    		float f8 = MathHelper.sin(getOnGround() * 3.141593F)
    				* -(bipedHead.rotateAngleX - 0.7F) * 0.75F;
    		bipedBody.rotateAngleY = MathHelper.sin(MathHelper
    				.sqrt_float(f6) * 3.141593F * 2.0F) * 0.2F;
    		if (getIsRiding()) {
    			bipedRightArm.rotateAngleX += (double)f10;
    			bipedLeftArm.rotateAngleX += (double)f10;
    		}
    		bipedRightArm.rotateAngleY += bipedBody.rotateAngleY;
    		bipedLeftArm.rotateAngleY += bipedBody.rotateAngleY;
    		bipedLeftArm.rotateAngleX += bipedBody.rotateAngleY;
    		f6 = 1.0F - getOnGround();
    		f6 *= f6;
    		f6 *= f6;
    		f6 = 1.0F - f6;
    		bipedRightArm.rotateAngleX -= (double) f7 * 1.2D
    				+ (double) f8;
    		bipedRightArm.rotateAngleY += bipedBody.rotateAngleY * 2.0F;
    		bipedRightArm.rotateAngleZ = MathHelper
    				.sin(getOnGround() * 3.141593F) * -0.4F;
    	}
    	bipedHead.rotationPointX = 0F;
    	bipedRightArm.rotationPointX = -1.5F;
    	bipedLeftArm.rotationPointX = 1.5F;
    	if (getIsWait() && !getaimedBow())
    	{
    		bipedRightArm.rotationPointY = bipedLeftArm.rotationPointY = 0.5F;
    		bipedRightArm.rotationPointZ = bipedLeftArm.rotationPointZ = -2.5F;
    		bipedRightArm.rotateAngleX = MathHelper.sin(f2 * 0.067F) * 0.05F - 0.7F;
    		bipedRightArm.rotateAngleZ = -0.4F;
    		bipedLeftArm.rotateAngleX = MathHelper.sin(f2 * 0.067F) * 0.05F - 0.7F;
    		bipedLeftArm.rotateAngleZ = 0.4F;
    		if (getIsRiding()) {
    			bipedRightArm.rotateAngleX += 1.5F;
    			bipedLeftArm.rotateAngleX += 1.5F;
    		}
    	}
    	if (getaimedBow()) {
    		// 弓構え
    		float f13 = MathHelper.sin(getOnGround() * 3.141593F);
    		float f14 = MathHelper.sin((1.0F - (1.0F - getOnGround())
    				* (1.0F - getOnGround())) * 3.141593F);
    		bipedRightArm.rotateAngleZ = 0.0F;
    		bipedLeftArm.rotateAngleZ = 0.0F;
    		bipedRightArm.rotateAngleY = -(0.1F - f13 * 0.6F)
    				+ bipedHead.rotateAngleY;
    		bipedLeftArm.rotateAngleY = (0.1F - f13 * 0.6F)
    				+ bipedHead.rotateAngleY + 0.4F;
    		bipedRightArm.rotateAngleX = -1.470796F;
    		bipedLeftArm.rotateAngleX = -1.470796F;
    		bipedRightArm.rotateAngleX -= f13 * 1.2F - f14 * 0.4F;
    		bipedLeftArm.rotateAngleX -= f13 * 1.2F - f14 * 0.4F;
    		bipedRightArm.rotateAngleZ += MathHelper.cos(f2 * 0.09F) * 0.05F + 0.05F;
    		bipedLeftArm.rotateAngleZ -= MathHelper.cos(f2 * 0.09F) * 0.05F + 0.05F;
    		bipedRightArm.rotateAngleX += MathHelper.sin(f2 * 0.067F) * 0.05F;
    		bipedLeftArm.rotateAngleX += MathHelper.sin(f2 * 0.067F) * 0.05F;
    		bipedRightArm.rotateAngleX += bipedHead.rotateAngleX;
    		bipedLeftArm.rotateAngleX += bipedHead.rotateAngleX;
    		bipedRightArm.rotationPointX = -2.0F;
    		bipedLeftArm.rotationPointX = 2.0F;
    		bipedRightArm.rotationPointZ += 1.5F;
    		bipedLeftArm.rotationPointZ += 1.5F;
    		if (getIsRiding()) {
    			bipedRightArm.rotationPointZ = bipedLeftArm.rotationPointZ -= 4.0F;
    		}
    	}

    	rightearhair.rotationPointX = -3.0F;
    	leftearhair.rotationPointX = 3.0F;
    	rightearhair.rotationPointY = leftearhair.rotationPointY = -3.0F;
    	rightearhair.rotationPointZ = leftearhair.rotationPointZ = 1.0F;

    	rightear.rotationPointX = -3.0F;
    	leftear.rotationPointX = 3.0F;
    	rightear.rotationPointY = leftear.rotationPointY = -2.5F;
    	rightear.rotationPointZ = leftear.rotationPointZ = 1.0F;

    	ringR.rotationPointZ = ringL.rotationPointZ = 1.2F;
    	ringR.rotateAngleX = ringL.rotateAngleX = 1.570796313F;

    	rightearhair.rotateAngleZ = ff1 + 0.25F;
    	leftearhair.rotateAngleZ = -rightearhair.rotateAngleZ;
    	ringR.rotateAngleZ = ff1 + 0.25F;
    	ringL.rotateAngleZ = -ringR.rotateAngleZ;
    	ringR.rotationPointX = -ff1 - 4.0F;
    	ringL.rotationPointX = ff1 * 2 + 4.0F;
    	ringR.rotationPointY = -ff1 + 1.0F;
    	ringL.rotationPointY = -ff1 + 1.0F;

    	if (isSleeping) {
    		bipedHead.rotationPointX = -4F;
    		bipedHead.rotationPointY = 2F;
    		bipedHead.rotationPointZ = -2F;
    		bipedBody.rotationPointY = 0F;
    		bipedBody.rotationPointZ = -1F;
    		bipedRightArm.rotationPointY = 2.0F;
    		bipedLeftArm.rotationPointY = bipedRightArm.rotationPointY;
    		rightLeg.rotationPointY = 0.5F;
    		leftLeg.rotationPointY = 0.5F;
    		rightLegbottom.rotationPointY = 1.5F;
    		leftLegbottom.rotationPointY = 1.5F;
    		tail1.rotationPointX = 0.0F;
    		tail1.rotationPointY = 0.0F;
    		tail1.rotationPointZ = 3.5F;
    		tail2.rotationPointY = 1.0F;
    		tail2.rotationPointX = 2.0F;
    		tail2.rotationPointZ = 3.0F;
    		tail3.rotationPointY = 0.0F;
    		tail3.rotationPointX = 1.0F;
    		tail3.rotationPointZ = 3.0F;

    		bipedHead.rotateAngleX = 1.770796313F + f4 / 57.29578F;
        	bipedHead.rotateAngleY = 0F;
    		bipedHead.rotateAngleZ = -0.5F + f3 / 57.29578F;
    		bipedBody.rotateAngleX = 1.570796313F;
    		bipedBody.rotateAngleY = 1.570796313F;
    		bipedBody.rotateAngleZ = 1.570796313F;
    		bipedBody.rotateAngleY = 0.0F;

    		bipedRightArm.rotateAngleX = -1.57F;
    		bipedLeftArm.rotateAngleX = bipedRightArm.rotateAngleX;
    		tail1.rotateAngleX = bipedBody.rotateAngleX - 1.8F;
    		tail1.rotateAngleY = 0.2F;

    		tail2.rotateAngleX = 0.0F;
    		tail2.rotateAngleY = 1.5F;
    		tail2.rotateAngleZ = 0.5F;
    		tail3.rotateAngleX = 0.0F;
    		tail3.rotateAngleY = 1.0F;
    		tail3.rotateAngleZ = 0.0F;
    	}
    }

    @Override
    public void settingShowParts() {
    	super.settingShowParts();
    	//GUI パーツ表示・非表示初期設定
    	//前回の項目最後から10個上書きして設定
    	overridePartsNumber = 10;
    	int k = getPartsNumber() - 10;
    	if(k < 0) k = 0;
    	if(getPartsSetFlag() == 1) {
    		String s[] = {
    				"rightLeg", "leftLeg", "rightear", "leftear", "rightLegb",
    				"leftLegb", "r_earhair", "l_earhair", "tail1", "tail2",
    				"tail3", "ringR", "ringL"
    		};
    		setParts(s, k);
    		setPartsSetFlag(2);
    	}

    	//GUI パーツ表示・非表示反映
    	if(getShowModelFlag() == 0) {
    		boolean b = getGuiShowModel(k);
    		rightLeg.setVisible(b);
    		k++;
    		b = getGuiShowModel(k);
    		leftLeg.setVisible(b);
    		k++;
    		b = getGuiShowModel(k);
    		rightear.setVisible(b);
    		k++;
    		b = getGuiShowModel(k);
    		leftear.setVisible(b);
    		k++;
    		b = getGuiShowModel(k);
    		rightLegbottom.setVisible(b);
    		k++;
    		b = getGuiShowModel(k);
    		leftLegbottom.setVisible(b);
    		k++;
    		b = getGuiShowModel(k);
    		rightearhair.setVisible(b);
    		k++;
    		b = getGuiShowModel(k);
    		leftearhair.setVisible(b);
    		k++;
    		b = getGuiShowModel(k);
    		tail1.setVisible(b);
    		k++;
    		b = getGuiShowModel(k);
    		tail2.setVisible(b);
    		k++;
    		b = getGuiShowModel(k);
    		tail3.setVisible(b);
    		k++;
    		b = getGuiShowModel(k);
    		ringR.setVisible(b);
    		k++;
    		b = getGuiShowModel(k);
    		ringL.setVisible(b);
    		setShowModelFlag(1);
    	}
    }

    @Override
    public float getHeight() {
    	return 0.85F;
    }

    @Override
    public float getWidth() {
    	return 0.7F;
    }

    @Override
    public float getRidingHeight() {
    	return 0.85F;
    }

    @Override
    public float getyOffset() {
    	return 0.47F;
    }

    @Override
    public double getMountedYOffset() {
    	return 1.4D;
    }

    @Override
    public void equippedItemPositionFlower()
    {
    	GL11.glTranslatef(0.0F, -0.3F, 0.0F);
    }

    @Override
    public float Physical_Hammer() {
    	return super.Physical_Hammer() == 1.0F ? 1.2F : super.Physical_Hammer();
    }
}
