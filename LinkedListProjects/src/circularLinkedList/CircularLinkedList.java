package circularLinkedList;

import student.Student;

public class CircularLinkedList {
	private Node first;
	private Node last;

	public CircularLinkedList() {
		first = null;
		last = first;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void addStudent(Student student) {
		Node newNode = new Node(student);
		
		if (isEmpty()) 
			first = newNode;
		else 
			last.setLink(newNode);
		last = newNode;
		last.setLink(first);
	}
	
	public void outputList() {
		Node currentNode = first;
		
		while (true) {
			System.out.println(currentNode.getStudent());
			if (currentNode == last)
				break;
			currentNode = currentNode.getLink();
		}
	}
}
