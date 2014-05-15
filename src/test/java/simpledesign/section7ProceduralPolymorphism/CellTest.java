package simpledesign.section7ProceduralPolymorphism;

import static org.junit.Assert.*;

import org.junit.Test;

public class CellTest {

	@Test
	public void aDeadCellShouldStayDeadWithLessThan3LiveNeighbors() {
		assertFalse(Cell.DeadCell().isAliveInNextGeneration(0));
	}
	
	@Test
   public void aDeadCellShouldComeAliveWith3LiveNeighbors() throws Exception {
		assertTrue(Cell.DeadCell().isAliveInNextGeneration(3));
   }
	
	@Test
   public void aLiveCellShouldDieWithFewerThan2LiveNeighbors() throws Exception {
	   assertFalse(Cell.LiveCell().isAliveInNextGeneration(1));
   }
	
	@Test
   public void aLiveCellShouldDieWithMoreThan3LiveNeighbors() throws Exception {
	   assertFalse(Cell.LiveCell().isAliveInNextGeneration(4));
   }
	
	@Test
   public void aLiveCellWith2LiveNeighborsShouldLiveOn() throws Exception {
	   assertTrue(Cell.LiveCell().isAliveInNextGeneration(2));
   }
	
	@Test
   public void aLiveCellWith3LiveNeighborsShouldLiveOn() throws Exception {
	   assertTrue(Cell.LiveCell().isAliveInNextGeneration(3));
   }
}
