package com.zdjy.bigdata.common.split.impl;

import com.zdjy.bigdata.common.split.FieldSplit;
import com.zdjy.bigdata.common.symbol.Symbol;

public class SpaceSplit implements FieldSplit{
	private SpaceSplit() {
	}
	private static SpaceSplit spaceSplit=new SpaceSplit();
	public static SpaceSplit getInstance=spaceSplit;
	public String getSplit() {
		return Symbol.SPACE;
	}
}
