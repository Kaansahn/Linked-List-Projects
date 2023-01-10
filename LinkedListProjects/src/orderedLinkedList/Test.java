package orderedLinkedList;

import student.Student;

public class Test {
	public static void main(String[] args) {
		OrderedLinkedList list = new OrderedLinkedList();
		list.insert(new Student(1, "ddd", 3.2));
		list.insert(new Student(2, "aaa", 3.5));
		list.insert(new Student(3, "ccc", 3.4));
		list.outputList();
		System.out.println("------------------------");
		
		Student student = new Student(4, "zzz", 3.7);
		list.insert(student);
		list.outputList();
		if (list.search(student))
			System.out.println("Student " + student + " is found");
		else
			System.out.println("Not found");
	}
}
