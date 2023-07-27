package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.Product;

public class ProductServiceImpl implements ProductService {

	static List<Product> plist = new ArrayList<>();

	@Override
	public void addProduct(Product p) {
//		plist.add(p);
//		System.out.println("=======Succesfully added====== Size = " + plist.size());

		// From database
		try {

			// register the driver[load the driver]
			Class.forName("com.mysql.cj.jdbc.Driver");

			// getConnection(url, username, password)
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "");

			// write sql query, create statement, execute sql
			String sql = "insert into product(name, company, price, quantity) values('" + p.getName() + "', '"
					+ p.getCompany() + "', '" + p.getPrice() + "', '" + p.getQuantity() + "')";

			Statement stm = con.createStatement();
			stm.execute(sql);

			con.close();

			System.out.println("Successfully added");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deleteProduct(int index) {
		// plist.remove(index);

		try {

			// register the driver[load the driver]
			Class.forName("com.mysql.cj.jdbc.Driver");

			// getConnection(url, username, password)
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "");

			// write sql query, create statement, execute sql
			String sql = "delete from product where id = 1";

			Statement stm = con.createStatement();
			stm.execute(sql);

			con.close();

			System.out.println("Deleted Successfully");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Product> getAllProduct() {

		try {
			// register driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// getConnection(url, username, password)
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "");

			// write sql query, create statement, execute sql
			String sql = "select * from product";
			Statement stm = con.createStatement();

			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println("id = "+rs.getInt("id"));
				System.out.println("Name = "+rs.getString("name"));
				System.out.println("Company = "+rs.getString("company"));
				System.out.println("Price = "+rs.getInt("price"));
				System.out.println("Quantity = "+rs.getInt("quantity"));
				
				System.out.println("======================================");
			}

			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return plist;

	}
}
