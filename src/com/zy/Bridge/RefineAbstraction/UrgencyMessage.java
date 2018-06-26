package com.zy.Bridge.RefineAbstraction;

import com.zy.Bridge.Abstraction.AbstractMessage;
import com.zy.Bridge.Implementor.MessageImplementor;

/**
 * 加急消息类
 * 
 * @author zhouyu
 *
 */
public class UrgencyMessage extends AbstractMessage {

	public UrgencyMessage(MessageImplementor messageImplementor) {
		super(messageImplementor);
	}

	@Override
	public void sendMessage(String message, String toUser) {
		//加急消息
		message = "加急：" + message;
		super.sendMessage(message, toUser);
	}

	/**
	 * 扩展它自己的功能，监控某个消息的处理状态
	 * 
	 * @param messageId
	 *            消息编码
	 * @return 监控到的消息的处理状态
	 */
	public String watch(String messageId) {
		String str = messageId + "号邮件消息正在处理中";
		return str;
	}
}
