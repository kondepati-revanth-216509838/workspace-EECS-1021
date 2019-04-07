
public class PersonTester {
static int counter = 1;
	
public static void main(String[] args) {
//		printBoundaries();
//		Person p1 = new Person("Heeyeon");
//		Person p2 = new Person("Jiyoon");
//		Person[] persons = new Person[2];
//		System.out.println(persons[persons.length] != null);
//		
//		printBoundaries();
		Person p1 = new Person("Heeyeon");
		Person p2 = new Person("Jiyoon");
		Person[] persons = {p1, p2};
		p1 = p2;
		System.out.println(persons[0] == p1);
	}
	
	static void printBoundaries() {
		System.out.println("---------------" + counter);
		counter ++;
	}

}
