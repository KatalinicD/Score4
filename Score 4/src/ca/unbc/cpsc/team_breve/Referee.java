package ca.unbc.cpsc.team_breve;

public class Referee {
     
	Board gameboard;
	Player human;
	AIPlayer opponent;
	Gui gui;
	Location savedLocation = null;
	
	public Referee(Board board, Player player, Player ai, Gui guiMethods) 
	{
			gameboard = board;
			human = player;
			opponent = ai;
			gui = guiMethods;
	}
	
     //2 ideas, one with board, players and ref called in game class and other with just everything under ref class so far
     
     public void start() {
    	 
    	 human.startGameAs(White);
    	 opponent.startGameAs(Black);
    	 //currently preset like this until we get buttons in the GUI
    	 
     }
     
     
     public void reset()
     {
    	 gameboard.clearBoard();
    	 human.reset();
    	 opponent.reset();
    	 
    	 savedLocation = null;
    	 
    	 human.startGameAs(White);
    	 opponent.startGameAs(Black);
     }
     
     public void gameState checkGameState()
     {
    	 if (gameboard.checkBoard(human.getColour()))
    	 {
    		 human.noteGameOver(WIN);
    		 opponent.noteGameOver(LOSE);
    		 return WIN;
    		 //
    	 }
    	 else if (gameboard.checkBoard(opponent.getColour()))
    	 {
    		 human.noteGameOver(LOSE);
    		 opponent.noteGameOver(WIN);
    		 return LOSE;
    	 }
     }
     
     public void saveLocation (Location loc)
     {
    	 savedLocation = loc;
     }
     
     public void setPlayedLocation()
     {
    	 gameboard.getPeg(savedLocation).addBead(human.getColour());
    	 human.setPlayerLastPlayed(savedLocation);
    	 human.setPegClicked(True);
     }
}
