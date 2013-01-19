package net.minecraft.src;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import net.minecraft.client.Minecraft;

public class Modchu_ItemRenderer extends MMM_ItemRenderer {

    public static boolean flipHorizontal = false;
    public static boolean leftHandedness = false;

    public Modchu_ItemRenderer(Minecraft minecraft) {
    	super(minecraft);
    }

    public void renderItemInFirstPerson(float f) {
    	ItemStack var7 = mc.thePlayer.inventory.getCurrentItem();
    	if (var7 != null) {
    		if (var7.itemID == Item.map.itemID) {
    			super.renderItemInFirstPerson(f);
    			return;
    		}
    		if (flipHorizontal) {
    			//GL11.glPushMatrix();
    			GL11.glScalef(-1.0F, 1.0F, 1.0F);
    			//GL11.glPopMatrix();
    		}
    	} else {
    		itemToRender = null;
    		equippedProgress = 0.0F;
    		prevEquippedProgress = 0.0F;

    		try {
    			// ローカル変数を確保
    			itemToRender = (ItemStack)ModLoader.getPrivateValue(ItemRenderer.class, this, 1);
    			equippedProgress = (Float)ModLoader.getPrivateValue(ItemRenderer.class, this, 2);
    			prevEquippedProgress = (Float)ModLoader.getPrivateValue(ItemRenderer.class, this, 3);
    		} catch (Exception e) {
    		}
    		renderItemInFirstPersonHand(f);
    		return;
    	}
    	//Modchu_Debug.mDebug("renderItemInFirstPerson");
    	super.renderItemInFirstPerson(f);
    }

