package com.zdjy.bigdata.common.split.impl;

import com.zdjy.bigdata.common.split.FieldSplit;
import com.zdjy.bigdata.common.symbol.Symbol;

public class SemicolonSplit implements FieldSplit{
	private SemicolonSplit() {
	}
	private static SemicolonSplit semicolonSplit=new SemicolonSplit();
	public static SemicolonSplit getInstance=semicolonSplit;
	public String getSplit() {
		return Symbol.SEMICOLON;
	}
}
