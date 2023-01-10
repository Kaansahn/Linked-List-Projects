package doublyLinkedList;

import student.Student;

public class Node {
	private Student student;
	private Node prev;
	private Node next;
	
	public Node() {
		student = null;
		prev = null;
		next = null;
	}
	
	public Node(Student student) {
		setStudent(student);
		prev = null;
		next = null;
	}
	
	public Node(Student student, Node next) {
		setStudent(student);
		prev = null;
		this.next = next;
	}
	
	public Node(Student student, Node prev, Node next) {
		setStudent(student);
		this.prev = prev;
		this.next = next;
	}

	public Student getStudent() {
		return student;
	}

	public Node getPrev() {
		return prev;
	}

	public Node getNext() {
		return next;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
}
