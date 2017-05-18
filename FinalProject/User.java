public class User
{
    private int points;
    
    public User()
    {
        points=0;
    }
    
    public int getPoints()
    {
        return points;
    }
    
    public void addPoint(int x)
    {
        points+=x;
    }
    
    public void setPoints(int x)
    {
        points=x;
    }
}