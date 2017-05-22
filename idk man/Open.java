import java.io.*;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.*;

public class Open extends Character
{
   
    
    public Open()
    {
       super("openscreen.jpg");
    }

    public Open(int x, int y)
    {
        super("openscreen.jpg", x, y);
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
