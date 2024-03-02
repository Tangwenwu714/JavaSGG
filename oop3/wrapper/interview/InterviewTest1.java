package com.atguigu12.wrapper.interview;

//说明：如果赋值的值在[-128,+127]范围内，则Integer对象使用的是IntegerCache中数组cache中的元素

public class InterviewTest1 {
	public static void main(String[] args) {
		
		Integer i = new Integer(1);
		Integer j = new Integer(1);
		System.out.println(i == j);// false

		// 底层都会调用Integer的valueOf(), 享元的设计思路
		Integer m = 1; //自动的装箱
		Integer n = 1;
		System.out.println(m == n);//true，-128 -127直接采用了现有对象

		Integer x = 128;
		Integer y = 128;
		System.out.println(x == y);//false

	}

}
