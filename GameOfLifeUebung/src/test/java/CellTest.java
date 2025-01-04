import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CellTest {

    @ParameterizedTest
    @CsvSource({
            // Lebende Zelle (ALIVE)
            "ALIVE, 0, DEAD", // Zu wenig Nachbarn -> stirbt
            "ALIVE, 1, DEAD", // Zu wenig Nachbarn -> stirbt
            "ALIVE, 2, ALIVE", // Überlebt
            "ALIVE, 3, ALIVE", // Überlebt
            "ALIVE, 4, DEAD", // Zu viele Nachbarn -> stirbt
            "ALIVE, 5, DEAD", // Zu viele Nachbarn -> stirbt
            "ALIVE, 6, DEAD", // Zu viele Nachbarn -> stirbt
            "ALIVE, 7, DEAD", // Zu viele Nachbarn -> stirbt
            "ALIVE, 8, DEAD", // Zu viele Nachbarn -> stirbt

            // Tote Zelle (DEAD)
            "DEAD, 0, DEAD", // Keine Reproduktion
            "DEAD, 1, DEAD", // Keine Reproduktion
            "DEAD, 2, DEAD", // Keine Reproduktion
            "DEAD, 3, ALIVE", // Reproduktion -> wird lebendig
            "DEAD, 4, DEAD", // Keine Reproduktion
            "DEAD, 5, DEAD", // Keine Reproduktion
            "DEAD, 6, DEAD", // Keine Reproduktion
            "DEAD, 7, DEAD", // Keine Reproduktion
            "DEAD, 8, DEAD" // Keine Reproduktion
    })
    void testUpdateState(CellState initialState, int neighbors, CellState expectedState) {
        // Arrange
        Cell cell = new Cell(initialState);

        // Act
        cell.updateState(neighbors);

        // Assert
        assertEquals(expectedState, cell.getState());
    }
}

