package com.ssafy.java.day05.clazz03;

public class Refrigerator extends Product{
	private String volume;
	
	@Override
	public String toString() {
		String s = (super.getpNum() + " | " + super.getpName() + " | " + super.getPrice() 
		+ " | " + super.getQuantity() + " | " + this.volume);
		return s;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String string) {
		this.volume = string;
	}
}
