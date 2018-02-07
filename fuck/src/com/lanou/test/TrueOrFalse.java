package com.lanou.test;

public class TrueOrFalse {
	public static void main(String[] args) {
		String s1 = "igeek";
		String s2 = "home";
		String s3 = "igeekhome";
		// false
		System.out.println(s3 == s1 + s2);
		// true
		System.out.println(s3.equals(s1 + s2));
		// true
		System.out.println(s3 == "igeek" + "home");
		// true
		System.out.println(s3.equals("igeek" + "home"));
	}
}
