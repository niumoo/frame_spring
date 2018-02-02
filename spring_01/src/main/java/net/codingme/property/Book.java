package net.codingme.property;

/**
 * <p>Description：TODO</p>
 * 
 * @author  NiuJinpeng
 * @date    2018年2月16日下午3:28:50
 */
public class Book {
	private String bookName;

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public void say() {
		System.out.println("[Book] Hello, I am book "+bookName);
	}
}
