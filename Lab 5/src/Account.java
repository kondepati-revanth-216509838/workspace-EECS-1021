
public class Account {

	String name;
	char type;
	double amount;
	
	Account(String name, char type){
		this.name = name;
		this.type = type;
	}
	
	
	Account(String name, char type, double amount){
		this.name = name;
		this.type = type;
		this.amount = amount;
	}
	
	
	public double getBalance() {
		return this.amount;
	}
	
	public void withdraw(double draw) {
		if (type == 'i') {
			double serviceCharge = draw * 0.1;
			this.amount -= draw + serviceCharge;
		} else {
			this.amount -= draw;
		}
	}
	
	public void deposit(double deposit) {
		if (type == 'i') {
			double serviceCharge = deposit * 0.1;
			this.amount += deposit - serviceCharge;
		} else {
			this.amount += deposit;
		}
		
	}
	
	public String getDescription() {
		String temp ="";
		
		if (type == 'i') {
			temp = "International ";
		} else if (type == 'd') {
			temp = "Domestic ";
		}
		
		temp += "with owner " + name + " has current balance " +"$"+ amount;
		return temp;
	}
	
	public void setBalance(double setBalance) {
		amount = setBalance;
	}
	
	public void transferTo(Account account, double transfer) {
		double serviceCharge = transfer * 0.1;
		if (this.type == 'i') {
			this.amount -=  transfer + serviceCharge;
		} else {
			this.amount -= transfer; 
		}
		
		
		if (account.type == 'i') {
			account.amount +=  transfer - serviceCharge;
		} else {
			account.amount += transfer;
		}
	}
}
