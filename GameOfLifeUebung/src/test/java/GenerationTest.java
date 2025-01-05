import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GenerationTest {

	private static final Cell X = new Cell(CellState.ALIVE);
	private static final Cell O = new Cell(CellState.DEAD);

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test1x1Universe() {
		Cell[][] initalCells = {
				{O}
		};
		Generation initalUniverse = new Generation(initalCells);
		initalUniverse.nextGeneration();
		Cell[][] expectedCells = {
				{O}
		};
		Generation expectedUniverse = new Generation(expectedCells);
		assertArrayEquals(expectedUniverse.getCellStates(), initalUniverse.getCellStates());
	}
	
	@Test
	void test3x3Universe() {
		Cell[][] initalCells = {
				{O, X, O},
                {X, X, O},
                {X, X, O}
		};
		Generation initalUniverse = new Generation(initalCells);
		initalUniverse.nextGeneration();
		Cell[][] expectedCells = {
				{X, X, O},
                {O, O, X},
                {X, X, O}
		};
		Generation expectedUniverse = new Generation(expectedCells);
		assertArrayEquals(expectedUniverse.getCellStates(), initalUniverse.getCellStates());
	}
}
