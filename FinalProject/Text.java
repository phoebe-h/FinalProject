

/**
 * Jamie Zhang 
 */

import java.awt.*; 

//draws second string (exactly like other string class)
public class Text
{private String string; 
 private int[]xrectangle=new int [4];
 private int[]yrectangle=new int [4];
   
    public Text(String string1)
    {string = string1; 
        
    }

    public void draw (Graphics page) {
        page.setColor(Color.white);
        //assigns coordinate to array elements
        xrectangle[0]=0;
        xrectangle[1]=0;
        xrectangle[2]=100;
        xrectangle[3]=100;
        yrectangle[0]=0;
        yrectangle[1]=70;
        yrectangle[2]=70;
        yrectangle[3]=0;
        page.fillPolygon(xrectangle,yrectangle,4);
        
        page.setColor(Color.black);
        page.drawString(string, 20, 50);
       }
}
