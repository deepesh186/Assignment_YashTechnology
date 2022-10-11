package com.yash.spring.assingment.productjdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.yash.spring.assingment.productjdbc.entities.Product;



public class ProductDaoImpl implements ProductDao {
private JdbcTemplate jdbctemp;
	
	
	public int insert(Product pro) {
		
		String q="insert into product(productid,productname) values(?,?)";
    	int msg=this.jdbctemp.update(q,pro.getProductId(),pro.getProductName());
		return msg;
	}
	public JdbcTemplate getJdbctemp() {
		return jdbctemp;
	}
	public void setJdbctemp(JdbcTemplate jdbctemp) {
		this.jdbctemp = jdbctemp;
	}
	public int updatedetails(Product pro) {
		// update details of student
		String q="update product set productname=? where productid=?";
		int msg=this.jdbctemp.update(q,pro.getProductName(),pro.getProductId());
		
		return msg;
	}
	public int deletedetails(int proid) {
		// TODO Auto-generated method stub
		String q="delete from product where productid=?";
		int msg=this.jdbctemp.update(q,proid);
		
		return msg;
		
	}
	public Product selectDetails(int proid) {
		// TODO Auto-generated method stub
		String q="select * from product where productid=?";
		RowMapper<Product> rowmapper=new RowMapperimpl();
		Product product=this.jdbctemp.queryForObject(q,rowmapper,proid);
		
		return product;
		
	}
	public List<Product> getAllDetails() {
		// TODO Auto-generated method stub
		String q="select * from product";
		List<Product> pro=this.jdbctemp.query(q,new RowMapperimpl());
		return pro;
		
	}

}
