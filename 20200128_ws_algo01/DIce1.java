import java.util.Scanner;

public class DIce1 {
	
	static int[] arr;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = 0, M = 0;

		while(true) {
			N = sc.nextInt();
			if(N < 2 || N > 5) {
				continue;
			}
			break;
		}
		arr = new int[N];
		
		while(true) {
			M = sc.nextInt();
			if(M < 1 || M > 3) {
				continue;
			}
			break;
		}
		
		
		switch(M) {
			case 1:
				method1(0, N);
				break;
			case 2:
				method2(0, N, 1);
				break;
			case 3:
				break;
			
			}

	}
	
	static void method1(int idx, int N) {
		if(N == 0) {
			print();
			return;
		}
		
		for(int i = 1; i <= 6; i++) {
			arr[idx] = i;
			method1(idx + 1, N - 1);
		}
	}
	
	static void method2(int idx, int N, int num) {
		if(N == 0) {
			print();
			return;
		}
		
		for(int i = num; i <= 6; i++) {
			arr[idx] = i;
			if(i < num) {
				continue;
			}
			method2(idx + 1, N - 1, i);
		}
	}
	
	static void print() {
		for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
}
