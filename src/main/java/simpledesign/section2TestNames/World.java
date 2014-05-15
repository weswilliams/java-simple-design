package simpledesign.section2TestNames;

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

}
