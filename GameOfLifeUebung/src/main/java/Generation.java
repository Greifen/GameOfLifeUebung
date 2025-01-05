
public class Generation {

	private Cell[][] cells;

	public Generation(Cell[][] cells) {
		this.cells = cells;
	}

	public CellState[][] getCellStates() {
		CellState[][] cellStates = new CellState[cells.length][cells[0].length];
		for (int i = 0; i < cells.length; i++) {
			for (int j = 0; j < cells[0].length; j++) {
				cellStates[i][j] = cells[i][j].getState();
			}
		}
		return cellStates;
	}

	public void nextGeneration() {
		int neighbours;
		Cell[][] newCells = new Cell[cells.length][cells[0].length];
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[0].length; j++) {
                neighbours = countNeighbours(i, j);
                newCells[i][j] = new Cell(cells[i][j].getState());
                newCells[i][j].nextState(neighbours);
            }
        }
        cells = newCells;
    }

	private int countNeighbours(int i, int j) {
		int count = 0;
        for (int row = i - 1; row <= i + 1; row++) {
            for (int col = j - 1; col <= j + 1; col++) {
                if (row >= 0 && row < cells.length && col >= 0 && col < cells[0].length && !(row == i && col == j) &&
                		cells[row][col].getState() == CellState.ALIVE) {
                	count++;
                }
            }
        }
        return count;
	}
}
