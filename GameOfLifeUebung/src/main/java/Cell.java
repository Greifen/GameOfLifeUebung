
public class Cell {

	private CellState cellState;

	public Cell(CellState cellState) {
		this.cellState = cellState;
	}

	public void nextState(int neighbours) {
		if(cellState == CellState.ALIVE) {
			//underpopulation and overpopulation
            if(neighbours < 2 || neighbours > 3) {
                cellState = CellState.DEAD;
            }
            //survival
        } else {
        	//reproduction
            if(neighbours == 3) {
                cellState = CellState.ALIVE;
            }
        }
		
	}

	public CellState getState() {
		return cellState;
	}
}
