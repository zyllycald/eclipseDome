package com.zy.Bridge.RefineAbstraction;

import com.zy.Bridge.Abstraction.AbstractMessage;
import com.zy.Bridge.Implementor.MessageImplementor;

/**
 * �Ӽ���Ϣ��
 * 
 * @author zhouyu
 *
 */
public class UrgencyMessage extends AbstractMessage {

	public UrgencyMessage(MessageImplementor messageImplementor) {
		super(messageImplementor);
	}

	@Override
	public void sendMessage(String message, String toUser) {
		//�Ӽ���Ϣ
		message = "�Ӽ���" + message;
		super.sendMessage(message, toUser);
	}

	/**
	 * ��չ���Լ��Ĺ��ܣ����ĳ����Ϣ�Ĵ���״̬
	 * 
	 * @param messageId
	 *            ��Ϣ����
	 * @return ��ص�����Ϣ�Ĵ���״̬
	 */
	public String watch(String messageId) {
		String str = messageId + "���ʼ���Ϣ���ڴ�����";
		return str;
	}
}
