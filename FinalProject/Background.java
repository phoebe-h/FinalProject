
/**
 *Jamie Zhang
 * Background - creates background (color will be changed in animation)
 */
import java.awt.*;

public class Background 
{   //initializes variables
    
    //r,g,b values for changing color 
    private int r,g,b;
    private Color color;
    
    //initializes arrays that hold x and y coordinates of rectangle (mimicks background)
    private int[]xrectangle=new int [4];
    private int[]yrectangle=new int [4];
  
    //takes r,g,b values as parameters (allow us to change rectangle's color in applet class
    public Background(int r1, int g1, int b1){
        r=r1;
        g=g1;
        b=b1;
        
    }
    
    //set method lets us set color of rectangle in applet
    public void setColors(int r1, int g1, int b1){
        r=r1;
        g=g1;
        b=b1;
    }
    
    //method draws rectangle to cover width and length of applet (x,y coordinates assigned, not inputted by user)
    //rectangle is set to specific color (in applet class)
    public void draw (Graphics page) {
        color=new Color(r,g,b);
        page.setColor(color);
        
        //assigns coordinate to array elements
        xrectangle[0]=0;
        xrectangle[1]=0;
        xrectangle[2]=700;
        xrectangle[3]=700;
        yrectangle[0]=0;
        yrectangle[1]=600;
        yrectangle[2]=600;
        yrectangle[3]=0;
        page.fillPolygon(xrectangle,yrectangle,4);
    }
    
}
