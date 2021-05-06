// cant use static in main class
public class ProductValidator {
	
	static {
		System.out.println("Static constractor-1 started.");
	}
	
	static {
		System.out.println("Static constractor-2 started.");
	}
	
	static {
		System.out.println("Static constractor-3 started.");
	}
	
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	
	// inner class
	public static class NewClass{
		public static void Delete() {
			
		}
	}
	
}
