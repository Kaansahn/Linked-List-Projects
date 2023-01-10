package doublyLinkedList;

import student.Student;

public class DoublyLinkedList {
	private Node first;
	private Node last;
	
	public DoublyLinkedList() {
		first = null;
		last = null;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void insertAtFront(Student student) {
		Node newNode = new Node(student);
		if (isEmpty()) {
			first = last = newNode;
		}
		else {
			newNode.setNext(first);
			first.setPrev(newNode);
			first = newNode;
		}
	}
	
	public void insertAtBack(Student student) {
		Node newNode = new Node(student);
		if (isEmpty()) {
			first = last = newNode;
		}
		else {
			newNode.setPrev(last);
			//newNode.setNext(null);
			last.setNext(newNode);
			last = last.getNext(); //last = newNode;
		}
	}
	
	public boolean removeFromFront() {
		if (isEmpty()) {
			return false;
		}
		else {
			if (first == last) {
				first = last = null;
			}
			else {
				first = first.getNext();
				first.setPrev(null);
			}
			return true;
		}
	}
	
	public boolean removeFromBack() {
		if (isEmpty()) {
			return false;
		}
		else {
			if (first == last) {
				first = last = null;
			}
			else {
				last = last.getPrev();
				last.setNext(null);
			}
			return true;
		}
	}
	
	public void outputList() {
		Node temp = first;
		while (temp != null) {
			System.out.println(temp.getStudent());
			temp = temp.getNext();
		}
	}
	
	public void outputListBackward() {
		Node temp = last;
		while (temp != null) {
			System.out.println(temp.getStudent());
			temp = temp.getPrev();
		}
	}
}
