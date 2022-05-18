package geometry.exceptions;

public class LineException extends GeometricException
{
	private static final long serialVersionUID = 1L;
	public LineException()
	{
		super("Line exception!");
	}
	public LineException(String message)
	{
		super(message);
	}
}
