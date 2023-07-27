//User bata add garne product & user bata delete garne product
//Multiple product add garne[user bata] and delete product as user wish
//delete garda, Do you want to delete product[y/n]? , vanera sodhne [if statement baata ]

package com.view;

import java.util.List;
import java.util.Scanner;

import com.model.Product;
import com.service.ProductService;
import com.service.ProductServiceImpl;

public class Test2 {

	public static void main(String[] args) {

		add();
		getAll();
		delete();
	}

	// add Product
	static void add() {

		ProductService ps = new ProductServiceImpl();

		Scanner sc = new Scanner(System.in);

		char flag = 'y';

		do {
			Product p = new Product();

			System.out.println("Enter id");
			p.setId(sc.nextInt());
			// p.setId(333);

			System.out.println("Enter name");
			p.setName(sc.next());
			// p.setName("Mobile");

			System.out.println("Enter price");
			p.setPrice(sc.nextInt());
			// p.setPrice(40000);

			System.out.println("Enter company");
			p.setCompany(sc.next());
			// p.setCompany("Samsung");

			System.out.println("Enter quantity");
			p.setQuantity(sc.nextInt());
			// p.setQuantity(500);

			ps.addProduct(p);

			System.out.println("Do you want to add more[y/n]");
			flag = sc.next().charAt(0);

		} while (flag == 'y');

	}

	// get all Product [fetchAll]
	static void getAll() {

		ProductService ps = new ProductServiceImpl();

		List<Product> plist = ps.getAllProduct();
		System.out.println(plist);

	}

	// delete Product
	static void delete() {

		ProductService ps = new ProductServiceImpl();

		Scanner sc = new Scanner(System.in);

		char flag = 'y';

		System.out.println("Do you want to delte product[y/n]?");
		flag = sc.next().charAt(0);
		

		if (flag == 'y') {
			System.out.println("Which item or Product [index] you want to remove/delete? ");

			// ps.deleteProduct(0); // 0-> index ho lekheko
			// ps.deleteProduct(sc.nextInt()); //in one line

			int index = sc.nextInt(); // in two line
			ps.deleteProduct(index);

			// get product after delete
			getAll();

		}
	}
}
