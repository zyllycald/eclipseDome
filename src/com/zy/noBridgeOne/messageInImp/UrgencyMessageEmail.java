package com.zy.noBridgeOne.messageInImp;

import com.zy.noBridgeOne.messageIn.UrgencyMessage;

/**
 * 邮件加急短消息示例类
 * 
 * @author zhouyu
 *
 */
public class UrgencyMessageEmail implements UrgencyMessage {

	@Override
	public void send(String message, String toUser) {
		message = "加急：" + message;
		System.out.println(String.format("使用邮件短消息的方法，发送消息 %s 给 %s", message, toUser));
	}

	@Override
	public String watch(String messageId) {
		String str = messageId + "号邮件消息正在处理中";
		return str;

	}

}
