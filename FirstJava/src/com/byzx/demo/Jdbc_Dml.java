package com.byzx.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_Dml {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//1.加载oracle数据库的驱动
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//2.连接数据库URL
		String url="jdbc:oracle:thin:@//localhost:1521/orcl";
		//3.通过用户名 密码 URl连接Oracle数据库
		Connection conn=null;
		Statement sta=null;
		try {
		conn=DriverManager.getConnection(url, "scott", "622723");
		//4. conn对象去创建操作sql语句的对象。
		sta=conn.createStatement();
		//5. 通过statement对象对数据库进行插入操作
		//5. 通过动态传参去执行不同的逻辑
		int stu_id=108;
		String name="SMITHES";
		int res=sta.executeUpdate("update student set sname='"+name+"' where sno="+stu_id);
		if(res>0){
		System.out.println("修改成功");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}finally{
					sta.close();
					conn.close();
					
			}
		}
	}
