package com.ssafy.java;
import java.util.Scanner;

public class DigitTest {
	final static int MAX = 100;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[MAX];
		int[] check = new int[MAX];
		int cnt = 0;
		
		int j = 0, temp = -1;
		do {
			temp = sc.nextInt();
			arr[j] = temp;
			j++;
		} while (temp != 0);
		
		while(true) {
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] == 0) {
					break;
				}
				cnt = arr[i] / 10;
				check[cnt]++;
			}
			break;
		}
		
		for(int i = 0; i < check.length; i++) {
			if(check[i] > 0) {
				System.out.println(String.format("%d : %d개", i, check[i]));
			}
		}
	}

}
