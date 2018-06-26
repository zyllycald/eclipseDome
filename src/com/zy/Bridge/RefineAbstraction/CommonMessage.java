package com.zy.Bridge.RefineAbstraction;

import com.zy.Bridge.Abstraction.AbstractMessage;
import com.zy.Bridge.Implementor.MessageImplementor;

/**
 * ��ͨ��Ϣ��
 * 
 * @author zhouyu
 *
 */
public class CommonMessage extends AbstractMessage {

	public CommonMessage(MessageImplementor messageImplementor) {
		super(messageImplementor);
	}

	@Override
	public void sendMessage(String message, String toUser) {
		// ������ͨ��Ϣ��ֱ�ӵ��ø��෽����������Ϣ����
		super.sendMessage(message, toUser);
	}
}
