package com.java.first;

import java.util.Scanner;

public class CheckPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int height = sc.nextInt();
		int weight = sc.nextInt();
		int obesity = weight + 100 - height;
		
		System.out.println(String.format("비만 수치는 %d입니다.", obesity));
		
		if(obesity > 0) {
			System.out.println("당신은 비만이군요..");
		}
		
	}

}
