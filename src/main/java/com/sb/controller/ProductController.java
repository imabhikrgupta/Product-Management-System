package com.sb.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sb.model.Product;
import com.sb.service.ProductSerivce;

@Controller
public class ProductController {

	@Autowired
	private ProductSerivce productSerivce;
	
   
	public void addProduct(Product p)  {
	      try {
			productSerivce.addProduct(p);
		  } catch (SQLException e) {
            System.err.println("Invalid Deatils");
		  }
	     
	}

	
	
	// delete
	public void deleteProduct(int id) {
		try {
			productSerivce.deleteProduct(id);
		} catch (SQLException e) {

			System.err.println("product id is invlid");
		}
	}
	
	//update 
	
	public void changeDetails(Product p) {
		try {
			productSerivce.updateProduct(p);
		} catch (SQLException e) {
			System.err.println("please enter valid details");
			
		}
	}
	
	//view table
	public void viewProduct() {
		try {
			productSerivce.seeProduct();
		} catch (SQLException e) {
			System.err.println("Product list is empty!");
		}
	}
	
	
}
