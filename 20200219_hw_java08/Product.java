package com.ssafy.java.day05.clazz03;

public class Product {
	private String num;
	private String name;
	private int price;
	private int quantity;
	
	
	@Override
	public String toString() {
		return "Product [num=" + this.num + ", name=" + this.name + ", price=" 
	+ this.price + ", quantity=" + this.quantity + "]";
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

}
