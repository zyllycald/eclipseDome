package com.zy.Bridge.ConcreteImplementor;

import com.zy.Bridge.Implementor.MessageImplementor;

/**
 * 系统内短消息的实现类
 * 
 * @author zhouyu
 *
 */
public class MessageSMS implements MessageImplementor {

	@Override
	public void send(String message, String toUser) {
		System.out.println(String.format("使用系统内部短消息的方法，发送消息 %s 给 %s", message, toUser));

	}

}
