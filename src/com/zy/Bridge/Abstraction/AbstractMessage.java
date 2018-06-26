package com.zy.Bridge.Abstraction;

import com.zy.Bridge.Implementor.MessageImplementor;

/**
 * 抽象消息类
 * 
 * @author zhouyu
 *
 */
public abstract class AbstractMessage {
	// 实现消息发送的统一接口
	private MessageImplementor messageImplementor;

	/**
	 * 构造方法，传入实现部分的对象
	 * 
	 * @param messageImplementor
	 *            实现部分的对象
	 */
	public AbstractMessage(MessageImplementor messageImplementor) {
		this.messageImplementor = messageImplementor;
	}



	/**
	 * 发送消息，委派给实现部分的方法
	 * 
	 * @param message
	 *            要发送的消息
	 * @param toUser
	 *            接收人
	 */
	public void sendMessage(String message, String toUser) {
		this.messageImplementor.send(message, toUser);
	}

}
