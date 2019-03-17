package model;

public class Student {
	String name;
	final int MAX_NUM_COURSES = 5;
	CourseRecord [] courses;
	int noc;
	
	public Student (String name) {
		this.name = name;
		this.courses = new CourseRecord [MAX_NUM_COURSES];
		this.noc = 0;
	}
	
	public void addCourse(CourseRecord c) {
		this.courses[this.noc] = c;
		this.noc ++;
	}
	
	public String getDescription() {
		String result = "";
		result += "Student " + this.name + " has registered " + this.noc + "courses: \n";
		
		for (int i = 0; i < this.noc; i ++) {
			result += this.courses[i].getDescription() + " \n";
		}
		
		return result;
	}
	
	
}
