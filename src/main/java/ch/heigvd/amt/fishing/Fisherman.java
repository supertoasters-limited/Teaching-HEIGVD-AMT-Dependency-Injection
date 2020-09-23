package ch.heigvd.amt.fishing;

import ch.heigvd.amt.fishing.equipment.api.*;
import ch.heigvd.amt.fishing.equipment.impl.Bait;
import ch.heigvd.amt.fishing.equipment.impl.Boat;
import ch.heigvd.amt.fishing.equipment.impl.Boots;
import ch.heigvd.amt.fishing.equipment.impl.FishingRod;
import lombok.Builder;


@Builder
//@Value
public class Fisherman {

  private Boots boots;
  private FishingRod fishingRod;
  private Bait bait;
  private Boat boat;

  public Fisherman(IBoat boat, IBoots boots, IFishingRod fishingRod, IBait bait){

  }
  public Fish goGetFish() {
    boots.wear();
    boat.putOnWater();
    boat.startEngine();
    bait.putOnHook();
    fishingRod.moveUpTheAir();
    Fish fish = fishingRod.pullOutOfWater();
    return fish;
  }

}
