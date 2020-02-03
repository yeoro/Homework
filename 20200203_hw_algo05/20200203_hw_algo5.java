package day5;

import java.util.Scanner;

public class HW01_20200203 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		for(int tc = 1; tc <= 10; tc++) {
			int result = 0;
			
			sc.next();
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			result = power(N, M);


			System.out.println(String.format("#%d %d", tc, result));
		}

	}

	static int power(int base, int exp) {
		//종료
		if(exp == 0) {
			return 1; // exp가 0인 경우는 1을 리턴
		}
		if(exp == 1) {
			return base; // exp가 1이면 1이 아닌 5^1을 리턴
		}
		//재귀 및 실행
		int num = power(base, exp/2);
		if(exp % 2 == 0) {
			//					return power(base, exp/2) * power(base, exp/2); // 함수를 변수화해서 과정을 줄임
			return num * num;
		}else {
			//					return power(base, exp/2) * power(base, exp/2);
			return num * num * base;
		}
	}


}
