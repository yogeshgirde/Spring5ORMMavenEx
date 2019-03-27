package com.app.dao;

import java.util.List;

import com.app.model.Product;

public interface IProductDao {

	public void saveProduct(Product p);
	public void updateProduct(Product p);
	public void deleteProduct(Integer prodId);
	
	public Product getProductById(Integer prodId);
	public List<Product> getAllProducts();
	
	
}
