package ca.unbc.cpsc.team_breve;

public class Player {
	private int id;
	private Bead[] set;
	private Colour colour;
	
	public Player (int identity) {
		id=identity;
		set=new Bead[32];
		for (int i=0; i<32; i++) {
			set[i]=new Bead();
			}
		colour=Colour.Black;
	}

	public boolean isBlack() {
		return (colour.isBlack());
	}
}
