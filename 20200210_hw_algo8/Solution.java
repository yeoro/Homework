import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	static int parent[];
	static int res;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		int TC = sc.nextInt(); // 테스트 케이스 개수
		
		for(int tc = 1; tc <= TC; tc++) {
			
			int N = sc.nextInt(); // 사람 수
			int M = sc.nextInt(); // 사람의 관계 수
			
			parent = new int[N + 1];
			
			make();
			
			for(int i = 0; i < M; i++) {
				union(sc.nextInt(), sc.nextInt());
			}
			
			
			
			System.out.println(Arrays.toString(parent));
		}
	}
	
	static void make() {
		for(int i = 1; i < parent.length; i++) {
			parent[i] = i;
		}
	}
	
	static void union(int x, int y) {
		x = findSet(x); // x의 부모 찾기
		y = findSet(y); // y의 부모 찾기
		
		if(x == y) {
			return; // 부모가 같다면 부모 리턴
		}
		
		if(x > y) {
			parent[x] = y; // x의 인덱스가 더 크면 y의 부모로 바꿔준다.
		}else {
			parent[y] = x; // y의 인덱스가 더 크면 x의 부모로 바꿔준다.
		}
	}
	
	static int findSet(int idx) {
		if(idx == parent[idx]) {
			return idx; // 인덱스가 부모값이면 리턴
		}
		return parent[idx] = findSet(parent[idx]);
	}
	
	
}
