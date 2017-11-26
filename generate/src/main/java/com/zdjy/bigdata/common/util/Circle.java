package com.zdjy.bigdata.common.util;

public class Circle {
	public static void circle(int times,DoSomething doSomething) {
		for(int i=0;i<times;i++) {
			doSomething.doSomething();
		}
	}
	public interface DoSomething{
		public void doSomething();
	}
}
