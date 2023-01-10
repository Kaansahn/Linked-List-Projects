package orderedLinkedList;

import student.Student;

public class OrderedLinkedList {
	private Node first;
	private Node last;
	
	public OrderedLinkedList() {
		first = null;
		last = null;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void insert(Student studentName) {
		Node newStudent = new Node(studentName);
		Node current = first;
		Node prev = new Node();
		
		if (isEmpty())
			first = last = newStudent;
		else {
			while (current != null) {
				if (current.getStudent().getFullName().compareTo(studentName.getFullName()) > 0) {
					if (current == first) {
						newStudent.setLink(first);
						first = newStudent;
						break;
					}
					else {
						prev.setLink(newStudent);
						newStudent.setLink(current);
						break;
					}
				}
				else if (current == last) {
					last.setLink(newStudent);
					newStudent.setLink(null);
					last = newStudent;
				}
				prev = current;
				current = current.getLink();
			}
		}
	}
	
	public int size() {
		int count = 0;
		Node current = first;
		
		while (current != null) {
			count++;
			current = current.getLink();
		}
		return count;
	}
	
	public void outputList() {
		Node current = first;
		while(current != null) {
			System.out.println(current.getStudent());
			current = current.getLink();
		}
	}
	
	public boolean search(Student target) {
		Node position = first;
		Student studentAtPosition;
		while (position != null) {
			studentAtPosition = position.getStudent();
			if (studentAtPosition == target) 
				return true;
			position = position.getLink();
		}
		return false;
	}
}
