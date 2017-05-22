import java.io.*;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.*;

public class Tree extends Character
{
    
    public Tree()
    {
        super("tree.jpg");
    }
    
    public Tree(int x, int y)
    {
        super("tree.jpg", x, y);
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
