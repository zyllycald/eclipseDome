package com.zy.Bridge.Abstraction;

import com.zy.Bridge.Implementor.MessageImplementor;

/**
 * ������Ϣ��
 * 
 * @author zhouyu
 *
 */
public abstract class AbstractMessage {
	// ʵ����Ϣ���͵�ͳһ�ӿ�
	private MessageImplementor messageImplementor;

	/**
	 * ���췽��������ʵ�ֲ��ֵĶ���
	 * 
	 * @param messageImplementor
	 *            ʵ�ֲ��ֵĶ���
	 */
	public AbstractMessage(MessageImplementor messageImplementor) {
		this.messageImplementor = messageImplementor;
	}



	/**
	 * ������Ϣ��ί�ɸ�ʵ�ֲ��ֵķ���
	 * 
	 * @param message
	 *            Ҫ���͵���Ϣ
	 * @param toUser
	 *            ������
	 */
	public void sendMessage(String message, String toUser) {
		this.messageImplementor.send(message, toUser);
	}

}
