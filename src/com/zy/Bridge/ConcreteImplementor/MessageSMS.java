package com.zy.Bridge.ConcreteImplementor;

import com.zy.Bridge.Implementor.MessageImplementor;

/**
 * ϵͳ�ڶ���Ϣ��ʵ����
 * 
 * @author zhouyu
 *
 */
public class MessageSMS implements MessageImplementor {

	@Override
	public void send(String message, String toUser) {
		System.out.println(String.format("ʹ��ϵͳ�ڲ�����Ϣ�ķ�����������Ϣ %s �� %s", message, toUser));

	}

}
