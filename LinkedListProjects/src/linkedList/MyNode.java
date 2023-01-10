package linkedList;

import student.Student;

public class MyNode {
	private Student student;
	MyNode next;
	
	public MyNode(Student student) {
		this.student = student;
		next = null;
	}

	public Student getStudent() {
		return student;
	}
}
