
public class Product1 {
	
	private String name;
	private int price;
	private String category;
	private int quantity;
	
	
	public Product1(String name, int price, String category, int quantity) {
		this.name = name;
		this.price = price;
		this.category = category;
		this.quantity = quantity;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "Product1 [name=" + name + ", price=" + price + ", category=" + category + ", quantity=" + quantity
				+ "]";
	}
	
	
	
	
}
