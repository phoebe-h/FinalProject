

/**
 *Jamie Zhang
 * Moon - draws the moon
 */

import java.awt.*;

public class Moon {
    
    //initializes variables 
    private int x; 
    private int y;
   
    private int radius; 
    
    //takes x,y coordinate of top of circle 
    public Moon(int x1, int y1){
        x=x1;
        y=y1;
    }
    
    //draws yellow circle (for moon)
    public void draw (Graphics page){
        page.setColor(Color.yellow);
        page.fillOval(x,y,50,50);
        page.setColor(Color.black);
        page.fillOval(x+10,y-15,50,50);
    }
}
