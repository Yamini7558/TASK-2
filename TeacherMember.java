package com.task2;

public class TeacherMember extends Member {

	private static final int maxBooksIsuued = 10;

	public TeacherMember(int memberId, String name) {
		super(memberId, name, maxBooksIsuued);

	}
}