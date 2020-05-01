import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SWEA_4050_재관이의대량할인 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int TC = sc.nextInt();
		
		for(int tc = 1; tc <= TC; tc++) {
			
			int N = sc.nextInt();
			int res = 0;
			
			List<Integer> list = new ArrayList<>();
			
			for(int i = 0; i < N; i++) {
				list.add(sc.nextInt());
			}
			
			list.sort(Comparator.reverseOrder());
			
			for(int i = 0; i <= list.size(); i++) {
				if((i + 1) % 3 != 0) {
					res += list.get(i);
				}
			}
			
			System.out.println("#" + tc + " " + res);
		}
	}

}
