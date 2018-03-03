package ca.unbc.cpsc.team_breve;

import java.util.Random;

//AiPlayer is a Player with a different requestMoveLocation() method
public class AiPlayer extends Player{
	
	//The random object is needed for the AiPlayer.requestMoveLocation() method
	Random rand = new Random();

	//AiPlayer constructor
	public AiPlayer(int identification) {
		super(identification);
	}
	
	//The AiPlayer.requestMoveLocation() needs to choose coordinates on its own
	@Override//Needs to override the PLayer.requestMoveLocation() method
	public Location requestMoveLocation(){
		int x;
		int y;
		x = rand.nextInt(3) + 0;//Randomly choose a row
		y = rand.nextInt(3) + 0;//Randomly choose a column
		Location move = new Location(x,y);//Create a new Location with x and y
		return move;
	}
}