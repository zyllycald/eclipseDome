package com.zy.noBridgeOne.messageInImp;

import com.zy.noBridgeOne.messageIn.UrgencyMessage;

/**
 * 系统内加急短消息示例类
 * 
 * @author zhouyu
 *
 */
public class UrgencyMessageSMS implements UrgencyMessage {

	@Override
	public void send(String message, String toUser) {
		message = "加急：" + message;
		System.out.println(String.format("使用系统内部短消息的方法，发送消息 %s 给 %s", message, toUser));

	}

	@Override
	public String watch(String messageId) {
		String str = messageId + "号系统内部消息正在处理中";
		return str;
	}

}
