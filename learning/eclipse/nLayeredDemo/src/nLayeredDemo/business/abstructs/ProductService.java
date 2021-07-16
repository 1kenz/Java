package nLayeredDemo.business.abstructs;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductService {
	void add(Product product);
	List<Product> getAll();
}
