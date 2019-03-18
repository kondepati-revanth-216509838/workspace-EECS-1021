package model;

public class CourseRecord {
	public String title;
	public int marks;
	
	public Faculty instructor;
	
	public CourseRecord() {
		//Leave it alone, it's a key to initialize without entering any parameters
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
	
	String getLetterGrade() {
		String lg = "";
		
		if (this.marks >= 90) {
			lg = "A+";
		} else if (this.marks >= 80) {
			lg = "A";
		} else if (this.marks >= 70) {
			lg = "B";
		} else if (this.marks >= 60) {
			lg = "C";
		} else if (this.marks >= 50) {
			lg = "D";
		} else {
			lg = "F";
		}
		return lg;
	}
	
	public String getDescription() {
		String description = "";
		
		if (this.instructor == null) {
			description = "Course " + this.title + " (raw marks: " + this.marks + ") has no instructor ";
		} else {
			description = "Course " + this.title + " letter grade: " + this.getLetterGrade() + " (raw marks: " + this.marks + ") has instructor " + this.instructor.getDescription();
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
