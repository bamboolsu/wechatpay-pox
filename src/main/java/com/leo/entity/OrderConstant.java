package com.leo.entity;

/**
 * @ClassName: OrderConstant
 * @Description: 订单接口地址
 * @author: leo
 * @date: 2016年4月2日 下午 
 */
public class OrderConstant {
	// 统一下单
	public static final String PLACEANORDER = "https://api.mch.weixin.qq.com/pay/unifiedorder";
	// 查询订单
	public static final String QUERYORDER = "https://api.mch.weixin.qq.com/pay/orderquery";

	public static Integer RESULT = 0;
}
