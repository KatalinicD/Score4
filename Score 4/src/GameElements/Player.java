package GameElements;

public class Player {
	
	private final int id;
	//private final Colour colour; Requires a Colour enum
	
	//Player constructor
	public Player(int identification){
		id = identification;
		//Colour = null; This will require the Referee to call startGameAs(Colour c)
	}
	
	public void reset(){
		//This method will erase the last recorded Location 
	}
	
	public void noteOpponentsId(int id){
		//Not sure if we need this information for anything, but we need the method
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
	
	/*public void noteGameOver(GameOverStatus ...){
	*Require the GameOverStatus enum
	*	
	}
	*/
}
