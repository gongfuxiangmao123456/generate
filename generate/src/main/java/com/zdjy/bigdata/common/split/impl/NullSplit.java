package com.zdjy.bigdata.common.split.impl;

import com.zdjy.bigdata.common.split.FieldSplit;
import com.zdjy.bigdata.common.symbol.Symbol;

public class NullSplit implements FieldSplit{
	private NullSplit() {
	}
	private static NullSplit nullSplit=new NullSplit();
	public static NullSplit getInstance=nullSplit;
	public String getSplit() {
		return Symbol.NULL;
	}
}
