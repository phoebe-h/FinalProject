
/**
 * Jamie Zhang
 * Stars - generates a bunch of small stars
 */
import java.awt.*;

public class Stars
 //initializes variables

{//initializes x,y coordinate of top of circle (stars)
 private int x;
 private int y;
 private int radius;
    
    //takes x,y coordinate as parameters
    public Stars(int x1, int y1)
    {x=x1;
     y=y1;
        
    }

    public void draw (Graphics page)
    {
     //draws 50 stars 
     for (int count = 0; count<50; count++){
     page.setColor(Color.yellow);
     page.fillOval(x,y,radius,radius);
     radius = (int) (Math.random()*4)+1; 
     x = (int) (Math.random()*700)+1;
     y = (int) (Math.random()*350)+1; }
    }

}
