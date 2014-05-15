package simpledesign.section2TestNames;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Test names should influence the design. 
 * 
 * What do the names of these test say the are checking?
 * 
 * What do they actually check?
 * 
 * Refactor the test and code to improve the design of both
 * 
 */
public class WorldTest {

	@Test
	public void aNewWorldShouldBeEmpty() {
		World world = new World();
		assertEquals(0, world.getLivingCells().size());
	}
	
	@Test
   public void aCellCanBeAddedToTheWorld() throws Exception {
	   World world = new World();
	   world.setLivingAt(1,1);
	   assertEquals(1, world.getLivingCells().size());
   }

}
