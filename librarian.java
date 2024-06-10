package com.task2;

public class librarian extends Member {

	public librarian(int memberId, String name) {
		super(memberId, name, Integer.MAX_VALUE);

	}

	public void addBook(Library library, Book book) {
		library.getBooks().add(book);
	}

	public void removeBook(Library library, Book book) {
		library.getBooks().remove(book);
	}

}