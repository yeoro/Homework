import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayList<Character> nonzero = new ArrayList<>();
		ArrayList<Character> onezero = new ArrayList<>();
		
		for(int i = 0; i < 19; i++) {
			nonzero.add("CEFGHIJKLMNSTUVWXYZ".charAt(i)); // 구멍이 하나도 없는 알파벳
		}
		for(int i = 0; i < 6; i++) {
			onezero.add("ADOPQR".charAt(i)); // 구멍이 하나인 알파벳
		}
		
		int TC = sc.nextInt(); // 테스트 케이스 개수
		
		for(int tc = 1; tc <= TC; tc++) {
			
			String s1 = sc.next();
			String s2 = sc.next();
			
			char[] ch1 = new char[s1.length()]; // 첫 번째 문자열 배열
			char[] ch2 = new char[s2.length()]; // 두 번째 문자열 배열
			
			for(int i = 0; i < s1.length(); i++) {
				ch1[i] = s1.charAt(i);
			}
			for(int i = 0; i < s2.length(); i++) {
				ch2[i] = s2.charAt(i);
			}
			
			if(ch1.length != ch2.length) { // 문자열 길이가 다르면 다음 케이스
				System.out.println(String.format("#%d %s", tc, "DIFF"));
				continue;
			}
			
			for(int i = 0; i < ch1.length; i++) {
				if(nonzero.contains(ch1[i])) { // nonzero 리스트에 있으면 C로 치환
					ch1[i] = 'C';
				}
				if(onezero.contains(ch1[i])) { // onezero 리스트에 있으면 A로 치환
					ch1[i] = 'A';
				}
			}
			for(int i = 0; i < ch2.length; i++) {
				if(nonzero.contains(ch2[i])) {
					ch2[i] = 'C';
				}
				if(onezero.contains(ch2[i])) {
					ch2[i] = 'A';
				}
			}
			
			System.out.print(String.format("#%d ", tc));
			if(Arrays.equals(ch1, ch2)) { // 문자열이 같은지 판단
				System.out.print("SAME");
			}else {
				System.out.print("DIFF");
			}
			System.out.println();
		}
		sc.close();
	}

}
