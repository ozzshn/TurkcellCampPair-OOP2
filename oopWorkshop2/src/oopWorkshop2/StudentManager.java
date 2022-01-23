package oopWorkshop2;

public class StudentManager {
	public void add(Student student) {
		System.out.println("Added Student" + student.getFirstName()+" "+student.getSurName());
	}
	
	public void update(Student student) {
		System.out.println("Updated Student" + student.getFirstName()+" "+student.getSurName());
	}
	
	public void delete(Student student) {
		System.out.println("Deleted Student" + student.getFirstName()+" "+student.getSurName());
	}
}
