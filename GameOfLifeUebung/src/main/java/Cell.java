
public class Cell {

	private CellState cellstate;

	public Cell(CellState cellstate) {
		this.cellstate = cellstate;
	}

	public void updateState(int neighbours) {
		if (cellstate == CellState.ALIVE) {
			//underpopulation and overcrowding
            if (neighbours < 2 || neighbours > 3) {
                cellstate = CellState.DEAD;
            }
            //survival
        } else {
        	//reproduction
            if (neighbours == 3) {
                cellstate = CellState.ALIVE;
            }
        }
	}

	public CellState getState() {
		return cellstate;
	}
}
