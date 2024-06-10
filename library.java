package com.task2;

import java.util.ArrayList;
import java.util.List;

public class library implements libraryOperations {

	private List<Book> books;
	private List<Member> members;

	public library() {
		books = new ArrayList<>();
		members = new ArrayList<>();
	}

	public List<Book> getBooks() {
		return books;
	}

	public List<Member> getMembers() {
		return members;
	}
	
public void setBooks(List<Book> books) {
		this.books = books;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

	@Override
	public boolean issueBook(Book book, Member member) {

		if (!book.isIssued() && member.getCurrentIssuedBooks().size() < member.getMaxBooksIsuued()) {
			book.setIssued(true);
			member.addIssuedBook(book);
		}
return false;
	}

	@Override
	public boolean returnBook(Book book, Member member) {
		if (book.isIssued() && member.getCurrentIssuedBooks().contains(book)) {
			book.setIssued(false);
			member.removeIssuedBook(book);
			return true;
		}
		return false;

	}
}