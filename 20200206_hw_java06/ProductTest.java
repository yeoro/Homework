package com.ssafy.java.day05.clazz03;

import java.util.Scanner;

import com.ssafy.java.day06.clazz01.CarMgr;

public class ProductTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		loop : while(true) {

			System.out.println("************** 재고 관리 프로그램 **************");
			System.out.println("1:상품 정보 입력 | 2:전체 상품 정보 검색 | 3:상품 번호로 검색 | 4. 상품명으로 검색");
			System.out.println("5:TV 검색 | 6:냉장고 검색 | 7:상품 정보 삭제 | 8:전체 상품 금액의 합계 | 0:종료");
			System.out.print("메뉴를 입력해주세요 : ");

			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("************** 상품 정보 입력 **************");
				ProductMgr.add();
				break;
			case 2:
				System.out.println("************** 전체 상품 정보 검색 **************");
				ProductMgr.allShow();
				break;
			case 3:
				System.out.println("************** 상품 번호로 검색 **************");
				System.out.print("상품 번호를 입력하세요 : ");
				ProductMgr.numSearch(sc.next());
				break;
			case 4:
				System.out.println("************** 상품명으로 검색  **************");
				System.out.print("가격을 입력하세요 : ");
				ProductMgr.nameSearch(sc.next());
				break;
			case 5:
				System.out.println("************** TV 검색  **************");
				ProductMgr.tvSearch();
				break;
			case 6:
				System.out.println("************** 냉장고 검색  **************");
				ProductMgr.rfSearch();
				break;
			case 7:
				System.out.println("************** 상품 정보 삭제  **************");
				System.out.print("삭제할 상품 번호를 입력하세요 : ");
				ProductMgr.delete(sc.next());
				break;
			case 8:
				System.out.println("************** 전체 상품 금액의 합계  **************");
				System.out.println(ProductMgr.totalPrice());
				break;
			case 0:
				System.out.println("종료합니다.");
				System.exit(0);
			}
		}
	}

}
