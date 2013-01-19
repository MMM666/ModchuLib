package net.minecraft.src;

public class ModelPlayerFormLittleMaid_Beverly3 extends ModelPlayerFormLittleMaid_Beverly4
{

    public ModelPlayerFormLittleMaid_Beverly3()
    {
    	this(0.0F);
    }

    public ModelPlayerFormLittleMaid_Beverly3(float f)
    {
    	this(f, 0.0F);
    }

    public ModelPlayerFormLittleMaid_Beverly3(float f, float f1)
    {
    	// 132deletesuper(f, f1);
//-@-132
    	this(f, f1 , 64, 64);
    }

    public ModelPlayerFormLittleMaid_Beverly3(float f, float f1, int i, int j) {
    	super(f, f1, i, j);
//@-@132
    }

    @Override
    public void initModel(float f, float f1) {
    	super.initModel(f, f1);
    	f = f > 0.0F ? 0.3F : 0.2F;
    	bipedHead = new Modchu_ModelRenderer(this, 0, 0);
    	bipedHead.addBox(-4.0F, -8F, -4.0F, 8, 8, 8, f - 0.5F);
    	bipedHead.setTextureOffset(35, 39).addBox(-1.5F, -1.0F, -1.2F, 3, 1, 3, f-0.5F);//neck
    	Headwear = new Modchu_ModelRenderer(this, 32, 0);
    	Headwear.addBox(-4.0F, -9F, -4.0F, 8, 12, 8, f);
    	bipedHead.addChild(Headwear);
    	bipedHead.addChild(eyeR);
    	bipedHead.addChild(eyeL);
    	mainFrame.clearChildModels();
    	mainFrame.addChild(bipedHead);
    	mainFrame.addChild(bipedBody);
    }
}