package tests;

import model.*;

public class StudentTester3 {

	public static void main(String[] args) {
	Student s1 = new Student("Heeyon");
	
	CourseRecord cr = new CourseRecord("1021");
	s1.addCourse(cr);
	System.out.println(s1.getDescription());
	
	s1.addCourse("2030");
	System.out.println(s1.getDescription());
	
	cr.setMarks(79);
	s1.courses[1].setMarks(60);
	System.out.println(s1.getDescription());
	
	}

}
