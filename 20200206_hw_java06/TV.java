package com.ssafy.java.day05.clazz03;

public class TV extends Product{
	private int inch;
	private String type;
	
	@Override
	public String toString() {
		String s = (super.getpNum() + " | " + super.getpName() + " | " + super.getPrice() + " | " 
	+ super.getQuantity() + " | " + this.inch + " | " + this.type);
		return s;
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
