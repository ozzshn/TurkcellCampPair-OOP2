package oopWorkshop2;

public class Course {

	private int id;
	private String courseName;
	private Category category;
	
	private Instructor[] instructors;
	private Student[] students;
	
	public Course() {
		super();
	}

	public Course(int id, String courseName, Category category) {
		super();
		this.id = id;
		this.courseName = courseName;
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Instructor[] getInstructors() {
		return instructors;
	}

	public void setInstructors(Instructor[] instructors) {
		this.instructors = instructors;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}
	
	
}
