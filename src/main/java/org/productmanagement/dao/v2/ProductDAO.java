package org.productmanagement.dao.v2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.productmanagement.model.Product;

/**
 * DAO class responsible for CRUD operations on product entity (id, name, price,
 * currency) This resource class is for version v2
 * 
 * @author gjp
 */
public class ProductDAO {

	private static final Map<Integer, Product> prodMap = new HashMap<Integer, Product>();

	static {
		initEmps();
	}

	/**
	 * This method mocks the DB layer to create product entity
	 */
	private static void initEmps() {
		Product prod1 = new Product(1, "Apple", 900, "USD");
		Product prod2 = new Product(2, "Lenovo", 500, "USD");
		Product prod3 = new Product(3, "HP", 600, "USD");

		prodMap.put(prod1.getId(), prod1);
		prodMap.put(prod1.getId(), prod2);
		prodMap.put(prod1.getId(), prod3);
	}

	/**
	 * method to get the details of the product
	 * 
	 * @param id
	 * @return Product
	 */
	public static Product getProduct(int id) {
		return prodMap.get(id);
	}

	/**
	 * Method to add product by id
	 * 
	 * @param product
	 * @return Product
	 */
	public static Product addProduct(Product product) {
		prodMap.put(product.getId(), product);
		return product;
	}

	/**
	 * Method to update product by id
	 * 
	 * @param product
	 * @return product
	 */
	public static Product updateProduct(Product product) {
		prodMap.put(product.getId(), product);
		return product;
	}

	/**
	 * Method to delete product by id
	 * 
	 * @param id
	 */
	public static void deleteProduct(int id) {
		prodMap.remove(id);
	}

	/**
	 * Method to list all products
	 * 
	 * @return List<Product>
	 */
	public static List<Product> getAllProducts() {
		Collection<Product> products = prodMap.values();
		List<Product> productList = new ArrayList<Product>();
		for (Product product : products) {
			productList.add(product);
		}
		return productList;
	}

	List<Product> productList;

}
