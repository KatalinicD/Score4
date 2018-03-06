package ca.unbc.cpsc.team_breve;

import java.util.Scanner;

import ca.unbc.cpsc.team_breve.enums.Colour;
import ca.unbc.cpsc.team_breve.enums.GameOverStatus;
import ca.unbc.cpsc.score4.exceptions.PlayerException;

import java.util.Random;

public class Player{
	
	//Scanner is needed for the Player.requestMoveLocation()
	Scanner in = new Scanner(System.in);
	//Random is needed for the player id
	Random rand = new Random();
	
	//Member variables
	int id;
	Colour colour;
	int opponentsId;
	GameOverStatus gamestatus;
	Location opponentsLastLocation;
	
	
	//Player constructor
	public Player(){
		id = rand.nextInt(1000) + 0;
		colour = null; //A player object will be assigned a color by the referee
		gamestatus = null;
		opponentsLastLocation = null;
	}
	
	public void reset() throws PlayerException{
		try {
		id = rand.nextInt(1000) + 0;
		colour = null;
		opponentsId = 0;
		gamestatus = null;
		opponentsLastLocation = null;
		}
		catch (GameStateException gse)
		{
		throw new PlayerException("bad reset", gse) ;
		}
	}
	
	public void noteOpponentsId(int id) throws PlayerException{
		try {
		opponentsId = id;
		}
		catch (GameStateException gse)
		{
		throw new PlayerException("bad noteOpponentsId", gse) ;
		}
		
	}
	
	public Location requestMoveLocation() throws PlayerException{
		try {
		int x;
		int y;
		System.out.println("Please enter a row number: ");
		x = in.nextInt();
		System.out.println("Please enter a column number: ");
		y = in.nextInt();
		
		Location moveLocation = new Location((x - 1),(y - 1));
		return moveLocation;
		}
		catch (GameStateException gse)
		{
		throw new PlayerException("bad requestMoveLocation", gse) ;
		}
	}
	 
	public Location retry() throws PlayerException{
		try {
		System.out.println("Please enter a new location.");
		return this.requestMoveLocation();
		}
		catch (GameStateException gse)
		{
		throw new PlayerException("bad Location", gse) ;
		}
	}
	
	public void opponentPlays(Location ell) throws PlayerException{
		//Need to work on this
	}
	
	public void noteGameOver(GameOverStatus gameoverstatus) throws PlayerException{
		try {
		gamestatus = gameoverstatus;
		}
		catch (GameStateException gse)
		{
		throw new PlayerException("bad noteGameOver", gse) ;
		}
	}
}