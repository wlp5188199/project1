package com.lanou.test;

public class One {

	public static void main(String[] args) {
		// int a =2;
		// System.out.println(a<<=2);
		 int row = 9;
         for (int i = 1; i <= row ; i++) {
             for (int j = 1; j <= i; j++) {
                 System.out.print(i+"*"+j+"="+i*j+"\t");
             }
             System.out.println();
         }
	}
}
