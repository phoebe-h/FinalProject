
/**
 * Jamie Zhang
 * sun - creates methods to draw sun
 */

import java.awt.*;


public class Sun 
{//initializes variables
   private int radius;     
   private int x;  
   private int y; 
 
   //takes x,y coordinate (of top of circle) and radius as parameter
   public Sun ( int ax, int ay, int aradius)
   {
      radius = aradius;
      x = ax;
      y = ay;
 
   }
   
   //draws orange circle (sun)
   public void draw (Graphics page)
   {  
      page.setColor(Color.orange);
      page.fillOval(x,y,radius,radius); 
      

   }
}