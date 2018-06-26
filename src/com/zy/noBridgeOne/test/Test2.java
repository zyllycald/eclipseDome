package com.zy.noBridgeOne.test;

import com.zy.noBridgeOne.messageInImp.UrgencyMessageEmail;
import com.zy.noBridgeOne.messageInImp.UrgencyMessageSMS;

/**
 * 测试类2
 * 
 * @author zhouyu
 *
 */
public class Test2 {
	public static void main(String[] args) {
		// 发送系统内加急短消息并监控
		UrgencyMessageSMS urgencyMessageSMS = new UrgencyMessageSMS();
		urgencyMessageSMS.send("1", "zy");
		System.out.println(urgencyMessageSMS.watch("1"));

		// 发送邮件加急短消息并监控
		UrgencyMessageEmail urgencyMessageEmail = new UrgencyMessageEmail();
		urgencyMessageEmail.send("2", "zy");
		System.out.println(urgencyMessageEmail.watch("2"));
	}
}
