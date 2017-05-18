import java.io.*;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.*;

public class GookDu extends Character
{
    
    public GookDu()
    {
        super("gookducrop.jpg");
    }
    
    public GookDu(int x, int y)
    {
        super("gookducrop.jpg", x, y);
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
    
    public void jump (Graphics page, int x, int y)
    {
        xo=x;
        yo=y;
        this.draw(page);
        super.move(x, y-60);
        this.draw(page);
        super.move(x+60, y-60);
        this.draw(page);
        super.move(x+60, y);
        this.draw(page);
        
    }
    
}
