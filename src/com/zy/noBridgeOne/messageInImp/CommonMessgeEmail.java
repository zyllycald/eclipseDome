package com.zy.noBridgeOne.messageInImp;

import com.zy.noBridgeOne.messageIn.Message;

/**
 * 邮件短消息示例类
 * 
 * @author zhouyu
 *
 */
public class CommonMessgeEmail implements Message {

	@Override
	public void send(String message, String toUser) {
		System.out.println(String.format("使用邮件短消息的方法，发送消息 %s 给 %s", message, toUser));
	}

}
