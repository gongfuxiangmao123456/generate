package com.zdjy.bigdata.generate.impl;

import java.io.UnsupportedEncodingException;

import com.zdjy.bigdata.generate.AbstractGenerater;

/**
 * 生成随机汉字
 * 
 * 原理是从汉字区位码找到汉字。在汉字区位码中分高位与底位， 且其中简体又有繁体。位数越前生成的汉字繁体的机率越大。
 * 所以在本例中高位从171取，底位从161取， 去掉大部分的繁体和生僻字。但仍然会有！！
 * @author david
 * @create 2017年11月19日 上午11:35:52
 */
public class Chinese implements AbstractGenerater<String> {

	@Override
	public String generate() {
		// return (char) (0x4e00 + (int) (Math.random() * (0x9fa5 - 0x4e00 + 1)));
		int hightPos, lowPos; // 定义高低位
		hightPos = (176 + Math.abs(RANDOM.nextInt(39)));// 获取高位值
		lowPos = (161 + Math.abs(RANDOM.nextInt(93)));// 获取低位值
		byte[] b = new byte[2];
		b[0] = (new Integer(hightPos).byteValue());
		b[1] = (new Integer(lowPos).byteValue());
		try {
			return new String(b, "GBK");//转成中文
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} // 转成中文
		return null;
	}

}
