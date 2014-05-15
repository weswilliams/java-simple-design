package simpledesign.section4BehaviorAttractors;

public class LivingCell implements Cell {

	private Location location;

	public LivingCell(Location location) {
		this.location = location;
   }

	public Location getLocation() {
	   return location;
   }

}
