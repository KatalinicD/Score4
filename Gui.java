package Score4_GUI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;

@SuppressWarnings("serial")
public class Gui extends JFrame implements ActionListener{
	
	//things here????
	private static final int FRAME_WIDTH = 600;
	private static final int FRAME_HEIGHT = 600;
	
	
	public Gui() {
		
		setTitle("Score4");
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		
		addButtons(this.getContentPane());
		addBoard(this.getContentPane());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
	}// constructor
	
	
	public void addButtons(Container pane) {
		
		JPanel buttonPanel = new JPanel();
		
		JButton playButton = new JButton("Play");
		playButton.addActionListener(this);
		playButton.setActionCommand("play");
		
		JButton quitButton = new JButton("Quit");
		quitButton.addActionListener(this);
		quitButton.setActionCommand("quit");
		JLabel colourLabel = new JLabel("     ");
		JRadioButton black = new JRadioButton("Black");
		JRadioButton white = new JRadioButton("white");
		ButtonGroup group = new ButtonGroup();
		group.add(black);
		group.add(white);
		add(black);
		add(white);
		//pack();
		/**
		JButton colourButton = new JButton("Colour");
		colourButton.addActionListener(this);
		colourButton.setActionCommand("colour");
		**/
		buttonPanel.setLayout(new GridLayout());
		buttonPanel.add(playButton);
		buttonPanel.add(quitButton);
		buttonPanel.add(colourLabel);
		buttonPanel.add(black);
		buttonPanel.add(white);
		
		//buttonPanel.add(colourButton);
	
		pane.setLayout(new BorderLayout());
		pane.add(buttonPanel, BorderLayout.NORTH);

	}//addButtons method
	
	@Override
	public void actionPerformed(ActionEvent event) {
		
		String action = event.getActionCommand();
		
		if(action.equals("play")) {
			
			
		}
		else if(action.equals("quit")){
				
				
		}// else if clause	
		
		else if(action.equals("colour")) {
			
			
		}
		
	}// actionPerformed method
	
	public void addBoard(Container pane) {
		
		//pane.setLayout(new BorderLayout());
		
		BoardComponent board = new BoardComponent();  
		
		pane.add(board, BorderLayout.CENTER);
		
	}// addBoard method
}// Gui class
