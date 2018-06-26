package com.zy.Bridge.ConcreteImplementor;

import com.zy.Bridge.Implementor.MessageImplementor;

/**
 * 邮件短消息的实现类
 * 
 * @author zhouyu
 *
 */
public class MessageEmail implements MessageImplementor {

	@Override
	public void send(String message, String toUser) {
		System.out.println(String.format("使用邮件短消息的方法，发送消息 %s 给 %s", message, toUser));

	}

}
