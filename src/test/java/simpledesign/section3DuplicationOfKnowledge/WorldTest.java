package simpledesign.section3DuplicationOfKnowledge;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Duplication of knowledge about topology. 
 * 
 * Look at the WorldTest, World, Cell, LivingCell and DeadCell:
 * 
 * How many places have we duplicated topology knowledge (x and y)?
 * 
 * Where should this knowledge go? 
 * 
 */
public class WorldTest {

	@Test
	public void aNewWorldShouldBeEmpty() {
		World world = new World();
		assertTrue(world.isEmpty());
	}
	
	@Test
   public void aCellCanBeAddedToTheWorld() throws Exception {
	   World world = new World();
	   world.setLivingAt(1,1);
	   assertFalse(world.isEmpty());
   }

}
