import java.util.Scanner;

public class Dice2 {

	static int[] arr;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = 0, M = 0;

		while(true) {
			N = sc.nextInt();
			if(N < 2 || N > 7) {
				continue;
			}
			break;
		}
		arr = new int[N];



		while(true) {
			M = sc.nextInt();
			if(M < 1 || M > 40) {
				continue;
			}
			break;
		}
		method1(0, N, M);

		sc.close();
	}

	static void method1(int idx, int N, int M) {
		if(N == 0) {
			print(M);
			return;
		}

		for(int i = 1; i <= 6; i++) {
			arr[idx] = i;
			method1(idx + 1, N - 1, M);
		}
	}

	static void print(int M) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if(sum == M) {
				if(i < arr.length-1) {
					continue;
				}
				for(int j = 0; j < arr.length; j++) {
					System.out.print(arr[j] + " ");
				}
				System.out.println();
			}
		}
	}


}
