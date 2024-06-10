package com.task2;

public class StudentMember extends Member {
	private static final int MAX_BOOKS_ISSUED = 5;

	public StudentMember(int memberId, String name) {
		super(memberId, name, MAX_BOOKS_ISSUED);
	}
}