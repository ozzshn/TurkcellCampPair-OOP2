package oopWorkshop2;

public class CourseManager {

	public void add(Student student,Course course) {
		System.out.println("Course Name: "+course.getCourseName()+ " Added student:  "+ student.getFirstName()+" "+student.getSurName());
	}
	
	public void getAll(Course[] courses) {
		for(Course course:courses) {
			System.out.println(course.getCourseName());
		}
	}
}
