package student;

public class Student {
	private int id;
	private String fullName;
	private double gpa;
	
	public Student(int id, String fullName, double gpa) {
		this.id = id;
		this.fullName = fullName;
		this.gpa = gpa;
	}
	
	public int getId() {
		return id;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID: " + id + " Full Name: " + fullName + " GPA: " + gpa + "\n";
	}
}
