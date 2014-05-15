package simpledesign.section4BehaviorAttractors;

import java.util.ArrayList;
import java.util.Collection;

public class World {

	private Collection<Cell> locations = new ArrayList<Cell>();
	
	public Collection<Cell> getLivingCells() {
	   return locations;
   }

	public boolean isAlive() {
	   return locations.size() > 0;
   }

	public boolean isEmpty() {
	   return locations.size() == 0;
   }

	public void setLivingAt(Location location) {
		locations.add(new LivingCell(location));
   }

}
