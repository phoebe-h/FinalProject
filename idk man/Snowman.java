import java.io.*;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.*;

public class Snowman extends Character
{
   
    
    public Snowman()
    {
       super("snowman.jpg");
    }

    public Snowman(int x, int y)
    {
        super("snowman.jpg", x, y);
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
