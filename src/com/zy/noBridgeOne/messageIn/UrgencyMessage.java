package com.zy.noBridgeOne.messageIn;

/**
 * �Ӽ���Ϣ�ӿ�
 * 
 * @author zhouyu
 *
 */
public interface UrgencyMessage extends Message {
	/**
	 * ���ָ����Ϣ�Ĵ������
	 * 
	 * @param messageId
	 *            ��Ϣ���
	 * @return String ����״̬
	 */
	public String watch(String messageId);
}
