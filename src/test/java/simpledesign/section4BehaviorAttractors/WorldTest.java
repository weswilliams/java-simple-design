package simpledesign.section4BehaviorAttractors;

import static org.junit.Assert.*;

import org.junit.Test;
public class WorldTest {

	@Test
	public void aNewWorldShouldBeEmpty() {
		World world = new World();
		assertTrue(world.isEmpty());
	}
	
	@Test
   public void aCellCanBeAddedToTheWorld() throws Exception {
	   World world = new World();
	   world.setLivingAt(new Location(1,1));
	   assertFalse(world.isEmpty());
   }

}
