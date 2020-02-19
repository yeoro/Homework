import java.util.Scanner;

public class Main {

	static int[] memo = new int[1000001];
	static int DIV = 1000000007;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();

		for (int i = 1; i <= 1000000; i++) {
			long ans = calc(i, i) + memo[i - 1];
			ans %= DIV;
			memo[i] = (int)ans;
		}

		for (int t = 1; t <= tc; t++) {
			long ans = 0;
			int n = sc.nextInt();

			System.out.println(String.format("#%d %d", t, memo[n]));
		}
	}


	static long calc(int base, int exp) {

		if (exp == 0) return 1;
		if (exp == 1) return base;

		long res = 0;
		res = calc(base, exp / 2) % DIV;
		res = (res * res) % DIV;
		if (exp % 2 != 0) res = (base * res) % DIV;
		return res;

	}

}