package geometry;

public class Point
{
	double x, y;
	public Point(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public Point()
	{
		this(0,0);
	}
  
	public static double distance(Point A, Point B)
	{
		double x = A.x - B.x;
		double y = A.y - B.y;
		return Math.sqrt(x * x + y * y);
	}
	
	public double distanceTo(Point other)
	{
		return distance(this, other);
	}
	
	public static boolean colinear(Point A, Point B, Point C)
	{
		return (A.x  * (B.y - C.y) + B.x * (A.y - C.y) + C.x * (A.y - B.y)) / 2 == 0;
	}
	
	public boolean equals(Object o)
	{
		if (o == this)
	        return true;
	    if (!(o instanceof Point))
	        return false;
	    Point other = (Point)o;
	    if(x != other.x)
	    	return false;
	    if(y != other.y)
	    	return false;
	    return true;
	}
	
	@Override
	public String toString()
	{
		return "P(" + x + ", " + y + ")";
	}
}
