import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int TC = sc.nextInt();
		
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		
		for(int tc = 1; tc <= TC; tc++) {
			int N = sc.nextInt(); // 맵 크기
			int B = sc.nextInt(); // 안전 기지 개수
			
			int max = 0; // 최대 중첩 개수
			
			int[][] map = new int[N][N];
			
			for(int i = 0; i < B; i++) {
				int x = sc.nextInt() - 1; // 안전 기지 x좌표
				int y = sc.nextInt() - 1; // 안전 기지 y좌표
				
				for(int j = 0; j < 4; j++) {
					for(int k = 1; k < 3; k++) {
						int tx = x + dx[j]*k; // 4방 2칸씩 이동
						int ty = y + dy[j]*k; // 4방 2칸씩 이동
						
						if(tx >= N || tx < 0 || ty >= N || ty < 0) {
							continue;
						}
						map[tx][ty]++;
					}
				}
			}
			
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					if(map[i][j] > max) {
						max = map[i][j];
					}
				}
			}
			
			System.out.println(String.format("#%d %d", tc, max));
		}
		
	}
}

