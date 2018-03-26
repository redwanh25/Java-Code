package practice;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class AWTGraphicsDemo extends Frame {
       
   public AWTGraphicsDemo(){
      super("Redwan Hossain");
      prepareGUI();
   }

   public static void main(String[] args){
      AWTGraphicsDemo  awtGraphicsDemo = new AWTGraphicsDemo();  
      awtGraphicsDemo.setVisible(true);
   }

   private void prepareGUI(){
      setSize(400,400);
      addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      }); 
   }    

   @Override
   public void paint(Graphics g) {
      g.setColor(Color.RED);
      Font font = new Font("Serif", Font.PLAIN, 24);
      g.setFont(font);
      g.drawString("Welcome to TutorialsPoint", 100, 150);      
   }
}
