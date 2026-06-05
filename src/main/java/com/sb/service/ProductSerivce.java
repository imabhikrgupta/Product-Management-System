
package com.sb.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.model.Product;
import com.sb.repository.ProductDAO;

@Service
public class ProductSerivce {

	@Autowired
	private ProductDAO productDAO;

	// add product
	public void addProduct(Product p) throws SQLException {


//		boolean insert=productDAO.inserIntoProductDB(p);
//		System.out.println((insert)?"product add successfully":"unable to add product ");
		int result = productDAO.inserIntoProductDB(p);
		System.err.println("\n=============================\n");
		System.out.println( result > 0 ? "Product Inserted Successfully" : "Product Insertion Failed!!!!");
		System.err.println("\n=============================\n");
	}

	// see product
	public void seeProduct() throws SQLException {
		List<Product> productList = productDAO.selectIntoProductDB();

		System.err.println("\n=============================\n");
		productList.forEach(p -> System.out
				.println("Product ID    : " + p.getProductId() +
						"\n" + "Product Name  : " + p.getProductName() +
						"\n" + "Product Price : " + p.getPrice() + 
						"\n" + "Product Info  : " + p.getDescription()+"\n\n"));
		System.err.println("\n=============================\n");

	}

//	update product
	public void updateProduct(Product p) throws SQLException {

		int update = productDAO.updateIntoProductDB(p);
		System.err.println("\n=============================\n");

		System.out.println((update > 0) ? "product details changed successfully" : "unable to change product detials");

		System.err.println("\n=============================\n");
	}

//	delete product 
	public void deleteProduct(int id) throws SQLException {

		System.err.println("\n=============================\n");

		int delete = productDAO.deleteIntoProductDB(id);
		System.out.println((delete > 0) ? "product info deleted successfully" : "product Id is invalid");
		System.err.println("\n=============================\n");

	}

}
