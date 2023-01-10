package linkedList;

import student.Student;

public class Test {
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		Student st1 = new Student(1234567, "Kaan Sahin", 3.5);
		list.addStudent(st1);
		Student st2 = new Student(2345678, "Ali Yilmaz", 2.5);
		list.addStudent(st2);
		Student st3 = new Student(3456789, "Kerim Bahcivan", 2.2);
		list.addStudent(st3);;
		list.printData();
		System.out.println("-----------------------------------");
		
		Student st4 = new Student(4567891, "Mustafa Kurt", 3.0);
		list.addFront(st4);
		list.printData();
		System.out.println("-----------------------------------");
		
		list.deleteNode(st4);
		list.printData();
		System.out.println("-----------------------------------");
		
		Student st5 = new Student(5678912, "Emir Boz", 1.5);
		MyNode headNode = new MyNode(st1);
		list.addStudentToGivenPosition(headNode, 3, st5);
		list.printData();
		System.out.println("-----------------------------------");
	}

}
