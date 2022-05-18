package geometry.exceptions;

public class GeometricException extends Exception
{
	private static final long serialVersionUID = 1L;
	public GeometricException()
	{
		super("Geometric exception!!!");
	}
	public GeometricException(String message)
	{
		super(message);
	}
}
