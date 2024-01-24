package abstraction;

public class Product {
	private int productId;
	private String ProductName;
	private double Price;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		p1.setProductId(101);
		p1.setProductName("Laptop");
		p1.setPrice(45000);
		
		System.out.println("Product Id : "+p1.productId);
		System.out.println("Product Name : "+p1.ProductName);
		System.out.println("Product Price : "+p1.Price);

	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

}
