package day1;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ1244_JUNGOL2077 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] s = new int[N];
		
		for(int i = 0; i < N; i++) {
			s[i] = sc.nextInt();
		}
		
		int M = sc.nextInt(); // 학생 수
		
		
		for(int i = 0; i < M; i++) {
			int x = sc.nextInt(); // 성별
			int y = sc.nextInt(); // 학생이 받은 수
			
			// 남자일 때
			if(x == 1) {
				for(int j = 0; j < N; j++) {
					if((j+1) % y == 0) {
						if(s[j] == 1) {
							s[j] = 0;
						}else {
							s[j] = 1;
						}
					}
				}
			}
			
			
		}
		System.out.println(Arrays.toString(s));
	}

}
