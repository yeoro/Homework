// 최빈수 구하기
import java.util.Arrays;
import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();




		for(int test_case = 1; test_case <= T; test_case++){
//			Arrays.fill(a, 0); // 배열을 0으로 초기화
			
			int[] a = new int[101];
			int max = 0;
			int b = 0;

			sc.nextInt();


			for(int i =0; i < 1000; i++) {

				int idx = sc.nextInt();
				a[idx]++;



				for(int j = 0; j < a.length; j++) {
					if(a[j] >= max) {
						max = a[j];
						b = j;
					}else if(a[j] == max) {
						if(j > b) {
							b = j;
						}
					}
				}
			}


			System.out.println(String.format("#%d %d", test_case, b));
		}
	}
}
