import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CellTest {

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

	@ParameterizedTest
	@CsvSource({
		"ALIVE,0,DEAD",
		"ALIVE,1,DEAD",
		"ALIVE,2,ALIVE",
		"ALIVE,3,ALIVE",
		"ALIVE,4,DEAD",
		"ALIVE,5,DEAD",
		"ALIVE,6,DEAD",
		"ALIVE,7,DEAD",
		"ALIVE,8,DEAD",
		"DEAD,0,DEAD",
		"DEAD,1,DEAD",
		"DEAD,2,DEAD",
		"DEAD,3,ALIVE",
		"DEAD,4,DEAD",
		"DEAD,5,DEAD",
		"DEAD,6,DEAD",
		"DEAD,7,DEAD",
		"DEAD,8,DEAD"
		})
	void testAlive0Neighbours(CellState initalState, int neighbour, CellState expectedState) {
		Cell cell = new Cell(initalState);
		cell.nextState(neighbour);
		assertEquals(expectedState,cell.getState());
	}

}
