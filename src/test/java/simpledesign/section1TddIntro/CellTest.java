package simpledesign.section1TddIntro;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * TDD = Test Driven Development - originally referred to as test first
 * * Writing the test first encourages us to always right a test
 * * Writing the test first encourages us to think about the interface (it is a thinking tool)
 * * Having test that check a public API gives us a safety net for refactoring the internal structure/design
 * 
 * TDD Mantra - Red -> Green -> Refactor
 * * Red - write a failing test
 * * Green - do the simplest thing to make it pass
 * * Refactor - remove duplication, validate intent, make it small, make it fast
 * 
 * Let's start with a Game of life dead and live cell rules. 
 * Review the game of life rules: http://en.wikipedia.org/wiki/Conway's_Game_of_Life#Rules
 * 
 */
public class CellTest {
	@Test
	public void deadCellShouldStayDeadWithNoLiveNeighbors() {
		assertTrue("environment is working", true);
	}
}
