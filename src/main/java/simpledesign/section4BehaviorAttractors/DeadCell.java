package simpledesign.section4BehaviorAttractors;

public class DeadCell implements Cell {

	private Location location;

	public DeadCell(Location location) {
		this.location = location;
   }

	public Location getLocation() {
	   return location;
   }

}
