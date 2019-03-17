package model;

public class CourseRecord {
	String title;
	int marks;
	
	Faculty instructor;
	
	public CourseRecord () {
		
		
	}
	
	
	public CourseRecord(String title) {
		this.title = title;
	}
	
	public CourseRecord(String title, int marks) {
		this.title = title;
		this.marks = marks;
	}


	public void setInstructor(Faculty instructor) {
		this.instructor = instructor;
	}
	
	public String getDescription() {
		String description = "";
		
		if (this.instructor == null) {
			description = "Course " + this.title + " (raw marks: " + this.marks + ") has no instructor ";
		} else {
			description = "Course " + this.title + " (raw marks: " + this.marks + ") has instructor " + this.instructor.getDescription();
		}
		return description;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public String getTitle() {
		return title;
	}


	public Faculty getInstructor() {
		return instructor;
	}
	
}
