
public class Order {
	String product;
	double price;
	int quantity;
	
	public Order(String product, double price, int quantity) {
		this.price = price;
		this.product = product;
		this.quantity = quantity;
	}

	public Order() {
		this.price = 0;
		this.product = "";
		this.quantity = 0;
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
