package day5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HW02_20200203 {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for(int tc = 1; tc <= 10; tc++) {
			Queue<Integer> q = new LinkedList<>();
			
			sc.next();
			
			for(int i = 0; i < 8; i++) {
				q.offer(sc.nextInt());
			}
			
			Secret(q);

			System.out.print("#" + tc + " ");
			for(int i = 0; i < 8; i++) {
				System.out.print(q.poll() + " ");
			}
			System.out.println();

			
		}
		
		sc.close();
	}

	static void Secret(Queue<Integer> q) {
		if(q.isEmpty()) {
			return;
		}


		for(int i = 1; i < 6; i++) {
			int temp = q.poll();

			if((temp - i) == 0 || (temp - i) < 0) {
				q.offer(0);
				
				return;
			}

			q.offer(temp-i);
		}

		Secret(q);
		return;

	}

}
