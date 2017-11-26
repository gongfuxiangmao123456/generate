package com.zdjy.bigdata.common.split.impl;

import com.zdjy.bigdata.common.split.FieldSplit;
import com.zdjy.bigdata.common.symbol.Symbol;

public class TabSplit implements FieldSplit{
	private TabSplit() {
	}
	private static TabSplit tabSplit=new TabSplit();
	public static TabSplit getInstance=tabSplit;
	public String getSplit() {
		return Symbol.TAB;
	}
}
