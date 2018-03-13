package ca.unbc.cpsc.team_breve.test;

import java.util.Random;
import java.util.ArrayList;

public class AIPlayer extends Player{
	
	//Random object to set our ID
	Random rand = new Random();
	
	//This will be the AIplayers copy of the board
	Board boardCopy;
	
	//Constructor
	public AIPlayer () { boardCopy = new Board();}//this.resetBoardCopy();//Clears the AIPlayer's board
		
	//We need to override the reset command to include resetBoardCopy()
	@Override
	public void reset() {
		super.reset();//Calls reset() from the superclass, Player
		boardCopy = new Board();
	}
	
	//We need to override the requestMoveLocation from Player. AIplayer has to choose independent of input
	//@override
	//public Location requestMoveLocation() {

	//}
	
	//The override removes the System.out.println statement present in Player
	@Override
	public Location retry() { return this.requestMoveLocation();}
	
	//This method places a bead onto the AIPlayer's copy of the board
	public void placeCopyBead(int ident, Location loc) {
		int row;//Get the row and column of the Location argument
		int column;
		row = loc.getRow();
		column = loc.getColumn();
		if(super.getId() == ident) {
			
		}
	}
	//The override adds a placeCopyBead() method 
	@Override
	public void opponentPlays(Location ell) {
		super.opponentPlays(ell);
		//Add the placeCopyBead method here
	}
	
}
