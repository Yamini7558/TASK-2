package com.task2;

public class MainClass {

	public static void main(String[] args) {
		Library library = new Library();
		Librarian librarian = new Librarian(1, "manya");
		StudentMember student = new StudentMember(2, "chaithu S");
		TeacherMember teacher = new TeacherMember(45, "ramya");

		Book book1 = new Book(100, "java programming", "Author A");
		Book book2 = new Book(200, "SQL", "Author B");

		librarian.addBook(library, book1);
		librarian.addBook(library, book2);

		System.out.println(" Books in library: ");
		for (Book book : library.getBooks()) {
			System.out.println(book.getTitle());
		}
		if (library.issueBook(book1, student)) {
			System.out.println(student.getName()+ " "+ " Successfully issued" + book1.getTitle());

		} else {
			System.out.println(student.getName() + " "+ "Could not issue" + book1.getTitle());
		}

		if (library.returnBook(book1, student)) {
			System.out.println(student.getName() + " "+ " Successfully returned" + book1.getTitle());

		} else {
			System.out.println(student.getName() + " "+ "Could not return" + book1.getTitle());
		}


		librarian.removeBook(library, book2);
		System.out.println("books in office after removal : ");
		for (Book book : library.getBooks()) {
			System.out.println(book.getTitle());
		}
	}
}