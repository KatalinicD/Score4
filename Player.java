package ca.unbc.cpsc.team_breve.test;

import java.util.Scanner;

import ca.unbc.cpsc.team_breve.Location;
import ca.unbc.cpsc.team_breve.enums.Colour;
import ca.unbc.cpsc.team_breve.enums.GameOverStatus;
import java.util.ArrayList;
import java.util.Random;

public class Player {
	
	//Scanner is needed for the Player.requestMoveLocation()
	Scanner in = new Scanner(System.in);
	//Random is needed for the player id
	Random rand = new Random();
	
	//Member variables
	private int id;
	private Colour colour;
	private int opponentsId;
	private GameOverStatus gamestatus;
	private Location opponentsLastLocation;
		
	//Player constructor
	public Player(){
		id = rand.nextInt(1000) + 0;
		colour = null; //A player object will be assigned a color by the referee
		gamestatus = null;
		opponentsLastLocation = null;
		}
	
	//The referee will use this method to assign our Player a Colour
	public void startGameAs(Colour c) {
		colour = c;
	}
	
	//This method resets the Player 
	public void reset() {
		id = rand.nextInt(1000) + 0;
		colour = null;
		opponentsId = 0;
		gamestatus = null;
		opponentsLastLocation = null;
	}
		
	//This method will record the ID of the opponent. Not sure what we want to do with it yet
	public void noteOpponentsId(int id) {
		opponentsId = id;
	}
	
	//The Referee will use this to get a Location from the PLayer. Will be different for AIplayer
	public Location requestMoveLocation() {
		int x;
		int y;
		System.out.println("Please enter a row number: ");
		x = in.nextInt();
		System.out.println("Please enter a column number: ");
		y = in.nextInt();
		
		Location moveLocation = new Location((x - 1),(y - 1));
		return moveLocation;
	}
	
	//Referee calls this method if our Location could not accept a bead
	public Location retry() {
		System.out.println("Please enter a new location.");
		return this.requestMoveLocation();
	}
	
	//Notes the last Location that the opponent played. not sure what we want to do with this yet
	public void opponentPlays(Location ell) {
		opponentsLastLocation = ell;
	}
	
	//Referee sends the Player a GameOverStatus when the game ends. 
	public void noteGameOver(GameOverStatus gameoverstatus) {
		gamestatus = gameoverstatus;
	}
	
	
}
