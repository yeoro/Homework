package com.ssafy.java.day05.clazz03;

import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
		
		IProductMgr mgr = new ProductMgrImpl();
		
		Scanner sc = new Scanner(System.in);

		while(true) {

			System.out.println("************** 재고 관리 프로그램 **************");
			System.out.println("1:상품 정보 입력 | 2:전체 상품 정보 검색 | 3:상품 번호로 검색 | 4. 상품명으로 검색");
			System.out.println("5:TV 검색 | 6:냉장고 검색 | 7:400L 이상 냉장고 검색 | 8:50inch 이상 TV 검색");
			System.out.println("9:상품 가격 수정 | 10:상품 삭제 | 11:전체 재고 상품 합계 | 0:종료");
			System.out.println("-----------------------------------------");
			System.out.print("메뉴를 입력해주세요 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("************** 상품 정보 입력 **************");
				mgr.add();
				break;
			case 2:
				System.out.println("************** 전체 상품 정보 검색 **************");
				for(Product p : mgr.allshow()) {
					System.out.println(p);
				}
				break;
			case 3:
				System.out.println("************** 상품 번호로 검색 **************");
				System.out.print("상품 번호를 입력하세요 : ");
				System.out.println(mgr.numSearch(sc.next()));
				break;
			case 4:
				System.out.println("************** 상품명으로 검색  **************");
				System.out.print("가격을 입력하세요 : ");
				System.out.println(mgr.nameSearch(sc.next()));
				break;
			case 5:
				System.out.println("************** TV 검색  **************");
				for(Product p : mgr.tvSearch()) {
					System.out.println(p);
				}
				break;
			case 6:
				System.out.println("************** 냉장고 검색  **************");
				for(Product p : mgr.rfSearch()) {
					System.out.println(p);
				}
				break;
			case 7:
				System.out.println("************** 400L 이상 냉장고  **************");
				for(Product p : mgr.volumeSearch()) {
					System.out.println(p);
				}
				break;
			case 8:
				System.out.println("************** 50inch 이상 TV  **************");
				for(Product p : mgr.inchSearch()) {
					System.out.println(p);
				}
				break;
			case 9:
				System.out.println("************** 상품 가격 수정  **************");
				System.out.print("수정하고 싶은 상품의 번호를 입력하세요 : ");
				String pnum = sc.next();
				System.out.print("원하는 가격을 입력하세요 : ");
				int pp = sc.nextInt();
				mgr.priceUpdate(pnum, pp);
				System.out.println("상품 가격이 수정되었습니다.");
				break;
			case 10:
				System.out.println("************** 상품 정보 삭제 **************");
				System.out.print("삭제하고 싶은 상품의 번호를 입력하세요 : ");
				mgr.delete(sc.next());
				System.out.println("상품이 삭제되었습니다.");
				break;
			case 11:
				System.out.println("************** 전체 재고 상품 금액  **************");
				System.out.println("전체 재고 상품 금액 합계 : " + mgr.doSum());
				break;
			case 0:
				System.out.println("종료합니다.");
				System.exit(0);
			}
		}
	}

}
