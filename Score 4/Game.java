package ca.unbc.cpsc.team_breve;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Game {
	
	//initialize all pieces for the game
	private Gui gui;
	private Board board;
	private Referee ref;
	private Player human;
	private Player opponent;	
	private static WinComponent winComponent;
	private static LoseComponent loseComponent;
	
	public Game () 
	{	
		board=new Board();	
		human=new Player();
		opponent=new AIPlayer();
		ref = new Referee(board, human, opponent, gui);
		gui = new Gui(board, ref);
		
		winComponent = new WinComponent();
		loseComponent = new LoseComponent();
	}
	
	//Main method to start the game
	public static void main (String []args) throws InterruptedException
	{
		int gameContinue = 0;
		
		Game g = new Game();
		g.ref.start();
		
		while (gameContinue == 0)
		{
			while (g.ref.checkGameState() != GameOverStatus.WIN || g.ref.checkGameState() != GameOverStatus.LOSE || g.ref.checkGameState() != GameOverStatus.DRAW)
			{
				int turn = 0;
				
				if (turn == 0)
				{
					g.ref.saveLocation(g.human.requestMoveLocation());
					g.ref.setPlayedLocation(g.human);
					((AIPlayer) g.opponent).placeCopyBead(g.human.getId(),g.ref.getSavedLocation());
					
					g.gui.repaint();
					
					turn++;
					System.out.println("The turn number is now: " + turn);
				}
				else if (turn == 1)
				{
					g.ref.saveLocation(g.opponent.requestMoveLocation());
					g.ref.setPlayedLocation(g.opponent);
					((AIPlayer) g.opponent).placeCopyBead(g.opponent.getId(),g.ref.getSavedLocation());
					
					g.gui.repaint();
					
					turn = 0;
				}
				
			}
			
			if (g.ref.checkGameState() == GameOverStatus.WIN)
			{
				JFrame frame1 = new JFrame();
				frame1.setSize(200,100);
				frame1.setTitle("You Win!");
				frame1.setDefaultCloseOperation(gameContinue);
				
				frame1.add(winComponent);
				
				frame1.setVisible(true);
			}
			else if (g.ref.checkGameState() == GameOverStatus.LOSE)
			{
				JFrame frame2 = new JFrame();
				frame2.setSize(200,100);
				frame2.setTitle("You Lose!");
				frame2.setDefaultCloseOperation(gameContinue);
				
				frame2.add(loseComponent);
				
				frame2.setVisible(true);
			}
			
			g.ref.reset();
		}
	}
}
