package ca.unbc.cpsc.team_breve;

// this class makes a bead //
public class Bead {
	private Colour beadcolour;
	// this constructs a bead
	public Bead(Colour colour) {
	    beadcolour=colour;
	}
    // this returns the colour of the bead //
	public Colour getColour() {
		return this.beadcolour;
	}
}
