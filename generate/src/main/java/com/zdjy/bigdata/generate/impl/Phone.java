package com.zdjy.bigdata.generate.impl;

import java.text.DecimalFormat;

import com.zdjy.bigdata.common.surrond.FieldSurround;
import com.zdjy.bigdata.common.surrond.impl.NullSurrond;
import com.zdjy.bigdata.generate.AbstractGenerater;

/**
 * 随机手机号生成器
 * @author david
 * @create 2017年11月19日 下午10:34:19
 */
public class Phone implements AbstractGenerater<String>{
	String[] telFirst="134,135,136,137,138,139,150,151,152,157,158,159,130,131,132,155,156,133,153".split(",");
	private FieldSurround fieldSurround;
	public Phone() {
		this(NullSurrond.getInstance);
	}
	public Phone(FieldSurround fieldSurround){
		this.fieldSurround=fieldSurround;
	}
	private DecimalFormat format=new DecimalFormat("00000000");
	@Override
	public String generate() {
		String phone=telFirst[RANDOM.nextInt(telFirst.length)]+format.format(RANDOM.nextInt(100000000));
		return fieldSurround.surrond(phone);
	}
}
