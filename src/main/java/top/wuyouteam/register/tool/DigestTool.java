package top.wuyouteam.register.tool;

import org.apache.commons.codec.digest.DigestUtils;

import top.wuyouteam.register.ex.ParamIsNullExcepiton;
/**
 * 此类为本项目的工具类，封装了常用的消息摘要算法<br>
 * 类是final的，不希望被继承，构造器是私有的，不希望被new对象
 * @author format
 *
 */
public final class DigestTool {
	private static final String MESSAGE ="您调用的参数必须提供非null非空串的参数！";
	
	/**
	 * 此方法用于生成MD5值<br>
	 * 参数为要处理的字符串<br>
	 * 如果传入的字符串为空或为null将会抛出ParamIsNullExcepiton
	 * @param text 要处理的字符串
	 * @return MD5值
	 * @throws top.wuyouteam.register.ex.ParamIsNullExcepiton 当调用方法时传入的参数为空串或为null将会抛出该异常
	 */
	public static String MD5Hex(String text) {
		boolean b = isNull(text);
		if (b == true) {
			throw new ParamIsNullExcepiton(MESSAGE);
		} else {
			return DigestUtils.md5Hex(text);
		}
	}
	
	/**
	 * 此方法用于生成字母大写的MD5值<br>
	 * 参数为要处理的字符串<br>
	 * 如果传入的参数为null或者空字符串将会抛出ParamIsNullExcepiton
	 * @param text 要处理的字符串
	 * @return 字母大写的MD5值
	 * @throws top.wuyouteam.register.ex.ParamIsNullExcepiton 当传入的字符串为空或为null将会抛出该异常
	 */
	public static String MD5HexUpperCase(String text) {
		boolean b = isNull(text);
		if (b == true) {
			throw new ParamIsNullExcepiton(MESSAGE);
		} else {
			return DigestUtils.md5Hex(text).toUpperCase();
		}
	}
	
	/**
	 * 此方法用于生成SHA1值<br>
	 * 参数为要处理的字符串<br>
	 * 如果传入的参数为null或者空字符串将会抛出ParamIsNullExcepiton
	 * @param text 要处理的字符串
	 * @return SHA1值
	 * @throws top.wuyouteam.register.ex.ParamIsNullExcepiton 当传入的参数为null或空串将会抛出该异常
	 */
	public static String SHA1Hex(String text) {
		boolean b = isNull(text);
		if (b == true) {
			throw new ParamIsNullExcepiton(MESSAGE);
		} else {
			return DigestUtils.sha1Hex(text);
		}
	}
	
	/**
	 *  此方法用于简化本类的判断<br>
	 * 参数为要处理的字符串，如果传入的参数为null或者空字符串将会返回true,否则返回flase 
	 * @param text 要判断的字符串
	 * @return 判断结果布尔值
	 */
	private static boolean isNull(String text) {
		if ("" .equals(text) || text == null ) {
			return true;

		} else {
			return false;
		}
	}
	/**
	 * 私有的构造器
	 */
	private DigestTool() {
		super();
		//  Auto-generated constructor stub
	}

}
