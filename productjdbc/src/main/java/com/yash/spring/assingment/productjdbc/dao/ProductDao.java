package com.yash.spring.assingment.productjdbc.dao;

import java.util.List;

import com.yash.spring.assingment.productjdbc.entities.Product;



public interface ProductDao {
	public int insert(Product pro);
	public int updatedetails(Product pro);
	public int deletedetails(int pro);
	public Product selectDetails(int pro);
	public List<Product> getAllDetails();
}
