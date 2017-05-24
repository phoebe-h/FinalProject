

import java.awt.*; 

//draws second string (exactly like other string class)
public class Counter
{//initializes string and arrays 
 private String string; 
 private int[]xrectangle=new int [4];
 private int[]yrectangle=new int [4];
   
    public Counter(String string1)
    {   //gets string from main class
        string = string1; 
        
    }

    public void draw (Graphics page) {
        page.setColor(Color.white);
        //assigns coordinate to array elements
        //this is rectangle displayed in background
        xrectangle[0]=520;
        xrectangle[1]=520;
        xrectangle[2]=700;
        xrectangle[3]=700;
        yrectangle[0]=0;
        yrectangle[1]=55;
        yrectangle[2]=55;
        yrectangle[3]=0;
        page.fillPolygon(xrectangle,yrectangle,4);
        //this is black outline around rectangle
        page.setColor(Color.black); 
        page.drawPolygon(xrectangle,yrectangle,4);
        
        //writes countdown + counter on page (for user to know how much "time" is left)
        page.setFont(new Font("Impact", Font.BOLD, 18));
        page.drawString("Countdown: "+string, 540, 35);
       }
}
