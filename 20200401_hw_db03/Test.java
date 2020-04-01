package board;

import java.util.List;
import java.util.Scanner;

import board.dao.ProductDAO;
import board.vo.Product;

public class Test {
	
	public static void main(String[] args) {
		ProductDAO pDAO = new ProductDAO();
		String code, name;
		int price;
		Product p;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("------------ 메뉴 선택 ------------");
			System.out.println(
					"\t1. 전체 상품 조회\n"
							+ "\t2. 상품 번호로 조회\n"
							+ "\t3. 상품 정보 입력\n"
							+ "\t4. 상품 정보 수정\n"
							+ "\t5. 상품 삭제\n"
							+ "\t6. 종료");
			System.out.println("--------------------------------");
			System.out.print("메뉴를 선택하세요 : ");

			int menu = sc.nextInt();
			
			switch(menu) {
			// 전체 상품 조회
			case 1:
				try {
					List<Product> list = pDAO.selectProduct();
					
					System.out.println("-----------------------------");
					System.out.println("상품번호\t상품명\t가격");
					System.out.println("-----------------------------");
					
					for(Product product : list) {
						System.out.println(
								product.getCode() + "\t" + 
								product.getName() + "\t" + 
								product.getPrice() + "\t");
					}
					
					if(list.isEmpty()) {
						System.out.println("데이터가 존재하지 않습니다.");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
				
				// 상품 번호로 조회
			case 2:
				System.out.print("조회할 상품 번호를 입력하세요 : ");
				code = sc.next();
				
				System.out.println("----------------- 상품 정보 -----------------");
				System.out.println(pDAO.selectProductByCode(code).toString());
				System.out.println("------------------------------------------");
				
				break;
				
				// 상품 정보 입력
			case 3:
				p = new Product();
				
				System.out.print("상품 명을 입력하세요 : ");
				name = sc.next();
				p.setName(name);
				
				System.out.print("상품 가격을 입력하세요 : ");
				price = sc.nextInt();
				p.setPrice(price);
				
				try {
					pDAO.insertProduct(p);
					System.out.println("상품이 등록되었습니다.");
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
				
			// 상품 정보 수정
			case 4:
				p = new Product();
				
				System.out.print("수정할 상품의 번호를 입력하세요 : ");
				code = sc.next();
				
				System.out.print("상품 명을 입력하세요 : ");
				name = sc.next();
				p.setName(name);
				
				System.out.print("상품 가격을 입력하세요 : ");
				price = sc.nextInt();
				p.setPrice(price);
				
				try {
					pDAO.updateProduct(p, code);
					System.out.println("상품 정보가 수정되었습니다.");
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
				
			// 상품 삭제
			case 5:
				System.out.print("수정할 상품의 번호를 입력하세요 : ");
				code = sc.next();
				
				try {
					pDAO.deleteProduct(code);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
				
			// 종료
			case 6:
				System.exit(0);
			}
			
		}
		
			
	}

}
