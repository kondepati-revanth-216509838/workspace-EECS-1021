package tests;

import model.*;

public class StudentTester5 {

	public static void main(String[] args) {
		
		Faculty f1 = new Faculty("Jonathan", "LAS2045", 70139);
		Faculty f2 = new Faculty("Jackie", "LAS2043", 70130);
		
		CourseRecord cr1 = new CourseRecord("2030");
		CourseRecord cr2 = new CourseRecord("1021");
		CourseRecord cr3 = new CourseRecord("3311");
		
		Student s1 = new Student ("SunHye");
		Student s2 = new Student ("JiHye");
		
		//Link from course objects to faculty objects
		cr1.setInstructor(f2);
		cr2.setInstructor(f2);
		cr3.setInstructor(f1);
		
		//Link from student objects to course record objects
		s1.addCourse(cr1);
		s1.addCourse(cr2);
		s1.addCourse(cr3);
		
		s2.addCourse(cr2);
		s2.addCourse(cr3);
		
		System.out.println(s1.getDescription());
		
		s1.setMarks("2030", 89);
		s1.setMarks("1021", 67);
		s1.setMarks("3311", 70);
		
		System.out.println(s1.getDescription());
	}

}
