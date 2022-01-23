package oopWorkshop2;

public class Main {
	public static void main(String[] args) {

		Student student1 = new Student(1, "Oznur", "Sahin", "o@s.com", "12345", "Kocaeli");
		Student student2 = new Student(2, "Anil", "Sahin", "a@s.com", "54321", "Kocaeli");

		Student[] students = { student1, student2 };

		Instructor instructor1 = new Instructor(1, "Engin ", "Demirog", "e@d.com", "3579", 10000);
		Instructor instructor2 = new Instructor(2, "Murat ", "Yucedag", "m@y.com", "9753", 1000);

		Instructor[] instructors = { instructor1, instructor2 };

		Category category1 = new Category(1, "Yazilim");

		Course course1 = new Course(1, "Java", category1);
		course1.setInstructors(new Instructor[] { instructor1 });
		course1.setStudents(new Student[]{student1});
		
		Course course2 = new Course(2, "C#", category1);
		course2.setInstructors(new Instructor[] { instructor1, instructor2 });
		course2.setStudents(new Student[]{student1,student2});
		
		Course[] courses = { course1, course2 };
		User[] users = { student1, student2, instructor1, instructor2 };

		for (User user : users) {
			System.out.println("Kullanicilar:  " + user.getFirstName() + " " + user.getSurName());
		}
		System.out.println("-------------------------------------------");
		System.out.println("Course2 Instructors: ");
		
		for(Instructor instructor: course2.getInstructors()) {
			System.out.println(instructor.getFirstName()+" "+instructor.getSurName());
		}
		
		System.out.println("-------------------------------------------");
		System.out.println("Course2 Students: ");
		for (Student student :course2.getStudents()) {
			System.out.println(student.getFirstName()+" "+ student.getSurName());
		}
			
		System.out.println("-------------------------------------------");

		CourseManager courseManager=new CourseManager();
		courseManager.getAll(courses);
		courseManager.add(student2, course1);
	
		System.out.println("-------------------------------------------");

		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.delete(instructor2);
		instructorManager.update(instructor1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
