package com.zy.noBridgeOne.messageInImp;

import com.zy.noBridgeOne.messageIn.Message;

/**
 * ϵͳ�ڶ���Ϣʾ����
 * 
 * @author zhouyu
 *
 */
public class CommonMessageSMS implements Message {

	@Override
	public void send(String message, String toUser) {
		System.out.println(String.format("ʹ��ϵͳ�ڲ�����Ϣ�ķ�����������Ϣ %s �� %s", message, toUser));
	}

}
