package simpledesign.section5StateVsBehavior;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * In this test we are testing the internal state of the world. 
 * Another way of approaching this is to test the behavior of the 
 * world. 
 * 
 * What is a behavior that the world has?
 * 
 * Refactor the aNewWorldShouldBeEmpty to test the expected behavior?
 * 
 * -------------
 * There is an implicit state that is implied that we are depending on.
 * What is it? Hint: consider the creation of the World,
 * 
 * Refactor to make that state explicit.
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
