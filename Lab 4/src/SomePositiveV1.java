
public class SomePositiveV1 {

	public static void main(String[] args) {
		int [] ns = {-2, -7, -4, -5, -1}; //{-2, -7, 4, 5, -1};
		boolean somePos = false;
		for (int i = 0; i < ns.length; i ++) {
			somePos = somePos || ns[i] > 0;
		}
		
		System.out.println("Some (at least one) elements in array are positive: "+ somePos);

	}

}