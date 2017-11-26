package com.zdjy.bigdata.generate.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.zdjy.bigdata.common.dome.DeoeFrom;
import com.zdjy.bigdata.common.surrond.impl.DoubleQuotationMarksSurrond;
import com.zdjy.bigdata.common.util.Circle;
import com.zdjy.bigdata.generate.Listto;
import com.zdjy.bigdata.generate.Mapto;
import com.zdjy.bigdata.generate.impl.Area;
import com.zdjy.bigdata.generate.impl.Area.AreaEnum;
import com.zdjy.bigdata.generate.impl.Chinese;
import com.zdjy.bigdata.generate.impl.ChineseName;
import com.zdjy.bigdata.generate.impl.Dome;
import com.zdjy.bigdata.generate.impl.From;
import com.zdjy.bigdata.generate.impl.Phone;
import com.zdjy.bigdata.generate.impl.Sex;

public class GenerateRandomTest {
	public static final String DBDRIVER = "com.mysql.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/dept";
	public static final String DBUSER = "root";
	public static final String DBPASSWORD = "root";

	@Test
	public void testChinese() {
		Chinese genareteChinese = new Chinese();
		Circle.circle(10, () -> {
			System.out.println(genareteChinese.generate());
		});
	}

	@Test
	public void testChineseName() {
		ChineseName generateChineseName = new ChineseName();
		Circle.circle(10, () -> {
			System.out.println(generateChineseName.generate());
		});
	}

	@Test
	public void testSex() {
		Sex generateSex = new Sex();
		Circle.circle(10, () -> {
			System.out.println(generateSex.generate(null));
		});
	}

	@Test
	public void testPhone() {
		Phone phone = new Phone(DoubleQuotationMarksSurrond.getInstance);
		Circle.circle(100, () -> {
			System.out.println(phone.generate());
		});
	}

	@Test
	public void testArea() {
		Area area = new Area(AreaEnum.PROVINCE_CITY_TOWN);
		Circle.circle(10, () -> {

			System.out.println(area.generaten());

		});
	}

	@Test
	public void testDome() {
		Sex generateSex = new Sex();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = Dome.randomDateBetweenMinAndMax(2017, 2, 1, 2017, 2, 26);
		String str = format.format(date);
		Area area = new Area(AreaEnum.PROVINCE_CITY_TOWN);
		String sex = generateSex.generate(null);
		String loc = area.generaten();
		System.out.println("地区：" + loc.substring(6));
		System.out.println("生日：" + str.substring(0, 4) + str.substring(5, 7) + str.substring(8));
		if ("M".equals(sex)) {
			System.out.println("性别：" + "男");
		} else {
			System.out.println("性别：" + "女");
		}

		System.out.println(loc.substring(0, 6) + str.substring(0, 4) + str.substring(5, 7) + str.substring(8)
				+ Dome.game(2) + Dome.gameSex(sex) + Dome.game(1));

	}

	@Test
	public void testdomefrom() throws Exception {
		From from = new From(DBDRIVER, DBURL, DBUSER, DBPASSWORD);
		List<String> list = new ArrayList<String>();
		list.add("qwer");
		list.add("asdf");
		list.add("zxcv");
		System.out.println(from.generate());
		System.out.println(from.generatelist(list));
	}

	@Test
	public void test() {
		Mapto<Integer, String>mapto=new Mapto<>(DBDRIVER, DBURL, DBUSER, DBPASSWORD);
		String str=mapto.generate("dept", "com", "deptno");
		System.out.println(str);
	}

}
