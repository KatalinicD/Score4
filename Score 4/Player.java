package ca.unbc.cpsc.team_breve;

import java.util.Scanner;
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
	
	public void reset(){
		id = rand.nextInt(1000) + 0;
		colour = null;
		opponentsId = 0;
		gamestatus = null;
		opponentsLastLocation = null;
	}
	
	public void noteOpponentsId(int id){
		opponentsId = id;
	}
	
	public Location requestMoveLocation(){
		int x;
		int y;
		System.out.println("Please enter a row number: ");
		x = in.nextInt();
		System.out.println("Please enter a column number: ");
		y = in.nextInt();
		
		Location moveLocation = new Location((x - 1),(y - 1));
		return moveLocation;
	}
	 
	public Location retry(){
		System.out.println("Please enter a new location.");
		return this.requestMoveLocation();
	}
	
	public void opponentPlays(Location ell){
		//Need to work on this
	}
	
	public void noteGameOver(GameOverStatus gameoverstatus){
		gamestatus = gameoverstatus;
	}
}