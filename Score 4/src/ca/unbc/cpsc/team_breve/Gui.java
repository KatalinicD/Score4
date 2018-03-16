package ca.unbc.cpsc.team_breve;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Gui extends JFrame{
	
	static Gui gui;
    
	int LBpointX=50;
    int LBpointY=450;
    double slope=0.5;
    int height=150;
    int width=350;
    int Xspace=width/5;
    int Yspace=height/5;
    int rowDifference=(int)(slope*height/5);
    int pegWidth=5;
    int pegHeight=200;
    int X=LBpointX+Xspace+rowDifference*3;
    int Y=LBpointY-Yspace*4;
    
    Board board;
    
    ArrayList<Integer> array = new ArrayList<Integer>();
    
    //tester
     
    Gui(){
        
    	board = new Board();
        
    	setSize(500,500);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        MousePressListener mousePressed = new MousePressListener();
        addMouseListener(mousePressed);
    
    }//no-argument constructor for tester Gui
    
    //Input board 
    
    Gui(Board b){
    	
    	board = b;
    	
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        MousePressListener mousePressed = new MousePressListener();
        addMouseListener(mousePressed);
        
    }//constructor Gui
    
    //painting :)
    
    public void paint(Graphics g){

        int[] pointX={LBpointX,LBpointX+width,LBpointX+width+(int)(height*slope),LBpointX+(int)(height*slope)};
        int[] pointY={LBpointY,LBpointY,LBpointY-height,LBpointY-height};
        g.setColor(Color.lightGray);
        g.fillPolygon(pointX,pointY, 4);
        int X=LBpointX+Xspace+rowDifference*3;
        int Y=LBpointY-Yspace*4;
        g.setColor(Color.GRAY);
        
        for(int i = 0; i < 4; i++){
        	
            for(int j = 0; j < 4; j++){
            	
               //g.fillRect(X-pegWidth/2,Y-pegHeight,pegWidth,pegHeight);
                
                //drawing pegs
                 
                g.fillRect(X+2*pegWidth,Y-pegHeight,pegWidth,pegHeight);
                
                //drawing bead
                
                int r=10;
                int centerX=X+(int)(2.5*pegWidth);
                int Ydifference=pegHeight/5;
                int centerY=Y-Ydifference;
                
                for(int ii = 0; ii < 4; ii++){
                    
                       //*****important*****
                       //change true to check null in the current position

                    if(true){
                        
                           //*****important*****
                           //change true to check black in current position

                        
                        if(true){
                        	
                            g.setColor(Color.BLACK);
                            g.fillOval(centerX-r,centerY-r,r*2,r*2);
                            g.setColor(Color.GRAY);

                        }else{
                            g.setColor(Color.white);
                            g.fillOval(centerX-r,centerY-r,r*2,r*2);
                            g.setColor(Color.GRAY);


                        }
                    }else{
                              //g.setColor(Color.BLACK);
                              //g.drawOval(centerX-r,centerY-r,r*2,r*2);
                             //g.setColor(Color.GRAY);

                    }
                    centerY-=Ydifference;

                }
                X=X+Xspace;
            }
            X=X-Xspace*4-rowDifference;
            Y=Y+Yspace;
        }
    }
    
    //inner class MouseListener
    
    class MousePressListener implements MouseListener{
    	
        public void mousePressed(MouseEvent event){
            within(event.getX(),event.getY());
            repaint();
        }
        
        //lazy methods cheering other working methods:)
        
        public void mouseReleased(MouseEvent event) {}
        public void mouseClicked(MouseEvent event) {}
        public void mouseEntered(MouseEvent event) {}
        public void mouseExited(MouseEvent event) {}
        
        public boolean within(int pointX,int pointY){
            int X=LBpointX+Xspace+rowDifference*3;
            int Y=LBpointY-Yspace*4;
            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){

                    if(X+1*pegWidth<=pointX&&pointX<=X+4*pegWidth){
                        if(Y-pegHeight<pointY&&pointY<Y){
                            /*
                               important
                               ADD THE METHOD OF ADDBEAD HERE
                               CHANGE THE COLOR YOU NEED HERE

                             */

                            System.out.println(i+" "+j);
                            return true;
                        }
                    }
                    X=X+Xspace;
                }
                X=X-Xspace*4-rowDifference;
                Y=Y+Yspace;
            }
            return false;
        }
    }
    
    public static void main(String[] lulu){
    	
        gui = new Gui();
    }// method main
}// class Gui