
public class Member {

	static int idNum = 0;

	String Name;
	String ID;
	double Balance;
	
	Order [] orders;
	int orderNum = 0;
	public Member(double Balance) {
		this.Balance = Balance;
		idNum ++;
		ID = "mem" + idNum;
		orders = new Order[5];
		
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	public Order[] getOrders() {
		return orders;
	}

	public void setOrders(Order[] orders) {
		this.orders = orders;
	}

	public String getId() {
		return ID;
	}
	
	public void addOrder(String Product, double price, int quantity) {
		orders[orderNum] = new Order(Product, price, quantity);
		orderNum += 1;
	}
	
	public double getAmountToPay() {
		
	}

}
