package com.ssafy.java;

import java.util.Scanner;

public class GameTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int win = 0, lose = 0, draw = 0, r = 0;
		System.out.println(">>가위바위보 게임을 시작합니다. 아래 보기 중 하나를 고르세요.");
		System.out.println("1. 5판 3승\n2. 3판 2승\n3. 1판 1승");
		System.out.print("번호를 입력하세요. ");
		int T = sc.nextInt();

		switch(T) {
		case 1:
			r = (int)(Math.random()*3) + 1;
			System.out.println(r);
			for(int i = 1; i <= 5; i++) {
				System.out.println(String.format("가위바위보 중 하나 입력 : "));
				String a = sc.next();

				if(r == 1) {
					if(a.equals("가위")) {
						draw++;
						System.out.println("비겼습니다!!!");
					}else if(a.equals("바위")) {
						win++;
						System.out.println("이겼습니다!!!");
					}else if(a.equals("보")) {
						lose++;
						System.out.println("졌습니다!!!");
					}
				}
				if(r == 2) {
					if(a.equals("가위")) {
						lose++;
						System.out.println("졌습니다!!!");
					}else if(a.equals("바위")) {
						draw++;
						System.out.println("비겼습니다!!!");
					}else if(a.equals("보")) {
						win++;
						System.out.println("이겼습니다!!!");
					}
				}
				if(r == 3) {
					if(a.equals("가위")) {
						win++;
						System.out.println("이겼습니다!!!");
					}else if(a.equals("바위")) {
						lose++;
						System.out.println("졌습니다!!!");
					}else if(a.equals("보")) {
						draw++;
						System.out.println("이겼습니다!!!");
					}
				}
				if(win == 3) {
					System.out.println("### 유저 승!!!");
					break;
				}else if(lose == 3) {
					System.out.println("### 컴퓨터 승!!!");
					break;
				}
			}
			break;
		case 2:
			r = (int)(Math.random()*3) + 1;
			System.out.println(r);
			for(int i = 1; i <= 3; i++) {
				System.out.println(String.format("가위바위보 중 하나 입력 : "));
				String a = sc.next();
				
				if(r == 1) {
					if(a.equals("가위")) {
						draw++;
						System.out.println("비겼습니다!!!");
					}else if(a.equals("바위")) {
						win++;
						System.out.println("이겼습니다!!!");
					}else if(a.equals("보")) {
						lose++;
						System.out.println("졌습니다!!!");
					}
				}
				if(r == 2) {
					if(a.equals("가위")) {
						lose++;
						System.out.println("졌습니다!!!");
					}else if(a.equals("바위")) {
						draw++;
						System.out.println("비겼습니다!!!");
					}else if(a.equals("보")) {
						win++;
						System.out.println("이겼습니다!!!");
					}
				}
				if(r == 3) {
					if(a.equals("가위")) {
						win++;
						System.out.println("이겼습니다!!!");
					}else if(a.equals("바위")) {
						lose++;
						System.out.println("졌습니다!!!");
					}else if(a.equals("보")) {
						draw++;
						System.out.println("이겼습니다!!!");
					}
				}
				if(win == 2) {
					System.out.println("### 유저 승!!!");
					break;
				}else if(lose == 2) {
					System.out.println("### 컴퓨터 승!!!");
					break;
				}
			}
			break;
		case 3:
			r = (int)(Math.random()*3) + 1;
			System.out.println(r);
			for(int i = 1; i <= 1; i++) {
				System.out.println(String.format("가위바위보 중 하나 입력 : "));
				String a = sc.next();
				
				if(r == 1) {
					if(a.equals("가위")) {
						draw++;
						System.out.println("비겼습니다!!!");
					}else if(a.equals("바위")) {
						win++;
						System.out.println("이겼습니다!!!");
					}else if(a.equals("보")) {
						lose++;
						System.out.println("졌습니다!!!");
					}
				}
				if(r == 2) {
					if(a.equals("가위")) {
						lose++;
						System.out.println("졌습니다!!!");
					}else if(a.equals("바위")) {
						draw++;
						System.out.println("비겼습니다!!!");
					}else if(a.equals("보")) {
						win++;
						System.out.println("이겼습니다!!!");
					}
				}
				if(r == 3) {
					if(a.equals("가위")) {
						win++;
						System.out.println("이겼습니다!!!");
					}else if(a.equals("바위")) {
						lose++;
						System.out.println("졌습니다!!!");
					}else if(a.equals("보")) {
						draw++;
						System.out.println("이겼습니다!!!");
					}
				}
				if(win == 1) {
					System.out.println("### 유저 승!!!");
					break;
				}else if(lose == 1) {
					System.out.println("### 컴퓨터 승!!!");
					break;
				}
			}
			break;
		}
	}
}
