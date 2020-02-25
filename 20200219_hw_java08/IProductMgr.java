package com.ssafy.java.day05.clazz03;

import java.util.List;

public interface IProductMgr {

	void add(); // 상품정보 입력
	List<Product> allshow(); // 상품 전체 검색
	Product numSearch(String num); // 상품번호로 검색
	Product nameSearch(String name); // 상품명으로 검색
	List<Product> tvSearch(); // TV만 검색
	List<Product> rfSearch(); // 냉장고만 검색
	List<Product> volumeSearch(); // 400L 이상 냉장고 검색
	List<Product> inchSearch(); // 50inch 이상 TV 검색
	void priceUpdate(String num, int price); // 가격 수정
	void delete(String num); // 상품 정보 삭제
	int doSum(); // 전체 재고 상품 금액
	
	
}
