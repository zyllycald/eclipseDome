package com.zy.Bridge.test;

import com.zy.Bridge.Abstraction.AbstractMessage;
import com.zy.Bridge.ConcreteImplementor.MessageEmail;
import com.zy.Bridge.ConcreteImplementor.MessageSMS;
import com.zy.Bridge.Implementor.MessageImplementor;
import com.zy.Bridge.RefineAbstraction.CommonMessage;
import com.zy.Bridge.RefineAbstraction.UrgencyMessage;

public class Test {
	public static void main (String[] args) {
		//���������ʵ�ֶ���
        MessageImplementor implementor = new MessageSMS();
        //������ͨ��Ϣ����
        AbstractMessage abstractMessage = new CommonMessage(implementor);
        abstractMessage.sendMessage("�Ӱ���������", "boss");
        
        //��ʵ�ַ�ʽ�л����ʼ����ٴη���
        implementor = new MessageEmail();
        //�����Ӽ���Ϣ����
        abstractMessage = new UrgencyMessage(implementor);
        abstractMessage.sendMessage("�Ӱ���������", "boss");
    }

}
