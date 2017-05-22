
/**
 * Write a description of class Instructions1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */import java.io.*;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.*;

public class Instructions1 extends Character
{
   
    
    public Instructions1()
    {
       super("instructions.jpg");
    }

    public Instructions1(int x, int y)
    {
        super("instructions.jpg", x, y);
    }
    
    public void draw (Graphics page)
    {
        page.drawImage(pic, xo, yo, null);
    }

    
    public void move (Graphics page, int x, int y)
    {
        super.move(x, y);
        this.draw(page);
    }

}
