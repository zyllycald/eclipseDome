package com.zy.noBridgeOne.test;

import com.zy.noBridgeOne.messageInImp.CommonMessageSMS;
import com.zy.noBridgeOne.messageInImp.CommonMessgeEmail;

/**
 * ������
 * 
 * @author zhouyu
 *
 */
public class Test {
	public static void main(String[] args) {
		// ����ϵͳ�ڶ���Ϣ
		CommonMessageSMS commonMessageSMS = new CommonMessageSMS();
		commonMessageSMS.send("ϵͳ����Ϣ", "zy");

		// �����ʼ���Ϣ
		CommonMessgeEmail commonMessgeEmail = new CommonMessgeEmail();
		commonMessgeEmail.send("�ʼ���Ϣ", "zy");
	}
}
