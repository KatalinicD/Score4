package ca.unbc.cpsc.team_breve;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class LoseComponent extends JComponent
	{
		@Override
		public void paintComponent(Graphics g)
		{
			Graphics2D g2 = (Graphics2D) g;
			
			g2.drawString("You Lose!",75,50);
			
		}
	}