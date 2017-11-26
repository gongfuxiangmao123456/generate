package com.zdjy.bigdata.common.split.impl;

import com.zdjy.bigdata.common.split.FieldSplit;
import com.zdjy.bigdata.common.symbol.Symbol;

public class CommaSplit implements FieldSplit{
	private CommaSplit() {
	}
	private static CommaSplit commaSplit=new CommaSplit();
	public static CommaSplit getInstance=commaSplit;
	public String getSplit() {
		return Symbol.COMMON;
	}
}
