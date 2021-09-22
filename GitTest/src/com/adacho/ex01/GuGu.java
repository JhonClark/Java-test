package com.adacho.ex01;

import java.util.Scanner;

public class GuGu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇단? ==>");
		int a = sc.nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.println(a + " X " + i + " = " + a * i);
		}
		sc.close();

	}
}
