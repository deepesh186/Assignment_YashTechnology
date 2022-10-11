package com.yash.spring.assingment.productjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.yash.spring.assingment.productjdbc.entities.Product;


public class RowMapperimpl implements RowMapper<Product>{
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Product product=new Product();
		product.setProductId(rs.getInt(1));//column name-1
		product.setProductName(rs.getString(2));//column name-2
		
		return product;
	}

}
