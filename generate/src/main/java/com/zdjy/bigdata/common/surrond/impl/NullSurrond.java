package com.zdjy.bigdata.common.surrond.impl;

import com.zdjy.bigdata.common.surrond.FieldSurround;
import com.zdjy.bigdata.common.symbol.Symbol;

public class NullSurrond implements FieldSurround{
	private NullSurrond() {
	}
	private static NullSurrond nullSurrond=new NullSurrond();
	public static NullSurrond getInstance=nullSurrond;
	@Override
	public String[] getSurrond() {
		return new String[] {Symbol.NULL,Symbol.NULL};
	}
	
}
