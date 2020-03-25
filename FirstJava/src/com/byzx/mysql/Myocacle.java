package com.byzx.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Myocacle {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//1.加载驱动
		Class.forName("oracle.jdbc.driver.OracleDriver");
//2.通过Url地址访问连接数据库
		String url="jdbc:oracle:thin:@//localhost:1521/orac";	/*其中orac是需要连接的数据库名字*/
//3.通过用户名、密码登陆到数据库
		Connection conn=DriverManager.getConnection(url, "scott", "622723");
//4.创建一个statement对象并准备sql语句
		Statement sta=conn.createStatement();		
//通过statement的对象对数据库进行操作
//5.在java中对数据库进行增删改查操作
		//查
		ResultSet res=sta.executeQuery("select ename from emp where empno=7786 ");
		
		
	
	
	}

}
