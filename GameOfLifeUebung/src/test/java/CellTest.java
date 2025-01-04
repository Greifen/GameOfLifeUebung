import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

	
	// Tests für lebende Zellen (ALIVE)
    @Test
    void testAlive0Neighbours() {
		Cell cell = new Cell(CellState.ALIVE);
        cell.updateState(0);
        assertEquals(CellState.DEAD, cell.getState());
    }

    @Test
    void testAlive1Neighbour() {
        Cell cell = new Cell(CellState.ALIVE);
        cell.updateState(1);
        assertEquals(CellState.DEAD, cell.getState());
    }

    @Test
    void testAlive2Neighbours() {
        Cell cell = new Cell(CellState.ALIVE);
        cell.updateState(2);
        assertEquals(CellState.ALIVE, cell.getState());
    }

    @Test
    void testAlive3Neighbours() {
        Cell cell = new Cell(CellState.ALIVE);
        cell.updateState(3);
        assertEquals(CellState.ALIVE, cell.getState());
    }

    @Test
    void testAlive4Neighbours() {
        Cell cell = new Cell(CellState.ALIVE);
        cell.updateState(4);
        assertEquals(CellState.DEAD, cell.getState());
    }

    @Test
    void testAlive5Neighbours() {
        Cell cell = new Cell(CellState.ALIVE);
        cell.updateState(5);
        assertEquals(CellState.DEAD, cell.getState());
    }

    @Test
    void testAlive6Neighbours() {
        Cell cell = new Cell(CellState.ALIVE);
        cell.updateState(6);
        assertEquals(CellState.DEAD, cell.getState());
    }

    @Test
    void testAlive7Neighbours() {
        Cell cell = new Cell(CellState.ALIVE);
        cell.updateState(7);
        assertEquals(CellState.DEAD, cell.getState());
    }

    @Test
    void testAlive8Neighbours() {
        Cell cell = new Cell(CellState.ALIVE);
        cell.updateState(8);
        assertEquals(CellState.DEAD, cell.getState());
    }

    // Tests für tote Zellen (DEAD)
    @Test
    void testDead0Neighbours() {
        Cell cell = new Cell(CellState.DEAD);
        cell.updateState(0);
        assertEquals(CellState.DEAD, cell.getState());
    }

    @Test
    void testDead1Neighbour() {
        Cell cell = new Cell(CellState.DEAD);
        cell.updateState(1);
        assertEquals(CellState.DEAD, cell.getState());
    }

    @Test
    void testDead2Neighbours() {
        Cell cell = new Cell(CellState.DEAD);
        cell.updateState(2);
        assertEquals(CellState.DEAD, cell.getState());
    }

    @Test
    void testDead3Neighbours() {
        Cell cell = new Cell(CellState.DEAD);
        cell.updateState(3);
        assertEquals(CellState.ALIVE, cell.getState());
    }

    @Test
    void testDead4Neighbours() {
        Cell cell = new Cell(CellState.DEAD);
        cell.updateState(4);
        assertEquals(CellState.DEAD, cell.getState());
    }

    @Test
    void testDead5Neighbours() {
        Cell cell = new Cell(CellState.DEAD);
        cell.updateState(5);
        assertEquals(CellState.DEAD, cell.getState());
    }

    @Test
    void testDead6Neighbours() {
        Cell cell = new Cell(CellState.DEAD);
        cell.updateState(6);
        assertEquals(CellState.DEAD, cell.getState());
    }

    @Test
    void testDead7Neighbours() {
        Cell cell = new Cell(CellState.DEAD);
        cell.updateState(7);
        assertEquals(CellState.DEAD, cell.getState());
    }

    @Test
    void testDead8Neighbours() {
        Cell cell = new Cell(CellState.DEAD);
        cell.updateState(8);
        assertEquals(CellState.DEAD, cell.getState());
    }
}

