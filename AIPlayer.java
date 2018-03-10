package ca.unbc.cpsc.team_breve.test;

import java.util.Random;
import java.util.ArrayList;

import ca.unbc.cpsc.team_breve.Location;
import ca.unbc.cpsc.team_breve.enums.Colour;

public class AIPlayer extends ca.unbc.cpsc.team_breve.test.Player{
	
	//This array list will be the AI's copy of the board
	Colour[][] boardcopy;
	
	//Random object to set our ID
	Random rand = new Random();
	
	//Constructor
	public AIPlayer () {}
	
	//This method will create our board copy after a reset
	public void createBoardCopy() {
		boardcopy = new Colour[4][4];
		for (Colour[] c: boardcopy) {//This advanced for-loop creates a clear board
			c = null;
		}
	}
		
	//We need to override the requestMoveLocation from Player. AIplayer has to choose independent of input
	@Override
	public Location requestMoveLocation() {
		int x;
		int y;
		x = rand.nextInt(3) + 0;//The x and y coordinates are selected randomly by the AI
		y = rand.nextInt(3) + 0;
		Location move = new Location(x,y);
		return move;
	}
	
	//The override removes the SYstem.out.println statement present in Player
	@Override
	public Location retry() {
		return this.requestMoveLocation();
	}
	
	

}
