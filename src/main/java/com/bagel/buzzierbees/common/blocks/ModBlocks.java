package com.bagel.buzzierbees.common.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks
{
	//candles
	public static Block CANDLE;
	public static Block WHITE_CANDLE;
	public static Block ORANGE_CANDLE;
	public static Block MAGENTA_CANDLE;
	public static Block LIGHT_BLUE_CANDLE;
	public static Block YELLOW_CANDLE;
	public static Block LIME_CANDLE;
	public static Block PINK_CANDLE;
	public static Block GRAY_CANDLE;
	public static Block LIGHT_GRAY_CANDLE;
	public static Block CYAN_CANDLE;
	public static Block PURPLE_CANDLE;
	public static Block BLUE_CANDLE;
	public static Block BROWN_CANDLE;
	public static Block GREEN_CANDLE;
	public static Block RED_CANDLE;
	public static Block BLACK_CANDLE;
	
	//flamboyant candles
	public static Block AMBER_CANDLE;
	public static Block BEIGE_CANDLE;
	public static Block CREAM_CANDLE;
	public static Block DARK_GREEN_CANDLE;
	public static Block FOREST_GREEN_CANDLE;
	public static Block HOT_PINK_CANDLE;
	public static Block INDIGO_CANDLE;
	public static Block MAROON_CANDLE;
	public static Block NAVY_CANDLE;
	public static Block OLIVE_CANDLE;
	public static Block PALE_GREEN_CANDLE;
	public static Block PALE_PINK_CANDLE;
	public static Block PALE_YELLOW_CANDLE;
	public static Block SKY_BLUE_CANDLE;
	public static Block SLATE_GRAY_CANDLE;
	public static Block VIOLET_CANDLE;
	
	//scented candles
	public static Block ALLIUM_SCENTED_CANDLE;
	public static Block AZURE_BLUET_SCENTED_CANDLE;
	public static Block BLUE_ORCHID_SCENTED_CANDLE;
	public static Block DANDELION_SCENTED_CANDLE;
	public static Block CORNFLOWER_SCENTED_CANDLE;
	public static Block LILY_OF_THE_VALLEY_SCENTED_CANDLE;
	public static Block OXEYE_DAISY_SCENTED_CANDLE;
	public static Block POPPY_SCENTED_CANDLE;
	public static Block WHITE_TULIP_SCENTED_CANDLE;
	public static Block ORANGE_TULIP_SCENTED_CANDLE;
	public static Block PINK_TULIP_SCENTED_CANDLE;
	public static Block RED_TULIP_SCENTED_CANDLE;
	public static Block WITHER_ROSE_SCENTED_CANDLE;
	
	public static Block WAX_BLOCK;
	public static Block CRYSTALLIZED_HONEY_BLOCK;
	public static Block CLOVER_HONEY_BLOCK;
	public static Block CRYSTALLIZED_CLOVER_HONEY_BLOCK;
	
	public static Block CARTWHEEL;
	public static Block BLUEBELL;
	public static Block VIOLET;
	public static Block COLUMBINE;
	public static Block JOLYCE;
	public static Block DAYBLOOM;
	public static Block BIRD_OF_PARADISE;
	public static Block WHITE_CLOVER;
	public static Block PINK_CLOVER;
	
	public static Block POTTED_CARTWHEEL;
	public static Block POTTED_BLUEBELL;
	public static Block POTTED_VIOLET;
	public static Block POTTED_COLUMBINE;
	public static Block POTTED_JOLYCE;
	public static Block POTTED_DAYBLOOM;
	public static Block POTTED_WHITE_CLOVER;
	public static Block POTTED_PINK_CLOVER;
	
	//public static Block CARTWHEEL_SCENTED_CANDLE;
	//public static Block BLUEBELL_SCENTED_CANDLE;
	//public static Block VIOLET_SCENTED_CANDLE;
	//public static Block COLUMBINE_SCENTED_CANDLE;
	//public static Block JOLYCE_SCENTED_CANDLE;
	//public static Block DAYBLOOM_SCENTED_CANDLE;
	//public static Block WHITE_CLOVER_SCENTED_CANDLE;
	//public static Block PINK_CLOVER_SCENTED_CANDLE;
	
	public static Block HIVE_PLANKS;
	public static Block HIVE_STAIRS;
	public static Block HIVE_SLAB;
	public static Block HIVE_FENCE;
	public static Block HIVE_FENCE_GATE;
	public static Block HIVE_PRESSURE_PLATE;
	public static Block HIVE_BUTTON;
	public static Block HIVE_DOOR;
	public static Block HIVE_TRAPDOOR;
	
	public static Block HIVE_BLOCK;
	
	@SuppressWarnings("deprecation")
	@SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
		
		WAX_BLOCK = registerBlock(new Block(Block.Properties.create(Material.CORAL).hardnessAndResistance(0.3F).sound(SoundType.CORAL)), "wax_block", ItemGroup.DECORATIONS);
		//CRYSTALLIZED_HONEY_BLOCK = registerBlock(new Block(Block.Properties.create(Material.GLASS).func_226896_b_().hardnessAndResistance(0.3F).sound(SoundType.GLASS)), "crystallized_honey_block", ItemGroup.DECORATIONS);
		CLOVER_HONEY_BLOCK = registerBlock(new CloverHoneyBlock(Block.Properties.from(Blocks.field_226907_mc_).func_226896_b_()), "clover_honey_block", ItemGroup.DECORATIONS);
		//CRYSTALLIZED_CLOVER_HONEY_BLOCK = registerBlock(new Block(Block.Properties.from(CRYSTALLIZED_HONEY_BLOCK)),"crystallized_clover_honey_block", ItemGroup.DECORATIONS);
		
		HIVE_PLANKS = registerBlock(new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), "hive_planks", ItemGroup.BUILDING_BLOCKS);
		HIVE_STAIRS = registerBlock(new StairsBlock(HIVE_PLANKS.getDefaultState(), Block.Properties.from(HIVE_PLANKS)), "hive_stairs", ItemGroup.BUILDING_BLOCKS);
		HIVE_SLAB = registerBlock(new SlabBlock(Block.Properties.from(HIVE_PLANKS)), "hive_slab", ItemGroup.BUILDING_BLOCKS);
        HIVE_FENCE = registerBlock(new FenceBlock(Block.Properties.from(HIVE_PLANKS)), "hive_fence", ItemGroup.DECORATIONS);
        HIVE_FENCE_GATE = registerBlock(new FenceGateBlock(Block.Properties.from(HIVE_PLANKS)), "hive_fence_gate", ItemGroup.REDSTONE);
        HIVE_BUTTON = registerBlock(new WoodButtonBlock(Block.Properties.from(HIVE_PLANKS)), "hive_button", ItemGroup.REDSTONE);
		HIVE_PRESSURE_PLATE = registerBlock(new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.from(HIVE_PLANKS)), "hive_pressure_plate", ItemGroup.REDSTONE);
		//HIVE_DOOR = registerBlock(new DoorBlock(Block.Properties.from(HIVE_PLANKS)), "hive_door", ItemGroup.REDSTONE);
        //HIVE_TRAPDOOR = registerBlock(new TrapDoorBlock(Block.Properties.from(HIVE_PLANKS)), "hive_trapdoor", ItemGroup.REDSTONE);
		
		CARTWHEEL = registerBlock(new FlowerBlock(Effects.SPEED, 11, Block.Properties.create(Material.PLANTS).func_226896_b_().doesNotBlockMovement().zeroHardnessAndResistance().sound(SoundType.PLANT)), "cartwheel", ItemGroup.DECORATIONS);
		BLUEBELL = registerBlock(new FlowerBlock(Effects.WATER_BREATHING, 6, Block.Properties.from(CARTWHEEL)), "bluebell", ItemGroup.DECORATIONS);
		DAYBLOOM = registerBlock(new FlowerBlock(Effects.GLOWING, 8, Block.Properties.from(CARTWHEEL)), "daybloom", ItemGroup.DECORATIONS);
		VIOLET = registerBlock(new FlowerBlock(Effects.INVISIBILITY, 6, Block.Properties.from(CARTWHEEL)), "violet", ItemGroup.DECORATIONS);
		JOLYCE = registerBlock(new FlowerBlock(Effects.NAUSEA, 6, Block.Properties.from(CARTWHEEL)), "jolyce", ItemGroup.DECORATIONS);
		COLUMBINE = registerBlock(new FlowerBlock(Effects.MINING_FATIGUE, 6, Block.Properties.from(CARTWHEEL)), "columbine", ItemGroup.DECORATIONS);
		BIRD_OF_PARADISE = registerBlock(new TallFlowerBlock(Block.Properties.from(CARTWHEEL)), "bird_of_paradise", ItemGroup.DECORATIONS);
		WHITE_CLOVER = registerBlock(new CloverBlock(Effects.LUCK, Block.Properties.from(Blocks.POPPY).func_226896_b_()), "white_clover", ItemGroup.DECORATIONS);
		PINK_CLOVER = registerBlock(new CloverBlock(Effects.LUCK, Block.Properties.from(Blocks.POPPY).func_226896_b_()), "pink_clover", ItemGroup.DECORATIONS);
		
	    POTTED_CARTWHEEL = registerBlockNoItem(new FlowerPotBlock(CARTWHEEL, Block.Properties.create(Material.MISCELLANEOUS).zeroHardnessAndResistance().func_226896_b_()), "potted_cartwheel");
	    POTTED_BLUEBELL = registerBlockNoItem(new FlowerPotBlock(BLUEBELL, Block.Properties.create(Material.MISCELLANEOUS).zeroHardnessAndResistance().func_226896_b_()), "potted_bluebell");
	    POTTED_DAYBLOOM = registerBlockNoItem(new FlowerPotBlock(DAYBLOOM, Block.Properties.create(Material.MISCELLANEOUS).zeroHardnessAndResistance().func_226896_b_()), "potted_daybloom");
	    POTTED_VIOLET = registerBlockNoItem(new FlowerPotBlock(VIOLET, Block.Properties.create(Material.MISCELLANEOUS).zeroHardnessAndResistance().func_226896_b_()), "potted_violet");
	    POTTED_JOLYCE = registerBlockNoItem(new FlowerPotBlock(JOLYCE, Block.Properties.create(Material.MISCELLANEOUS).zeroHardnessAndResistance().func_226896_b_()), "potted_jolyce");
	    POTTED_COLUMBINE = registerBlockNoItem(new FlowerPotBlock(COLUMBINE, Block.Properties.create(Material.MISCELLANEOUS).zeroHardnessAndResistance().func_226896_b_()), "potted_columbine");
	    POTTED_WHITE_CLOVER = registerBlockNoItem(new FlowerPotBlock(WHITE_CLOVER, Block.Properties.create(Material.MISCELLANEOUS).zeroHardnessAndResistance().func_226896_b_()), "potted_white_clover");
	    POTTED_PINK_CLOVER = registerBlockNoItem(new FlowerPotBlock(PINK_CLOVER, Block.Properties.create(Material.MISCELLANEOUS).zeroHardnessAndResistance().func_226896_b_()), "potted_pink_clover");

		//vanilla candles
		CANDLE = registerBlock(new CandleBlock(Block.Properties.create(Material.CORAL).hardnessAndResistance(0.0F).sound(SoundType.WOOD)), "candle", ItemGroup.DECORATIONS);
		WHITE_CANDLE = registerBlock(new CandleBlock(Block.Properties.from(CANDLE)), "white_candle", ItemGroup.DECORATIONS);
		ORANGE_CANDLE = registerBlock(new CandleBlock(Block.Properties.from(CANDLE)), "orange_candle", ItemGroup.DECORATIONS);
		MAGENTA_CANDLE = registerBlock(new CandleBlock(Block.Properties.from(CANDLE)), "magenta_candle", ItemGroup.DECORATIONS);
		LIGHT_BLUE_CANDLE = registerBlock(new CandleBlock(Block.Properties.from(CANDLE)), "light_blue_candle", ItemGroup.DECORATIONS);
		YELLOW_CANDLE = registerBlock(new CandleBlock(Block.Properties.from(CANDLE)), "yellow_candle", ItemGroup.DECORATIONS);
		LIME_CANDLE = registerBlock(new CandleBlock(Block.Properties.from(CANDLE)), "lime_candle", ItemGroup.DECORATIONS);
		PINK_CANDLE = registerBlock(new CandleBlock(Block.Properties.from(CANDLE)), "pink_candle", ItemGroup.DECORATIONS);
		GRAY_CANDLE = registerBlock(new CandleBlock(Block.Properties.from(CANDLE)), "gray_candle", ItemGroup.DECORATIONS);
		LIGHT_GRAY_CANDLE = registerBlock(new CandleBlock(Block.Properties.from(CANDLE)), "light_gray_candle", ItemGroup.DECORATIONS);
		CYAN_CANDLE = registerBlock(new CandleBlock(Block.Properties.from(CANDLE)), "cyan_candle", ItemGroup.DECORATIONS);
		PURPLE_CANDLE = registerBlock(new CandleBlock(Block.Properties.from(CANDLE)), "purple_candle", ItemGroup.DECORATIONS);
		BLUE_CANDLE = registerBlock(new CandleBlock(Block.Properties.from(CANDLE)), "blue_candle", ItemGroup.DECORATIONS);
		BROWN_CANDLE = registerBlock(new CandleBlock(Block.Properties.from(CANDLE)), "brown_candle", ItemGroup.DECORATIONS);
		GREEN_CANDLE = registerBlock(new CandleBlock(Block.Properties.from(CANDLE)), "green_candle", ItemGroup.DECORATIONS);
		RED_CANDLE = registerBlock(new CandleBlock(Block.Properties.from(CANDLE)), "red_candle", ItemGroup.DECORATIONS);
		BLACK_CANDLE = registerBlock(new CandleBlock(Block.Properties.from(CANDLE)), "black_candle", ItemGroup.DECORATIONS);
		
		//vanilla scented candles
		ALLIUM_SCENTED_CANDLE = registerBlock(new ScentedCandleBlock(Effects.FIRE_RESISTANCE, Block.Properties.from(CANDLE)), "allium_scented_candle", ItemGroup.DECORATIONS);
		AZURE_BLUET_SCENTED_CANDLE = registerBlock(new ScentedCandleBlock(Effects.BLINDNESS, Block.Properties.from(CANDLE)), "azure_bluet_scented_candle", ItemGroup.DECORATIONS);
		BLUE_ORCHID_SCENTED_CANDLE = registerBlock(new ScentedCandleBlock(Effects.SATURATION, Block.Properties.from(CANDLE)), "blue_orchid_scented_candle", ItemGroup.DECORATIONS);
		DANDELION_SCENTED_CANDLE = registerBlock(new ScentedCandleBlock(Effects.SATURATION, Block.Properties.from(CANDLE)), "dandelion_scented_candle", ItemGroup.DECORATIONS);
		CORNFLOWER_SCENTED_CANDLE = registerBlock(new ScentedCandleBlock(Effects.JUMP_BOOST, Block.Properties.from(CANDLE)), "cornflower_scented_candle", ItemGroup.DECORATIONS);
		LILY_OF_THE_VALLEY_SCENTED_CANDLE = registerBlock(new ScentedCandleBlock(Effects.POISON, Block.Properties.from(CANDLE)), "lily_of_the_valley_scented_candle", ItemGroup.DECORATIONS);
		OXEYE_DAISY_SCENTED_CANDLE = registerBlock(new ScentedCandleBlock(Effects.REGENERATION, Block.Properties.from(CANDLE)), "oxeye_daisy_scented_candle", ItemGroup.DECORATIONS);
		POPPY_SCENTED_CANDLE = registerBlock(new ScentedCandleBlock(Effects.NIGHT_VISION, Block.Properties.from(CANDLE)), "poppy_scented_candle", ItemGroup.DECORATIONS);
		WHITE_TULIP_SCENTED_CANDLE = registerBlock(new ScentedCandleBlock(Effects.WEAKNESS, Block.Properties.from(CANDLE)), "white_tulip_scented_candle", ItemGroup.DECORATIONS);
		ORANGE_TULIP_SCENTED_CANDLE = registerBlock(new ScentedCandleBlock(Effects.WEAKNESS, Block.Properties.from(CANDLE)), "orange_tulip_scented_candle", ItemGroup.DECORATIONS);
		PINK_TULIP_SCENTED_CANDLE = registerBlock(new ScentedCandleBlock(Effects.WEAKNESS, Block.Properties.from(CANDLE)), "pink_tulip_scented_candle", ItemGroup.DECORATIONS);
		RED_TULIP_SCENTED_CANDLE = registerBlock(new ScentedCandleBlock(Effects.WEAKNESS, Block.Properties.from(CANDLE)), "red_tulip_scented_candle", ItemGroup.DECORATIONS);
		WITHER_ROSE_SCENTED_CANDLE = registerBlock(new ScentedCandleBlock(Effects.WITHER, Block.Properties.from(CANDLE)), "wither_rose_scented_candle", ItemGroup.DECORATIONS);
		
		//mod scented candles
		//CARTWHEEL_SCENTED_CANDLE = registerBlock(new ScentedCandleBlock(Effects.SPEED, Block.Properties.from(CANDLE)), "cartwheel_scented_candle", ItemGroup.DECORATIONS);
		//BLUEBELL_SCENTED_CANDLE = registerBlock(new ScentedCandleBlock(Effects.___, Block.Properties.from(CANDLE)), "bluebell_scented_candle", ItemGroup.DECORATIONS);
		//DAYBLOOM_SCENTED_CANDLE = registerBlock(new ScentedCandleBlock(Effects.GLOWING, Block.Properties.from(CANDLE)), "daybloom_scented_candle", ItemGroup.DECORATIONS);
		//VIOLET_SCENTED_CANDLE = registerBlock(new ScentedCandleBlock(Effects.___, Block.Properties.from(CANDLE)), "violet_scented_candle", ItemGroup.DECORATIONS);
		//JOLYCE_SCENTED_CANDLE = registerBlock(new ScentedCandleBlock(Effects.NAUSUA, Block.Properties.from(CANDLE)), "jolyce_scented_candle", ItemGroup.DECORATIONS);
		//COLUMBINE_SCENTED_CANDLE = registerBlock(new ScentedCandleBlock(Effects.MINING_FATIGUE, Block.Properties.from(CANDLE)), "columbine_scented_candle", ItemGroup.DECORATIONS);
		//WHITE_CLOVER_SCENTED_CANDLE = registerBlock(new ScentedCandleBlock(Effects.LUCK, Block.Properties.from(CANDLE)), "white_clover_scented_candle", ItemGroup.DECORATIONS);
		//PINK_CLOVER_SCENTED_CANDLE = registerBlock(new ScentedCandleBlock(Effects.LUCK, Block.Properties.from(CANDLE)), "pink_clover_scented_candle", ItemGroup.DECORATIONS);

		
		//flamboyant candles
		if (ModList.get().isLoaded("flamboyant")) {
			AMBER_CANDLE = registerBlock(new CandleBlock(Block.Properties.from(CANDLE)), "amber_candle", ItemGroup.DECORATIONS);
			BEIGE_CANDLE = registerBlock(new CandleBlock(Block.Properties.from(CANDLE)), "beige_candle", ItemGroup.DECORATIONS);
			CREAM_CANDLE = registerBlock(new CandleBlock(Block.Properties.from(CANDLE)), "cream_candle", ItemGroup.DECORATIONS);
			DARK_GREEN_CANDLE = registerBlock(new CandleBlock(Block.Properties.from(CANDLE)), "dark_green_candle", ItemGroup.DECORATIONS);
			FOREST_GREEN_CANDLE = registerBlock(new CandleBlock(Block.Properties.from(CANDLE)), "forest_green_candle", ItemGroup.DECORATIONS);
			HOT_PINK_CANDLE = registerBlock(new CandleBlock(Block.Properties.from(CANDLE)), "hot_pink_candle", ItemGroup.DECORATIONS);
			INDIGO_CANDLE = registerBlock(new CandleBlock(Block.Properties.from(CANDLE)), "indigo_candle", ItemGroup.DECORATIONS);
			MAROON_CANDLE = registerBlock(new CandleBlock(Block.Properties.from(CANDLE)), "maroon_candle", ItemGroup.DECORATIONS);
			NAVY_CANDLE = registerBlock(new CandleBlock(Block.Properties.from(CANDLE)), "navy_candle", ItemGroup.DECORATIONS);
			OLIVE_CANDLE = registerBlock(new CandleBlock(Block.Properties.from(CANDLE)), "olive_candle", ItemGroup.DECORATIONS);
			PALE_GREEN_CANDLE = registerBlock(new CandleBlock(Block.Properties.from(CANDLE)), "pale_green_candle", ItemGroup.DECORATIONS);
			PALE_PINK_CANDLE = registerBlock(new CandleBlock(Block.Properties.from(CANDLE)), "pale_pink_candle", ItemGroup.DECORATIONS);
			PALE_YELLOW_CANDLE = registerBlock(new CandleBlock(Block.Properties.from(CANDLE)), "pale_yellow_candle", ItemGroup.DECORATIONS);
			SKY_BLUE_CANDLE = registerBlock(new CandleBlock(Block.Properties.from(CANDLE)), "sky_blue_candle", ItemGroup.DECORATIONS);
			SLATE_GRAY_CANDLE = registerBlock(new CandleBlock(Block.Properties.from(CANDLE)), "slate_gray_candle", ItemGroup.DECORATIONS);
			VIOLET_CANDLE = registerBlock(new CandleBlock(Block.Properties.from(CANDLE)), "violet_candle", ItemGroup.DECORATIONS);
		}
    }

    public static Block registerBlock(Block block, String name, ItemGroup group)
    {
        BlockItem itemBlock = new BlockItem(block, new Item.Properties().group(group));
        block.setRegistryName(name);
        itemBlock.setRegistryName(name);
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(itemBlock);
        return block;
    }
    
    public static Block registerBlockNoItem(Block block, String name)
    {
        block.setRegistryName(name);
        ForgeRegistries.BLOCKS.register(block);
        return block;
    }

    public static Block registerBlockNoGroup(Block block, String name)
    {
        BlockItem itemBlock = new BlockItem(block, new Item.Properties().group(null));
        block.setRegistryName(name);
        itemBlock.setRegistryName(name);
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(itemBlock);
        return block;
    }
    
    public static Block registerBlock(Block block, BlockItem itemBlock, String name) {
        block.setRegistryName(name);
        ForgeRegistries.BLOCKS.register(block);

        if (itemBlock != null) {
            itemBlock.setRegistryName(name);
            ForgeRegistries.ITEMS.register(itemBlock);
        }

        return block;
    }
}