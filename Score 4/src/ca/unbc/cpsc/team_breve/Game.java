package ca.unbc.cpsc.team_breve;

public class Game {
	private Board board;
	private Referee referee;
	private Player human;
	private Player opponent;
	
	public Game () {
		Board board=new Board();
		Referee referee=new Referee();
		Player human=new Player();
		Player opponent=new AIPlayer();
	}
    
	public Board getBoard() {
		return board;
	}
	
	public Board getReferee() {
		return referee;
	}
	
	public Player getHuman() {
		return human;
	}
	
	public Player getOpponent() {
		return opponent;
	}
}
