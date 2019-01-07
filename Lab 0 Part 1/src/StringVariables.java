
public class StringVariables {

	public static void main(String[] args) {
		String firstname = "";
		String lastname = "";
		int i = 0;	
		System.out.println("Person " + i + ": " + lastname + ", " + firstname);
		
		firstname = "Heeyeon";
		lastname = "Kang";
		i = i + 1;
		System.out.println("Person " + i + ": " + lastname + ", " + firstname);
		
		firstname = "Jihye";
		lastname = "Park";
		i = i + 1;
		System.out.println("Person " + i + ": " + lastname + ", " + firstname);
	/*
	 * Remark:
	 * Lines 8, 13 and 18 are identical
	 * However, at runtime, they produce different outputs to the console.
	 * This is because they depend on values of variables, which are changed
	 * at Lines 5 - 7, 10 - 12 and 15 - 17.
	 * */
	}

}
