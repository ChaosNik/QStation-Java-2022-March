package geometry.exceptions;

public class TriangleException extends GeometricException
{
	private static final long serialVersionUID = 1L;
	public TriangleException()
	{
		super("Triangle exception!");
	}
	public TriangleException(String message)
	{
		super(message);
	}
}
