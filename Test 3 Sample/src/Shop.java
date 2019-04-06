
public class Shop {
	Member[] members = new Member[10];
	int numMembers = 0;
	public Shop() {
		
	}
	
	public Member[] getMembers() {
		Member [] temp = new Member[numMembers];
		for (int i = 0; i < numMembers; i ++) {
			temp[i] = members[i];
		}
		return temp;
	}
	
	public boolean hasMember(String id) {
		boolean found = false;
		for (int i = 0; i < numMembers; i ++) {
			if (members[i].getId().equals(id)) {
				found = true;
			}
		}
		return found;
	}
	
	public void addMember(Member newMem) {
		members[numMembers] = newMem;
		numMembers ++;
	}
	
	
	public void checkOut(String id) {
		boolean found = false;
		int index = 0;
		
		for (int i = 0; i < numMembers && !found; i ++) {
			if (members[i].getId().equals(id)) {
				found = true;
				index = i;
			}
		}
		
		if (found == true) {
			int last = members[index].numOrders;
			for (int i = 0; i <last; i ++) {
				Order temp = members[index].order[i];
				members[index].withdraw(temp.price, temp.quantity);
				members[index].order[i] = null;
			}
			members[index].numOrders = 0;
		}
		
		
	}
	
}
