package ca.unbc.cpsc.team_breve;

import java.util.Random;

public class AIPlayer extends ca.unbc.cpsc.team_breve.Player {
	
	Random rand = new Random();
	
	public AIPlayer () {}
	
	//The AIPLayer will select Location differently than Player
	@Override
	public Location requestMoveLocation(){
		int x;
		int y;
		x = rand.nextInt(3) + 0;//The x and y coordinates are selected randomly by the AI
		y = rand.nextInt(3) + 0;
		Location move = new Location(x,y);
		return move;
	}
	
	//The AIPlayer will select Location differently than Player
	@Override
	public Location retry(){return this.requestMoveLocation();}
	
}