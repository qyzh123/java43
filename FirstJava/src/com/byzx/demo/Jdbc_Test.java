package com.byzx.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_Test {

	public static void main(String[] args) throws SQLException {
		//1.����oracle���ݿ������
		ResultSet res=null;
		
		Statement sta=JdbcUtils.getStament();
		
		res=sta.executeQuery("select ename,sal from emp ");
			//6. ͨ��ѭ������ȡ���������֤
			while(res.next()){
				System.out.println("����:"+res.getString("ename")+"���ʣ�"+res.getDouble("sal"));
			}
			
		JdbcUtils.close_connect();
		
	}
}

