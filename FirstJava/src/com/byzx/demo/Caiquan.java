package com.byzx.demo;

import java.util.Random;
import java.util.Scanner;

public class Caiquan {

	public static void main(String[] args) {
	//�û�����
		Scanner sc=new Scanner(System.in);
		System.out.println("�����룺1.������2.ʯͷ��3.��");

		int a=sc.nextInt();
		
		System.out.println("ϵͳ����˼������������");
		
		Random ra=new Random();
		
		int cc=ra.nextInt(3);
		
		String ro = null;
		
		switch(cc){case 0:	ro="ʯͷ"; case 1: ro="����";  case 2: ro="��";}
		
		System.out.println("ϵͳ��������������"+ro);
		
		
		
		
		
		
		
		
		
		System.out.println();
		
		
		
		
		
		
		
		
	}

}