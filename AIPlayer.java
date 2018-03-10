package ca.unbc.cpsc.team_breve.test;

import java.util.Random;

import ca.unbc.cpsc.team_breve.Location;

public class AIPlayer extends ca.unbc.cpsc.team_breve.test.Player{
	
	Random rand = new Random();
	public AIPlayer () {}
		
	@Override
	public Location requestMoveLocation() {
		int x;
		int y;
		x = rand.nextInt(3) + 0;//The x and y coordinates are selected randomly by the AI
		y = rand.nextInt(3) + 0;
		Location move = new Location(x,y);
		return move;
	}
	
	@Override
	public Location retry() {
		return this.requestMoveLocation();
	}

}
