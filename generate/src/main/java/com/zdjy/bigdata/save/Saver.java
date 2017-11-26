package com.zdjy.bigdata.save;

import java.util.List;

public interface Saver {
	public default void before(List<String> strings) {
		System.out.println("save before...");
	};
	public default void run(List<String> strings) {
		before(strings);
		save(strings);
		end(strings);
	}
	public void save(List<String> strings);
	public default void end(List<String> strings) {
		System.out.println("save end...");
	};
}
