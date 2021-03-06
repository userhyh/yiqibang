package cn.uc.yiqibang.utils;

/**
 * 结果集的工具类
 * 该对象是请求的统一响应对象，会将其转化为json格式的字符串给客户端
 * @author ucai
 *
 */
public class Result {
   
	/**
	 * 响应码
	 */
	private int retCode;
	/**
	 * 响应结果信息-true/false
	 */
	private boolean retMsg;
	/**
	 * 响应数据
	 */
	private Object retData;
	
	
	
	public int getRetCode() {
		return retCode;
	}
	public void setRetCode(int retCode) {
		this.retCode = retCode;
	}
	public boolean isRetMsg() {
		return retMsg;
	}
	public void setRetMsg(boolean retMsg) {
		this.retMsg = retMsg;
	}
	public Object getRetData() {
		return retData;
	}
	public void setRetData(Object retData) {
		this.retData = retData;
	}
	@Override
	public String toString() {
		return "Result [retCode=" + retCode + ", retMsg=" + retMsg + ", retData=" + retData + "]";
	}
	
	
}
