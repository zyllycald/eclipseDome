package com.zy.Bridge.RefineAbstraction;

import com.zy.Bridge.Abstraction.AbstractMessage;
import com.zy.Bridge.Implementor.MessageImplementor;

/**
 * 普通消息类
 * 
 * @author zhouyu
 *
 */
public class CommonMessage extends AbstractMessage {

	public CommonMessage(MessageImplementor messageImplementor) {
		super(messageImplementor);
	}

	@Override
	public void sendMessage(String message, String toUser) {
		// 对于普通消息，直接调用父类方法，发送消息即可
		super.sendMessage(message, toUser);
	}
}
