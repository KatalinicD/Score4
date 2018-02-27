package ca.unbc.cpsc.team_breve;

public class Player implements Player{
	
	private final int id;
	private final Colour colour;
	
	//Unsure about these member variables, need input
	int opponentsId;
	GameOverStatus gamestatus;
	
	
	//Player constructor
	public Player(int identification){
		id = identification;
		colour = null; //A player object will be assigned a color by the referee
		gamestatus = null;
	}
	
	public void reset(){
		id = 0;
		colour = null;
		opponentsId = 0;
		gamestatus = null;
	}
	
	public void noteOpponentsId(int id){
		opponentsId = id;
	}
	
	/*public Location requestMoveLocation(){
	 * Requires the Location object
	 * Will be altered in AiPlayer class
	  }
	 */
	
	/*public Location retry(){
	*This will call the requestMoveLocation() method once again
	*Maybe have output telling the player to try again? If so, don't need 
	*output for AiPlayer
	}
	*/
	
	/*public void opponentPlays(Location ell){
	*This will tell us the last position the opponent played in
	}
	*/
	
	public void noteGameOver(GameOverStatus gameoverstatus){
		gamestatus = gameoverstatus;
}