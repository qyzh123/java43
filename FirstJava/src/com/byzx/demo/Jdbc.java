package com.byzx.demo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {

	public static void main(String[] args) throws ClassNotFoundException {
		//1.加载数据库驱动
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//2.连接数据库
		String url="jdbc:oracle:thin:@//localhost:1521/orcl";
		//3.通过用户名密码连接oracle数据库
		Connection conn=null;
		Statement sta=null;
		ResultSet res=null;
		
		try {
			conn=DriverManager.getConnection(url, "scott","622723");
			sta=conn.createStatement();
			//查询
			 res=sta.executeQuery("select sal,ename from emp ");
			 while(res.next()){
				 System.out.println(res.getString("ename")+"    "+res.getInt("sal"));
			 }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
