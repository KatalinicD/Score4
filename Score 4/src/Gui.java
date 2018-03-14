package ca.unbc.cpsc.team_breve;

import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JFrame;

public class Gui extends JFrame{
    static Gui t;
    ArrayList<Integer> a=new ArrayList<Integer>();
    Gui(){
        setSize(500,500);
        setVisible(true);
        MousePressListener l=new MousePressListener();
        addMouseListener(l);


    }
    public void paint(Graphics g){
        int LBpointX=50;
        int LBpointY=450;
        double slope=0.5;
        int height=150;
        int width=350;
        int[] pointX={LBpointX,LBpointX+width,LBpointX+width+(int)(height*slope),LBpointX+(int)(height*slope)};
        int[] pointY={LBpointY,LBpointY,LBpointY-height,LBpointY-height};
        g.setColor(Color.lightGray);
        g.fillPolygon(pointX,pointY, 4);
        int Xspace=width/5;
        int Yspace=height/5;
        int rowDifference=(int)(slope*height/5);
        int pegWidth=5;
        int pegHeight=200;
        int X=LBpointX+Xspace+rowDifference*3;
        int Y=LBpointY-Yspace*4;
        g.setColor(Color.GRAY);
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
//                g.fillRect(X-pegWidth/2,Y-pegHeight,pegWidth,pegHeight);
                g.fillRect(X+2*pegWidth,Y-pegHeight,pegWidth,pegHeight);
                X=X+Xspace;
            }
            X=X-Xspace*4-rowDifference;
            Y=Y+Yspace;
        }
    }
    class MousePressListener implements MouseListener{
        public void mousePressed(MouseEvent event){
            if(a.size()==4){
                t.setVisible(false);
                t=new Gui();
                a.clear();
            }else{
                a.add(event.getX());
                a.add(event.getY());
                System.out.println("ADD "+event.getX()+" "+event.getY()+" "+a.size());
            }
            repaint();
        }
        public void mouseReleased(MouseEvent event) {}
        public void mouseClicked(MouseEvent event) {}
        public void mouseEntered(MouseEvent event) {}
        public void mouseExited(MouseEvent event) {}
    }
    public static void main(String[] meow){
        t=new Gui();
    }
}