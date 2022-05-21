package executable;

import geometry.Line;
import geometry.Point;
import geometry.Triangle;
import geometry.exceptions.LineException;
import geometry.exceptions.TriangleException;

public class Main
{
	public static void main(String[] args)
	{
		Point O = new Point();
		Point A = new Point(0, 0);
		Point B = new Point(0, 1);
		Point C = new Point(1, 0);
		Line AC = null;
		try
		{
			AC = new Line(A, C);
		}
		catch(LineException e)
		{
			System.out.println(e.getMessage());
		}
		Line line = new Line(0, 0);
		Triangle ABC = null;
		try
		{
			ABC = new Triangle(A, B, C);
		}
		catch(TriangleException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("AB = " + A.distanceTo(B));
		System.out.println("AC = " + Point.distance(A, C));
		if(Point.colinear(A, B, C))
			System.out.println("Points are colinear!");
		else
			System.out.println("Points are not colinear!");
		System.out.println("AC = " + Point.distance(A, C));
		if(A.equals(O))
			System.out.println("A is equal to O!");
		else
			System.out.println("A is not equal to O!");
		if(A.equals(B))
			System.out.println("A is equal to B!");
		else
			System.out.println("A is not equal to B!");
		System.out.println("Circumference of ABC is: " + ABC.circumference());
		System.out.println("Area of ABC is: " + ABC.area());
	}

}
