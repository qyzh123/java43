package com.byzx.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_Test {

	public static void main(String[] args) throws SQLException {
		//1.加载oracle数据库的驱动
		ResultSet res=null;
		
		Statement sta=JdbcUtils.getStament();
		
		res=sta.executeQuery("select ename,sal from emp ");
			//6. 通过循环遍历取出结果做验证
			while(res.next()){
				System.out.println("姓名:"+res.getString("ename")+"工资："+res.getDouble("sal"));
			}
			
		JdbcUtils.close_connect();
		
	}
}

