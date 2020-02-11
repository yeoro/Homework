import java.util.Scanner;

class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 8방 탐색을 위한 배열
		int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
		int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
		
		int TC = sc.nextInt(); // 테스트 케이스 개수
		
		for(int tc = 1; tc <= TC; tc++) {
			
			int N = sc.nextInt(); // 저수지 크기
			
			char[][] map = new char[N][N]; // 저수지 배열
			
			int max = 0; // 최대 물의 깊이
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					map[i][j] = sc.next().charAt(0); // 테스트 케이스 입력
				}
			}
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					int wcnt = 0; // W 개수
					int gcnt = 0; // G 개수
					if(map[i][j] == 'W') {
						for(int k = 0; k < 8; k++) {
							int tx = i + dx[k];
							int ty = j + dy[k];
							
							if(tx >= N || tx < 0 || ty >= N || ty < 0) {
								continue;
							}
							
							if(map[tx][ty] == 'W') {
								wcnt++;
							}
							
							if(map[tx][ty] == 'G') {
								gcnt++;
								if(gcnt == 8) {
									wcnt = 1;
								}
							}
						}
					}
					if(max < wcnt) {
						max = wcnt;
					}
				}
			}
			
			System.out.println(String.format("#%d %d", tc, max));
		}
	}

}
