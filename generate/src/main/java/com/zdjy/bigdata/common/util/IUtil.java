package com.zdjy.bigdata.common.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class IUtil {

	
	public Connection getConnection(String DBDRIVER,String DBURL,String DBUSER,String DBPASSWORD){
		Connection conn=null;
		try {
			Class.forName(DBDRIVER);
			conn = DriverManager.getConnection(DBURL, DBUSER, DBPASSWORD);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
