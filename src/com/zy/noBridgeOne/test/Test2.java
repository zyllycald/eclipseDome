package com.zy.noBridgeOne.test;

import com.zy.noBridgeOne.messageInImp.UrgencyMessageEmail;
import com.zy.noBridgeOne.messageInImp.UrgencyMessageSMS;

/**
 * ������2
 * 
 * @author zhouyu
 *
 */
public class Test2 {
	public static void main(String[] args) {
		// ����ϵͳ�ڼӼ�����Ϣ�����
		UrgencyMessageSMS urgencyMessageSMS = new UrgencyMessageSMS();
		urgencyMessageSMS.send("1", "zy");
		System.out.println(urgencyMessageSMS.watch("1"));

		// �����ʼ��Ӽ�����Ϣ�����
		UrgencyMessageEmail urgencyMessageEmail = new UrgencyMessageEmail();
		urgencyMessageEmail.send("2", "zy");
		System.out.println(urgencyMessageEmail.watch("2"));
	}
}
