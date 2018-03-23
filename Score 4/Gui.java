package trial;

import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class Gui extends JFrame{
	 
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
    
    private Referee myR;
    private Board board;
    private Location loc;
    //private Player player;
    
    ArrayList<Integer> array = new ArrayList<Integer>();
    
    //tester
    
    
    /**
    Gui(){
    	
    	board = new Board();
    	board.getPeg(0, 0).addBead(Colour.Black);
    	setSize(500,500);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        MousePressListener mousePressed = new MousePressListener();
        addMouseListener(mousePressed);
    
    }//no-argument constructor for tester 
    
    //Input board 
    **/
    
    
    Gui(Board b, Referee r){

    	myR = r;
    	
    	board = b;
    	
    	//******i should not need this
    	//myR = new Referee(board, player, player, gui);
    	//board.board[0][0].array[0]=new Bead(Colour.Black);
    	//board.board[1][2].array[0]=new Bead(Colour.White);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        
        MousePressListener mousePressed = new MousePressListener();
        addMouseListener(mousePressed);
        //System.out.print("end of gui cnstr");
        
    }//constructor Gui
    
    /**
    
    //************************this is my manu bar test***************************************
    
    public void addMenuBarToPane() {
    	
    	JMenuBar menuBar = new JMenuBar();
    	JMenu helpMenu = new JMenu("Help");
    	JMenuItem viewHelpMenuItem = new JMenuItem("View Help");
    	viewHelpMenuItem.addActionListener((ActionListener) this);
    	viewHelpMenuItem.setActionCommand("help_viewHelp");
    	JMenuItem aboutMenuItem = new JMenuItem("About Score4");
    	helpMenu.add(viewHelpMenuItem);
    	helpMenu.add(aboutMenuItem);
    	
    	menuBar.add(helpMenu);
    	this.setJMenuBar(menuBar);
    	
    }
    
    
    //********************************menu bar test****************************************
    
    **/
    
    //painting :)
    
    public void paint(Graphics g){
    	Color c=new Color(220,220,220);
    	g.setColor(c);
    	g.fillRect(0, 0, 10000, 10000);

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
                  //    board.getPeg(i, j).getBead(ii).getColour()!=Colour.Blank;
                	//below it's checking the existence of the board, pegs, and beads
                	//if(board == null) System.out.println("1");
                	//if(board.board[i][j] == null) System.out.println("2");
                	//if(board.board[i][j].array[ii] == null) System.out.println("3");
                	//if(board.board[i][j].array[ii].beadcolour == null) System.out.println("4");
                	//you cannot check the colour of the non-existing bead!!!!!!
                    if(board.board[i][j].array[ii] != null){
                        
                           //*****important*****
                           //////change true to check black in current position

                        
                        if(board.board[i][j].array[ii].beadcolour!=Colour.Black){
                        	
                            g.setColor(Color.BLACK);
                            g.fillOval(centerX-r,centerY-r,r*2,r*2);
                            g.setColor(Color.GRAY);

                        }else if(board.board[i][j].array[ii].beadcolour!=Colour.White){
                            g.setColor(Color.WHITE);
                            g.fillOval(centerX-r,centerY-r,r*2,r*2);
                            g.setColor(Color.GRAY);
                        	

                        }
                    }else{
                    	//System.out.println("blank");
                              //g.setColor(Color.BLACK);
                              //g.drawOval(centerX-r,centerY-r,r*2,r*2);
                             //g.setColor(Color.GRAY);
                    		break;

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
        
        
        //Location loc;
        
        public boolean within(int pointX,int pointY){
        	System.out.println(pointX+"   "+pointY);
            int X=LBpointX+Xspace+rowDifference*3;
            int Y=LBpointY-Yspace*4;
            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){

                    if(X+1*pegWidth<=pointX&&pointX<=X+4*pegWidth){
                        if(Y-pegHeight<pointY&&pointY<Y){
                        	
                        	//loc = new Location(i,j);
                        	//Bead bead = new Bead();
                        	//bead = board.checkPeg(i, j);
                        	
                        	//myR.saveLocation(loc);
                        	
                        	//loc = new Location(i,j);
                        	//Bead human_bead = new Bead(Colour.White);
                        	//Bead ai_bead = new Bead(Colour.Black);
                        	
                        	
                        	//loc = new Location(i,j);
                        	//myR.saveLocation(loc);
                        	
                        	//Bead bead = new Bead(board.checkPeg(i, j));
                        	
                        	//Bead beadPosition = board.checkPeg(i, j);
                        	
                        	//Peg peg = new Peg(i,j);
                        	//board.board[i][j].array[0] = new Bead(Colour.White);
                
                        	
                        	//board.addBead(player.requestMoveLocation(), player.getColour());
                        	//System.out.println(myR);
                        	//loc = new Location(i,j);
                        	//Bead bb = new Bead(Colour.White);
                        	//bb = board.checkPeg(i, j);
                        	
                        	//System.out.println(bb);
                        	//board.checkPeg(i, j);
                        	
                        	
                        	if(board.checkPeg(i, j)!=null) {
                        		
                        		//Bead bb = new Bead(Colour.Black);
                        		//bb = board.checkPeg(i, j);
                        		
                        		//System.out.println(bb.toString());
                        		
                        		//board.addBead(i, j, Colour.White);
                        		board.board[i][j].array[0] = new Bead(Colour.Black);
                        		System.out.println(myR.getSavedLocation());
                        		                      		
                        		
                        		myR.saveLocation(loc);
                        	}
                        	               
                        	
                        	//Peg peg = new Peg(i,j);
                        
                        	//board.board[i][j].array[2]= new Bead(Colour.Black);
                        	//board.board[i][j].array[1]= new Bead(Colour.Black);
                        	//System.out.println(myR + "---------------------------");
                        	
    
                        	
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
        
       //public static void main(String[] lulu){
    	
        //gui = new Gui();
    //}// method main
}// class Gui