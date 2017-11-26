package com.zdjy.bigdata.common.surrond;

public interface FieldSurround {
	String[] getSurrond();
	default String surrond(String string) {
		return getSurrond()[0]+string+getSurrond()[1];
	};
}
