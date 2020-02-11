package com.ssafy.java.day05.clazz03;

public class Book {
		private String isbn;
		private String title;
		private String author;
		private String publisher;
		private int price;
		private String desc;
		
		@Override
		public String toString() {
			System.out.println("-----------------------------------------");
			return (this.isbn + " | " + this.title + "| " + this.author + " | " + this.publisher
					 + " | " + this.price + " | " + this.desc);
		}

		public String getIsbn() {
			return isbn;
		}
		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getPublisher() {
			return publisher;
		}

		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}

		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getDesc() {
			return desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		
	
}
