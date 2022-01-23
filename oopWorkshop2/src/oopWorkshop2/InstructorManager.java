package oopWorkshop2;

public class InstructorManager {

	public void add(Instructor instructor) {
		System.out.println("Added instructor:  "+ instructor.getFirstName()+" "+instructor.getSurName());
	}
	
	public void delete(Instructor instructor) {
		System.out.println("Deleted instructor:  "+ instructor.getFirstName()+" "+instructor.getSurName());
	}
	
	public void update(Instructor instructor) {
		System.out.println("Updated instructor:  "+ instructor.getFirstName()+" "+instructor.getSurName());
	}
}
