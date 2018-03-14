package ca.unbc.cpsc.team_breve;

// this stores the state of the game  //
public enum GameOverStatus {
	
	WIN, LOSE, DRAW;

	// this method checks if the state of the game is a WIN //
	public boolean isWin() {
		return this==WIN;
	}
	
	// this method checks if the state of the game is a LOSE //
	public boolean isLose() {
		return this==LOSE;
	}
	
	// this method checks if the state of the game is a DRAW //
	public boolean isDraw() {
		return this==DRAW;
	}
	
	}

