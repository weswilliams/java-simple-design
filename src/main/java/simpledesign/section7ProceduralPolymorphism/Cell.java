package simpledesign.section7ProceduralPolymorphism;
/**
 * Procedural Polymorphism - representing types with a state field
 * 
 * Where have we hidden a type in a field?
 * 
 * What would we have to do to add a new type of Cell, like a Zombie or a God that could not die? 
 * 
 * Refactor to true types (take very small steps and keep the test running)
 * 
 * How did the factory methods reduce the number of changes required to allow this refactoring?
 * 
 */
public class Cell {

	static final Cell LiveCell() {
		return new Cell(true);
	}

	static final Cell DeadCell() {
		return new Cell(false);
	}
	
	private boolean alive;

	public Cell(boolean alive) {
		this.alive = alive;
   }

	public boolean isAliveInNextGeneration(int numberOfLiveNeighbors) {
		if (alive)
			return isStableNeighborhood(numberOfLiveNeighbors);
		else
			return isFurtileNeighborhood(numberOfLiveNeighbors);
   }

	private boolean isFurtileNeighborhood(int numberOfLiveNeighbors) {
	   return numberOfLiveNeighbors == 3;
   }

	private boolean isStableNeighborhood(int numberOfLiveNeighbors) {
	   return numberOfLiveNeighbors == 2 || isFurtileNeighborhood(numberOfLiveNeighbors);
   }

}
