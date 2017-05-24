public class User
{
    private int points;
    
    //constructor initializes user's points to 0
    public User()
    {
        points=0;
    }
    
    //returns user's points
    public int getPoints()
    {
        return points;
    }
    
    //changes point value by adding positive or negative integers
    public void addPoint(int x)
    {
        points+=x;
    }
    
    //sets points to the given value
    public void setPoints(int x)
    {
        points=x;
    }
}