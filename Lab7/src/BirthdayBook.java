import java.util.ArrayList;

public class BirthdayBook {
	Birthday[] book = new Birthday[10];
	int nob = 0;
	void addBirthday(String name, int month, int day) {
		book[nob] = new Birthday(name,month,day);
		nob ++;
	}
	
	void addBirthday(String name, Birthday bd) {
		addBirthday(name,bd.getMonth(), bd.getDay());
	}
	
	String getDescription() {
		String result = "";
		if (nob == 0) {
			result = "The birthday book is empty.";
		} else {
			for (int i = 0; i < nob; i ++) {
				String monthName = getMonthName(book[i].getMonth());
				
				result += book[i].name + ": " + monthName + " " + book[i].getDay() + "\n";
			}
		}
		
		return result;
	}
	
	String getMonthName(int month) {
		String result = "";
		if (month == 1) {
			result = "January";
		} else if (month == 2) {
			result = "Febuary";
		} else if (month == 3) {
			result = "March";
		} else if (month == 4) {
			result = "April";
		} else if (month == 5) {
			result = "May";
		} else if (month == 6) {
			result = "June";
		} else if (month == 7) {
			result = "July";
		} else if (month == 8) {
			result = "August";
		} else if (month == 9) {
			result = "September";
		}	else if (month == 10) {
			result = "October";
		} else if (month == 11) {
			result = "November";
		}	else if (month == 12) {
			result = "December";
		}
		return result;
	}
	
	ArrayList<String> getReminders(Birthday bd){
		ArrayList <String> temp = new ArrayList <String>();
		for (int i = 0; i < nob; i ++) {
			if (book[i].getMonth() == bd.getMonth() && book[i].getDay() == bd.getDay()) {
				temp.add(book[i].name);
			}
		}
		return temp;
	}
}
