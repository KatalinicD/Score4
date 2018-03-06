package ca.unbc.cpsc.team_breve;

import java.util.Random;
import ca.unbc.cpsc.score4.exceptions.PlayerException;

public class AIPlayer extends ca.unbc.cpsc.team_breve.Player {
	
	Random rand = new Random();
	
	public AIPlayer () {}
	
	//The AIPLayer will select Location differently than Player
	@Override
	public Location requestMoveLocation() throws PlayerException{
		try {
		int x;
		int y;
		x = rand.nextInt(3) + 0;//The x and y coordinates are selected randomly by the AI
		y = rand.nextInt(3) + 0;
		Location move = new Location(x,y);
		return move;
		}
		catch (GameStateException gse)
		{
		throw new PlayerException("bad requestMoveLocation", gse) ;
		}
	}
	
	//The AIPlayer will select Location differently than Player
	@Override
	public Location retry() throws PlayerException{
		try {
		return this.requestMoveLocation();
		}
		catch (GameStateException gse)
		{
		throw new PlayerException("bad Location", gse) ;
		}
	}
}