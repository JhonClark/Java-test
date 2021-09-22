package com.adacho.ex01;

import java.util.Scanner;

public class Fact {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, result;

		System.out.print("정수입력: ");
		num = sc.nextInt();
		result = num;
		for (int i = num - 1; i > 1; i--)
			result *= i;

		System.out.println(num + "! = " + result);
		sc.close();
	}
}
