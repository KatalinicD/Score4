package ca.unbc.cpsc.team_breve;

public class Referee {
     
	public Referee() 
	{
		//allows this to be called in game class	
	}
	
     //2 ideas, one with board, players and ref called in game class and other with just everything under ref class so far
     
     public void start(Player human, AIPlayer opponent) {
    	 
    	 human.startGameAs(White);
    	 opponent.startGameAs(Black);
    	 //currently preset like this until we get buttons in the GUI
     }
     
     
     
     public void reset(Player human, AIPlayer opponent, Board gameboard)
     {
    	 gameboard.clearBoard();
    	 human.reset();
    	 opponent.reset();
    	 
    	 human.startGameAs(White);
    	 opponent.startGameAs(Black);
     }
     
     public void checkGameState(Player checkWin, Board gameboard)
     {
    	 if (gameboard.checkBoard(checkWin.getColour()))
    	 {
    		 checkWin.noteGameOver(WIN);
    		 //
    	 }
    	 else
    	 {
    		 /*could add in constructor for both players then check for either win
    		 instead of only 1 player at a time*/
    	 }
     }
     
     
     
     
}
