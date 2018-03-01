package ca.unbc.cpsc.team_breve;

public class Peg {
	private Bead [] array;
	private int row;
	private int column;
	private Location location;
	
	public Peg (int Row, int Column) {
		row=Row;
		column=Column;
		location=new Location(row, column);
		array=new Bead[4];
	}
 
	public Location Location() {
		return this.location;
	}
	
	public void addBead() {
		
	
	}
}
