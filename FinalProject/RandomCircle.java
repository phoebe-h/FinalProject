
/**
 * Jamie Zhang
 * Random Circle - makes circle that covers up yellow circle to make moon
 * moves with moon
 * changes colors with the background object
 */

import java.awt.*;


public class RandomCircle {
    //initializes variables
    
    //initializes color of circle
    private Color color;
    
    //initializes x,y coordinate of top of circle
    private int x,y;
    
    //r,g,b values for color
    private int r,g,b;
   
    //takes x,y coordinate and r,g,b as parameters
    //r,g,b changes color with background (blends in)
    //makes yellow circle into moon
    public RandomCircle(int x1, int y1, int r1, int g1, int b1){
        x=x1;
        y=y1;
        r=r1;
        g=g1;
        b=b1;
    }
    
    //draws circle that partially covers yellow circle to make moon
    public void draw (Graphics page)
    {color = new Color (r,g,b);
     page.setColor(color);
     page.fillOval(x+10,y-14,50,50);
    }
    
}
