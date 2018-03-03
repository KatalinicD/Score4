package ca.unbc.cpsc.team_breve;

// this creates a peg //
public class Peg {
	private Bead [] array;
	private int row;
	private int column;
	private Location location;
	
	// this makes the Peg based on the row and column //
	public Peg (int Row, int Column) {
		row=Row;
		column=Column;
		location=new Location(row, column);
		array=new Bead[4];
	}
    
	// this returns the location of a peg //
	public Location getLocation() {
		return this.location;
	}
	
	// this adds a bead to a peg if possible //
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
	
	// this removes all the beads from a peg //
	public void removeBeads() {
     for (int i=0; i<array.length; i++) {
    	      array[i]=null;
     }
	}
}
