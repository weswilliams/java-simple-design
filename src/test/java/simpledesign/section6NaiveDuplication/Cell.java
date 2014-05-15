package simpledesign.section6NaiveDuplication;
/**
 * Be careful with Naive Duplication
 * 
 * Where is the duplication in the Cell?
 * 
 * Did you say "numberOfLiveNeighbors == 3"? Do the 3s in this case mean the same thing?
 * 
 * Refactor this code to make the meaning of each part of the if/else indicate meaning.
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
			return numberOfLiveNeighbors == 2 || numberOfLiveNeighbors == 3;
		else
			return numberOfLiveNeighbors == 3;
   }

}
