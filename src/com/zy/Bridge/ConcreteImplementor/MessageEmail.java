package com.zy.Bridge.ConcreteImplementor;

import com.zy.Bridge.Implementor.MessageImplementor;

/**
 * �ʼ�����Ϣ��ʵ����
 * 
 * @author zhouyu
 *
 */
public class MessageEmail implements MessageImplementor {

	@Override
	public void send(String message, String toUser) {
		System.out.println(String.format("ʹ���ʼ�����Ϣ�ķ�����������Ϣ %s �� %s", message, toUser));

	}

}
