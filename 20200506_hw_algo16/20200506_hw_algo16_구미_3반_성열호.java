import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_6987_월드컵 {

	static int res;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 4; i++) {
			List<Score> list = new ArrayList<>();
			res = 0;
			for(int j = 0; j < 6; j++) {
				list.add((new Score(sc.nextInt(), sc.nextInt(), sc.nextInt())));
			}
			go(list);
			
			if(i == 3) {
				System.out.print(res);
			} else {
				System.out.print(res + " ");
			}
		}
		
		sc.close();
	}
	
	static void go(List<Score> list) {
		
		int wCnt = 0, dCnt = 0, lCnt = 0;
		List<Score> dList = new ArrayList<Score>();
		
		for(Score s : list) {
			wCnt += s.win;
			lCnt += s.lose;
			
			if(s.draw > 0) {
				dCnt += s.draw;
				dList.add(s);
			}
			
			// 승, 무, 패의 합이 5여야함
			if(s.win + s.lose + s.draw != 5) {
				return;
			}
			
			if(!cntCheck(s.win) && !cntCheck(s.lose) && !cntCheck(s.draw)) {
				return;
			}
		}
		
		// 총 승, 무, 패의 합은 30이어야 함, 승과 패의 수가 같아야 함, 무승부가 있으면 무승부 국가의 개수가 짝수, 총 무승부의 수는 짝수
		if( (wCnt+lCnt+dCnt == 30) && (wCnt == lCnt) && dCheck(dCnt, dList.size()) && (dCnt % 2 == 0) ) {
			res = 1;
		}
	}
	
	static boolean dCheck(int cnt, int size) {
		if(cnt > 0 && size % 2 != 0) {
			return false;
		}
		return true;
	}
	
	static boolean cntCheck(int cnt) {
		return 0 <= cnt && cnt <= 6;
	}
}

class Score {
	int win, draw, lose;

	public Score(int win, int draw, int lose) {
		this.win = win;
		this.draw = draw;
		this.lose = lose;
	}
}
