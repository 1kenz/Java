package encapsulation;

public class ProductManager {

	public void Add(Product product) {
		//JDBC
		System.out.println(product.getName() + " added.");
	}
	
	public void Add2(int id, String name, String description, int stockAmount, double price) {
		System.out.println("Product added.");
	}
	
}
