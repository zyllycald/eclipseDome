package com.zy.noBridgeOne.messageInImp;

import com.zy.noBridgeOne.messageIn.Message;

/**
 * 系统内短消息示例类
 * 
 * @author zhouyu
 *
 */
public class CommonMessageSMS implements Message {

	@Override
	public void send(String message, String toUser) {
		System.out.println(String.format("使用系统内部短消息的方法，发送消息 %s 给 %s", message, toUser));
	}

}
