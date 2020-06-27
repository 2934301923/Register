package top.wuyouteam.register.ex;
/**
 * 此异常为所有异常的基类，一般，不直接向外抛出该异常
 * @author format
 * @version JDK_1.8.0_221
 *
 */
public class BaseException extends RuntimeException {


	private static final long serialVersionUID = -5420906047135031774L;

	public BaseException() {
		super();
		//  Auto-generated constructor stub
	}

	public BaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public BaseException(String message, Throwable cause) {
		super(message, cause);
		//  Auto-generated constructor stub
	}

	public BaseException(String message) {
		super(message);
		//  Auto-generated constructor stub
	}

	public BaseException(Throwable cause) {
		super(cause);
		//  Auto-generated constructor stub
	}

}
