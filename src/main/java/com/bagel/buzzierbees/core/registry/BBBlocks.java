package com.bagel.buzzierbees.core.registry;

import com.bagel.buzzierbees.common.blocks.CandleBlock;
import com.bagel.buzzierbees.common.blocks.CartwheelBlock;
import com.bagel.buzzierbees.common.blocks.CrystallizedHoneyBlock;
import com.bagel.buzzierbees.common.blocks.HoneyLampBlock;
import com.bagel.buzzierbees.common.blocks.HoneyPotBlock;
import com.bagel.buzzierbees.common.blocks.PottedCartwheelBlock;
import com.bagel.buzzierbees.common.blocks.ScentedCandleBlock;
import com.bagel.buzzierbees.core.BuzzierBees;
import com.bagel.buzzierbees.core.util.PropertyUtils;
import com.mojang.datafixers.util.Pair;
import com.teamabnormals.abnormals_core.common.blocks.AbnormalsBeehiveBlock;
import com.teamabnormals.abnormals_core.common.blocks.AbnormalsFlowerBlock;
import com.teamabnormals.abnormals_core.common.blocks.AbnormalsLadderBlock;
import com.teamabnormals.abnormals_core.common.blocks.AbnormalsStairsBlock;
import com.teamabnormals.abnormals_core.common.blocks.AbnormalsTallFlowerBlock;
import com.teamabnormals.abnormals_core.common.blocks.BookshelfBlock;
import com.teamabnormals.abnormals_core.common.blocks.VerticalSlabBlock;
import com.teamabnormals.abnormals_core.common.blocks.sign.AbnormalsStandingSignBlock;
import com.teamabnormals.abnormals_core.common.blocks.sign.AbnormalsWallSignBlock;
import com.teamabnormals.abnormals_core.common.blocks.wood.AbnormalsWoodButtonBlock;
import com.teamabnormals.abnormals_core.common.blocks.wood.PlanksBlock;
import com.teamabnormals.abnormals_core.common.blocks.wood.WoodDoorBlock;
import com.teamabnormals.abnormals_core.common.blocks.wood.WoodFenceBlock;
import com.teamabnormals.abnormals_core.common.blocks.wood.WoodFenceGateBlock;
import com.teamabnormals.abnormals_core.common.blocks.wood.WoodPressurePlateBlock;
import com.teamabnormals.abnormals_core.common.blocks.wood.WoodSlabBlock;
import com.teamabnormals.abnormals_core.common.blocks.wood.WoodStairsBlock;
import com.teamabnormals.abnormals_core.common.blocks.wood.WoodTrapDoorBlock;
import com.teamabnormals.abnormals_core.core.utils.RegistryHelper;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.WallBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.entity.item.PaintingType;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.Effects;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("deprecation")
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BBBlocks
{	
	public static final RegistryHelper HELPER = BuzzierBees.REGISTRY_HELPER;
	
	public static final DeferredRegister<PaintingType> PAINTINGS = DeferredRegister.create(ForgeRegistries.PAINTING_TYPES, BuzzierBees.MODID);
	public static final RegistryObject<PaintingType> CANDLE_PAINTING = PAINTINGS.register("candle", () -> new PaintingType(32, 48));
	
	// Beehives //
	
	public static final RegistryObject<Block> SPRUCE_BEEHIVE   	= HELPER.createBlock("spruce_beehive", () -> new AbnormalsBeehiveBlock(Block.Properties.from(Blocks.BEEHIVE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BIRCH_BEEHIVE    	= HELPER.createBlock("birch_beehive", () -> new AbnormalsBeehiveBlock(Block.Properties.from(Blocks.BEEHIVE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> JUNGLE_BEEHIVE   	= HELPER.createBlock("jungle_beehive", () -> new AbnormalsBeehiveBlock(Block.Properties.from(Blocks.BEEHIVE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> ACACIA_BEEHIVE   	= HELPER.createBlock("acacia_beehive", () -> new AbnormalsBeehiveBlock(Block.Properties.from(Blocks.BEEHIVE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> DARK_OAK_BEEHIVE	= HELPER.createBlock("dark_oak_beehive", () -> new AbnormalsBeehiveBlock(Block.Properties.from(Blocks.BEEHIVE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CRIMSON_BEEHIVE	= HELPER.createBlock("crimson_beehive", () -> new AbnormalsBeehiveBlock(Block.Properties.from(Blocks.BEEHIVE)), null);
	public static final RegistryObject<Block> WARPED_BEEHIVE	= HELPER.createBlock("warped_beehive", () -> new AbnormalsBeehiveBlock(Block.Properties.from(Blocks.BEEHIVE)), null);
	
	// Compatability Beehives //
	
	public static final RegistryObject<Block> ROSEWOOD_BEEHIVE 	= HELPER.createCompatBlock("atmospheric", "rosewood_beehive", () -> new AbnormalsBeehiveBlock(Block.Properties.from(Blocks.BEEHIVE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> YUCCA_BEEHIVE    	= HELPER.createCompatBlock("atmospheric", "yucca_beehive", () -> new AbnormalsBeehiveBlock(Block.Properties.from(Blocks.BEEHIVE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> KOUSA_BEEHIVE    	= HELPER.createCompatBlock("atmospheric", "kousa_beehive", () -> new AbnormalsBeehiveBlock(Block.Properties.from(Blocks.BEEHIVE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> ASPEN_BEEHIVE    	= HELPER.createCompatBlock("atmospheric", "aspen_beehive", () -> new AbnormalsBeehiveBlock(Block.Properties.from(Blocks.BEEHIVE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> GRIMWOOD_BEEHIVE 	= HELPER.createCompatBlock("atmospheric", "grimwood_beehive", () -> new AbnormalsBeehiveBlock(Block.Properties.from(Blocks.BEEHIVE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> WILLOW_BEEHIVE   	= HELPER.createCompatBlock("swampexpansion", "willow_beehive", () -> new AbnormalsBeehiveBlock(Block.Properties.from(Blocks.BEEHIVE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> WISTERIA_BEEHIVE 	= HELPER.createCompatBlock("bloomful", "wisteria_beehive", () -> new AbnormalsBeehiveBlock(Block.Properties.from(Blocks.BEEHIVE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BAMBOO_BEEHIVE	= HELPER.createCompatBlock("bambooblocks", "bamboo_beehive", () -> new AbnormalsBeehiveBlock(Block.Properties.from(Blocks.BEEHIVE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> MAPLE_BEEHIVE    	= HELPER.createCompatBlock("autumnity", "maple_beehive", () -> new AbnormalsBeehiveBlock(Block.Properties.from(Blocks.BEEHIVE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> DRIFTWOOD_BEEHIVE	= HELPER.createCompatBlock("upgrade_aquatic", "driftwood_beehive", () -> new AbnormalsBeehiveBlock(Block.Properties.from(Blocks.BEEHIVE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> RIVER_BEEHIVE		= HELPER.createCompatBlock("upgrade_aquatic", "river_beehive", () -> new AbnormalsBeehiveBlock(Block.Properties.from(Blocks.BEEHIVE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> POISE_BEEHIVE		= HELPER.createCompatBlock("endergetic", "poise_beehive", () -> new AbnormalsBeehiveBlock(Block.Properties.from(Blocks.BEEHIVE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SNAKE_BLOCK_BEEHIVE = HELPER.createBlock("snake_block_beehive", () -> new AbnormalsBeehiveBlock(Block.Properties.from(Blocks.DARK_PRISMARINE)), null);
	public static final RegistryObject<Block> BOP_FIR_BEEHIVE 		= HELPER.createCompatBlock("biomesoplenty", "bop_fir_beehive", () -> new AbnormalsBeehiveBlock(Block.Properties.from(Blocks.BEEHIVE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BOP_DEAD_BEEHIVE 		= HELPER.createCompatBlock("biomesoplenty", "bop_dead_beehive", () -> new AbnormalsBeehiveBlock(Block.Properties.from(Blocks.BEEHIVE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BOP_PALM_BEEHIVE 		= HELPER.createCompatBlock("biomesoplenty", "bop_palm_beehive", () -> new AbnormalsBeehiveBlock(Block.Properties.from(Blocks.BEEHIVE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BOP_MAGIC_BEEHIVE 	= HELPER.createCompatBlock("biomesoplenty", "bop_magic_beehive", () -> new AbnormalsBeehiveBlock(Block.Properties.from(Blocks.BEEHIVE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BOP_CHERRY_BEEHIVE 	= HELPER.createCompatBlock("biomesoplenty", "bop_cherry_beehive", () -> new AbnormalsBeehiveBlock(Block.Properties.from(Blocks.BEEHIVE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BOP_UMBRAN_BEEHIVE 	= HELPER.createCompatBlock("biomesoplenty", "bop_umbran_beehive", () -> new AbnormalsBeehiveBlock(Block.Properties.from(Blocks.BEEHIVE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BOP_WILLOW_BEEHIVE 	= HELPER.createCompatBlock("biomesoplenty", "bop_willow_beehive", () -> new AbnormalsBeehiveBlock(Block.Properties.from(Blocks.BEEHIVE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BOP_REDWOOD_BEEHIVE 	= HELPER.createCompatBlock("biomesoplenty", "bop_redwood_beehive", () -> new AbnormalsBeehiveBlock(Block.Properties.from(Blocks.BEEHIVE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BOP_HELLBARK_BEEHIVE 	= HELPER.createCompatBlock("biomesoplenty", "bop_hellbark_beehive", () -> new AbnormalsBeehiveBlock(Block.Properties.from(Blocks.BEEHIVE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BOP_MAHOGANY_BEEHIVE 	= HELPER.createCompatBlock("biomesoplenty", "bop_mahogany_beehive", () -> new AbnormalsBeehiveBlock(Block.Properties.from(Blocks.BEEHIVE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BOP_JACARANDA_BEEHIVE = HELPER.createCompatBlock("biomesoplenty", "bop_jacaranda_beehive", () -> new AbnormalsBeehiveBlock(Block.Properties.from(Blocks.BEEHIVE)), ItemGroup.DECORATIONS);

	// Misc //
	
	public static final RegistryObject<Block> WAX_BLOCK 				= HELPER.createBlock("wax_block", () -> new Block(Block.Properties.create(Material.CORAL).slipperiness(0.95F).hardnessAndResistance(0.3F).sound(SoundType.CORAL)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CRYSTALLIZED_HONEY_BLOCK  = HELPER.createBlock("crystallized_honey_block", () -> new CrystallizedHoneyBlock(Block.Properties.create(Material.CAKE).notSolid().slipperiness(0.98F).hardnessAndResistance(0.3F).sound(SoundType.GLASS)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> HONEY_LAMP 				= HELPER.createBlock("honey_lamp", () -> new HoneyLampBlock(Block.Properties.from(Blocks.END_ROD).sound(SoundType.field_226947_m_)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> HONEY_POT 				= HELPER.createBlock("honey_pot", () -> new HoneyPotBlock(Block.Properties.from(Blocks.TERRACOTTA)), ItemGroup.DECORATIONS);

	// Hive Planks //
	
	public static final RegistryObject<Block> HIVE_PLANKS          = HELPER.createBlock("hive_planks", () -> new PlanksBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)), ItemGroup.BUILDING_BLOCKS); 
	public static final RegistryObject<Block> HIVE_STAIRS          = HELPER.createBlock("hive_stairs", () -> new WoodStairsBlock(HIVE_PLANKS.get().getDefaultState(), Block.Properties.from(HIVE_PLANKS.get())), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> HIVE_SLAB            = HELPER.createBlock("hive_slab", () -> new WoodSlabBlock(Block.Properties.from(HIVE_PLANKS.get())), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> HIVE_FENCE           = HELPER.createBlock("hive_fence", () -> new WoodFenceBlock(Block.Properties.from(Blocks.OAK_FENCE)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> HIVE_PRESSURE_PLATE  = HELPER.createBlock("hive_pressure_plate", () -> new WoodPressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.from(Blocks.OAK_PRESSURE_PLATE).doesNotBlockMovement()), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> HIVE_TRAPDOOR        = HELPER.createBlock("hive_trapdoor", () -> new WoodTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR).notSolid()), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> HIVE_FENCE_GATE      = HELPER.createBlock("hive_fence_gate", () -> new WoodFenceGateBlock(Block.Properties.from(Blocks.OAK_FENCE_GATE)), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> HIVE_BUTTON          = HELPER.createBlock("hive_button", () -> new AbnormalsWoodButtonBlock(Block.Properties.from(Blocks.OAK_BUTTON).doesNotBlockMovement()), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> HIVE_DOOR            = HELPER.createBlock("hive_door", () -> new WoodDoorBlock(Block.Properties.from(Blocks.OAK_DOOR).notSolid()), ItemGroup.REDSTONE);
	public static final RegistryObject<Block> VERTICAL_HIVE_PLANKS = HELPER.createCompatBlock("quark", "vertical_hive_planks", () -> new Block(Block.Properties.from(HIVE_PLANKS.get())), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> HIVE_VERTICAL_SLAB   = HELPER.createCompatBlock("quark", "hive_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(HIVE_PLANKS.get())), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> HIVE_LADDER          = HELPER.createCompatBlock("quark", "hive_ladder", () -> new AbnormalsLadderBlock(Block.Properties.from(Blocks.LADDER).notSolid()), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> HIVE_BOOKSHELF       = HELPER.createCompatBlock("quark", "hive_bookshelf", () -> new BookshelfBlock(Block.Properties.from(Blocks.BOOKSHELF).notSolid()), ItemGroup.DECORATIONS);
	
	// Honey Bricks //
	
	public static final RegistryObject<Block> HONEY_BRICKS              = HELPER.createBlock("honey_bricks", () -> new Block(Block.Properties.from(Blocks.BRICKS)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> HONEY_BRICK_STAIRS 	    = HELPER.createBlock("honey_brick_stairs", () -> new AbnormalsStairsBlock(HONEY_BRICKS.get().getDefaultState(), Block.Properties.from(Blocks.BRICK_STAIRS)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> HONEY_BRICK_SLAB 	        = HELPER.createBlock("honey_brick_slab", () -> new SlabBlock(Block.Properties.from(Blocks.BRICK_SLAB)), ItemGroup.BUILDING_BLOCKS);
	public static final RegistryObject<Block> HONEY_BRICK_WALL 	        = HELPER.createBlock("honey_brick_wall", () -> new WallBlock(Block.Properties.from(Blocks.BRICK_WALL)), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> HONEY_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "honey_brick_vertical_slab", () -> new VerticalSlabBlock(Block.Properties.from(HONEY_BRICKS.get())), ItemGroup.BUILDING_BLOCKS);
	public static final Pair<RegistryObject<AbnormalsStandingSignBlock>, RegistryObject<AbnormalsWallSignBlock>> SIGNS = HELPER.createSignBlock("hive", MaterialColor.YELLOW);
	
	// Flowers //
	
	public static final RegistryObject<Block> CARTWHEEL 		= HELPER.createBlock("cartwheel", () -> new CartwheelBlock(Effects.SPEED, 11, PropertyUtils.FLOWER), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BLUEBELL 			= HELPER.createBlock("bluebell", () -> new AbnormalsFlowerBlock(Effects.WATER_BREATHING, 6, PropertyUtils.FLOWER), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> VIOLET 			= HELPER.createBlock("violet", () -> new AbnormalsFlowerBlock(Effects.INVISIBILITY, 6, PropertyUtils.FLOWER), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> DIANTHUS 			= HELPER.createBlock("jolyce", () -> new AbnormalsFlowerBlock(Effects.STRENGTH, 8, PropertyUtils.FLOWER), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> COLUMBINE 		= HELPER.createBlock("columbine", () -> new AbnormalsFlowerBlock(Effects.MINING_FATIGUE, 6, PropertyUtils.FLOWER), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> WHITE_CLOVER 		= HELPER.createBlock("white_clover", () -> new AbnormalsFlowerBlock(Effects.UNLUCK, 30, PropertyUtils.FLOWER.notSolid()), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PINK_CLOVER 		= HELPER.createBlock("pink_clover", () -> new AbnormalsFlowerBlock(Effects.UNLUCK, 60, PropertyUtils.FLOWER.notSolid()), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> YELLOW_HIBISCUS	= HELPER.createBlock("daybloom", () -> new AbnormalsFlowerBlock(Effects.GLOWING, 8, PropertyUtils.FLOWER), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> ORANGE_HIBISCUS 	= HELPER.createBlock("orange_hibiscus", () -> new AbnormalsFlowerBlock(Effects.GLOWING, 8, PropertyUtils.FLOWER), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> RED_HIBISCUS 		= HELPER.createBlock("red_hibiscus", () -> new AbnormalsFlowerBlock(Effects.GLOWING, 8, PropertyUtils.FLOWER), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PINK_HIBISCUS 	= HELPER.createBlock("pink_hibiscus", () -> new AbnormalsFlowerBlock(Effects.GLOWING, 8, PropertyUtils.FLOWER), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> MAGENTA_HIBISCUS 	= HELPER.createBlock("magenta_hibiscus", () -> new AbnormalsFlowerBlock(Effects.GLOWING, 8, PropertyUtils.FLOWER), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PURPLE_HIBISCUS 	= HELPER.createBlock("purple_hibiscus", () -> new AbnormalsFlowerBlock(Effects.GLOWING, 8, PropertyUtils.FLOWER), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BIRD_OF_PARADISE 	= HELPER.createBlock("bird_of_paradise", () -> new AbnormalsTallFlowerBlock(PropertyUtils.FLOWER), ItemGroup.DECORATIONS);

	// Candles //
	
	public static final RegistryObject<Block> CANDLE 			= HELPER.createBlock("candle", () -> new CandleBlock(PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> WHITE_CANDLE 		= HELPER.createBlock("white_candle", () -> new CandleBlock(PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> ORANGE_CANDLE 	= HELPER.createBlock("orange_candle", () -> new CandleBlock(PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> MAGENTA_CANDLE 	= HELPER.createBlock("magenta_candle", () -> new CandleBlock(PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> LIGHT_BLUE_CANDLE = HELPER.createBlock("light_blue_candle", () -> new CandleBlock(PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> YELLOW_CANDLE 	= HELPER.createBlock("yellow_candle", () -> new CandleBlock(PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> LIME_CANDLE 		= HELPER.createBlock("lime_candle", () -> new CandleBlock(PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PINK_CANDLE 		= HELPER.createBlock("pink_candle", () -> new CandleBlock(PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> GRAY_CANDLE 		= HELPER.createBlock("gray_candle", () -> new CandleBlock(PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> LIGHT_GRAY_CANDLE = HELPER.createBlock("light_gray_candle", () -> new CandleBlock(PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CYAN_CANDLE 		= HELPER.createBlock("cyan_candle", () -> new CandleBlock(PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PURPLE_CANDLE 	= HELPER.createBlock("purple_candle", () -> new CandleBlock(PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BLUE_CANDLE 		= HELPER.createBlock("blue_candle", () -> new CandleBlock(PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BROWN_CANDLE 		= HELPER.createBlock("brown_candle", () -> new CandleBlock(PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> GREEN_CANDLE 		= HELPER.createBlock("green_candle", () -> new CandleBlock(PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> RED_CANDLE 		= HELPER.createBlock("red_candle", () -> new CandleBlock(PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BLACK_CANDLE 		= HELPER.createBlock("black_candle", () -> new CandleBlock(PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	
	public static final RegistryObject<Block> AMBER_CANDLE 		  = HELPER.createCompatBlock("flamboyant", "amber_candle", () -> new CandleBlock(PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BEIGE_CANDLE 		  = HELPER.createCompatBlock("flamboyant", "beige_candle", () -> new CandleBlock(PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CREAM_CANDLE 		  = HELPER.createCompatBlock("flamboyant", "cream_candle", () -> new CandleBlock(PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> DARK_GREEN_CANDLE   = HELPER.createCompatBlock("flamboyant", "dark_green_candle", () -> new CandleBlock(PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> FOREST_GREEN_CANDLE = HELPER.createCompatBlock("flamboyant", "forest_green_candle", () -> new CandleBlock(PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> HOT_PINK_CANDLE 	  = HELPER.createCompatBlock("flamboyant", "hot_pink_candle", () -> new CandleBlock(PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> INDIGO_CANDLE 	  = HELPER.createCompatBlock("flamboyant", "indigo_candle", () -> new CandleBlock(PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> MAROON_CANDLE 	  = HELPER.createCompatBlock("flamboyant", "maroon_candle", () -> new CandleBlock(PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> NAVY_CANDLE 	      = HELPER.createCompatBlock("flamboyant", "navy_candle", () -> new CandleBlock(PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> OLIVE_CANDLE 		  = HELPER.createCompatBlock("flamboyant", "olive_candle", () -> new CandleBlock(PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PALE_GREEN_CANDLE   = HELPER.createCompatBlock("flamboyant", "pale_green_candle", () -> new CandleBlock(PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PALE_PINK_CANDLE 	  = HELPER.createCompatBlock("flamboyant", "pale_pink_candle", () -> new CandleBlock(PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PALE_YELLOW_CANDLE  = HELPER.createCompatBlock("flamboyant", "pale_yellow_candle", () -> new CandleBlock(PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SKY_BLUE_CANDLE 	  = HELPER.createCompatBlock("flamboyant", "sky_blue_candle", () -> new CandleBlock(PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SLATE_GRAY_CANDLE   = HELPER.createCompatBlock("flamboyant", "slate_gray_candle", () -> new CandleBlock(PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> VIOLET_CANDLE 	  = HELPER.createCompatBlock("flamboyant", "violet_candle", () -> new CandleBlock(PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	
	// Scented Candles //
	
	public static final RegistryObject<Block> ALLIUM_SCENTED_CANDLE             = HELPER.createBlock("allium_scented_candle", () -> new ScentedCandleBlock(() -> Effects.FIRE_RESISTANCE, 70, 0, PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> AZURE_BLUET_SCENTED_CANDLE        = HELPER.createBlock("azure_bluet_scented_candle", () -> new ScentedCandleBlock(() -> Effects.BLINDNESS,       70, 0, PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BLUE_ORCHID_SCENTED_CANDLE        = HELPER.createBlock("blue_orchid_scented_candle", () -> new ScentedCandleBlock(() -> Effects.SATURATION,      70, 0, PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> DANDELION_SCENTED_CANDLE          = HELPER.createBlock("dandelion_scented_candle", () -> new ScentedCandleBlock(() -> Effects.SATURATION,      70, 0, PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> CORNFLOWER_SCENTED_CANDLE         = HELPER.createBlock("cornflower_scented_candle", () -> new ScentedCandleBlock(() -> Effects.JUMP_BOOST,      70, 0, PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> LILY_OF_THE_VALLEY_SCENTED_CANDLE = HELPER.createBlock("lily_of_the_valley_scented_candle", () -> new ScentedCandleBlock(() -> Effects.POISON,          70, 0, PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> OXEYE_DAISY_SCENTED_CANDLE        = HELPER.createBlock("oxeye_daisy_scented_candle", () -> new ScentedCandleBlock(() -> Effects.REGENERATION,    70, 0, PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> POPPY_SCENTED_CANDLE              = HELPER.createBlock("poppy_scented_candle", () -> new ScentedCandleBlock(() -> Effects.NIGHT_VISION,    70, 0, PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> WHITE_TULIP_SCENTED_CANDLE        = HELPER.createBlock("white_tulip_scented_candle", () -> new ScentedCandleBlock(() -> Effects.WEAKNESS,        70, 0, PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> ORANGE_TULIP_SCENTED_CANDLE       = HELPER.createBlock("orange_tulip_scented_candle", () -> new ScentedCandleBlock(() -> Effects.WEAKNESS,        70, 0, PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PINK_TULIP_SCENTED_CANDLE         = HELPER.createBlock("pink_tulip_scented_candle", () -> new ScentedCandleBlock(() -> Effects.WEAKNESS,        70, 0, PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> RED_TULIP_SCENTED_CANDLE          = HELPER.createBlock("red_tulip_scented_candle", () -> new ScentedCandleBlock(() -> Effects.WEAKNESS,        70, 0, PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> WITHER_ROSE_SCENTED_CANDLE        = HELPER.createBlock("wither_rose_scented_candle", () -> new ScentedCandleBlock(() -> Effects.WITHER,          70, 0, PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	
	public static final RegistryObject<Block> CARTWHEEL_SCENTED_CANDLE    = HELPER.createBlock("cartwheel_scented_candle", () -> new ScentedCandleBlock(() -> Effects.SPEED, 70, 0, PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> BLUEBELL_SCENTED_CANDLE     = HELPER.createBlock("bluebell_scented_candle", () -> new ScentedCandleBlock(() -> Effects.WATER_BREATHING, 70, 0, PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> VIOLET_SCENTED_CANDLE       = HELPER.createBlock("violet_scented_candle", () -> new ScentedCandleBlock(() -> Effects.INVISIBILITY,    70, 0, PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> DIANTHUS_SCENTED_CANDLE     = HELPER.createBlock("jolyce_scented_candle", () -> new ScentedCandleBlock(() -> Effects.STRENGTH,        70, 0, PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> COLUMBINE_SCENTED_CANDLE    = HELPER.createBlock("columbine_scented_candle", () -> new ScentedCandleBlock(() -> Effects.MINING_FATIGUE,  70, 0, PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> WHITE_CLOVER_SCENTED_CANDLE = HELPER.createBlock("white_clover_scented_candle", () -> new ScentedCandleBlock(() -> Effects.UNLUCK,          70, 0, PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PINK_CLOVER_SCENTED_CANDLE  = HELPER.createBlock("pink_clover_scented_candle", () -> new ScentedCandleBlock(() -> Effects.UNLUCK,          70, 0, PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> YELLOW_HIBISCUS_SCENTED_CANDLE	= HELPER.createBlock("daybloom_scented_candle", () -> new ScentedCandleBlock(() -> Effects.GLOWING,         70, 0, PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> ORANGE_HIBISCUS_SCENTED_CANDLE    = HELPER.createBlock("orange_hibiscus_scented_candle", () -> new ScentedCandleBlock(() -> Effects.GLOWING,         70, 0, PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> RED_HIBISCUS_SCENTED_CANDLE     	= HELPER.createBlock("red_hibiscus_scented_candle", () -> new ScentedCandleBlock(() -> Effects.GLOWING,         70, 0, PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PINK_HIBISCUS_SCENTED_CANDLE    	= HELPER.createBlock("pink_hibiscus_scented_candle", () -> new ScentedCandleBlock(() -> Effects.GLOWING,         70, 0, PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> MAGENTA_HIBISCUS_SCENTED_CANDLE   = HELPER.createBlock("magenta_hibiscus_scented_candle", () -> new ScentedCandleBlock(() -> Effects.GLOWING,         70, 0, PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PURPLE_HIBISCUS_SCENTED_CANDLE    = HELPER.createBlock("purple_hibiscus_scented_candle", () -> new ScentedCandleBlock(() -> Effects.GLOWING,         70, 0, PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	
	public static final RegistryObject<Block> WARM_MONKEY_BRUSH_SCENTED_CANDLE    	= HELPER.createCompatBlock("atmospheric", "warm_monkey_brush_scented_candle", () -> new ScentedCandleBlock(() -> (ModList.get().isLoaded("atmospheric") ? ForgeRegistries.POTIONS.getValue(new ResourceLocation("atmospheric:relief")) : null), 70, 0, PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> HOT_MONKEY_BRUSH_SCENTED_CANDLE    	= HELPER.createCompatBlock("atmospheric", "hot_monkey_brush_scented_candle", () -> new ScentedCandleBlock(() -> (ModList.get().isLoaded("atmospheric") ? ForgeRegistries.POTIONS.getValue(new ResourceLocation("atmospheric:relief")): null), 70, 0, PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> SCALDING_MONKEY_BRUSH_SCENTED_CANDLE  = HELPER.createCompatBlock("atmospheric", "scalding_monkey_brush_scented_candle", () -> new ScentedCandleBlock(() -> (ModList.get().isLoaded("atmospheric") ? ForgeRegistries.POTIONS.getValue(new ResourceLocation("atmospheric:relief")) : null), 70, 0, PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> GILIA_SCENTED_CANDLE    				= HELPER.createCompatBlock("atmospheric", "gilia_scented_candle", () -> new ScentedCandleBlock(() -> Effects.SLOW_FALLING, 70, 0, PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> YUCCA_FLOWER_SCENTED_CANDLE    		= HELPER.createCompatBlock("atmospheric", "yucca_flower_scented_candle", () -> new ScentedCandleBlock(() -> (ModList.get().isLoaded("atmospheric") ? ForgeRegistries.POTIONS.getValue(new ResourceLocation("atmospheric:persistence")) : null), 70, 0, PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> PINK_SEAROCKET_SCENTED_CANDLE    		= HELPER.createCompatBlock("upgrade_aquatic", "pink_searocket_scented_candle", () -> new ScentedCandleBlock(() -> Effects.WATER_BREATHING, 70, 0, PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> WHITE_SEAROCKET_SCENTED_CANDLE    	= HELPER.createCompatBlock("upgrade_aquatic", "white_searocket_scented_candle", () -> new ScentedCandleBlock(() -> Effects.WATER_BREATHING, 70, 0, PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	public static final RegistryObject<Block> AUTUMN_CROCUS_SCENTED_CANDLE    		= HELPER.createCompatBlock("autumnity", "autumn_crocus_scented_candle", () -> new ScentedCandleBlock(() -> (ModList.get().isLoaded("autumnity") ? ForgeRegistries.POTIONS.getValue(new ResourceLocation("autumnity:life_stasis")) : null), 70, 0, PropertyUtils.CANDLE), ItemGroup.DECORATIONS);
	
	// Flower Pots //
		
	public static final RegistryObject<Block> POTTED_CARTWHEEL 	  		= HELPER.createBlockNoItem("potted_cartwheel", () -> new PottedCartwheelBlock(CARTWHEEL.get(), PropertyUtils.POT));
	public static final RegistryObject<Block> POTTED_BLUEBELL     		= HELPER.createBlockNoItem("potted_bluebell", () -> new FlowerPotBlock(BLUEBELL.get(), PropertyUtils.POT));
	public static final RegistryObject<Block> POTTED_VIOLET 	  		= HELPER.createBlockNoItem("potted_violet", () -> new FlowerPotBlock(VIOLET.get(), PropertyUtils.POT));
	public static final RegistryObject<Block> POTTED_DIANTHUS 	  		= HELPER.createBlockNoItem("potted_jolyce", () -> new FlowerPotBlock(DIANTHUS.get(), PropertyUtils.POT));
	public static final RegistryObject<Block> POTTED_COLUMBINE 	  		= HELPER.createBlockNoItem("potted_columbine", () -> new FlowerPotBlock(COLUMBINE.get(), PropertyUtils.POT));
	public static final RegistryObject<Block> POTTED_WHITE_CLOVER 		= HELPER.createBlockNoItem("potted_white_clover", () -> new FlowerPotBlock(WHITE_CLOVER.get(), PropertyUtils.POT));
	public static final RegistryObject<Block> POTTED_PINK_CLOVER  		= HELPER.createBlockNoItem("potted_pink_clover", () -> new FlowerPotBlock(PINK_CLOVER.get(), PropertyUtils.POT));
	public static final RegistryObject<Block> POTTED_YELLOW_HIBISCUS	= HELPER.createBlockNoItem("potted_daybloom", () -> new FlowerPotBlock(YELLOW_HIBISCUS.get(), PropertyUtils.POT));
	public static final RegistryObject<Block> POTTED_ORANGE_HIBISCUS	= HELPER.createBlockNoItem("potted_orange_hibiscus", () -> new FlowerPotBlock(ORANGE_HIBISCUS.get(), PropertyUtils.POT));
	public static final RegistryObject<Block> POTTED_RED_HIBISCUS 		= HELPER.createBlockNoItem("potted_red_hibiscus", () -> new FlowerPotBlock(RED_HIBISCUS.get(), PropertyUtils.POT));
	public static final RegistryObject<Block> POTTED_PINK_HIBISCUS  	= HELPER.createBlockNoItem("potted_pink_hibiscus", () -> new FlowerPotBlock(PINK_HIBISCUS.get(), PropertyUtils.POT));
	public static final RegistryObject<Block> POTTED_MAGENTA_HIBISCUS	= HELPER.createBlockNoItem("potted_magenta_hibiscus", () -> new FlowerPotBlock(MAGENTA_HIBISCUS.get(), PropertyUtils.POT));
	public static final RegistryObject<Block> POTTED_PURPLE_HIBISCUS	= HELPER.createBlockNoItem("potted_purple_hibiscus", () -> new FlowerPotBlock(PURPLE_HIBISCUS.get(), PropertyUtils.POT));
	public static final RegistryObject<Block> POTTED_BIRD_OF_PARADISE	= HELPER.createBlockNoItem("potted_bird_of_paradise", () -> new FlowerPotBlock(BIRD_OF_PARADISE.get(), PropertyUtils.POT));
}
