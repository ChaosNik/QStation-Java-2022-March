package geometry;

import geometry.exceptions.TriangleException;

public class Triangle implements Polygon
{
	Point A, B, C;
	public Triangle(Point A, Point B, Point C) throws TriangleException
	{
		if(A.equals(B) || A.equals(C) || B.equals(C))
			throw new TriangleException("There are same points!");
		if(Point.colinear(A, B, C))
			throw new TriangleException("Points are colinear!");
		this.A = A;
		this.B = B;
		this.C = C;
	}
	@Override
	public double area()
	{
		return 0;
	}

	@Override
	public double circumference()
	{
		return 0;
	}
	
	@Override
	public boolean equals(Object o)
	{
		if (o == this)
	        return true;
	    if (!(o instanceof Triangle))
	        return false;
	    Triangle other = (Triangle)o;
	    if(!(A.equals(other.A)))
	    	return false;
	    if(!(B.equals(other.B)))
	    	return false;
	    if(!(C.equals(other.C)))
	    	return false;
	    return true;
	}
	
	@Override
	public String toString()
	{
		return "T(" + A + ", " + B + ", " + C + ")";
	}
}
