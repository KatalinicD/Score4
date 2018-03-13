package ca.unbc.cpsc.team_breve;
// this class creates a board //
public class Board {
	
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
	
	// this adds a bead to a peg on the board if possible //
	public void addBead(int row, int column, Colour colour) {
		board[row][column].addBead(colour);
	}
	
	// this method removes all beads from all pegs on the board //
	public void clearBoard() {
		for (int i=0; i<length; i++) {
			for (int j=0; j<width; j++) {
				board[i][j].removeBeads();
			}
		}
	}
	
	// this returns the first empty bead //
	public Bead checkPeg (int row, int column) {
		if (board[row][column].getBead(0)==null) {
			return board[row][column].getBead(0);
		}
		else if (board[row][column].getBead(1)==null) {
			return board[row][column].getBead(1);
		}
		else if (board[row][column].getBead(2)==null) {
			return board[row][column].getBead(2);
		}
		else return board[row][column].getBead(3);
	}

	// this returns the first spot that has a bead //
	public Bead checkMove(int row, int column) {
		if (board[row][column].getBead(0)!=board[row][column].getBead(1)) {
			return board[row][column].getBead(0);
		}
		else if (board[row][column].getBead(1)!=board[row][column].getBead(2)) {
			return board[row][column].getBead(1);
		}
		else if (board[row][column].getBead(2)!=board[row][column].getBead(3)) {
			return board[row][column].getBead(2);
		}
		else if (board[row][column].getBead(2)!=null && board[row][column].getBead(3)!=null) {
			return board[row][column].getBead(3);
		}
		else return board[row][column].getBead(0);
		
	}
}
