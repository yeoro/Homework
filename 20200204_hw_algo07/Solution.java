import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int tc = 1; tc <= 10; tc++) {
			
			LinkedList<Integer> list = new LinkedList<>();
			
			int N = sc.nextInt(); // 암호문 길이
			
			for(int i = 0; i < N; i++) {
				list.offer(sc.nextInt()); // 암호문 저장
			}
			
			int C = sc.nextInt(); // 명령어 개수
			for(int i = 0; i < C; i++) {
				String x = sc.next(); // 명령어 종류
				int y = sc.nextInt(); // 위치
				int s = sc.nextInt(); // 덧붙일 숫자 개수
				
				if(x.equals("I")) {
					for(int j = 1; j <= s; j++) {
						list.add(y, sc.nextInt());
						y++;
					}
				}
				if(x.equals("D")) {
					for(int j = 1; j <= s; j++) {
						list.remove(y);
					}
				}
			}
			
//			Iterator<Integer> itr = list.iterator();
//			while(itr.hasNext()) {
//				System.out.print(itr.next() + " ");
//			}
			
			
			
			System.out.print(String.format("#%d ", tc));
			Iterator<Integer> itr = list.iterator();
			for(int i = 0; i < 10; i++) {
				System.out.print(itr.next() + " ");
			}
			System.out.println();
		}
	}

}