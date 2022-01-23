package oopWorkshop2;

public class Student extends User {

	private Course[] course;
	private String schoolName;

	public Student() {
		super();
	}

	public Student(int id,String firstName,String surName,String email,String password,String schoolName) {
		super(id,firstName,surName,email,password);
		this.schoolName = schoolName;
	}
	
	public Course[] getCourse() {
		return course;
	}

	public void setCourse(Course[] course) {
		this.course = course;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

}
