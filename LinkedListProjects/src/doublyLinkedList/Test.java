package doublyLinkedList;

import student.Student;

public class Test {
	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.insertAtBack(new Student(1, "AAA", 3.5));
		list.insertAtFront(new Student(2, "BBB", 3.0));
		list.insertAtBack(new Student(4, "DDD", 2.0));
		list.insertAtBack(new Student(3, "CCC", 2.5));
		
		list.outputListBackward();
	}
}
