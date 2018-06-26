package com.zy.Bridge.Implementor;

/**
 * 实现消息发送的统一接口
 * 
 * @author zhouyu
 *
 */
public interface MessageImplementor {
	/**
	 * 发送消息的方法
	 * 
	 * @param message
	 *            消息内容
	 * @param toUser
	 *            接收人
	 */
	public void send(String message, String toUser);
}
