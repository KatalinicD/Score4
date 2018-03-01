package ca.unbc.cpsc.team_breve;

public class Player {
	private int id;
	private Bead[] set;
	private Colour colour;
	
	public Player (int identity) {
		id=identity;
		set=new Bead[32];
		colour=Colour.Black;
	}

	public boolean isBlack() {
		return (colour.isBlack());
	}
}
