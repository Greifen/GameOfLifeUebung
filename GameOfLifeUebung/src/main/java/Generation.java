
/**
 * The Generation class represents a grid of cells and provides functionality to
 * compute the next generation of cells based on the rules of Conway's Game of
 * Life.
 */
public class Generation {

	private Cell[][] cells;

	/**
	 * Constructs a Generation with the specified grid of cells.
	 *
	 * @param cells a 2D array of Cell objects representing the initial state of the
	 *              generation
	 */
	public Generation(Cell[][] cells) {
		this.cells = cells;
	}

	/**
	 * Computes the next generation of cells based on the current state.
	 */
	public void nextGeneration() {
		int neighbours;
		Cell[][] newCells = new Cell[cells.length][cells[0].length];

		// Create a copy of the current state of cells
		for (int i = 0; i < cells.length; i++) {
			for (int j = 0; j < cells[0].length; j++) {
				newCells[i][j] = new Cell(cells[i][j].getState());
			}
		}

		// Update each cell to its next state based on the number of alive neighbours
		for (int i = 0; i < cells.length; i++) {
			for (int j = 0; j < cells[0].length; j++) {
				neighbours = countNeighbours(i, j, newCells);
				cells[i][j].nextState(neighbours);
			}
		}
	}

	/**
	 * Counts the number of alive neighbours for the cell at the specified position.
	 *
	 * @param i      the row index of the cell
	 * @param j      the column index of the cell
	 * @param ncells a 2D array of Cell objects representing the current state of
	 *               the generation
	 * @return the number of alive neighbours
	 */
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

	/**
	 * Returns the current states of all cells in the generation.
	 *
	 * @return a 2D array of CellState objects representing the states of the cells
	 */
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
