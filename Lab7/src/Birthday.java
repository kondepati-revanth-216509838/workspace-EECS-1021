
public class Birthday {
	int month, day;
	String name;
	
	Birthday(int month, int day){
		this.month = month;
		this.day = day;
		this.name = "";
	}
	
	Birthday(String name,int month, int day){
		this.month = month;
		this.day = day;
		this.name = name;
	}

	int getMonth() {
		return month;
	}

	void setMonth(int month) {
		this.month = month;
	}

	int getDay() {
		return day;
	}

	void setDay(int day) {
		this.day = day;
	}
}
