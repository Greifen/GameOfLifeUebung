
public class Generation {

	private Cell[][] cells;

	public Generation(Cell[][] cells) {
		this.cells = cells;
	}

	public void nextGeneration() {
		int neighbours;
		Cell[][] newCells = new Cell[cells.length][cells[0].length];
		for (int i = 0; i < cells.length; i++) {
			for (int j = 0; j < cells[0].length; j++) {
				newCells[i][j] = new Cell(cells[i][j].getState());
			}
		}

		for (int i = 0; i < cells.length; i++) {
			for (int j = 0; j < cells[0].length; j++) {
				neighbours = countNeighbours(i, j, newCells);
				cells[i][j].nextState(neighbours);
			}
		}

	}
	
	private int countNeighbours(int i, int j, Cell[][] ncells) {
		int neighbours = 0;
		for (int row = i - 1; row <= i + 1; row++) {
			for (int col = j - 1; col <= j + 1; col++) {
				if (row >= 0 && row < ncells.length && col >= 0 && col < ncells[0].length && !(row == i && col == j)
						&& ncells[row][col].getState() == CellState.ALIVE) {
					neighbours++;
				}
			}
		}
		return neighbours;
	}

	public CellState[][] getStates() {
		CellState[][] cellStates = new CellState[cells.length][cells[0].length];
		for (int i = 0; i < cells.length; i++) {
			for (int j = 0; j < cells[0].length; j++) {
				cellStates[i][j] = cells[i][j].getState();
			}
		}
		return cellStates;
	}

}
