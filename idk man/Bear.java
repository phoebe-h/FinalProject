import java.io.*;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.*;

public class Bear extends Character
{
    
    public Bear()
    {
        super("bear.jpg");
    }
    
    public Bear(int x, int y)
    {
        super("bear.jpg", x, y);
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
