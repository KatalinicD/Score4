package ca.unbc.cpsc.team_breve;

public class Board {
	private int pegnumber;
	private int length=Location.MAX_ROW+1;
	private int width=Location.MIN_COLUMN+1;
	private Peg [][] board;
	
	public Board() {
		board=new Peg [length][width];
		for (int i=0; i<length; i++) {
			for (int j=0; j<width; j++) { 
				board [i][j]=new Peg(i,j);
			}
			}

	}
	
	public Peg getPeg(Location ell) {
		return getPeg(ell.getRow(), ell.getColumn());
	}
	
	public Peg getPeg(int r, int c) {
		return board [r][c];
	}
	
}
