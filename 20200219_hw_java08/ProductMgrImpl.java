package com.ssafy.java.day05.clazz03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ProductMgrImpl implements IProductMgr{
	
	Scanner sc = new Scanner(System.in);
	
	private List<Product> list = new ArrayList<>();
	
	// 상품 정보 저장
	public void add() {
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

			list.add(tv);
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
			
			list.add(rf);
			System.out.println("냉장고 정보가 입력되었습니다.");
			break;
		}
	}

	// 데이터 전체 검색
	public List<Product> allshow() {
		return list;
	}

	// 상품번호로 검색
	public Product numSearch(String num) {
		for(Product p : list) {
			if(p.getpNum().equals(num)) {
				return p;
			}
		}
		return null;
	}

	// 상품명으로 검색
	public Product nameSearch(String name) {
		for(Product p : list) {
			if(p.getpName().contains(name)) {
				return p;
			}
		}
		return null;
	}

	// TV만 검색
	public List<Product> tvSearch() {
		List<Product> l = new ArrayList<>();
		for(Product p : list) {
			if(p instanceof TV) {
				l.add(p);
			}
		}
		return l;
	}

	// 냉장고만 검색
	public List<Product> rfSearch() {
		List<Product> l = new ArrayList<>();
		for(Product p : list) {
			if(p instanceof Refrigerator) {
				l.add(p);
			}
		}
		return l;
	}

	// 400L 이상 냉장고 검색
	public List<Product> volumeSearch() {
		List<Product> l = new ArrayList<>();
		for(Product p : list) {
			if(p instanceof Refrigerator && Integer.parseInt(((Refrigerator) p).getVolume()) >= 400) {
				l.add(p);
			}
		}
		return l;
	}

	// 50in 이상 TV 검색
	public List<Product> inchSearch() {
		List<Product> l = new ArrayList<>();
		for(Product p : list) {
			if(p instanceof TV && ((TV) p).getInch() >= 50) {
				l.add(p);
			}
		}
		return l;
	}

	// 상품 가격 수정
	public void priceUpdate(String num, int price) {
		for(Product p : list) {
			if(p.getpNum().equals(num)) {
				p.setPrice(price);
			}
		}
	}
	
	// 상품 정보 삭제
	public void delete(String num) {
		Iterator<Product> itr = list.iterator();
		while(itr.hasNext()) {
			if(itr.next().getpNum().equals(num)) {
				itr.remove();
				break;
			}
		}
	}

	// 전체 재고 상품 금액
	public int doSum() {
		int sum = 0;
		for(Product p : list) {
			sum += p.getPrice();
		}
		return sum;
	}


}
