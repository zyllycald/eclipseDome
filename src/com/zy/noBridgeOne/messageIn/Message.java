package com.zy.noBridgeOne.messageIn;

/**
 * 消息的统一接口
 * 
 * @author zhouyu
 *
 */
public interface Message {

	/**
	 * 发送消息的方法
	 * 
	 * @param message
	 *            发送内容
	 * @param toUser
	 *            接收人
	 */
	public void send(String message, String toUser);
}
