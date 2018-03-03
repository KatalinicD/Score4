package ca.unbc.cpsc.team_breve;

// this is the location class, which defines the location of a peg on a board //
public class Location {
	public static final int MAX_ROW=3;
	public static final int MIN_ROW=0;
	public static final int MAX_COLUMN=3;
	public static final int MIN_COLUMN=0;
	private int row;
	private int column;
	
	// this creates a new location //
	public Location (int Row, int Column) {
		row=Row;
		column=Column;	
	}
	
	// this returns the row number of a location //
	public int getRow() {
		return row;
	}
	
	// this returns the column number of a location //
	public int getColumn() {
		return column;
	}
	

}