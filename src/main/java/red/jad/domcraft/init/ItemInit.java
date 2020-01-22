package red.jad.domcraft.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemRecord;
import net.minecraftforge.common.util.EnumHelper;
import red.jad.domcraft.items.ArmorGeneric;
import red.jad.domcraft.items.ItemBucketOfCumgus;
import red.jad.domcraft.items.ItemCustomRecord;
import red.jad.domcraft.items.ItemGeneric;
import red.jad.domcraft.utility.Reference;
import red.jad.domcraft.utility.handlers.SoundsHandler;

public class ItemInit {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	// Materials
	public static final ArmorMaterial ARMOR_MATERIAL_SOCKS = EnumHelper.addArmorMaterial("armor_material_socks", Reference.MODID + ":socks", 2, new int[]{1, 3, 2, 1}, 25, SoundEvents.BLOCK_SNOW_HIT, 0.0F);
	
	// Registration
	public static final Item DOMCOIN = new ItemGeneric("domcoin");
	public static final Item SOCKS = new ArmorGeneric("socks", ARMOR_MATERIAL_SOCKS, 1, EntityEquipmentSlot.FEET);
	public static final ItemBucketOfCumgus BUCKET_OF_CUMGUS = new ItemBucketOfCumgus();
	
	/// Records
	public static final ItemRecord RECORD_CHUNGUS = new ItemCustomRecord("record_chungus", SoundsHandler.RECORD_CHUNGUS);
	public static final ItemRecord RECORD_GUILLOTINE = new ItemCustomRecord("record_guillotine", SoundsHandler.RECORD_GUILLOTINE);
	public static final ItemRecord RECORD_GMAN = new ItemCustomRecord("record_gman", SoundsHandler.RECORD_GMAN);
	public static final ItemRecord RECORD_HUNGRY = new ItemCustomRecord("record_hungry", SoundsHandler.RECORD_HUNGRY);
}
