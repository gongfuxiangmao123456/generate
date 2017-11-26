package com.zdjy.bigdata.common.surrond.impl;

import com.zdjy.bigdata.common.surrond.FieldSurround;
import com.zdjy.bigdata.common.symbol.Symbol;

public class DoubleQuotationMarksSurrond implements FieldSurround{
	private DoubleQuotationMarksSurrond() {
	}
	private static DoubleQuotationMarksSurrond doubleQuotationMarksSurrond=new DoubleQuotationMarksSurrond();
	public static DoubleQuotationMarksSurrond getInstance=doubleQuotationMarksSurrond;
	@Override
	public String[] getSurrond() {
		return new String[] {Symbol.DOUBLE_QUOTATION_MARKS,Symbol.DOUBLE_QUOTATION_MARKS};
	}
	
}
