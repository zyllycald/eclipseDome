package com.zy.Bridge.Implementor;

/**
 * ʵ����Ϣ���͵�ͳһ�ӿ�
 * 
 * @author zhouyu
 *
 */
public interface MessageImplementor {
	/**
	 * ������Ϣ�ķ���
	 * 
	 * @param message
	 *            ��Ϣ����
	 * @param toUser
	 *            ������
	 */
	public void send(String message, String toUser);
}
