import java.io.*;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.*;

public class Stump extends Character
{
   
    
    public Stump()
    {
       super("tree stump.jpg");
    }

    public Stump(int x, int y)
    {
        super("tree stump.jpg", x, y);
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
