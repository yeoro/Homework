package com.ssafy.java.day05.clazz03;

public class Magazine extends Book{
	private int year;
	private int month;
	
	
	@Override
	public String toString() {
		System.out.println("-----------------------------------------");
		return (super.getIsbn() + " | " + super.getTitle() + "| " + super.getAuthor() + " | " + super.getPublisher()
				 + " | " + super.getPrice() + " | " + super.getDesc() + " | " + this.year + "." + this.month);
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
}
