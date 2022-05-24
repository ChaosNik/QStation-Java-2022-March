package geometry.exceptions;

public class PointException extends GeometricException
{
	private static final long serialVersionUID = 1L;
	public PointException()
	{
		super("");
	}
	public PointException(String message)
	{
		super(message);
	}
}
