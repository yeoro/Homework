package com.ssafy.java.day04.clazz03.self;

public class HW_java05_20200205 {

	public static void main(String[] args) {
		
		TV tv = new TV();
		Refrigerator rf = new Refrigerator();
		
		tv.setpNum("21424");
		tv.setpName("SAMSUNG");
		tv.setPrice(2000000);
		tv.setQuantity(100);
		tv.setInch(64);
		tv.setType("QLED");
		
		rf.setpNum("35535");
		rf.setpName("SAMSUNG");
		rf.setPrice(3000000);
		rf.setQuantity(200);
		rf.setVolume("800L");
		
		System.out.println("********************* TV 정보 *********************");
		System.out.println(tv.toString());
		System.out.println("********************* 냉장고 정보 *********************");
		System.out.println(rf.toString());
	}

}

class TV{
	private String num;
	private String name;
	private int price;
	private int quantity;
	private int inch;
	private String type;
	
	@Override
	public String toString() {
		String s = (this.num + " | " + this.name + " | " + this.price + " | " + this.quantity
				 + " | " + this.inch + " | " + this.type);
		return s;
	}
	
	public String getpNum() {
		return num;
	}
	public void setpNum(String pNum) {
		this.num = pNum;
	}
	public String getpName() {
		return name;
	}
	public void setpName(String pName) {
		this.name = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}

class Refrigerator{
	private String num;
	private String name;
	private int price;
	private int quantity;
	private String volume;
	
	@Override
	public String toString() {
		String s = (this.num + " | " + this.name + " | " + this.price + " | " + this.quantity
				 + " | " + this.volume);
		return s;
	}

	public String getpNum() {
		return num;
	}

	public void setpNum(String pNum) {
		this.num = pNum;
	}

	public String getpName() {
		return name;
	}

	public void setpName(String pName) {
		this.name = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String string) {
		this.volume = string;
	}
	
	
}