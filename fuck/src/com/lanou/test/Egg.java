package com.lanou.test;

public class Egg {

	public static void main(String[] args) {
		int a = 0;
		while (true) {
			a++;
			if (a % 2 == 1 && a % 3 == 2 && a % 5 == 4) {
				break;
			}
		}
		System.out.println(a);

	}
}
