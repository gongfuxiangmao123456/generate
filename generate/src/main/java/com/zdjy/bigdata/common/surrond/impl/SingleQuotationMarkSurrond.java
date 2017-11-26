package com.zdjy.bigdata.common.surrond.impl;

import com.zdjy.bigdata.common.surrond.FieldSurround;
import com.zdjy.bigdata.common.symbol.Symbol;

public class SingleQuotationMarkSurrond implements FieldSurround{
	private SingleQuotationMarkSurrond() {
	}
	private static SingleQuotationMarkSurrond singleQuotationMarkSurrond=new SingleQuotationMarkSurrond();
	public static SingleQuotationMarkSurrond getInstance=singleQuotationMarkSurrond;
	@Override
	public String[] getSurrond() {
		return new String[] {Symbol.SINGLE_QUOTATION_MARK,Symbol.SINGLE_QUOTATION_MARK};
	}
	
}
