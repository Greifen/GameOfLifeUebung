
public class Cell {

	private CellState cellstate;

	public Cell(CellState cellstate) {
		this.cellstate = cellstate;
	}

	public void nextState(int neighbour) {
		if(cellstate==CellState.ALIVE && (neighbour<2 ||neighbour>3))
		{
			cellstate=CellState.DEAD;
		}
		else if(cellstate==cellstate.DEAD && neighbour==3) {
			cellstate=CellState.ALIVE;
		}
	}

	public CellState getState() {
		return cellstate;
	}

}
