
public class Member {
	String id;
	
	static int globalMemberQuantity = 0;
	
	Order[] order = new Order[100];
	double balance;
	int numOrders = 0;
	public Member() {
		globalMemberQuantity += 1;
		id = "mem" + globalMemberQuantity;
	}
	
	public Member(double balance) {
		this.balance = balance;
		globalMemberQuantity += 1;
		id = "mem" + globalMemberQuantity;
	}
	
	public void addOrder(String product, double price, int quantity) {
		order[numOrders] = new Order(product, price, quantity);
		numOrders +=1;
	}
	
	public void addOrder(Order newOrder) {
		order[numOrders] = newOrder;
		numOrders+=1;
	}
	
	public Order[] getOrders() {
		Order[] temp = new Order[numOrders];
		for (int i = 0; i < numOrders; i ++) {
			temp[i] = order[i];
		}
		return temp;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getAmountToPay() {
		double loan = 0;
		for (int i = 0; i < numOrders; i ++) {
			loan += order[i].getPrice() * order[i].getQuantity();
		}
		return loan;
	}
	
	public void deposit(double deposit) {
		this.balance += deposit;
	}
	
	public String getId() {
		return id;
	}
	
	public void withdraw(double price, double quantity) {
		this.balance -= price * quantity;
	}
	
}