    public void renderItemInFirstPersonHand(float par1)
    {
        float var2 = this.prevEquippedProgress + (this.equippedProgress - this.prevEquippedProgress) * par1;
        EntityClientPlayerMP var3 = this.mc.thePlayer;
        float var4 = var3.prevRotationPitch + (var3.rotationPitch - var3.prevRotationPitch) * par1;
        GL11.glPushMatrix();
        GL11.glRotatef(var4, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef(var3.prevRotationYaw + (var3.rotationYaw - var3.prevRotationYaw) * par1, 0.0F, 1.0F, 0.0F);
        RenderHelper.enableStandardItemLighting();
        GL11.glPopMatrix();
        float var5;
        float var6;

        if (var3 instanceof EntityPlayerSP)
        {
            var5 = var3.prevRenderArmPitch + (var3.renderArmPitch - var3.prevRenderArmPitch) * par1;
            var6 = var3.prevRenderArmYaw + (var3.renderArmYaw - var3.prevRenderArmYaw) * par1;
            GL11.glRotatef((var3.rotationPitch - var5) * 0.1F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef((var3.rotationYaw - var6) * 0.1F, 0.0F, 1.0F, 0.0F);
        }

        //ItemStack var7 = this.itemToRender;
        var5 = this.mc.theWorld.getLightBrightness(MathHelper.floor_double(var3.posX), MathHelper.floor_double(var3.posY), MathHelper.floor_double(var3.posZ));
        var5 = 1.0F;
        int var8 = this.mc.theWorld.getLightBrightnessForSkyBlocks(MathHelper.floor_double(var3.posX), MathHelper.floor_double(var3.posY), MathHelper.floor_double(var3.posZ), 0);
        int var9 = var8 % 65536;
        int var10 = var8 / 65536;
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)var9 / 1.0F, (float)var10 / 1.0F);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        float var11;
        float var12;
        float var13;

        GL11.glColor4f(var5, var5, var5, 1.0F);

        float var14;
        float var15;
        Render var17;
        float var16;
        RenderPlayer var18;

        if (!var3.getHasActivePotion())
        {
            GL11.glPushMatrix();
            if (leftHandedness) {
                var6 = 0.8F;
                //var13 = 0.5F;
                var13 = var3.getSwingProgress(par1);
                var12 = MathHelper.sin(var13 * (float)Math.PI);
                var11 = MathHelper.sin(MathHelper.sqrt_float(var13) * (float)Math.PI);
                float x = -var11 * 0.3F;
                float y = MathHelper.sin(MathHelper.sqrt_float(var13) * (float)Math.PI * 2.0F) * 0.4F;
                float z = -var12 * 0.4F;
                GL11.glTranslatef(-x, y, z);
                x = 0.8F * var6;
                y = -0.75F * var6 - (1.0F - var2) * 0.6F;
                z = -0.9F * var6;
                GL11.glTranslatef(-x, y, z);
                GL11.glRotatef(-45.0F, 0.0F, 1.0F, 0.0F);
                GL11.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
                GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
                GL11.glEnable(GL12.GL_RESCALE_NORMAL);
                var13 = -var3.getSwingProgress(par1);
                var12 = MathHelper.sin(var13 * var13 * (float)Math.PI);
                var11 = MathHelper.sin(MathHelper.sqrt_float(var13) * (float)Math.PI);
                GL11.glRotatef(-var11 * 70.0F, 0.0F, 1.0F, 0.0F);
                GL11.glRotatef(var12 * 20.0F, 0.0F, 0.0F, 1.0F);
                GL11.glBindTexture(GL11.GL_TEXTURE_2D, this.mc.renderEngine.getTextureForDownloadableImage(this.mc.thePlayer.skinUrl, this.mc.thePlayer.getTexture()));
                GL11.glTranslatef(1.0F, 3.6F, 3.5F);
                GL11.glRotatef(-120.0F, 0.0F, 0.0F, 1.0F);
                GL11.glRotatef(-200.0F, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(135.0F, 0.0F, 1.0F, 0.0F);
                GL11.glScalef(1.0F, 1.0F, 1.0F);
                GL11.glTranslatef(-4.8F, -2.9F, 0.5F);
                var17 = RenderManager.instance.getEntityRenderObject(this.mc.thePlayer);
                var18 = (RenderPlayer)var17;
            	var16 = 1.0F;
            	GL11.glScalef(var16, var16, var16);
            } else {
                var6 = 0.8F;
                var13 = var3.getSwingProgress(par1);
                var12 = MathHelper.sin(var13 * (float)Math.PI);
                var11 = MathHelper.sin(MathHelper.sqrt_float(var13) * (float)Math.PI);
                GL11.glTranslatef(-var11 * 0.3F, MathHelper.sin(MathHelper.sqrt_float(var13) * (float)Math.PI * 2.0F) * 0.4F, -var12 * 0.4F);
                GL11.glTranslatef(0.8F * var6, -0.75F * var6 - (1.0F - var2) * 0.6F, -0.9F * var6);
                GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
                GL11.glEnable(GL12.GL_RESCALE_NORMAL);
                var13 = var3.getSwingProgress(par1);
                var12 = MathHelper.sin(var13 * var13 * (float)Math.PI);
                var11 = MathHelper.sin(MathHelper.sqrt_float(var13) * (float)Math.PI);
                GL11.glRotatef(var11 * 70.0F, 0.0F, 1.0F, 0.0F);
                GL11.glRotatef(-var12 * 20.0F, 0.0F, 0.0F, 1.0F);
                GL11.glBindTexture(GL11.GL_TEXTURE_2D, this.mc.renderEngine.getTextureForDownloadableImage(this.mc.thePlayer.skinUrl, this.mc.thePlayer.getTexture()));
                GL11.glTranslatef(-1.0F, 3.6F, 3.5F);
                GL11.glRotatef(120.0F, 0.0F, 0.0F, 1.0F);
                GL11.glRotatef(200.0F, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
                GL11.glScalef(1.0F, 1.0F, 1.0F);
                GL11.glTranslatef(5.6F, 0.0F, 0.0F);
                var17 = RenderManager.instance.getEntityRenderObject(this.mc.thePlayer);
                var18 = (RenderPlayer)var17;
            	var16 = 1.0F;
            	GL11.glScalef(var16, var16, var16);
            }
            var18.func_82441_a(this.mc.thePlayer);
            GL11.glPopMatrix();
        }

        GL11.glDisable(GL12.GL_RESCALE_NORMAL);
        RenderHelper.disableStandardItemLighting();
    }

    public boolean getFlipHorizontal() {
    	return flipHorizontal;
    }

    public void setFlipHorizontal(boolean b) {
    	flipHorizontal = b;
    }
}