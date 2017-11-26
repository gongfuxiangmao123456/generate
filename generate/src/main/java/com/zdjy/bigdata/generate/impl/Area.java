package com.zdjy.bigdata.generate.impl;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.zdjy.bigdata.common.split.FieldSplit;
import com.zdjy.bigdata.common.split.impl.CommaSplit;
import com.zdjy.bigdata.common.surrond.FieldSurround;
import com.zdjy.bigdata.common.surrond.impl.NullSurrond;
import com.zdjy.bigdata.common.util.FileUtil;
import com.zdjy.bigdata.generate.AbstractGenerater;

public class Area implements AbstractGenerater<String> {
	private AreaEnum areaEnum;
	private FieldSplit fieldSplit;
	private FieldSurround fieldSurround;
	private List<String> strings;

	public Area(AreaEnum areaEnum, FieldSplit fieldSplit, FieldSurround fieldSurround) {
		this.areaEnum = areaEnum;
		this.fieldSplit = fieldSplit;
		this.fieldSurround = fieldSurround;
	}

	public Area(AreaEnum areaEnum, FieldSplit fieldSplit) {
		this(areaEnum, fieldSplit, NullSurrond.getInstance);
	}

	public Area(AreaEnum areaEnum, FieldSurround fieldSurround) {
		this(areaEnum, CommaSplit.getInstance, fieldSurround);
	}

	public Area(AreaEnum areaEnum) {
		this(areaEnum, CommaSplit.getInstance, NullSurrond.getInstance);
	}

	public Area() {
		this(AreaEnum.PROVINCE_CITY_TOWN, CommaSplit.getInstance, NullSurrond.getInstance);
	}

	@Override
	public String generate() {
		parse();
		return strings.get(RANDOM.nextInt(strings.size()));
	}

	
	public String generaten(){
		parse1();
		return strings.get(RANDOM.nextInt(strings.size()));
		
	}
	
	public enum AreaEnum {
		PROVINCE_CITY_TOWN, PROVINCE_CITY, PROVINCE, CITY;
	}

	public void parse() {
		InputStream systemResourceAsStream = ClassLoader.getSystemResourceAsStream("area.txt");
		List<String> read = new ArrayList<>();
		try {
			read = FileUtil.read(systemResourceAsStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
		strings = new ArrayList<>();
		for (String string : read) {
			String[] split = string.split("\t");
			strings.add(fieldSurround.surrond(split[4])+"+++++++"+fieldSurround.surrond(split[5])+"***" +fieldSurround.surrond(split[0]) + fieldSplit.getSplit() + fieldSurround.surrond(split[1])
					+ fieldSplit.getSplit() + fieldSurround.surrond(split[2]) + fieldSplit.getSplit()
					+ fieldSurround.surrond(split[3]) + fieldSplit.getSplit() + fieldSurround.surrond(split[4])
					+ fieldSplit.getSplit() + fieldSurround.surrond(split[5]));
		}
	}
	
	public void parse1() {
		InputStream systemResourceAsStream = ClassLoader.getSystemResourceAsStream("area.txt");
		List<String> read = new ArrayList<>();
		try {
			read = FileUtil.read(systemResourceAsStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
		strings = new ArrayList<>();
		for (String string : read) {
			String[] split = string.split("\t");
			strings.add(fieldSurround.surrond(split[4])+fieldSurround.surrond(split[1])+fieldSplit.getSplit()+fieldSurround.surrond(split[3])+fieldSplit.getSplit()+fieldSurround.surrond(split[5]));
		}
	}
}
