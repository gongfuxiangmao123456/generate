package com.zdjy.bigdata.common.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {

	
	public IUtil util=new IUtil();
	public Connection conn=null;
	public PreparedStatement pstm=null;
	public ResultSet rs=null;
	public Dao(String DBDRIVER,String DBURL,String DBUSER,String DBPASSWORD) {
		// TODO Auto-generated constructor stub
		this.conn=this.util.getConnection(DBDRIVER, DBURL, DBUSER, DBPASSWORD);
	}
}
