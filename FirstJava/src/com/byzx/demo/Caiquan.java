package com.byzx.demo;

import java.util.Random;
import java.util.Scanner;

public class Caiquan {

	public static void main(String[] args) {
	//用户输入
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入：1.剪刀；2.石头；3.布");

		int a=sc.nextInt();
		
		System.out.println("系统正在思考。。。。。");
		
		Random ra=new Random();
		
		int cc=ra.nextInt(3);
		
		String ro = null;
		
		switch(cc){case 0:	ro="石头"; case 1: ro="剪刀";  case 2: ro="布";}
		
		System.out.println("系统决定出。。。。"+ro);
		
		
		
		
		
		
		
		
		
		System.out.println();
		
		
		
		
		
		
		
		
	}

}