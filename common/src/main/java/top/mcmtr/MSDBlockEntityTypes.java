package top.mcmtr;

import mtr.RegistryObject;
import mtr.mappings.RegistryUtilities;
import net.minecraft.world.level.block.entity.BlockEntityType;
import top.mcmtr.blocks.*;

public interface MSDBlockEntityTypes {
    RegistryObject<BlockEntityType<BlockYuuniPIDS.TileEntityPIDS>> YUUNI_PIDS_TILE_ENTITY = new RegistryObject<>(() -> RegistryUtilities.getBlockEntityType(BlockYuuniPIDS.TileEntityPIDS::new, MSDBlocks.YUUNI_PIDS.get()));
    RegistryObject<BlockEntityType<BlockYuuniPIDS_2.TileEntityPIDS>> YUUNI_PIDS_2_TILE_ENTITY = new RegistryObject<>(() -> RegistryUtilities.getBlockEntityType(BlockYuuniPIDS_2.TileEntityPIDS::new, MSDBlocks.YUUNI_2_PIDS.get()));
    RegistryObject<BlockEntityType<BlockYamanote4PIDS.TileEntityPIDS>> YAMANOTE_4_PIDS_TILE_ENTITY = new RegistryObject<>(() -> RegistryUtilities.getBlockEntityType(BlockYamanote4PIDS.TileEntityPIDS::new, MSDBlocks.YAMANOTE_4_PIDS.get()));
    RegistryObject<BlockEntityType<BlockYamanote5PIDS.TileEntityPIDS>> YAMANOTE_5_PIDS_TILE_ENTITY = new RegistryObject<>(() -> RegistryUtilities.getBlockEntityType(BlockYamanote5PIDS.TileEntityPIDS::new, MSDBlocks.YAMANOTE_5_PIDS.get()));
    RegistryObject<BlockEntityType<BlockYamanote6PIDS.TileEntityPIDS>> YAMANOTE_6_PIDS_TILE_ENTITY = new RegistryObject<>(() -> RegistryUtilities.getBlockEntityType(BlockYamanote6PIDS.TileEntityPIDS::new, MSDBlocks.YAMANOTE_6_PIDS.get()));
    RegistryObject<BlockEntityType<BlockYamanote7PIDS.TileEntityPIDS>> YAMANOTE_7_PIDS_TILE_ENTITY = new RegistryObject<>(() -> RegistryUtilities.getBlockEntityType(BlockYamanote7PIDS.TileEntityPIDS::new, MSDBlocks.YAMANOTE_7_PIDS.get()));
    RegistryObject<BlockEntityType<BlockYamanoteRailwaySign.TileEntityRailwaySign>> YAMANOTE_RAILWAY_SIGN_2_EVEN_TILE_ENTITY = new RegistryObject<>(() -> RegistryUtilities.getBlockEntityType((pos, state) -> new BlockYamanoteRailwaySign.TileEntityRailwaySign(2, false, pos, state), MSDBlocks.YAMANOTE_RAILWAY_SIGN_2_EVEN.get()));
    RegistryObject<BlockEntityType<BlockYamanoteRailwaySign.TileEntityRailwaySign>> YAMANOTE_RAILWAY_SIGN_2_ODD_TILE_ENTITY = new RegistryObject<>(() -> RegistryUtilities.getBlockEntityType((pos, state) -> new BlockYamanoteRailwaySign.TileEntityRailwaySign(2, true, pos, state), MSDBlocks.YAMANOTE_RAILWAY_SIGN_2_ODD.get()));
    RegistryObject<BlockEntityType<BlockYamanoteRailwaySign.TileEntityRailwaySign>> YAMANOTE_RAILWAY_SIGN_3_EVEN_TILE_ENTITY = new RegistryObject<>(() -> RegistryUtilities.getBlockEntityType((pos, state) -> new BlockYamanoteRailwaySign.TileEntityRailwaySign(3, false, pos, state), MSDBlocks.YAMANOTE_RAILWAY_SIGN_3_EVEN.get()));
    RegistryObject<BlockEntityType<BlockYamanoteRailwaySign.TileEntityRailwaySign>> YAMANOTE_RAILWAY_SIGN_3_ODD_TILE_ENTITY = new RegistryObject<>(() -> RegistryUtilities.getBlockEntityType((pos, state) -> new BlockYamanoteRailwaySign.TileEntityRailwaySign(3, true, pos, state), MSDBlocks.YAMANOTE_RAILWAY_SIGN_3_ODD.get()));
    RegistryObject<BlockEntityType<BlockYamanoteRailwaySign.TileEntityRailwaySign>> YAMANOTE_RAILWAY_SIGN_4_EVEN_TILE_ENTITY = new RegistryObject<>(() -> RegistryUtilities.getBlockEntityType((pos, state) -> new BlockYamanoteRailwaySign.TileEntityRailwaySign(4, false, pos, state), MSDBlocks.YAMANOTE_RAILWAY_SIGN_4_EVEN.get()));
    RegistryObject<BlockEntityType<BlockYamanoteRailwaySign.TileEntityRailwaySign>> YAMANOTE_RAILWAY_SIGN_4_ODD_TILE_ENTITY = new RegistryObject<>(() -> RegistryUtilities.getBlockEntityType((pos, state) -> new BlockYamanoteRailwaySign.TileEntityRailwaySign(4, true, pos, state), MSDBlocks.YAMANOTE_RAILWAY_SIGN_4_ODD.get()));
    RegistryObject<BlockEntityType<BlockYamanoteRailwaySign.TileEntityRailwaySign>> YAMANOTE_RAILWAY_SIGN_5_EVEN_TILE_ENTITY = new RegistryObject<>(() -> RegistryUtilities.getBlockEntityType((pos, state) -> new BlockYamanoteRailwaySign.TileEntityRailwaySign(5, false, pos, state), MSDBlocks.YAMANOTE_RAILWAY_SIGN_5_EVEN.get()));
    RegistryObject<BlockEntityType<BlockYamanoteRailwaySign.TileEntityRailwaySign>> YAMANOTE_RAILWAY_SIGN_5_ODD_TILE_ENTITY = new RegistryObject<>(() -> RegistryUtilities.getBlockEntityType((pos, state) -> new BlockYamanoteRailwaySign.TileEntityRailwaySign(5, true, pos, state), MSDBlocks.YAMANOTE_RAILWAY_SIGN_5_ODD.get()));
    RegistryObject<BlockEntityType<BlockYamanoteRailwaySign.TileEntityRailwaySign>> YAMANOTE_RAILWAY_SIGN_6_EVEN_TILE_ENTITY = new RegistryObject<>(() -> RegistryUtilities.getBlockEntityType((pos, state) -> new BlockYamanoteRailwaySign.TileEntityRailwaySign(6, false, pos, state), MSDBlocks.YAMANOTE_RAILWAY_SIGN_6_EVEN.get()));
    RegistryObject<BlockEntityType<BlockYamanoteRailwaySign.TileEntityRailwaySign>> YAMANOTE_RAILWAY_SIGN_6_ODD_TILE_ENTITY = new RegistryObject<>(() -> RegistryUtilities.getBlockEntityType((pos, state) -> new BlockYamanoteRailwaySign.TileEntityRailwaySign(6, true, pos, state), MSDBlocks.YAMANOTE_RAILWAY_SIGN_6_ODD.get()));
    RegistryObject<BlockEntityType<BlockYamanoteRailwaySign.TileEntityRailwaySign>> YAMANOTE_RAILWAY_SIGN_7_EVEN_TILE_ENTITY = new RegistryObject<>(() -> RegistryUtilities.getBlockEntityType((pos, state) -> new BlockYamanoteRailwaySign.TileEntityRailwaySign(7, false, pos, state), MSDBlocks.YAMANOTE_RAILWAY_SIGN_7_EVEN.get()));
    RegistryObject<BlockEntityType<BlockYamanoteRailwaySign.TileEntityRailwaySign>> YAMANOTE_RAILWAY_SIGN_7_ODD_TILE_ENTITY = new RegistryObject<>(() -> RegistryUtilities.getBlockEntityType((pos, state) -> new BlockYamanoteRailwaySign.TileEntityRailwaySign(7, true, pos, state), MSDBlocks.YAMANOTE_RAILWAY_SIGN_7_ODD.get()));
    RegistryObject<BlockEntityType<BlockStandingSign.TileEntityBlockStandingSign>> STANDING_SIGN_TILE_ENTITY = new RegistryObject<>(() -> RegistryUtilities.getBlockEntityType(BlockStandingSign.TileEntityBlockStandingSign::new, MSDBlocks.STANDING_SIGN.get()));
    RegistryObject<BlockEntityType<BlockStandingSign1.TileEntityBlockStandingSign1>> STANDING_SIGN_1_TILE_ENTITY = new RegistryObject<>(() -> RegistryUtilities.getBlockEntityType(BlockStandingSign1.TileEntityBlockStandingSign1::new, MSDBlocks.STANDING_SIGN_1.get()));
}