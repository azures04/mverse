package network.mverse.common;

import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.ObjectHolder;

public class TeleportalTileEntity extends TileEntity {
  public static final String NAME = "mverse:teleportal";

  @ObjectHolder(NAME)
  public static TileEntityType<TeleportalTileEntity> TILE_ENTITY_TYPE;

  public String teleportalId = "";

  @Override
  public CompoundNBT save(CompoundNBT compound) {
    compound.putString("teleportalId", this.teleportalId);
    return super.save(compound);
  }

  @Override
  public void load(BlockState blockState, CompoundNBT compound) {
      super.load(blockState, compound);
      this.teleportalId = compound.getString("teleportalId");
  }

  public TeleportalTileEntity() {
    super(TILE_ENTITY_TYPE);
  }
  
  
}
