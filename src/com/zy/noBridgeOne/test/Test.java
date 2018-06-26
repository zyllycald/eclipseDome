package com.zy.noBridgeOne.test;

import com.zy.noBridgeOne.messageInImp.CommonMessageSMS;
import com.zy.noBridgeOne.messageInImp.CommonMessgeEmail;

/**
 * 测试类
 * 
 * @author zhouyu
 *
 */
public class Test {
	public static void main(String[] args) {
		// 发送系统内短消息
		CommonMessageSMS commonMessageSMS = new CommonMessageSMS();
		commonMessageSMS.send("系统短消息", "zy");

		// 发送邮件消息
		CommonMessgeEmail commonMessgeEmail = new CommonMessgeEmail();
		commonMessgeEmail.send("邮件消息", "zy");
	}
}
