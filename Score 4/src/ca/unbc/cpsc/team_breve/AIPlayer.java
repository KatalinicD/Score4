package ca.unbc.cpsc.team_breve;

import java.util.Random;

public class AIPlayer extends Player{
	
	//Random object to set our ID
	Random rand = new Random();
	
	//This boolean will record the Referee called retry() 
	//private boolean retried = false;//Starts out false because retry() hasn't been called
	
	//This will be the AIplayers copy of the board
	Board boardCopy;
	
	//Constructor
	public AIPlayer () { boardCopy = new Board();}//Create a copy board
		
	//We need to override the reset command to include resetBoardCopy()
	@Override
	public void reset() {
		super.reset();//Calls reset() from the superclass, Player
		boardCopy.clearBoard();
		//retried = false;
	}
	
	//We need to override the requestMoveLocation from Player. AIplayer has to choose independent of input
	@Override
	public Location requestMoveLocation() {
		int row;
		int column;
		//if(retried) {//If retry() was called, do this
			//row = rand.nextInt(3) + 0;
			//column = rand.nextInt(3) + 0;
			//Location location = new Location(row, column);
			//retried = false;
			//return location;
		//}
		//else {//If retry() was not called, do this
			//return this.getOpponentsLastLocation();
		row = rand.nextInt(3) + 0;
		column = rand.nextInt(3) + 0;
		Location location = new Location(row, column);
		//retried = false;
		System.out.println(location);
		return location;
	}
	
	//The override removes the System.out.println statement present in Player
	@Override
	public Location retry() { 
		//retried = true;//Note that the retry() method was called
		return this.requestMoveLocation();
	}
	
	//This method places a bead onto the AIPlayer's copy of the board
	public void placeCopyBead(int ident, Location loc) {
		int row;//Get the row and column of the Location argument
		int column;
		row = loc.getRow();
		column = loc.getColumn();
		if(this.getId() == ident) {boardCopy.addBead(row,column,this.getColour());}//Place Players bead
		else {boardCopy.addBead(row, column, this.getOpponentColour());}//Place Opponents bead		
	}
	//The override adds a placeCopyBead() method 
	@Override
	public void opponentPlays(Location ell) {
		super.opponentPlays(ell);
		this.placeCopyBead(this.getOpponentsId(), this.getOpponentsLastLocation());
		this.placeCopyBead(this.getId(), this.getPlayerLastPlayed());
	}
	
}
