package model;

public class StudentManagementSystem {
	
	Student Students[];
	int nos;
	
	public StudentManagementSystem(){
		int length = 5;
		this.Students = new Student[length];
		this.nos = 0;
	}
	
	public String getDescription() {
		String description = "Student ";
		return description;
	}
	
	public void addStudent(Student student) {
		Students[nos] = student;
		nos++;
	}
	

	public Student[] getStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setMarks(String string, String string2, int i) {
		// TODO Auto-generated method stub
		
	}

	public String getGPA(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public char[] getMarks(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addStudent(String string) {
		// TODO Auto-generated method stub
		
	}

	public void addCourse(String string, CourseRecord cr6) {
		// TODO Auto-generated method stub
		
	}
	
}
