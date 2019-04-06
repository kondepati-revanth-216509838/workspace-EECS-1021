import java.util.ArrayList;

/*
 * A birthday book stores a collection of entries. 
 * Each entry contains a name and a birthday. 
 * Each birthday is characterized by a month and a day.
 * No two entries in the book have the same name, whereas
 * two entries may have the same birthday. 
 */
public class BirthdayBookTester {

	public static void main(String[] args) {
		
		System.out.println("==================== (1)");
		/*
		 * Create a new birthday object for August 4.
		 */
		Birthday bd1 = new Birthday(8, 4);
		System.out.println("Month: " + bd1.getMonth());
		System.out.println("Day: " + bd1.getDay());
		
		System.out.println("==================== (2)");
		/*
		 * Create an empty birthday book.
		 */
		BirthdayBook book = new BirthdayBook();
		System.out.println(book.getDescription());
		
		System.out.println("==================== (3)");
		/*
		 * Add three entries into the birthday book.
		 */
		book.addBirthday("Alan", bd1);
		book.addBirthday("Mark", 3, 19);
		book.addBirthday("Tom", 8, 4);
		System.out.println(book.getDescription());
		
		System.out.println("==================== (4)");
		/*
		 * Return the list of people whose birthday is bd1.
		 */
		ArrayList<String> reminders = book.getReminders(bd1);
		System.out.println("Number of people born on August 4: " + reminders.size());
		System.out.println("People born on August 4: " + reminders);
		
		System.out.println("==================== (5)");
		/* Adding the birthday of an existing person should overwrite their birthday.
		 */
		book.addBirthday("Alan", 4, 18);
		reminders = book.getReminders(bd1);
		System.out.println("Number of people born on August 4: " + reminders.size());
		System.out.println("People born on August 4: " + reminders);
	}

}
