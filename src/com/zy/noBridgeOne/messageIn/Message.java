package com.zy.noBridgeOne.messageIn;

/**
 * ��Ϣ��ͳһ�ӿ�
 * 
 * @author zhouyu
 *
 */
public interface Message {

	/**
	 * ������Ϣ�ķ���
	 * 
	 * @param message
	 *            ��������
	 * @param toUser
	 *            ������
	 */
	public void send(String message, String toUser);
}
