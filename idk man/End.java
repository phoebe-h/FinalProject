

import java.awt.*; 

//draws second string (exactly like other string class)
public class End
{//initializes string and arrays 
 private String string; 
 private int[]xrectangle=new int [4];
 private int[]yrectangle=new int [4];
   
    public End(String string1)
    {//gets string from main class
      string = string1; 
        
    }

    public void draw (Graphics page) {
        page.setColor(Color.white); 
        //this is rectangle displayed in background
        //assigns coordinate to array elements
        xrectangle[0]=200;
        xrectangle[1]=200;
        xrectangle[2]=500;
        xrectangle[3]=500;
        yrectangle[0]=200;
        yrectangle[1]=400;
        yrectangle[2]=400;
        yrectangle[3]=200;
        page.fillPolygon(xrectangle,yrectangle,4);
        page.setColor(Color.black); 
        page.drawPolygon(xrectangle,yrectangle,4);
        
        //writes end of game + if user won or not on page 
        page.setFont(new Font("Impact", Font.BOLD, 18));
        page.drawString("END OF GAME: "+string, 250, 300);
       }
}
