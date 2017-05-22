import java.io.*;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.*;

public class Igloo extends Character
{
    
    public Igloo()
    {
        super("igloo.jpg");
    }
    
    public Igloo(int x, int y)
    {
        super("igloo.jpg", x, y);
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
