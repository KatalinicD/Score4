package ca.unbc.cpsc.team_breve;

public class Referee {
    
	Board gameboard;
	Player human;
	AIPlayer opponent;
	Gui gui;
	Location savedLocation = null;
	Location newLocation = null;
	
	public Referee(Board board, Player player, Player ai, Gui guiMethods) 
	{
			gameboard = board;
			human = player;
			opponent = (AIPlayer) ai;
			gui = guiMethods;
	}
	
     //2 ideas, one with board, players and ref called in game class and other with just everything under ref class so far
     
     public void start() {
    	 
    	 human.startGameAs(Colour.White);
    	 opponent.startGameAs(Colour.Black);
    	 //currently preset like this until we get buttons in the GUI
     }
     
     
     public void reset()
     {
    	 gameboard.clearBoard();
    	 human.reset();
    	 opponent.reset();
    	 
    	 savedLocation = null;
    	 
    	 human.startGameAs(Colour.White);
    	 opponent.startGameAs(Colour.Black);
     }
     
     public GameOverStatus checkGameState()
     {
    	 if (gameboard.checkBoard(human.getColour()))
    	 {
    		 human.noteGameOver(GameOverStatus.WIN);
    		 opponent.noteGameOver(GameOverStatus.LOSE);
    		 return GameOverStatus.WIN;
    		 //
    	 }
    	 else if (gameboard.checkBoard(opponent.getColour()))
    	 {
    		 human.noteGameOver(GameOverStatus.LOSE);
    		 opponent.noteGameOver(GameOverStatus.WIN);
    		 return GameOverStatus.LOSE;
    	 }
    	 
    	 return null;
     }
     
     public void saveLocation (Location loc)
     {
       	 System.out.println(loc);
    	 savedLocation = loc;
     }
     
     public Location getSavedLocation()
     {
    	 return savedLocation;
     }
     
     public void setPlayedLocation(Player players)
     {
    	 gameboard.getPeg(savedLocation).addBead(players.getColour());
    	 
     }
     
     public void setPlayerLastPlayed()
     {
    	 human.setPlayerLastPlayed(savedLocation);
    	 human.setPegClicked(true);
     }
     
     public void newLocation (Location loc)
     {
    	 newLocation = loc;
     }
     
     public Location getNewLocation (Location loc)
     {
    	 return newLocation;
     }
}