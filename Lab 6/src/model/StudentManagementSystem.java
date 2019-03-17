package model;

public class StudentManagementSystem {
	
	Student Students[];
	int nOS;
	
	public StudentManagementSystem(){
		int length = (int) (5*Math.pow(10,10));
		this.Students = new Student[length];
		this.nOS = 0;
	}
	
	public String getDescription() {
		String description = "Student ";
		return description;
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
