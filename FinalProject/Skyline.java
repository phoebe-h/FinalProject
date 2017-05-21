/*
 * Ground
 * Phoebe & Jamie
 * May 2017
 */

import java.io.*;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.*;
import java.awt.image.BufferedImage;

  
//stuff for picture, may be repeats
import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List


public class Skyline  
{
    
    private Image pic = null;
    private int x;
    private int y;
    private Pixel pixel; 


    
    public Skyline(int x1, int y1)
    {  x=x1;
       y=y1; 
 
       try
        {pic = ImageIO.read(new File("skyline1.jpg"));
        }
        catch (IOException e)
        {}
      
       
    }
  

    public void draw (Graphics page)
    {
        page.drawImage(pic, x, y, null);
    }

    
}

    

