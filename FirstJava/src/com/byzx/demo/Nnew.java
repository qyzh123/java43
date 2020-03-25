package com.byzx.demo;

public class Nnew {
/*常量池取值范围(包含临界值)：127-*/
	public static void main(String[] args) {

		Integer a=-129;
		Integer b=-129;
		Integer c=new Integer(128);
		int d=c.intValue();
		
		if(a==b){
			
			System.out.println("相等！");
			
		}else{
			
			System.out.println("不相等！");
		
		}
		
		
		System.out.println(c-1);
				
	}
}