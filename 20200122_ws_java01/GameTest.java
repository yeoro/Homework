package com.ssafy.java;

import java.util.Scanner;

public class GameTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int win = 0, lose = 0, draw = 0, r = 0;
		System.out.println(">>���������� ������ �����մϴ�. �Ʒ� ���� �� �ϳ��� ������.");
		System.out.println("1. 5�� 3��\n2. 3�� 2��\n3. 1�� 1��");
		System.out.print("��ȣ�� �Է��ϼ���. ");
		int T = sc.nextInt();

		switch(T) {
		case 1:
			r = (int)(Math.random()*3) + 1;
			System.out.println(r);
			for(int i = 1; i <= 5; i++) {
				System.out.println(String.format("���������� �� �ϳ� �Է� : "));
				String a = sc.next();

				if(r == 1) {
					if(a.equals("����")) {
						draw++;
						System.out.println("�����ϴ�!!!");
					}else if(a.equals("����")) {
						win++;
						System.out.println("�̰���ϴ�!!!");
					}else if(a.equals("��")) {
						lose++;
						System.out.println("�����ϴ�!!!");
					}
				}
				if(r == 2) {
					if(a.equals("����")) {
						lose++;
						System.out.println("�����ϴ�!!!");
					}else if(a.equals("����")) {
						draw++;
						System.out.println("�����ϴ�!!!");
					}else if(a.equals("��")) {
						win++;
						System.out.println("�̰���ϴ�!!!");
					}
				}
				if(r == 3) {
					if(a.equals("����")) {
						win++;
						System.out.println("�̰���ϴ�!!!");
					}else if(a.equals("����")) {
						lose++;
						System.out.println("�����ϴ�!!!");
					}else if(a.equals("��")) {
						draw++;
						System.out.println("�̰���ϴ�!!!");
					}
				}
				if(win == 3) {
					System.out.println("### ���� ��!!!");
					break;
				}else if(lose == 3) {
					System.out.println("### ��ǻ�� ��!!!");
					break;
				}
			}
			break;
		case 2:
			r = (int)(Math.random()*3) + 1;
			System.out.println(r);
			for(int i = 1; i <= 3; i++) {
				System.out.println(String.format("���������� �� �ϳ� �Է� : "));
				String a = sc.next();
				
				if(r == 1) {
					if(a.equals("����")) {
						draw++;
						System.out.println("�����ϴ�!!!");
					}else if(a.equals("����")) {
						win++;
						System.out.println("�̰���ϴ�!!!");
					}else if(a.equals("��")) {
						lose++;
						System.out.println("�����ϴ�!!!");
					}
				}
				if(r == 2) {
					if(a.equals("����")) {
						lose++;
						System.out.println("�����ϴ�!!!");
					}else if(a.equals("����")) {
						draw++;
						System.out.println("�����ϴ�!!!");
					}else if(a.equals("��")) {
						win++;
						System.out.println("�̰���ϴ�!!!");
					}
				}
				if(r == 3) {
					if(a.equals("����")) {
						win++;
						System.out.println("�̰���ϴ�!!!");
					}else if(a.equals("����")) {
						lose++;
						System.out.println("�����ϴ�!!!");
					}else if(a.equals("��")) {
						draw++;
						System.out.println("�̰���ϴ�!!!");
					}
				}
				if(win == 2) {
					System.out.println("### ���� ��!!!");
					break;
				}else if(lose == 2) {
					System.out.println("### ��ǻ�� ��!!!");
					break;
				}
			}
			break;
		case 3:
			r = (int)(Math.random()*3) + 1;
			System.out.println(r);
			for(int i = 1; i <= 1; i++) {
				System.out.println(String.format("���������� �� �ϳ� �Է� : "));
				String a = sc.next();
				
				if(r == 1) {
					if(a.equals("����")) {
						draw++;
						System.out.println("�����ϴ�!!!");
					}else if(a.equals("����")) {
						win++;
						System.out.println("�̰���ϴ�!!!");
					}else if(a.equals("��")) {
						lose++;
						System.out.println("�����ϴ�!!!");
					}
				}
				if(r == 2) {
					if(a.equals("����")) {
						lose++;
						System.out.println("�����ϴ�!!!");
					}else if(a.equals("����")) {
						draw++;
						System.out.println("�����ϴ�!!!");
					}else if(a.equals("��")) {
						win++;
						System.out.println("�̰���ϴ�!!!");
					}
				}
				if(r == 3) {
					if(a.equals("����")) {
						win++;
						System.out.println("�̰���ϴ�!!!");
					}else if(a.equals("����")) {
						lose++;
						System.out.println("�����ϴ�!!!");
					}else if(a.equals("��")) {
						draw++;
						System.out.println("�̰���ϴ�!!!");
					}
				}
				if(win == 1) {
					System.out.println("### ���� ��!!!");
					break;
				}else if(lose == 1) {
					System.out.println("### ��ǻ�� ��!!!");
					break;
				}
			}
			break;
		}
	}
}
