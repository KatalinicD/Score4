package ca.unbc.cpsc.team_breve;

import java.util.Random;

public class AiPlayer extends Player{
	
	Random rand = new Random();
	
	public AiPlayer(int identification) {
		super(identification);
		color = null;
		gamestatus = null;
		opponentsLastLocation = null;
	}
	
	@Override
	public Location requestMoveLocation(){
		int x;
		int y;
		x = rand.nextInt(3) + 1;
		y = rand.nextInt(3) + 1;
		Location movelocation = new Location(x,y);
		return movelocation;
	}


}
