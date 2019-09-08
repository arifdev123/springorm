package in.co.javacoder.springorm.product.dao;

import java.util.List;

import in.co.javacoder.springorm.entities.Product;

public interface ProductDao {
	int create(Product product);
	void update(Product product);
	void delete(Product product);
	Product find(int id);
	List<Product> findAll();
	
}
