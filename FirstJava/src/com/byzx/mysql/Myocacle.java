package com.byzx.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Myocacle {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//1.��������
		Class.forName("oracle.jdbc.driver.OracleDriver");
//2.ͨ��Url��ַ�����������ݿ�
		String url="jdbc:oracle:thin:@//localhost:1521/orac";	/*����orac����Ҫ���ӵ����ݿ�����*/
//3.ͨ���û����������½�����ݿ�
		Connection conn=DriverManager.getConnection(url, "scott", "622723");
//4.����һ��statement����׼��sql���
		Statement sta=conn.createStatement();		
//ͨ��statement�Ķ�������ݿ���в���
//5.��java�ж����ݿ������ɾ�Ĳ����
		//��
		ResultSet res=sta.executeQuery("select ename from emp where empno=7786 ");
		
		
	
	
	}

}
