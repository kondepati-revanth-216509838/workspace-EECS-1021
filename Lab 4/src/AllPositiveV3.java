
public class AllPositiveV3 {

	public static void main(String[] args) {
		int [] ns = {2,3,-1,4,5};
		
		// early exit when possible
		boolean allPos = true;
		for (int i = 0; i < ns.length && allPos; i ++) {
			// accumulation of result from between iterations
			allPos = allPos && ns[i] > 0;
		}
		
		System.out.println("All elements in array are positive: "+ allPos);

	}

}
