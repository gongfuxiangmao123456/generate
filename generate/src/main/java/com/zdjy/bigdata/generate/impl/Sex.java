package com.zdjy.bigdata.generate.impl;

import java.util.ArrayList;
import java.util.List;

import com.zdjy.bigdata.common.surrond.FieldSurround;
import com.zdjy.bigdata.common.surrond.impl.NullSurrond;
import com.zdjy.bigdata.generate.AbstractGenerater;
import com.zdjy.bigdata.generate.Listto;

public class Sex extends Listto<String>{
	
	public String generate(List<String> t) {
		// TODO Auto-generated method stub
		t=null;
		t=new ArrayList<String>();
		t.add("M");
		t.add("F");
		String temp;
		
		try {
		
		 temp=t.get(RANDOM.nextInt(t.size()));	
		 return temp;
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
