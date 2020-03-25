package com.byzx.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtils {
	
	static String url=null;
	static Connection conn=null;
	static Statement sta=null;
	//连接数据库
	static{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			url="jdbc:oracle:thin:@//localhost:1521/orcl" ;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	//登陆数据库
	public static Statement getStament() throws SQLException{
		conn=DriverManager.getConnection(url, "scott", "622723");
		sta= conn.createStatement();	
		return sta;
	}
	
	//关流
	public static void close_connect(){		
		try {
			sta.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
