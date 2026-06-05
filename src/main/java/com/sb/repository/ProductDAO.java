package com.sb.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sb.model.Product;

@Repository
public class ProductDAO {

	@Autowired
	DataSource dataSource;

	private static final String INSERT_QUERY = "INSERT INTO product ( PRODUCTID ,PRODUCTNAME, PRODUCTDESC,PRODUCTPRICE) values (?,?,?,?)";
	private static final String SELECT_QUERY = "SELECT * FROM product";
	private static final String UPDATE_QUERY = "UPDATE product SET PRODUCTNAME=?, PRODUCTDESC=?, PRODUCTPRICE=? WHERE PRODUCTID=?";
	private static final String DELETE_QUERY = "DELETE from product WHERE PRODUCTID=?";

//	SQL> desc product;
//	 Name                                      Null?    Type
//	 ----------------------------------------- -------- ----------------------------
//	 PRODUCTID                                 NOT NULL NUMBER(5)
//	 PRODUCTNAME                               NOT NULL VARCHAR2(100)
//	 PRODUCTDESC                               NOT NULL VARCHAR2(200)
//	 PRODUCTPRICE                              NOT NULL NUMBER(10,2)
//
//	SQL>
	//add
	public int inserIntoProductDB(Product p) throws SQLException {

		Connection con = dataSource.getConnection();

		PreparedStatement ps = con.prepareStatement(INSERT_QUERY);
		
		ps.setInt(1, p.getProductId());
		ps.setString(2, p.getProductName());
		ps.setString(3, p.getDescription());
		ps.setDouble(4, p.getPrice());

		int rowCount = ps.executeUpdate();

		return rowCount;

		
	}

	// select
	public List<Product> selectIntoProductDB() throws SQLException {

		Connection con = dataSource.getConnection();

		PreparedStatement ps = con.prepareStatement(SELECT_QUERY);

		ResultSet rs = ps.executeQuery();

		List<Product> listProduct = new ArrayList<>();

		while (rs.next()) {

			Product p = new Product();
			p.setProductId(rs.getInt(1));
			p.setProductName(rs.getString(2));
			p.setDescription(rs.getString(3));
			p.setPrice(rs.getDouble(4));

			listProduct.add(p);
		}

		con.close();

		return listProduct;
	}

	// update
	public int updateIntoProductDB(Product p) throws SQLException {

		Connection con = dataSource.getConnection();

		PreparedStatement ps = con.prepareStatement(UPDATE_QUERY);
		ps.setString(1, p.getProductName());
		ps.setString(2, p.getDescription());
		ps.setDouble(3, p.getPrice());
		ps.setInt(4, p.getProductId());

		int update = ps.executeUpdate();
		con.close();

		return update;
	}

	// delete
	public int  deleteIntoProductDB(int id) throws SQLException {

		Connection con = dataSource.getConnection();

		PreparedStatement ps = con.prepareStatement(DELETE_QUERY);

		ps.setInt(1, id);

		int bool = ps.executeUpdate();
		con.close();

		return bool;
	}

}
