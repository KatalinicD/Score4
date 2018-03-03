package ca.unbc.cpsc.team_breve;
// this class creates a board //
public class Board {
	private int pegnumber;
	private int length=Location.MAX_ROW+1;
	private int width=Location.MIN_COLUMN+1;
	private Peg [][] board;
	// this creates a new board
	public Board() {
		board=new Peg [length][width];
		for (int i=0; i<length; i++) {
			for (int j=0; j<width; j++) { 
				board [i][j]=new Peg(i,j);
			}
			}

	}
	// this gets a peg location using the location of a peg //
	public Peg getPeg(Location ell) {
		return getPeg(ell.getRow(), ell.getColumn());
	}
	// this returns the peg based on it's row and column //
	public Peg getPeg(int r, int c) {
		return board [r][c];
	}
	
}
