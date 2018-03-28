package score4;

import java.awt.Graphics;

import java.awt.Graphics2D;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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
			int turn = 0;
			//while (g.ref.checkGameState() != GameOverStatus.WIN || g.ref.checkGameState() != GameOverStatus.LOSE || g.ref.checkGameState() != GameOverStatus.DRAW)
			while(g.ref.checkGameState() == null)
			{
				
				if (turn == 0)
				{
					//g.human.setPlayerLastPlayed(g.ref.getNewLocation());
					//System.out.println(1);
					//g.human.setPegClicked(true);
					/*System.out.println(2);
					g.ref.saveLocation(g.human.requestMoveLocation());
					System.out.println(3);
					g.ref.setPlayedLocation(g.human);
					System.out.println(4);
					g.human.setPegClicked(true);
					System.out.println(5);
					((AIPlayer) g.opponent).placeCopyBead(g.human.getId(),g.ref.getSavedLocation());
					System.out.println(6);*/
					g.human.requestMoveLocation();
					
					
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
					System.out.println("ai move");
				}
				
			}
			
			if (g.ref.checkGameState() == GameOverStatus.WIN)
			{
				JFrame frame1 = new JFrame();
				frame1.setSize(200,100);
				frame1.setTitle("You Win!");
				//frame1.setDefaultCloseOperation(gameContinue);

				
				frame1.add(winComponent);
				frame1.addWindowListener(new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						onExit();
					}

					private void onExit() {
						
						frame1.dispose();
						g.gui.repaint();
						// TODO Auto-generated method stub
						
					}
				});
				
				frame1.setVisible(true);
				
				//frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				
			}
			else if (g.ref.checkGameState() == GameOverStatus.LOSE)
			{
				JFrame frame2 = new JFrame();
				frame2.setSize(200,100);
				frame2.setTitle("You Lose!");
				
				
				frame2.add(loseComponent);
				
				frame2.setVisible(true);
				
				frame2.addWindowListener(new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						onExit();
					}

					private void onExit() {
						
						frame2.dispose();
						g.gui.repaint();
						// TODO Auto-generated method stub
						
					}
				});
				
				//frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
			
			g.ref.reset();
		}
	}
}