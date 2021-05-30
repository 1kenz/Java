package encapsulation;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product();
		product1.setName("Laptop");
		product1.setId(1);
		product1.setPrice(5000);
		product1.setDescription("Asus Laptop");
		product1.setStockAmount(5);
		
		System.out.println(product1.getName());

		Product product2 = new Product(2,"Dell Laptop", "Dell Laptop", 10000, 5);
		System.out.println(product2.getName());
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product1);
		productManager.Add(product2);
		
		// productManager.Add2(1, "", "", 20, 250);
	}
	
	

}
