package circularLinkedList;

import student.Student;

public class Node {
	private Student student;
	private Node link;
	
	public Node(Student student) {
		setStudent(student);
		link = null;
	}
	
	public Node(Student student, Node link) {
		setStudent(student);
		this.link = link;
	}

	public Student getStudent() {
		return student;
	}

	public Node getLink() {
		return link;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public void setLink(Node link) {
		this.link = link;
	}
	
}
