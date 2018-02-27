package ca.unbc.cpsc.team_breve;

public class Peg {
	private Bead [] array;
	private int row;
	private int column;
	
	public Peg (int Row, int Column) {
		row=Row;
		column=Column;
		Location loc=new Location(row, column);
		array=new Bead[4];
	}
	public Peg getPeg(Location ell) {
		return getPeg(ell.getRow(), ell.getColumn());
	}

}
