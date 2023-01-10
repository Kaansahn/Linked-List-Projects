package linkedList;

import student.Student;

public class MyLinkedList {
	private MyNode root;
	
	public MyLinkedList() {
		root = null;
	}
	
	public void addStudent(Student student) {
		MyNode node = new MyNode(student);
		if (root == null) {
			root = node;
		}
		else { //if there exist some previous MyNode instances
			MyNode currentNode = root;
			while (currentNode.next != null) 
				currentNode = currentNode.next;
			currentNode.next = node;
		}
	}
	
	public void searchGpa(double gpa) { // find students that have higher GPA
		MyNode currentNode = root;
		while (currentNode != null) {
			if (currentNode.getStudent().getGpa() > gpa) 
				System.out.println(currentNode.getStudent());
			currentNode = currentNode.next;
		}
	}
	
	public void printData() {
		MyNode currentNode = root;
		while (currentNode != null) {
			System.out.println(currentNode.getStudent());
			currentNode = currentNode.next;
		}
	}
	
	public void addFront(Student student) {
		MyNode newFront = new MyNode(student);
		newFront.next = root;
		root = newFront;
	}
	
	public void deleteNode(Student student) {
		MyNode temp = root;
		MyNode prev = null;
		
		if (temp != null && temp.getStudent() == student) {
			root = temp.next;
			return;
		}
		while (temp != null && temp.getStudent() != student) {
			prev = temp;
			temp = temp.next;
		}
		if (temp == null) 
			return;
		prev.next = temp.next;
	}
	
	public MyNode addStudentToGivenPosition(MyNode headNode, int position, Student data) {
		if (position <= 0) 
			System.out.println("Invalid position");
		else if (position == 1) 
			addFront(data);
		else {
			MyNode newNode = new MyNode(data);
			MyNode prev = root;
			
			int count = 1;
			while (count < position - 1) {
				prev = prev.next;
				count++;
			}
			
			MyNode current = prev.next;
			newNode.next = current;
			prev.next = newNode;
		}
		return root;
	}
}
