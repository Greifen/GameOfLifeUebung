import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GenerationTest {

	private static final Cell O = new Cell(CellState.DEAD);
	private static final Cell X = new Cell(CellState.ALIVE);

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
	void testNextGenerationDEATH() {
		Cell[][] initialCells = {{O}};
		Generation initialGeneration = new Generation(initialCells);
		initialGeneration.nextGeneration();
		Cell[][] expectedCells = {{O}};
		Generation expectedGeneration = new Generation(expectedCells);
		assertArrayEquals(expectedGeneration.getStates(), initialGeneration.getStates());
	}
	
	@Test
	void testNextGenerationALIVE() {
		Cell[][] initialCells = {{X}};
		Generation initialGeneration = new Generation(initialCells);
		initialGeneration.nextGeneration();
		Cell[][] expectedCells = {{X}};
		Generation expectedGeneration = new Generation(expectedCells);
		assertArrayEquals(expectedGeneration.getStates(), initialGeneration.getStates());
	}
	
	@Test
	void testNextGeneration3x3() {
		Cell[][] initialCells = {
				{X,O,O},
				{X,X,O},
				{X,X,O},
				};
		Generation initialGeneration = new Generation(initialCells);
		initialGeneration.nextGeneration();
		Cell[][] expectedCells = {
				{X,X,O},
				{O,O,O},
				{X,X,O},
				};
		Generation expectedGeneration = new Generation(expectedCells);
		assertArrayEquals(expectedGeneration.getStates(), initialGeneration.getStates());
	}

}
