import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int t = 1; t <= 10; t++) {
			int size = sc.nextInt();
			sc.nextLine();
			int[] tree = new int[size + 1];
			int ans = 0;

			for (int i = 0; i < size; i++) {
				String inp = sc.nextLine();
				String[] s = inp.split(" ");
				int idx = Integer.parseInt(s[0]);
				if (s[1].equals("+") || s[1].equals("-") || s[1].equals("*") || s[1].equals("/")) {
					tree[idx] = 0;
					continue;
				}
				tree[idx] = 1;
			}

			ans = postOrder(1, tree);

			System.out.println(String.format("#%d %d", t, ans));
		}
	}

	static int postOrder(int idx, int[] tree) {
		int left, right;
		left = right = -1;
		if (idx * 2 < tree.length) left = postOrder(idx * 2, tree);
		if (idx * 2 + 1 < tree.length) right = postOrder(idx * 2 + 1, tree);
		if (left == -1 && right == -1 && tree[idx] == 1) return 1;
		if (left == 1 && right == 1 && tree[idx] == 0) return 1;

		return 0;
	}
}