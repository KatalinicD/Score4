package ca.unbc.cpsc.team_breve;

// this class creates a colour //
public enum Colour {
	Black,White;
	
	// this checks if the colour is black //
	public boolean isBlack() { 
		return this==Black;	
	}
	// this checks if the colour is white //
	public boolean isWhite() {
		return this==White;
	}

	
}
