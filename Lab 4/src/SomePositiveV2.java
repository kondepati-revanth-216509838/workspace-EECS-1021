
public class SomePositiveV2 {

	public static void main(String[] args) {
		int [] ns = {-2, -7, 4, 5, 9}; //{-2, -7, 4, 5, -1};
		boolean somePos = false;
		for (int i = 0; i < ns.length; i ++) {
			/* wrong version without accumulation */
			somePos = ns[i] > 0;
		}
		
		System.out.println("Some (at least one) elements in array are positive: "+ somePos);

	}

}
