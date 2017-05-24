import java.io.*;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.*;

public class Stump extends Character
{
    //constructor references super()
    public Stump()
    {
       super("tree stump.jpg");
    }
    
    //constructor references super()
    public Stump(int x, int y)
    {
        super("tree stump.jpg", x, y);
    }
    
    //draws image
    public void draw (Graphics page)
    {
        page.drawImage(pic, xo, yo, null);
    }
    
    public void move (Graphics page, int x, int y)
    {
        //uses parent class to reset x and y coordinates
        super.move(x, y);
        //redraws image to move
        this.draw(page);
    }
}
