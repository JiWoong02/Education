package my.exception;

public class NotDivideZeroException extends Exception{
	public NotDivideZeroException() {}
	
	public NotDivideZeroException(String message) {
		super(message);
	}
}
