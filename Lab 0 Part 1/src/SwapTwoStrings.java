
public class SwapTwoStrings {

	public static void main(String[] args) {
		String person1 = "Alan";
		String person2 = "Tom";
		
		System.out.print("Before the swap: ");
		System.out.print("person1 is " + person1 + " and ");
		System.out.println("person2 is " + person2 + ".");
		
		/*Swap
		 * Wrong implementation
		 * person1 = person2;
		 * person2 = person1;
		 */
		
		/*Swap
		 * Correct implementation
		 */
		 String temp = person1;
		 person1 = person2;
		 /*notice that at this point, person1 is already replaced by "Tom"
		  * so we have to use temp in order to complete the swap
		  * */
		 person2 = temp;
		
		
		
		System.out.print("After the swap: ");
		System.out.print("person1 is " + person1 + " and ");
		System.out.println("person2 is " + person2 + ".");

	}

}
