package geometry;

import geometry.exceptions.LineException;

public class Line
{
	double m; // slope
	double n; // y-intercept
	
	Line(double m, double n)
	{
		this.m = m;
		this.n = n;
	}
	
	Line(Point A, Point B) throws LineException
	{
		if(A.equals(B))
			throw new LineException("Same points!");
		double x = Math.abs(A.x - B.x);
		double y = Math.abs(A.x - B.x);
		m = y / x;
		n = y - m * x;
	}
	
	public double getSlope()
	{
		return m;
	}
	
	public double f(double x)
	{
		return m * x + n;
	}
	
	public boolean pointIsLeft(Point point)
	{
		Point A = new Point(0, f(0));
		Point B = new Point(1, f(1));
		return ((B.x - A.x) * (point.y - A.y) - (B.y - A.y) * (point.x - A.x)) > 0;
	}
	
	@Override
	public boolean equals(Object o)
	{
		if (o == this)
	        return true;
	    if (!(o instanceof Line))
	        return false;
	    Line other = (Line)o;
	    if(m != other.m)
	    	return false;
	    if(n != other.n)
	    	return false;
	    return true;
	}
}
//nesto
//nesto trece by milica