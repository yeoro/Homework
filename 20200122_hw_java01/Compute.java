package com.java.first;

import java.util.Scanner;

public class Compute {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			System.out.println(String.format("��=%d", num1 * num2));
			System.out.println(String.format("��=%d", num1 / num2));
			
	}

}
