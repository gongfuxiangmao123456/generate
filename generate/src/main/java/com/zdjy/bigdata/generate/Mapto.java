package com.zdjy.bigdata.generate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.zdjy.bigdata.common.util.Dao;

public class Mapto<K,T> extends Dao{

public Mapto(String DBDRIVER, String DBURL, String DBUSER, String DBPASSWORD) {
		super(DBDRIVER, DBURL, DBUSER, DBPASSWORD);
		// TODO Auto-generated constructor stub
	}

public	Random RANDOM=new Random();
	
	
public String generate(String table,String from,String no) {
	// TODO Auto-generated method stub
	T temp;
	Map<K,T>map ;
	K key;
	try {
		map = this.dome(table,from,no);
		List<K>list= this.generate2(table, no);
		key=list.get(RANDOM.nextInt(list.size()));
		temp= map.get(key);
	
		
	
	 return key.toString()+temp.toString();
		
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return "null";

}



public List<K> generate2(String table,String no) {
	// TODO Auto-generated method stub
	K temp;
	List<K> list;
	try {
		list = this.dome2(table, no);
		
	
	 return list;
		
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return null;
}

public Map<K,T> dome(String table,String from,String no) throws Exception {
	// TODO Auto-generated method stub
	
	String sql="select "+from+","+no+" from "+table;
	super.pstm=super.conn.prepareStatement(sql);
	Map<K,T>map=new HashMap<K,T>();
	super.rs=super.pstm.executeQuery();
	while (rs.next()) {
		
		map.put((K)rs.getObject(2),(T) rs.getObject(1));
	}
	return map;
}

public List<K> dome2(String table,String from) throws Exception {
	// TODO Auto-generated method stub
	String sql="select "+from+" from "+table;
	super.pstm=super.conn.prepareStatement(sql);
	List<K>list=new ArrayList<K>();
	super.rs=super.pstm.executeQuery();
	while (rs.next()) {
		K str=(K) rs.getObject(1);
		list.add(str);
	}
	return list;
}

	
}
