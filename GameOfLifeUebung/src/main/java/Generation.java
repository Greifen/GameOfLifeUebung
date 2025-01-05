
public class Generation {

	private Cell[][] cells;

	public Generation(Cell[][] cells) {
		this.cells = cells;
	}

	public void nextGeneration() {
		Cell[][] nextGeneration = new Cell[cells.length][cells[0].length];
		for (int i = 0; i < cells.length; i++) {
			for (int j = 0; j < cells[0].length; j++) {
				int neighbours = countNeighbours(i, j);
				nextGeneration[i][j] = new Cell(cells[i][j].getState());
				nextGeneration[i][j].nextState(neighbours);
			}
		}
		cells = nextGeneration;
	}

	private int countNeighbours(int i, int j) {
        int neighbours = 0;
        for (int k = i - 1; k <= i + 1; k++) {
            for (int l = j - 1; l <= j + 1; l++) {
                if (k >= 0 && k < cells.length && l >= 0 && l < cells[0].length && !(k == i && l == j)
                        && cells[k][l].getState() == CellState.ALIVE) {
                    neighbours++;
                }
            }
        }
        return neighbours;
	}


	/**für die Tests
	 * @return the cellStates
	 */
	public CellState[][] getCellStates() {
		CellState[][] cellStates = new CellState[cells.length][cells[0].length];
		for (int i = 0; i < cells.length; i++) {
			for (int j = 0; j < cells[0].length; j++) {
				cellStates[i][j] = cells[i][j].getState();
			}
		}
		return cellStates;
	}
}
