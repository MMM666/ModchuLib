package net.minecraft.src;

import org.lwjgl.input.Mouse;

import net.minecraft.client.Minecraft;

public class Modchu_GuiSmallButton extends GuiSmallButton {

	public boolean buttonClick = false;

	public Modchu_GuiSmallButton(int i, int x, int j, int k,
			int l, String s) {
		super(i, x, j, k, l, s);
	}

	public boolean mousePressed(Minecraft par1Minecraft, int par2, int par3)
    {
    	if (buttonClick) {
    		buttonClick = false;
    		return enabled && drawButton && par2 >= xPosition && par3 >= yPosition && par2 < xPosition + width && par3 < yPosition + height;
    	}
    	return false;
    }

    public void drawButton(Minecraft par1Minecraft, int par2, int par3)
    {
    	super.drawButton(par1Minecraft, par2, par3);
    	if (!buttonClick
    			&& Mouse.isButtonDown(0)) buttonClick = true;
    }
}
