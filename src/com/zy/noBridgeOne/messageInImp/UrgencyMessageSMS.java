package com.zy.noBridgeOne.messageInImp;

import com.zy.noBridgeOne.messageIn.UrgencyMessage;

/**
 * ϵͳ�ڼӼ�����Ϣʾ����
 * 
 * @author zhouyu
 *
 */
public class UrgencyMessageSMS implements UrgencyMessage {

	@Override
	public void send(String message, String toUser) {
		message = "�Ӽ���" + message;
		System.out.println(String.format("ʹ��ϵͳ�ڲ�����Ϣ�ķ�����������Ϣ %s �� %s", message, toUser));

	}

	@Override
	public String watch(String messageId) {
		String str = messageId + "��ϵͳ�ڲ���Ϣ���ڴ�����";
		return str;
	}

}
