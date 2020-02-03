import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class hw_200129 {


	public static void main(String[] args) {

		Stack<Integer> s = new Stack<Integer>();
//		Stack<Integer> idx = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		//		int[] top = new int[N];
		int[] idx = new int[N];

		for(int i = 0; i < N; i++) {

//			if(s.isEmpty()) {
//				idx.push(0);
//			}
			
			s.push(sc.nextInt());
			
//			while(!s.isEmpty()) {
//				int a = s.pop();
//				if(s.isEmpty()) {
//					d
//					break;
//				}
//				if(a > s.peek()) {
//					continue;
//				}
//				if(a <= s.peek()) {
//					
//				}
//			}
			
		}
		//		for(int i = 0; i < N; i++) {
		//			top[i] = sc.nextInt();
		//		}

		//		for(int i = N - 1; i >= 0; i--) {
		//			for(int j = i - 1; j >= 0; j--) {
		//				if(top[i] < top[j]) {
		//					idx[i] = j + 1;
		//					break;
		//				}
		//			}
		//		}

				for(int i = N - 1; i > 0 ; i--) {
					if(!s.isEmpty()) {
						int a = s.pop();
						
						if(s.isEmpty()) {
							break;
						}
						
						if(a <= s.peek()) {
							idx[i] = i;
						}
						
						if(a > s.peek()) {
							if(s.isEmpty()) {
								break;
							}
							int b = s.pop();
							if(!s.isEmpty()) {
								if(a <= s.peek()) {
								idx[i] = s.search(s.peek()) + 1;
								}
							}
							s.push(b);
						}
					}
				}

		for(int i = 0; i < N; i++) {
			System.out.print(idx[i] + " ");
		}

	}

}