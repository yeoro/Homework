package com.java.first;

import java.util.Scanner;

public class CheckPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int height = sc.nextInt();
		int weight = sc.nextInt();
		int obesity = weight + 100 - height;
		
		System.out.println(String.format("�� ��ġ�� %d�Դϴ�.", obesity));
		
		if(obesity > 0) {
			System.out.println("����� ���̱���..");
		}
		
	}

}
