package com.byzx.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class First {
	//java总复习
	/**
	 * 第一节，八大基本数据类型(byte,short,int,long,float,double,char,boolean)，
	 * 两个保留字（goto,const),关键字不能作对象名，类名
	 * 
	 * 第二节，条件判断语句：if，if else,switch case
	 * 
	 * 第三节，循环语句：while,do while,for,for each
	 * 
	 * 第四节，数组：
	 * 1.定义方式：int []a;a=new int[数组长度];
	 * 数组和String都是引用数据类型；
	 * 熟练运用冒泡排序，熟悉二维数组；
	 * 
	 * 第五节，字符串！！！！（重点）
	 * 1.字符串的声明方式：String a="";				String a=new String("");
	 * 
	 * 计算字符串的长度：.length();
	 * 
	 * 比较字符串是否相等：== 或 ,equals();
	 * 
	 * 字符串大小写转化：toUpperCase;   toLowerCase;
	 * 
	 * 字符串的拼接：+或.concat();
	 * 
	 * 字符串的切割：split（）	用法：将字符串通过split（）小括号里的参数分割成若干字符
	 * 串类型的数组
	 * 
	 * 去掉字符串前后空格：.trim();
	 * 
	 * 通过下标提取单个字符：.charAt();
	 * 
	 * 截取字符段：subString(a,b);a,b为两个int类型数字，表示从a开始到b结束，若只有一个
	 * 参数，则表示从a开始到结束。
	 * 
	 * StringBuffer:String的加强版，其中有两个方法：append表示给对象本身加字符串；insert
	 * 表示给指定的位置加字符串，也是给对象本身加
	 * StringBuilder 与StringBuffer 大致使用方式一样，但是StringBuffer比StringBuilder
	 * 
	 * 第五节：包装类
	 * 
	 * 1.八大基本数据类型的包装类：
	 * int--Integer;byte--Byte;short--Short;long--Long;double--Double;float--Float;
	 * char--Character;boolean--Boolean;
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */

	
	
	public static void main(String[] args){
		
		//StringBuffer a=new StringBuffer("稻花香里说丰年");
		
	//	a.insert(a.length(), "    听取蛙声一片");
		
		//System.out.println(a);
		
		//验证StringBuilder比StringBuffer运行快
		
		long beginf=System.currentTimeMillis();
		
		for(int i=0;i<100000;i++){
			
			StringBuffer ab=new StringBuffer("xasxcsa");
			
			
		}
		
		long finishf=System.currentTimeMillis();
		System.out.println("buffer用时："+(finishf-beginf));
		
		
		
		
		long beginl=System.currentTimeMillis();
		
		for(int i=0;i<100000;i++){
		StringBuilder al=new StringBuilder("xasxcsa");
	
		}
		
		long finishl=System.currentTimeMillis();
		
		System.out.println("builder用时："+(finishl-beginl));
		
		//System.out.println(a.concat("    听取蛙声一片"));
		
		/*String b=new String(a.concat("    听取蛙声一片"));
		
		
		String c=new String("123456789");
				
		String[]d=c.split(",");
		
		System.out.println(c.substring(0,6));
		
		System.out.println(c.charAt(6));
		
		for(String e:d){
			e=e.trim();
			System.out.println(e);
			
		StringBuffer sa=new StringBuffer("金戈铁马");
		
		System.out.println(sa.substring(2));
		*/
		}
		
		
		
		
	}

