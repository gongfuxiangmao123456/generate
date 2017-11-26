package com.zdjy.bigdata.common.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
	public static List<String> read(InputStream inputStream) throws Exception{
		List<String> strings=new ArrayList<>();
		BufferedReader reader=new BufferedReader(new InputStreamReader(inputStream));
		String tmp=null;
		while((tmp=reader.readLine())!=null) {
			strings.add(tmp);
		}
		reader.close();
		return strings;
	}
	public static List<String> read(File file) throws Exception{
		return read(new FileInputStream(file));
	}
	public static void write(List<String> strings,File file) throws Exception {
		BufferedWriter writer=new BufferedWriter(new FileWriter(file));
		int i=0;
		for(String string:strings) {
			writer.write(string);
			writer.newLine();
			i++;
			if(i%1000==0) {
				writer.flush();
			}
		}
		writer.flush();
		writer.close();
	}
}
