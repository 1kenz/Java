package nLayeredDemo;

import nLayeredDemo.business.abstructs.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
// import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		// TODO: Its solved by Spring IoC
		// ProductService productService = new ProductManager(new HibernateProductDao());
		ProductService productService = new ProductManager(new AbcProductDao());
		
		Product product = new Product(1,2,"Apple", 12,50);
		productService.add(product);

	}

}
