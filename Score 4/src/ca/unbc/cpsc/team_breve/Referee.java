package ca.unbc.cpsc.team_breve;

public class Referee {
     
	
	
    
	public Referee() 
	{
		
	}
	
     //2 ideas, one with board, players and ref called in game class and other with just everything under ref class so far
     
     public void start(Player human, AIPlayer opponent) {
    	 
    	 human.startGameAs(White);
    	 opponent.startGameAs(Black);
    	 
     }
     
     
     
     public void reset(Player human, AIPlayer opponent, Board gameboard)
     {
    	 gameboard.clearBoard();
    	 human.reset();
    	 opponent.reset();
    	 
    	 human.startGameAs(White);
    	 opponent.startGameAs(Black);
     }
     
     public void checkGameState(Board gameboard)
     {
    	 gameboard.checkBoard;
    	 
    	 
    	 
     }
}
