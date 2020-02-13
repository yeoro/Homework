import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Temp implements Comparable<Temp>{
	int lowTemp;
	int highTemp;
	
	@Override
	public int compareTo(Temp o) {
		return highTemp - o.highTemp;
	}
}

public class Main {
	public static void main(String[] args) throws IOException {

		ArrayList<Temp> rf = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 화학물질 개수
		
		int cnt = 1; // 냉장고 개수
		
		for(int i = 0; i < N; i++) { // 화학 물질 온도 저장
			Temp t = new Temp();
			t.lowTemp = sc.nextInt();
			t.highTemp = sc.nextInt();
			rf.add(t);
		}
		
		Collections.sort(rf);
		
		int low = rf.get(0).lowTemp;
		int high = rf.get(0).highTemp;
		
		
		while(true) {
			
			if(rf.size() == 1) {
				break;
			}
			
			if(rf.get(1) != null) {
				if(rf.get(1).lowTemp <= high) {
					rf.remove(rf.get(1));
					continue;
				}
				
				if(rf.get(1).lowTemp > high) {
					low = rf.get(1).lowTemp;
					high = rf.get(1).highTemp;
					cnt++;
					rf.remove(rf.get(0));
					continue;
				}
			}
			break;
			
			
		}
		
		
		System.out.println(cnt);
		
	}
}
