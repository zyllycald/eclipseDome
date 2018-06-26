package com.zy.noBridgeOne.messageInImp;

import com.zy.noBridgeOne.messageIn.UrgencyMessage;

/**
 * �ʼ��Ӽ�����Ϣʾ����
 * 
 * @author zhouyu
 *
 */
public class UrgencyMessageEmail implements UrgencyMessage {

	@Override
	public void send(String message, String toUser) {
		message = "�Ӽ���" + message;
		System.out.println(String.format("ʹ���ʼ�����Ϣ�ķ�����������Ϣ %s �� %s", message, toUser));
	}

	@Override
	public String watch(String messageId) {
		String str = messageId + "���ʼ���Ϣ���ڴ�����";
		return str;

	}

}
