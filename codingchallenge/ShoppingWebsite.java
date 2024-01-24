package codingchallenge;
import codingchallenge.Customer;
//import codingchallenge.InsufficientBalanceException;
import codingchallenge.Item;
//import codingchallenge.ItemOutOfStockException;
import codingchallenge.ShoppingWebsite;

//Created by Gitanjali Aher...

class Customer{
	int id;
	String name, address;
	double walletBalance;
	
	public Customer(int id, String name, String address, double walletBalance) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.walletBalance = walletBalance;
	}

}

class Item{
	int id;
	String name, companyName;
	double price;
	boolean isInStock;
	
	public Item(int id, String name, String companyName, double price, boolean isInStock) {
		super();
		this.id = id;
		this.name = name;
		this.companyName = companyName;
		this.price = price;
		this.isInStock = isInStock;
	}

}

public class ShoppingWebsite {
	public String purchaseItem(Item i, Customer c) throws ItemOutOfStockException, InsufficientBalanceException {
		if(!i.isInStock) {
			throw new ItemOutOfStockException("Item is out of stock");
		}
		else if(i.price>c.walletBalance) {
			throw new InsufficientBalanceException("customer wallet balance is not sufficient");
		}
		return  "Order Successful";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer cusDet = new Customer(927392, "Steve" ,"USA", 500.0);
		Item itemDet = new Item(27392, "T-Shirt", "US polo", 800, true);
		ShoppingWebsite obj = new ShoppingWebsite();
		String out = " ";
		try {
			out = obj.purchaseItem(itemDet, cusDet);
		} catch (ItemOutOfStockException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			out = e.getMessage();
		}
		System.out.println(out);

	}

}

