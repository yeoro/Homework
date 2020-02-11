package com.ssafy.java.day05.clazz03;

import java.util.Arrays;
import java.util.Scanner;

public class ProductMgr {
	static Scanner sc = new Scanner(System.in);

	static private Product[] products = new Product[100];
	static private int index = 0;

	static public void add() {
		Scanner sc = new Scanner(System.in);

		TV tv = new TV();
		Refrigerator rf = new Refrigerator();

		System.out.print("입력할 데이터를 선택해주세요(TV:1, 냉장고:2) : ");

		int menu = sc.nextInt();

		switch(menu) {
		case 1:
			System.out.print("TV 번호 : ");
			tv.setpNum(sc.next());
			System.out.print("TV 이름 : ");
			tv.setpName(sc.next());
			System.out.print("TV 가격 : ");
			tv.setPrice(sc.nextInt());
			System.out.print("TV 수량 : ");
			tv.setQuantity(sc.nextInt());
			System.out.print("TV 인치 : ");
			tv.setInch(sc.nextInt());
			System.out.print("TV 타입 : ");
			tv.setType(sc.next());

			products[index] = tv;
			index++;
			System.out.println("TV 정보가 입력되었습니다.");
			break;
		case 2:
			System.out.print("냉장고 번호 : ");
			rf.setpNum(sc.next());
			System.out.print("냉장고 이름 : ");
			rf.setpName(sc.next());
			System.out.print("냉장고 가격 : ");
			rf.setPrice(sc.nextInt());
			System.out.print("냉장고 수량 : ");
			rf.setQuantity(sc.nextInt());
			System.out.print("냉장고 용량 : ");
			rf.setVolume(sc.next());
			
			products[index] = rf;
			index++;
			System.out.println("냉장고 정보가 입력되었습니다.");
			break;
		}
	}
	static public void allShow() {
		for(int i = 0; i < index; i++) {
			System.out.println(products[i]);
		}
	}
	static public Product numSearch(String num) {
		for(int i = 0; i < index; i++) {
			if(products[i].getpNum().equals(num)) {
				System.out.println(products[i]);
			}
		}
		return null;
	}
	static public Product nameSearch(String name) {
		for(int i = 0; i < index; i++) {
			if(products[i].getpNum().equals(name)) {
				System.out.println(products[i]);
			}
		}
		return null;
	}
	static Product tvSearch() {
		for(int i = 0; i < index; i++) {
			if(products[i] instanceof TV && !(products[i] instanceof Refrigerator)) {
				System.out.println(products[i]);
			}
		}
		return null;
	}
	static Product rfSearch() {
		for(int i = 0; i < index; i++) {
			if(products[i] instanceof Refrigerator) {
				System.out.println(products[i]);
			}
		}
		return null;
	}
	static public void delete(String num) {
		for(int i = 0; i < index; i++) {
			if(products[i].getpNum().equals(num)) {
				products[i] = null;
				products = Arrays.copyOf(products, index);
				index--;
				return;
			}
		}
	}
	static public int totalPrice() {
		int sum = 0;
		for(int i = 0; i < index; i++) {
			sum += products[i].getPrice();
		}
		return sum;
	}
}
