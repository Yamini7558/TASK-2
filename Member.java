package com.task2;

import java.util.ArrayList;
import java.util.List;

public class Member {

	private int memberId;
	private String name;
	private int maxBooksIssued;
	private List<Book> currentIssuedBooks;

	public Member(int memberId, String name, int maxBooksIsuued) {
		super();
		this.memberId = memberId;
		this.name = name;
		this.maxBooksIssued = maxBooksIssued;
		this.currentIssuedBooks = new ArrayList<>();
	}

	public int getMemberId() {
		return memberId;
	}

	public String getName() {
		return name;
	}

	public int getMaxBooksIsuued() {
		return maxBooksIssued;
	}

	public List<Book> getCurrentIssuedBooks() {
		return currentIssuedBooks;
	}

	public void addIssuedBook(Book book) {
		if (currentIssuedBooks.size() < maxBooksIssued) {
			currentIssuedBooks.add(book);
		}
	}

	public void removeIssuedBook(Book book) {
		currentIssuedBooks.remove(book);

	}

}