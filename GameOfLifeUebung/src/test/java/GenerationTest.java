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
	void test1x1Generation() {
		Cell[][] initialCells = {
				{ O} };
		Generation initialGeneration = new Generation(initialCells);
		initialGeneration.nextGeneration();
		Cell[][] expectedCells = {
				{ O} };
		Generation expectedGeneration = new Generation(expectedCells);
		assertArrayEquals(expectedGeneration.getCellStates(), initialGeneration.getCellStates());
	}
	
	@Test
	void test3x3Generation() {
		Cell[][] initialCells = {
				{ X, O, X },
				{ O, X, X },
				{ X, X, O } };
		Generation initialGeneration = new Generation(initialCells);
		initialGeneration.nextGeneration();
		Cell[][] expectedCells = {
				{ O, O, X },
				{ O, O, X },
				{ X, X, X } };
		Generation expectedGeneration = new Generation(expectedCells);
		assertArrayEquals(expectedGeneration.getCellStates(), initialGeneration.getCellStates());
	}

}
