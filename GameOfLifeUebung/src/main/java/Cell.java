
public class Cell {

	
	private CellState cellstate;
	
	public Cell(CellState cellstate) {
		this.cellstate = cellstate;
	}

	public void nextGeneration(int neighbours) {
		if (cellstate == CellState.ALIVE) {
			//underpopulation or overcrowding
			if (neighbours < 2||neighbours>3) {
				cellstate = CellState.DEAD;
			} else {
			//survival
				cellstate = CellState.ALIVE;
			}
		}
		else if (cellstate == CellState.DEAD) {
			//reproduction
			if (neighbours == 3) {
				cellstate = CellState.ALIVE;
			} else {
				cellstate = CellState.DEAD;
			}
		}
	}

	public CellState getCellState() {
		return cellstate;
	}

}
