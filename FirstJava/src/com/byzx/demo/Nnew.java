package com.byzx.demo;

public class Nnew {
/*������ȡֵ��Χ(�����ٽ�ֵ)��127-*/
	public static void main(String[] args) {

		Integer a=-129;
		Integer b=-129;
		Integer c=new Integer(128);
		int d=c.intValue();
		
		if(a==b){
			
			System.out.println("��ȣ�");
			
		}else{
			
			System.out.println("����ȣ�");
		
		}
		
		
		System.out.println(c-1);
				
	}
}