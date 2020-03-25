package com.byzx.demo;

public class Test {
	
	public static Runtime runtime = Runtime.getRuntime();

	public static void main(String[] args) {
		long maxMemory = runtime.maxMemory();
		System.out.println("最大内存： " + maxMemory/1024/1024 + "M");
		int [] times = {10000, 100000, 1000000, 10000000, 100000000, 1000000000};
		for (int i : times) {
			System.out.println("循环执行次数：" + i);
			StringBuilderTest(i);
			StringBufferTest(i);
			System.out.println();
		}
	}
	
	private static void StringBuilderTest(int times){
		StringBuilder sbd = new StringBuilder();
		
		long start = System.currentTimeMillis();
		while (sbd.length() < times) {
			sbd.append("a");
		}
		System.out.println("StringBuilder执行时间：" + (System.currentTimeMillis() - start));
		System.out.println("StringBuilder使用内存： " + (runtime.totalMemory() - runtime.freeMemory())/1024/1024 + "M");
	}
	
	private static void StringBufferTest(int times){
		StringBuffer sbf = new StringBuffer();
		
		long start = System.currentTimeMillis();
		while (sbf.length() < times) {
			sbf.append("a");
		}
		System.out.println("StringBuffer执行时间：" + (System.currentTimeMillis() - start));
		System.out.println("StringBuffer使用内存： " + (runtime.totalMemory() - runtime.freeMemory())/1024/1024 + "M");
	}
}
