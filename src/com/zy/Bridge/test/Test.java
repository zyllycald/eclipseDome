package com.zy.Bridge.test;

import com.zy.Bridge.Abstraction.AbstractMessage;
import com.zy.Bridge.ConcreteImplementor.MessageEmail;
import com.zy.Bridge.ConcreteImplementor.MessageSMS;
import com.zy.Bridge.Implementor.MessageImplementor;
import com.zy.Bridge.RefineAbstraction.CommonMessage;
import com.zy.Bridge.RefineAbstraction.UrgencyMessage;

public class Test {
	public static void main (String[] args) {
		//创建具体的实现对象
        MessageImplementor implementor = new MessageSMS();
        //创建普通消息对象
        AbstractMessage abstractMessage = new CommonMessage(implementor);
        abstractMessage.sendMessage("加班申请速批", "boss");
        
        //将实现方式切换成邮件，再次发送
        implementor = new MessageEmail();
        //创建加急消息对象
        abstractMessage = new UrgencyMessage(implementor);
        abstractMessage.sendMessage("加班申请速批", "boss");
    }

}
