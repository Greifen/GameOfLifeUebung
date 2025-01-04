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

	@Test
	void testAlive0Nachbarn() {
		Cell cell = new Cell(CellState.ALIVE);
		cell.nextGeneration(0);
        assertEquals(CellState.DEAD, cell.getCellState());
    }
	
	@Test
	void testAlive1Nachbarn() {
		Cell cell = new Cell(CellState.ALIVE);
		cell.nextGeneration(1);
        assertEquals(CellState.DEAD, cell.getCellState());
    }
	
	@Test
	void testAlive2Nachbarn() {
		Cell cell = new Cell(CellState.ALIVE);
		cell.nextGeneration(2);
        assertEquals(CellState.ALIVE, cell.getCellState());
    }
	
	@Test
	void testAlive3Nachbarn() {
		Cell cell = new Cell(CellState.ALIVE);
		cell.nextGeneration(3);
        assertEquals(CellState.ALIVE, cell.getCellState());
    }
	
	@Test
	void testAlive4Nachbarn() {
		Cell cell = new Cell(CellState.ALIVE);
		cell.nextGeneration(4);
        assertEquals(CellState.DEAD, cell.getCellState());
    }
	
	@Test
	void testAlive5Nachbarn() {
		Cell cell = new Cell(CellState.ALIVE);
		cell.nextGeneration(5);
        assertEquals(CellState.DEAD, cell.getCellState());
    }
	
	@Test
	void testAlive6Nachbarn() {
		Cell cell = new Cell(CellState.ALIVE);
		cell.nextGeneration(6);
        assertEquals(CellState.DEAD, cell.getCellState());
    }
	
	@Test
	void testAlive7Nachbarn() {
		Cell cell = new Cell(CellState.ALIVE);
		cell.nextGeneration(7);
        assertEquals(CellState.DEAD, cell.getCellState());
    }
	
	@Test
	void testAlive8Nachbarn() {
		Cell cell = new Cell(CellState.ALIVE);
		cell.nextGeneration(8);
        assertEquals(CellState.DEAD, cell.getCellState());
    }
	
	@Test
	void testDead0Nachbarn() {
		Cell cell = new Cell(CellState.DEAD);
		cell.nextGeneration(0);
        assertEquals(CellState.DEAD, cell.getCellState());
    }
	
	@Test
	void testDead1Nachbarn() {
		Cell cell = new Cell(CellState.DEAD);
		cell.nextGeneration(1);
        assertEquals(CellState.DEAD, cell.getCellState());
    }
	
	@Test
	void testDead2Nachbarn() {
		Cell cell = new Cell(CellState.DEAD);
		cell.nextGeneration(2);
        assertEquals(CellState.DEAD, cell.getCellState());
    }
	
	@Test
	void testDead3Nachbarn() {
		Cell cell = new Cell(CellState.DEAD);
		cell.nextGeneration(3);
        assertEquals(CellState.ALIVE, cell.getCellState());
    }
	
	@Test
	void testDead4Nachbarn() {
		Cell cell = new Cell(CellState.DEAD);
		cell.nextGeneration(4);
        assertEquals(CellState.DEAD, cell.getCellState());
    }
	
	@Test
	void testDead5Nachbarn() {
		Cell cell = new Cell(CellState.DEAD);
		cell.nextGeneration(5);
        assertEquals(CellState.DEAD, cell.getCellState());
    }
	
	@Test
	void testDead6Nachbarn() {
		Cell cell = new Cell(CellState.DEAD);
		cell.nextGeneration(6);
        assertEquals(CellState.DEAD, cell.getCellState());
    }
	
	@Test
	void testDead7Nachbarn() {
		Cell cell = new Cell(CellState.DEAD);
		cell.nextGeneration(7);
        assertEquals(CellState.DEAD, cell.getCellState());
    }
	
	@Test
	void testDead8Nachbarn() {
		Cell cell = new Cell(CellState.DEAD);
		cell.nextGeneration(8);
        assertEquals(CellState.DEAD, cell.getCellState());
    }

}
