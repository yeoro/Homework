package com.ssafy.java.day05.clazz03;

import java.util.Arrays;
import java.util.Scanner;




public class BookTest {
	
	static Book[] arr = new Book[3];
	static Book M = new Magazine();
	static Magazine m = (Magazine)M;
	static int i = 0;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		loop : while(true) {
			
			System.out.println("************** 도서 관리 프로그램 **************");
			System.out.println("1:데이터 입력 | 2:데이터 전체 검색 | 3:Isbn으로 검색 | 4. Title로 검색");
			System.out.println("5:책만 검색| 6:잡지만 검색 | 7:출판사로 검색 | 8. 가격으로 검색");
			System.out.println("9:모든 도서의 금액 합계 | 10:모든 도서의 금액 평균 | 0:종료");
			System.out.print("메뉴를 입력해주세요 : ");
			
			int menu = sc.nextInt();
			
			switch(menu) {
			case 0:
				System.out.println("종료합니다.");
				System.exit(0);
			case 1:
				insert();
				System.out.println();
				break;
			case 2:
				allShow(arr);
				System.out.println();
				break;
			case 3:
				System.out.println("************** Isbn 검색 **************");
				System.out.print("Isbn를 입력해주세요 : ");
				
				M = isbnSearch(sc.next());
				
				if(M == null) {
					System.out.println("해당 도서 번호를 가진 도서가 없습니다.");
				}
				
				if(M instanceof Magazine) {
					System.out.println("--------------------------");
					System.out.println("잡지 번호 : " + M.getIsbn());
					System.out.println("잡지명 : " + M.getTitle());
					System.out.println("저자 : " + M.getAuthor());
					System.out.println("출판사 : " + M.getPublisher());
					System.out.println("가격 : " + M.getPrice());
					System.out.println("설명 : " + M.getDesc());
					System.out.println("출판 년도 : " + ((Magazine) M).getYear());
					System.out.println("출판 월 : " + ((Magazine) M).getMonth());
					System.out.println("--------------------------");
				}else if(M instanceof Book) {
					
					System.out.println("--------------------------");
					System.out.println("도서 번호 : " + M.getIsbn());
					System.out.println("도서명 : " + M.getTitle());
					System.out.println("저자 : " + M.getAuthor());
					System.out.println("출판사 : " + M.getPublisher());
					System.out.println("가격 : " + M.getPrice());
					System.out.println("설명 : " + M.getDesc());
					System.out.println("--------------------------");
				}
				
				break;
			case 4:
				System.out.println("************** Title 검색 **************");
				System.out.print("제목을 입력해주세요 : ");
				
				M = titleSearch(sc.next());
				
				if(M instanceof Magazine) {
					System.out.println("--------------------------");
					System.out.println("잡지 번호 : " + M.getIsbn());
					System.out.println("잡지명 : " + M.getTitle());
					System.out.println("저자 : " + M.getAuthor());
					System.out.println("출판사 : " + M.getPublisher());
					System.out.println("가격 : " + M.getPrice());
					System.out.println("설명 : " + M.getDesc());
					System.out.println("출판 년도 : " + ((Magazine) M).getYear());
					System.out.println("출판 월 : " + ((Magazine) M).getMonth());
					System.out.println("--------------------------");
				}else if(M instanceof Book) {
					
					System.out.println("--------------------------");
					System.out.println("도서 번호 : " + M.getIsbn());
					System.out.println("도서명 : " + M.getTitle());
					System.out.println("저자 : " + M.getAuthor());
					System.out.println("출판사 : " + M.getPublisher());
					System.out.println("가격 : " + M.getPrice());
					System.out.println("설명 : " + M.getDesc());
					System.out.println("--------------------------");
				}
				break;
			case 5:
				System.out.println("************** Book **************");
				bookSearch();
				break;
			case 6:
				System.out.println("************** Magazine **************");
				magazineSearch();
				break;
			case 7:
				System.out.println("************** 출판사 검색 **************");
				System.out.print("출판사를 입력해주세요 : ");
				M = pubSearch(sc.next());
				
				if(M instanceof Magazine) {
					System.out.println("--------------------------");
					System.out.println("잡지 번호 : " + M.getIsbn());
					System.out.println("잡지명 : " + M.getTitle());
					System.out.println("저자 : " + M.getAuthor());
					System.out.println("출판사 : " + M.getPublisher());
					System.out.println("가격 : " + M.getPrice());
					System.out.println("설명 : " + M.getDesc());
					System.out.println("출판 년도 : " + ((Magazine) M).getYear());
					System.out.println("출판 월 : " + ((Magazine) M).getMonth());
					System.out.println("--------------------------");
				}else if(M instanceof Book) {
					
					System.out.println("--------------------------");
					System.out.println("도서 번호 : " + M.getIsbn());
					System.out.println("도서명 : " + M.getTitle());
					System.out.println("저자 : " + M.getAuthor());
					System.out.println("출판사 : " + M.getPublisher());
					System.out.println("가격 : " + M.getPrice());
					System.out.println("설명 : " + M.getDesc());
					System.out.println("--------------------------");
				}
				break;
			case 8:
				System.out.println("************** 가격 검색 **************");
				System.out.print("출판사를 입력해주세요 : ");
				M = priceSearch(sc.nextInt());
				
				if(M instanceof Magazine) {
					System.out.println("--------------------------");
					System.out.println("잡지 번호 : " + M.getIsbn());
					System.out.println("잡지명 : " + M.getTitle());
					System.out.println("저자 : " + M.getAuthor());
					System.out.println("출판사 : " + M.getPublisher());
					System.out.println("가격 : " + M.getPrice());
					System.out.println("설명 : " + M.getDesc());
					System.out.println("출판 년도 : " + ((Magazine) M).getYear());
					System.out.println("출판 월 : " + ((Magazine) M).getMonth());
					System.out.println("--------------------------");
				}else if(M instanceof Book) {
					
					System.out.println("--------------------------");
					System.out.println("도서 번호 : " + M.getIsbn());
					System.out.println("도서명 : " + M.getTitle());
					System.out.println("저자 : " + M.getAuthor());
					System.out.println("출판사 : " + M.getPublisher());
					System.out.println("가격 : " + M.getPrice());
					System.out.println("설명 : " + M.getDesc());
					System.out.println("--------------------------");
				}
				break;
			case 9:
				System.out.println("************** 모든 도서의 금액 합계 **************");
				System.out.println("합계 : " + doSum());
				break;
			case 10:
				System.out.println("************** 모든 도서의 금액 평균 **************");
				System.out.println("평균 : " + doSum() / arr.length);
				
				break;
			}
			
		}
		
		
	}
	

	static void insert(){
		Scanner sc = new Scanner(System.in);
		
		Book b1 = new Book();
		Magazine m1 = new Magazine();
		
		System.out.println("************** 데이터 입력 **************");
		System.out.print("입력할 데이터를 선택해주세요(책 : 1, 잡지 : 2) : ");
		
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.print("도서 번호 : ");
			b1.setIsbn(sc.next());
			System.out.print("도서 제목 : ");
			b1.setTitle(sc.next());
			System.out.print("도서 저자 : ");
			b1.setAuthor(sc.next());
			System.out.print("도서 출판사 : ");
			b1.setPublisher(sc.next());
			System.out.print("도서 가격 : ");
			b1.setPrice(sc.nextInt());
			System.out.print("도서 설명 : ");
			b1.setDesc(sc.next());
			
			arr[i] = b1;
			i++;
			
			System.out.println("도서가 입력되었습니다.");
			break;
		case 2:
			System.out.print("잡지 번호 : ");
			m1.setIsbn(sc.next());
			System.out.print("잡지 제목 : ");
			m1.setTitle(sc.next());
			System.out.print("잡지 저자 : ");
			m1.setAuthor(sc.next());
			System.out.print("잡지 출판사 : ");
			m1.setPublisher(sc.next());
			System.out.print("잡지 가격 : ");
			m1.setPrice(sc.nextInt());
			System.out.print("잡지 설명 : ");
			m1.setDesc(sc.next());
			System.out.print("출판 년도 : ");
			m1.setYear(sc.nextInt());
			System.out.print("출판 월 : ");
			m1.setMonth(sc.nextInt());
			
			arr[i] = m1;
			i++;
			System.out.println("잡지가 입력되었습니다.");
			break;
		}
	}
	static void allShow(Book[] arr) {
		System.out.println("************** 데이터 전체 검색 **************");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	static Book isbnSearch(String isbn) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				continue;
			}
			if(arr[i].getIsbn().equals(isbn)) {
				return arr[i];
			}
		}
		return null;
	}
	static Book titleSearch(String title) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				continue;
			}
			if(arr[i].getTitle().equals(title)) {
				System.out.println(arr[i]);
			}
		}
		return null;
	}
	static Book bookSearch() {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				continue;
			}
			if(arr[i] instanceof Book && !(arr[i] instanceof Magazine)) {
				System.out.println(arr[i]);
			}
		}
		return null;
	}
	static Book magazineSearch() {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				continue;
			}
			if(arr[i] instanceof Magazine) {
				System.out.println(arr[i]);
			}
		}
		return null;
	}
	static Book pubSearch(String pub) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				continue;
			}
			if(arr[i].getPublisher().equals(pub)) {
				return arr[i];
			}
		}
		return null;
	}
	static Book priceSearch(int price) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				continue;
			}
			if(arr[i].getPrice() < price) {
				return arr[i];
			}
		}
		return null;
	}
	static int doSum() {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				continue;
			}
			sum += arr[i].getPrice();
		}
		return sum;
	}
	
}
