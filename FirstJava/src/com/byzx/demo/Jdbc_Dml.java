package com.byzx.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_Dml {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//1.����oracle���ݿ������
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//2.�������ݿ�URL
		String url="jdbc:oracle:thin:@//localhost:1521/orcl";
		//3.ͨ���û��� ���� URl����Oracle���ݿ�
		Connection conn=null;
		Statement sta=null;
		try {
		conn=DriverManager.getConnection(url, "scott", "622723");
		//4. conn����ȥ��������sql���Ķ���
		sta=conn.createStatement();
		//5. ͨ��statement��������ݿ���в������
		//5. ͨ����̬����ȥִ�в�ͬ���߼�
		int stu_id=108;
		String name="SMITHES";
		int res=sta.executeUpdate("update student set sname='"+name+"' where sno="+stu_id);
		if(res>0){
		System.out.println("�޸ĳɹ�");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}finally{
					sta.close();
					conn.close();
					
			}
		}
	}
