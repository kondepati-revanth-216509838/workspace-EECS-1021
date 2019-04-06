package model;

public class Student {
	public String name;
	public final int MAX_NUM_COURSES = 5;
	public CourseRecord [] courses;
	public int noc;
	double gpa = 0.0;
	public Student (String name) {
		this.name = name;
		this.courses = new CourseRecord [MAX_NUM_COURSES];
		this.noc = 0;
	}
	
	public void addCourse(CourseRecord c) {
		this.courses[this.noc] = c;
		this.noc ++;
	}
	
	public void addCourse(String title) {
		CourseRecord c = new CourseRecord(title);
		this.addCourse(c);
//		this.courses[this.noc] = c;
//		this.noc ++;
	}
	
	public int getMarks(String title) {
		int marks = -1;
		boolean found = false;
		
		for (int i = 0; i < this.noc && !found; i ++) {
			if (this.courses[i].getTitle().equals(title)) {
				found = true;
				marks = this.courses[i].getMarks();
			}
		}
		
		if (!found) {
			marks = -1;
		}
		
//		int index = this.indexOf(title);
//		
//		if (index >= 0){
//			marks = this.courses[index].getMarks();
//		}
//		
		return marks;
	}
	
	public void setMarks(String title, int marks) {
//		boolean found = false;
//		
//		for (int i = 0; i < this.noc && !found; i ++) {
//			if (this.courses[i].getTitle().equals(title)) {
//				found = true;
//				this.courses[i].setMarks(marks);
//			}
//		}
		
		int index = this.indexOf(title);
		if (index >= 0) {
			this.courses[index].setMarks(marks);
		}
		
	}
	
	int indexOf(String title) {
		int index = 0;
		boolean found = false;
		for (int i = 0; i < this.noc && !found; i ++) {
			if (this.courses[i].getTitle().equals(title)) {
				index = i;
				found = true;
			}
		}
		
		
		
		return index;
	}
	
	public double getGPA() {
		double gpa = 0.0;
		double gp = 0.0;

			for (int i = 0; i < this.noc; i ++) {
//				CourseRecord c = this.courses[i];
//				String lg = c.getLetterGrade();
				String lg = this.courses[i].getLetterGrade();
				if (lg.equals("A+")) {
					gp += 9;
				} else if (lg.equals("A")) {
					gp += 8;
				} else if (lg.equals("B")) {
					gp += 7;
				} else if (lg.equals("C")) {
					gp += 6;
				} else if (lg.equals("D")) {
					gp += 5;
				} else {
					gp += 0;
				} 

			}
			
			if (this.noc != 0) {
			
				gpa = gp/this.noc;
			
			}
		
		return gpa;
	}
	
	public String getDescription() {
		String result = "";
		result += "Student " + this.name + " has registered " + this.noc + " courses: (with GPA "+ this.getGPA() +  ")\n";
		
		for (int i = 0; i < this.noc; i ++) {
			result += this.courses[i].getDescription() + " \n";
		}
		
		return result;
	}
	
	
}
