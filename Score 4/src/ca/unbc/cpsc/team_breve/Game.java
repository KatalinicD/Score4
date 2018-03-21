package ca.unbc.cpsc.team_breve;

public class Game {
	
	//initialize all pieces for the game
	private Gui;
	private Board board;
	private Referee ref;
	private Player human;
	private Player opponent;	
	
	
	public Game () 
	{	
		board=new Board();	
		human=new Player();
		opponent=new AIPlayer();
		gui = new GUI(board, ref);
		ref = new Referee(board, human, opponent, gui);
	}
	
	//Main method to start the game
	public static void main (String []args)
	{
		Game g = new Game();
		g.ref.start();
		
	}

}
