package top.wuyouteam.register.ex;
/**
 * 如果调用参数时提供的参数为null或为空将会抛出该异常
 * @author format
 * @version JDK_1.8.0_221
 *
 */
public class ParamIsNullExcepiton extends BaseException {

	
	private static final long serialVersionUID = -1202850063822753145L;

	public ParamIsNullExcepiton() {
		super();
		//  Auto-generated constructor stub
	}

	public ParamIsNullExcepiton(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		//  Auto-generated constructor stub
	}

	public ParamIsNullExcepiton(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ParamIsNullExcepiton(String message) {
		super(message);
		//  Auto-generated constructor stub
	}

	public ParamIsNullExcepiton(Throwable cause) {
		super(cause);
		//  Auto-generated constructor stub
	}

}
