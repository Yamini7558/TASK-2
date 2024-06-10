package com.task2;

public interface LibraryOperations {
	boolean issueBook(Book book, Member member);

	boolean returnBook(Book book, Member member);
}