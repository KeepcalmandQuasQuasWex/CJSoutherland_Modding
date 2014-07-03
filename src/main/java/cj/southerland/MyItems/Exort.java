package cj.southerland.MyItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class Exort extends Item {	
	public Exort(){
	setCreativeTab(CreativeTabs.tabMaterials);
	setUnlocalizedName("Exort");
	setMaxStackSize(64);}

	//Load Icons and Textures Properly
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon("malicematerials:"
		+ (this.getUnlocalizedName().substring(5)));
}
}