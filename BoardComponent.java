package Score4_GUI;

import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;

import javax.swing.JComponent;

@SuppressWarnings("serial")
public class BoardComponent extends JComponent {
	
	public void paint(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setStroke(new BasicStroke(3));
		/**
		Point2D.Double point1 = new Double(10, 460);
		Point2D.Double point2 = new Double(30, 470);
		Point2D.Double point3 = new Double(50, 480);
		Point2D.Double point4 = new Double(70, 490);
		Point2D.Double point1top = new Double(10, 420);
		Point2D.Double point2top = new Double(30, 430);
		Point2D.Double point3top = new Double(50, 440);
		Point2D.Double point4top = new Double(70, 450);
		Point2D.Double point5 = new Double(20, 440);
		Point2D.Double point6 = new Double(40, 450);
		Point2D.Double point7 = new Double(60, 460);
		Point2D.Double point8 = new Double(80, 470);
		Point2D.Double point5top = new Double(20, 400);
		Point2D.Double point6top = new Double(40, 410);
		Point2D.Double point7top = new Double(60, 420);
		Point2D.Double point8top = new Double(80, 430);
		Point2D.Double point9 = new Double(30, 420);
		Point2D.Double point10 = new Double(50, 430);
		Point2D.Double point11 = new Double(70, 440);
		Point2D.Double point12 = new Double(90, 450);
		Point2D.Double point9top = new Double(30, 380);
		Point2D.Double point10top = new Double(50, 390);
		Point2D.Double point11top = new Double(70, 400);
		Point2D.Double point12top = new Double(90, 410);
		Point2D.Double point13 = new Double(40, 400);
		Point2D.Double point14 = new Double(60, 410);
		Point2D.Double point15 = new Double(80, 420);
		Point2D.Double point16 = new Double(100, 430);
		Point2D.Double point13top = new Double(40, 360);
		Point2D.Double point14top = new Double(60, 370);
		Point2D.Double point15top = new Double(80, 380);
		Point2D.Double point16top = new Double(100, 390);
		**/


		//pegs in the 1st row
		Line2D.Double peg1_1_1 = new Line2D.Double(80, 380, 80, 340);
		Line2D.Double peg1_1_2 = new Line2D.Double(80, 340, 80, 300);
		Line2D.Double peg1_1_3 = new Line2D.Double(80, 300, 80, 260);
		Line2D.Double peg1_1_4 = new Line2D.Double(80, 260, 80, 220);
		
		Line2D.Double peg1_2_1 = new Line2D.Double(160, 420, 160, 380);
		Line2D.Double peg1_2_2 = new Line2D.Double(160, 380, 160, 340);
		Line2D.Double peg1_2_3 = new Line2D.Double(160, 340, 160, 300);
		Line2D.Double peg1_2_4 = new Line2D.Double(160, 300, 160, 260);
		
		Line2D.Double peg1_3_1 = new Line2D.Double(240, 460, 240, 420);
		Line2D.Double peg1_3_2 = new Line2D.Double(240, 420, 240, 380);
		Line2D.Double peg1_3_3 = new Line2D.Double(240, 380, 240, 340);
		Line2D.Double peg1_3_4 = new Line2D.Double(240, 340, 240, 300);
		
		Line2D.Double peg1_4_1 = new Line2D.Double(320, 500, 320, 460);
		Line2D.Double peg1_4_2 = new Line2D.Double(320, 460, 320, 420);
		Line2D.Double peg1_4_3 = new Line2D.Double(320, 420, 320, 380);
		Line2D.Double peg1_4_4 = new Line2D.Double(320, 380, 320, 340);
		
		//pegs in the 2nd row
		Line2D.Double peg2_1_1 = new Line2D.Double(120, 300, 120, 260);
		Line2D.Double peg2_1_2 = new Line2D.Double(120, 260, 120, 220);
		Line2D.Double peg2_1_3 = new Line2D.Double(120, 220, 120, 180);
		Line2D.Double peg2_1_4 = new Line2D.Double(120, 180, 120, 140);
		
		Line2D.Double peg2_2_1 = new Line2D.Double(200, 340, 200, 300);
		Line2D.Double peg2_2_2 = new Line2D.Double(200, 300, 200, 260);
		Line2D.Double peg2_2_3 = new Line2D.Double(200, 260, 200, 220);
		Line2D.Double peg2_2_4 = new Line2D.Double(200, 220, 200, 180);
		
		Line2D.Double peg2_3_1 = new Line2D.Double(280, 380, 280, 340);
		Line2D.Double peg2_3_2 = new Line2D.Double(280, 340, 280, 300);
		Line2D.Double peg2_3_3 = new Line2D.Double(280, 300, 280, 260);
		Line2D.Double peg2_3_4 = new Line2D.Double(280, 260, 280, 220);
		
		Line2D.Double peg2_4_1 = new Line2D.Double(360, 420, 360, 380);
		Line2D.Double peg2_4_2 = new Line2D.Double(360, 380, 360, 340);
		Line2D.Double peg2_4_3 = new Line2D.Double(360, 340, 360, 300);
		Line2D.Double peg2_4_4 = new Line2D.Double(360, 300, 360, 260);

		//pegs in the 3rd row
		Line2D.Double peg3_1_1 = new Line2D.Double(160, 220, 160, 180);
		Line2D.Double peg3_1_2 = new Line2D.Double(160, 180, 160, 140);
		Line2D.Double peg3_1_3 = new Line2D.Double(160, 140, 160, 100);
		Line2D.Double peg3_1_4 = new Line2D.Double(160, 100, 160, 60);
		
		Line2D.Double peg3_2_1 = new Line2D.Double(240, 260, 240, 220);
		Line2D.Double peg3_2_2 = new Line2D.Double(240, 220, 240, 180);
		Line2D.Double peg3_2_3 = new Line2D.Double(240, 180, 240, 140);
		Line2D.Double peg3_2_4 = new Line2D.Double(240, 140, 240, 100);
		
		Line2D.Double peg3_3_1 = new Line2D.Double(320, 300, 320, 260);
		Line2D.Double peg3_3_2 = new Line2D.Double(320, 260, 320, 220);
		Line2D.Double peg3_3_3 = new Line2D.Double(320, 220, 320, 180);
		Line2D.Double peg3_3_4 = new Line2D.Double(320, 180, 320, 140);
		
		Line2D.Double peg3_4_1 = new Line2D.Double(400, 340, 400, 300);
		Line2D.Double peg3_4_2 = new Line2D.Double(400, 300, 400, 260);
		Line2D.Double peg3_4_3 = new Line2D.Double(400, 260, 400, 220);
		Line2D.Double peg3_4_4 = new Line2D.Double(400, 220, 400, 180);

		//pegs in the 4th row
		Line2D.Double peg4_1_1 = new Line2D.Double(200, 140, 200, 100);
		Line2D.Double peg4_1_2 = new Line2D.Double(200, 100, 200, 60);
		Line2D.Double peg4_1_3 = new Line2D.Double(200, 60, 200, 20);
		Line2D.Double peg4_1_4 = new Line2D.Double(200, 20, 200, -20);//******
		
		Line2D.Double peg4_2_1 = new Line2D.Double(280, 180, 280, 140);
		Line2D.Double peg4_2_2 = new Line2D.Double(280, 140, 280, 100);
		Line2D.Double peg4_2_3 = new Line2D.Double(280, 100, 280, 60);
		Line2D.Double peg4_2_4 = new Line2D.Double(280, 60, 280, 20);
		
		Line2D.Double peg4_3_1 = new Line2D.Double(360, 220, 360, 180);
		Line2D.Double peg4_3_2 = new Line2D.Double(360, 180, 360, 140);
		Line2D.Double peg4_3_3 = new Line2D.Double(360, 140, 360, 100);
		Line2D.Double peg4_3_4 = new Line2D.Double(360, 100, 360, 60);
		
		Line2D.Double peg4_4_1 = new Line2D.Double(440, 260, 440, 220);
		Line2D.Double peg4_4_2 = new Line2D.Double(440, 220, 440, 180);
		Line2D.Double peg4_4_3 = new Line2D.Double(440, 180, 440, 140);
		Line2D.Double peg4_4_4 = new Line2D.Double(440, 140, 440, 100);

		/**
		//board
		java.awt.geom.Line2D.Double boardFront = new Line2D.Double(70, 390, 330, 510);
		java.awt.geom.Line2D.Double boardRight = new Line2D.Double(330, 510, 450, 250);
		java.awt.geom.Line2D.Double boardBack = new Line2D.Double(450, 250, 190, 130);
		java.awt.geom.Line2D.Double boardLeft = new Line2D.Double(190, 130, 70, 390);

		g2.draw(boardFront);
		g2.draw(boardRight);
		g2.draw(boardBack);
		g2.draw(boardLeft);
		**/
		/**
		Line2D.Double peg1_1 = new Line2D.Double(20, 460, 20, 440);
		Line2D.Double peg1_1 = new Line2D.Double(20, 460, 20, 440);
		Line2D.Double peg1_1 = new Line2D.Double(20, 460, 20, 440);
		Line2D.Double peg1_1 = new Line2D.Double(20, 460, 20, 440);
		Line2D.Double peg1_1 = new Line2D.Double(20, 460, 20, 440);
		Line2D.Double peg1_1 = new Line2D.Double(20, 460, 20, 440);
		Line2D.Double peg1_1 = new Line2D.Double(20, 460, 20, 440);
		Line2D.Double peg1_1 = new Line2D.Double(20, 460, 20, 440);
		Line2D.Double peg1_1 = new Line2D.Double(20, 460, 20, 440);
		Line2D.Double peg1_1 = new Line2D.Double(20, 460, 20, 440);
		Line2D.Double peg1_1 = new Line2D.Double(20, 460, 20, 440);
		**/
		
		
		
		/**
		Line2D.Double peg2 = new Line2D.Double(point2, point2top);
		Line2D.Double peg3 = new Line2D.Double(point3, point3top);
		Line2D.Double peg4 = new Line2D.Double(point4, point4top);
		Line2D.Double peg5 = new Line2D.Double(point5, point5top);
		Line2D.Double peg6 = new Line2D.Double(point6, point6top);
		Line2D.Double peg7 = new Line2D.Double(point7, point7top);
		Line2D.Double peg8 = new Line2D.Double(point8, point8top);
		Line2D.Double peg9 = new Line2D.Double(point9, point9top);
		Line2D.Double peg10 = new Line2D.Double(point10, point10top);
		Line2D.Double peg11 = new Line2D.Double(point11, point11top);
		Line2D.Double peg12 = new Line2D.Double(point12, point12top);
		Line2D.Double peg13 = new Line2D.Double(point13, point13top);
		Line2D.Double peg14 = new Line2D.Double(point14, point14top);
		Line2D.Double peg15 = new Line2D.Double(point15, point15top);
		Line2D.Double peg16 = new Line2D.Double(point16, point16top);

		//Line2D.Double peg1 = new Line2D.Double(point1, point11);
		**/
		
		
		
		g2.draw(peg1_1_1);
		g2.draw(peg1_1_2);
		g2.draw(peg1_1_3);
		g2.draw(peg1_1_4);
		g2.draw(peg1_2_1);
		g2.draw(peg1_2_2);
		g2.draw(peg1_2_3);
		g2.draw(peg1_2_4);
		g2.draw(peg1_3_1);
		g2.draw(peg1_3_2);
		g2.draw(peg1_3_3);
		g2.draw(peg1_3_4);
		g2.draw(peg1_4_1);
		g2.draw(peg1_4_2);
		g2.draw(peg1_4_3);
		g2.draw(peg1_4_4);
		
		g2.draw(peg2_1_1);
		g2.draw(peg2_1_2);
		g2.draw(peg2_1_3);
		g2.draw(peg2_1_4);
		g2.draw(peg2_2_1);
		g2.draw(peg2_2_2);
		g2.draw(peg2_2_3);
		g2.draw(peg2_2_4);
		g2.draw(peg2_3_1);
		g2.draw(peg2_3_2);
		g2.draw(peg2_3_3);
		g2.draw(peg2_3_4);
		g2.draw(peg2_4_1);
		g2.draw(peg2_4_2);
		g2.draw(peg2_4_3);
		g2.draw(peg2_4_4);
		
		g2.draw(peg3_1_1);
		g2.draw(peg3_1_2);
		g2.draw(peg3_1_3);
		g2.draw(peg3_1_4);
		g2.draw(peg3_2_1);
		g2.draw(peg3_2_2);
		g2.draw(peg3_2_3);
		g2.draw(peg3_2_4);
		g2.draw(peg3_3_1);
		g2.draw(peg3_3_2);
		g2.draw(peg3_3_3);
		g2.draw(peg3_3_4);
		g2.draw(peg3_4_1);
		g2.draw(peg3_4_2);
		g2.draw(peg3_4_3);
		g2.draw(peg3_4_4);
		
		g2.draw(peg4_1_1);
		g2.draw(peg4_1_2);
		g2.draw(peg4_1_3);
		g2.draw(peg4_1_4);
		g2.draw(peg4_2_1);
		g2.draw(peg4_2_2);
		g2.draw(peg4_2_3);
		g2.draw(peg4_2_4);
		g2.draw(peg4_3_1);
		g2.draw(peg4_3_2);
		g2.draw(peg4_3_3);
		g2.draw(peg4_3_4);
		g2.draw(peg4_4_1);
		g2.draw(peg4_4_2);
		g2.draw(peg4_4_3);
		g2.draw(peg4_4_4);
		
	}
}
