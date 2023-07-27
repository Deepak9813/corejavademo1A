package com.view;

import java.util.List;

import com.model.Product;
import com.service.ProductService;
import com.service.ProductServiceImpl;

public class Test {

	public static void main(String[] args) {

		add();
		getAll();
		delete();
	}

	// add Product
	static void add() {

		ProductService ps = new ProductServiceImpl();

		Product p = new Product();

		p.setId(333);
		p.setName("Mobile");
		p.setPrice(40000);
		p.setCompany("Samsung");
		p.setQuantity(500);

		ps.addProduct(p);

	}

	// get all Product [fetchAll]
	static void getAll() {

		ProductService ps = new ProductServiceImpl();

		List<Product> plist = ps.getAllProduct();
		System.out.println(plist);

	}

	//delete Product
	static void delete() {
		
		ProductService ps = new ProductServiceImpl();
		
		ps.deleteProduct(0);  // 0-> index ho lekheko
		
		//get product after delete
		getAll();
	}
}
