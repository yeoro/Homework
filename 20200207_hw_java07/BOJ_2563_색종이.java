import java.util.Scanner;

public class Solution {

	static int MAX = 100;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] map = new int[MAX][MAX];

		int result = 0;

		int TC = sc.nextInt(); // 색종이 개수

		for(int tc = 1; tc <= TC; tc++) {

			int x = sc.nextInt(); // 색종이 x좌표
			int y = sc.nextInt(); // 색종이 y좌표

			for(int i = x; i < x + 10; i++) {
				for(int j = y; j < y + 10; j++) {
					map[i][j] = 1;
				}
			}
		}
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[0].length; j++) {
				if(map[i][j] == 1) {
					result++;
				}
			}
		}

		System.out.println(result);		



		sc.close();

	}

}
