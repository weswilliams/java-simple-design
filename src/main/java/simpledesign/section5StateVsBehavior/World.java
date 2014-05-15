package simpledesign.section5StateVsBehavior;

import java.util.ArrayList;
import java.util.Collection;

public class World {

	private Collection<Location> liveCells = new ArrayList<Location>();
	
	public Collection<Location> getLivingCells() {
	   return liveCells;
   }

	public void setLivingAt(int x, int y) {
		liveCells.add(new Location(x, y, Cell.LiveCell));
   }

	public boolean isEmpty() {
	   return liveCells.size() == 0;
   }

}
