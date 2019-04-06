
public class Order {

	String product;
	double price;
	int quantity;
	
	public Order() {
		
	}
	
	public Order(String product, double price, int quantity) {
		this.product = product;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
}
