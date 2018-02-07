package com.lanou.test;

public class Outer {
	private int num = 5;

	private class Inner {
		private int num = 15;

		void f(){
            int num=25;
            System.out.println(num/new Outer().num);//要求输出5
            System.out.println(this.num);//要求输出15
            System.out.println(num);//要求输出25 
        }
	}
	
	public static void main(String[] args) {
		Inner i = new Outer().new Inner();
		i.f();
	}
}
