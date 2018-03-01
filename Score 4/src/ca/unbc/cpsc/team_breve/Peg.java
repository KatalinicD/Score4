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
	
	public void addBead(Colour colour) {
	if (array[0]==null) {
	 array[0]=new Bead(colour);			 
	}
	else if (array[1]==null) {
		array[1]=new Bead(colour);
		}
	else if (array[2]==null) {
		array[2]=new Bead(colour);
		}
	else if (array[3]==null) {
		array[3]=new Bead(colour);
	}
	else ;
	}
	public void removeBeads() {
     for (int i=0; i<array.length; i++) {
    	      array[i]=null;
     }
     int x=9;
	}
}
