package oopWorkshop2;

public class Instructor extends User {

	private Course[] course;

	private double salary;

	public Instructor() {
		super();
	}

	public Instructor(int id, String firstName, String surName, String email, String password, double salary) {
		super(id, firstName, surName, email, password);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Course[] getCourse() {
		return course;
	}

	public void setCourse(Course[] course) {
		this.course = course;
	}

}
