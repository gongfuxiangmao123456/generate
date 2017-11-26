package com.zdjy.bigdata.save.impl;

import java.io.File;
import java.util.List;

import com.zdjy.bigdata.common.util.FileUtil;
import com.zdjy.bigdata.save.Saver;

public class FileSaver implements Saver{
	private File file;
	public FileSaver(File file) {
		this.file=file;
	}
	@Override
	public void save(List<String> strings) {
		try {
			FileUtil.write(strings, file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
