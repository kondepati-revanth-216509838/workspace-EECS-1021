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
		String description = "Student management system currently stores " + this.nos + " students: \n";
		for (int i = 0; i < this.nos; i ++) {
			description += "\n" +  Students[i].getDescription();
		}
		return description;
	}
	
	public void addStudent(Student student) {
		Students[nos] = student;
		nos++;
	}
	

	public Student[] getStudents() {
		Student temp [] = new Student[this.nos];
		for (int i = 0; i < this.nos; i ++) {
			temp[i] = Students[i];
		}
		return temp;
	}

	public void setMarks(String name, String code, int marks) {
		int index = this.indexOf(name);
		
		if (index >= 0) {
			Students[index].setMarks(code, marks);
		}
		
	}

	public double getGPA(String name) {
		double gpa = -1;
		int index = this.indexOf(name);
		
		if (index >= 0) {
			gpa = Students[index].getGPA();
		}
		return gpa;
	}

	public int getMarks(String name, String course) {
		int marks = -1;
		int index = this.indexOf(name);
		
		if (index >= 0) {
			marks = Students[index].getMarks(course);	
		}
		
		return marks;
	}
	
	int indexOf(String name) {
		int index = -1;
		boolean found = false;
		
		for (int i = 0; i < this.nos && !found; i ++) {
			if (Students[i].name.equals(name)) {
				index = i;
				found = true;
			}
		}
		
		return index;
	}

	public void addStudent(String name) {
		Student temp = new Student (name);
		Students[nos] = temp;
		nos ++;
		
	}

	public void addCourse(String name, CourseRecord course) {
		int index = this.indexOf(name);
		
		if (index >= 0) {
			Students[index].addCourse(course);
		}
		
	}
	
}
