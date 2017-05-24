/**
 * Jamie Zhang 
 */

import java.awt.*; 

//draws second string (exactly like other string class)
public class Text
{
    private String string; 
    private int[]xrectangle=new int [4];
    private int[]yrectangle=new int [4];
   
    //constructor
    public Text(String string1)
    {
        string = string1; 
        
    }

    public void draw (Graphics page)
    {
        //sets page color to white
        page.setColor(Color.white);
        //assigns coordinate to array elements
        xrectangle[0]=0;
        xrectangle[1]=0;
        xrectangle[2]=125;
        xrectangle[3]=125;
        yrectangle[0]=0;
        yrectangle[1]=55;
        yrectangle[2]=55;
        yrectangle[3]=0;
        page.fillPolygon(xrectangle,yrectangle,4);
        page.setColor(Color.black); 
        page.drawPolygon(xrectangle,yrectangle,4);

        page.setFont(new Font("Impact", Font.BOLD, 18));
        page.drawString(string, 10, 35);
    }
}
