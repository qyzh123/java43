package com.byzx.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class First {
	//java�ܸ�ϰ
	/**
	 * ��һ�ڣ��˴������������(byte,short,int,long,float,double,char,boolean)��
	 * ���������֣�goto,const),�ؼ��ֲ�����������������
	 * 
	 * �ڶ��ڣ������ж���䣺if��if else,switch case
	 * 
	 * �����ڣ�ѭ����䣺while,do while,for,for each
	 * 
	 * ���Ľڣ����飺
	 * 1.���巽ʽ��int []a;a=new int[���鳤��];
	 * �����String���������������ͣ�
	 * ��������ð��������Ϥ��ά���飻
	 * 
	 * ����ڣ��ַ��������������ص㣩
	 * 1.�ַ�����������ʽ��String a="";				String a=new String("");
	 * 
	 * �����ַ����ĳ��ȣ�.length();
	 * 
	 * �Ƚ��ַ����Ƿ���ȣ�== �� ,equals();
	 * 
	 * �ַ�����Сдת����toUpperCase;   toLowerCase;
	 * 
	 * �ַ�����ƴ�ӣ�+��.concat();
	 * 
	 * �ַ������иsplit����	�÷������ַ���ͨ��split����С������Ĳ����ָ�������ַ�
	 * �����͵�����
	 * 
	 * ȥ���ַ���ǰ��ո�.trim();
	 * 
	 * ͨ���±���ȡ�����ַ���.charAt();
	 * 
	 * ��ȡ�ַ��Σ�subString(a,b);a,bΪ����int�������֣���ʾ��a��ʼ��b��������ֻ��һ��
	 * ���������ʾ��a��ʼ��������
	 * 
	 * StringBuffer:String�ļ�ǿ�棬����������������append��ʾ����������ַ�����insert
	 * ��ʾ��ָ����λ�ü��ַ�����Ҳ�Ǹ��������
	 * StringBuilder ��StringBuffer ����ʹ�÷�ʽһ��������StringBuffer��StringBuilder
	 * 
	 * ����ڣ���װ��
	 * 
	 * 1.�˴�����������͵İ�װ�ࣺ
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
		
		//StringBuffer a=new StringBuffer("��������˵����");
		
	//	a.insert(a.length(), "    ��ȡ����һƬ");
		
		//System.out.println(a);
		
		//��֤StringBuilder��StringBuffer���п�
		
		long beginf=System.currentTimeMillis();
		
		for(int i=0;i<100000;i++){
			
			StringBuffer ab=new StringBuffer("xasxcsa");
			
			
		}
		
		long finishf=System.currentTimeMillis();
		System.out.println("buffer��ʱ��"+(finishf-beginf));
		
		
		
		
		long beginl=System.currentTimeMillis();
		
		for(int i=0;i<100000;i++){
		StringBuilder al=new StringBuilder("xasxcsa");
	
		}
		
		long finishl=System.currentTimeMillis();
		
		System.out.println("builder��ʱ��"+(finishl-beginl));
		
		//System.out.println(a.concat("    ��ȡ����һƬ"));
		
		/*String b=new String(a.concat("    ��ȡ����һƬ"));
		
		
		String c=new String("123456789");
				
		String[]d=c.split(",");
		
		System.out.println(c.substring(0,6));
		
		System.out.println(c.charAt(6));
		
		for(String e:d){
			e=e.trim();
			System.out.println(e);
			
		StringBuffer sa=new StringBuffer("�������");
		
		System.out.println(sa.substring(2));
		*/
		}
		
		
		
		
	}

