package com.zy.noBridgeOne.messageIn;

/**
 * 加急消息接口
 * 
 * @author zhouyu
 *
 */
public interface UrgencyMessage extends Message {
	/**
	 * 监控指定消息的处理过程
	 * 
	 * @param messageId
	 *            消息编号
	 * @return String 处理状态
	 */
	public String watch(String messageId);
}
