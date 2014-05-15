package simpledesign.section3DuplicationOfKnowledge;

import java.util.ArrayList;
import java.util.Collection;

public class World {

	private Collection<Cell> cells = new ArrayList<Cell>();
	
	public Collection<Cell> getLivingCells() {
	   return cells;
   }

	public void setLivingAt(int x, int y) {
		cells.add(new LivingCell(x, y));
   }

	public boolean isAlive() {
	   return cells.size() > 0;
   }

	public boolean isEmpty() {
	   return cells.size() == 0;
   }

}
