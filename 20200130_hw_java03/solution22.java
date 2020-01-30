package com.ssafy.java.day03.arrayexam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class solution22 {

	public static void main(String[] args) throws FileNotFoundException {

		System.setIn(new FileInputStream("hw_java_200130.txt"));
		Scanner sc = new Scanner(System.in);

		int TC = sc.nextInt();

		for(int tc = 1; tc <= TC; tc++) {

			int N = sc.nextInt();
			int S = sc.nextInt();

			int result = S;

			int[][] lake = new int[N][N];
			int[][] strider = new int[S][3];
			int[] Si;

			for(int i = 0; i < S; i++) {
				for(int j = 0; j < 3; j++) {
					strider[i][j] = sc.nextInt();
				}
			}

			for(int i = 0; i < S; i++) {
				lake[strider[i][0]][strider[i][1]]++;
			}


			for(int i = 0; i < S; i++) {


				//상
				if(strider[i][2] == 1) {
					int k = 0;
					for(int j = 3; j > 0; j--) {
						k += j;
						if(strider[i][0] - k < 0) {
							result--;
							break;
						}
						lake[strider[i][0] - k][strider[i][1]]++;
						if(lake[strider[i][0] - k][strider[i][1]] == 2) {
							result--;
							break;
						}
					}
				}
				//하
				if(strider[i][2] == 2) {
					int k = 0;
					for(int j = 3; j > 0; j--) {
						k += j;
						if(strider[i][0] + k >= N) {
							result--;
							break;
						}
						lake[strider[i][0] + k][strider[i][1]]++;
						if(lake[strider[i][0] + k][strider[i][1]] == 2) {
							result--;
							break;
						}
					}
				}
				//좌
				if(strider[i][2] == 3) {
					int k = 0;
					for(int j = 3; j > 0; j--) {
						k += j;
						if(strider[i][1] - k < 0) {
							result--;
							break;
						}
						lake[strider[i][0]][strider[i][1] - k]++;
						if(lake[strider[i][0]][strider[i][1] - k] == 2) {
							result--;
							break;
						}
					}
				}
				//우
				if(strider[i][2] == 3) {
					int k = 0;
					for(int j = 3; j > 0; j--) {
						k += j;
						if(strider[i][1] + k >= N) {
							result--;
							break;
						}
						lake[strider[i][0]][strider[i][1] + k]++;
						if(lake[strider[i][0]][strider[i][1] + k] == 2) {
							result--;
							break;
						}
					}
				}
			}
			System.out.println(String.format("#%d %d", tc, result));
		}
	}

}
