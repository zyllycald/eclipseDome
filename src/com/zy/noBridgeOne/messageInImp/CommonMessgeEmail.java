package com.zy.noBridgeOne.messageInImp;

import com.zy.noBridgeOne.messageIn.Message;

/**
 * �ʼ�����Ϣʾ����
 * 
 * @author zhouyu
 *
 */
public class CommonMessgeEmail implements Message {

	@Override
	public void send(String message, String toUser) {
		System.out.println(String.format("ʹ���ʼ�����Ϣ�ķ�����������Ϣ %s �� %s", message, toUser));
	}

}
