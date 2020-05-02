import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SWEA_4366_정식이의은행업무 {
	
	static char[] barr, tarr;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int TC = sc.nextInt();
		
		for(int tc = 1; tc <= TC; tc++) {
			
			List<Integer> blist = new ArrayList<>(); // 이진수들을 저장할 리스트
			List<Integer> tlist = new ArrayList<>(); // 삼진수들을 저장할 리스트
			
			int res = 0;
			
			barr = sc.next().toCharArray();
			tarr = sc.next().toCharArray();
			
			// 이진수의 각 자리 수를 바꿔주며 리스트에 추가
			for(int i = 0; i < barr.length; i++) {
				if(barr[i] == '0') {
					barr[i] = '1';
					blist.add(Integer.parseInt(String.valueOf(barr), 2));
					barr[i] = '0';
					continue;
				} 
				
				barr[i] = '0';
				blist.add(Integer.parseInt(String.valueOf(barr), 2));
				barr[i] = '1';
			}
			
			// 삼진수의 각 자리 수를 바꿔주며 리스트에 추가
			for(int i = 0; i < tarr.length; i++) {
				if(tarr[i] == '0') {
					tarr[i] = '1';
					tlist.add(Integer.parseInt(String.valueOf(tarr), 3));
					tarr[i] = '2';
					tlist.add(Integer.parseInt(String.valueOf(tarr), 3));
					tarr[i] = '0';
					continue;
				} else if(tarr[i] == '1') {
					tarr[i] = '0';
					tlist.add(Integer.parseInt(String.valueOf(tarr), 3));
					tarr[i] = '2';
					tlist.add(Integer.parseInt(String.valueOf(tarr), 3));
					tarr[i] = '1';
					continue;
				} else if(tarr[i] == '2') {
					tarr[i] = '0';
					tlist.add(Integer.parseInt(String.valueOf(tarr), 3));
					tarr[i] = '1';
					tlist.add(Integer.parseInt(String.valueOf(tarr), 3));
					tarr[i] = '2';
					continue;
				}
			}
			
			// 각 리스트에서 같은 수를 찾음
			loop : for(int i = 0; i < blist.size(); i++) {
				for(int j = 0; j < tlist.size(); j++) {
					if(blist.get(i).equals(tlist.get(j))) {
						System.out.println(blist.get(i) == tlist.get(j));
						System.out.println(blist.get(i).equals(tlist.get(j)));
						res = blist.get(i);
						break loop;
					}
				}
			}
			
			System.out.println("#" + tc + " " + res);
		}
		
		sc.close();
	}
}
