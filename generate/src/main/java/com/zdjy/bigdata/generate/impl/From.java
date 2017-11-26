package com.zdjy.bigdata.generate.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.zdjy.bigdata.common.dome.DeoeFrom;
import com.zdjy.bigdata.common.util.Dao;
import com.zdjy.bigdata.generate.AbstractGenerater;

public class From  extends Dao implements AbstractGenerater<String>{
	
	
	
	


	public From(String DBDRIVER, String DBURL, String DBUSER, String DBPASSWORD) {
		super(DBDRIVER, DBURL, DBUSER, DBPASSWORD);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String generate() {
		// TODO Auto-generated method stub
		String temp;
		List<String> list;
		try {
			list = this.dome("dept", "com");
			String []from=new String[list.size()];
		for (int i = 0; i < from.length-1; i++) {
			from[i]=list.get(i+1);
		}
			
		 temp=from[RANDOM.nextInt(from.length)];	
		 return temp;
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "错误";
	}

	
	public String generatelist(List<String> list){
		
		String temp;
		
		try {
			
			String []from=new String[list.size()];
		for (int i = 0; i < from.length-1; i++) {
			from[i]=list.get(i+1);
		}
			
		 temp=from[RANDOM.nextInt(from.length)];	
		 return temp;
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "错误";
		
	}
	public List<String> dome(String table,String from) throws Exception {
		// TODO Auto-generated method stub
		String sql="select "+from+" from "+table;
		super.pstm=super.conn.prepareStatement(sql);
		List<String>list=new ArrayList<String>();
		super.rs=super.pstm.executeQuery();
		while (rs.next()) {
			String str=rs.getString(1);
			list.add(str);
		}
		return list;
	}


	
}
