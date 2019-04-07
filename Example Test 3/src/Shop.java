
public class Shop {

	Member [] members = new Member[10];
	int memNum = 0;
	
	public Shop() {
		// TODO Auto-generated constructor stub
	}
	
	public void addMember(Member temp) {
		members[memNum] = temp;
		memNum ++;
	}
	
	public Member[] getMembers(){
		Member[] temp = new Member[memNum];
		
		for (int i = 0; i < memNum; i ++) {
			temp[i] = members[i];
		}
		
		return temp;
	}
	
	public boolean hasMember(String id) {
		boolean hasMember = false;
		
		for (int i = 0; i < memNum && !hasMember; i ++) {
			hasMember = hasMember || (members[i].getId().equals(id));
		}
		
		return hasMember;
	}
	
	public void checkOut(String id) {
		boolean found = false;
		int index = 0;
		for (int i = 0; i < memNum && !found; i ++) {
			found = found || (id.equals(members[i].getId()));
			index = i;
		}
		
		if (found) {
			members[index].withdraw(members[index].getAmountToPay());
			members[index].orderNum = 0;
		}
		
		
		
	}

}
