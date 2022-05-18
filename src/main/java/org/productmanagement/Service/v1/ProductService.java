package org.productmanagement.Service.v1;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.productmanagement.dao.v1.ProductDAO;
import org.productmanagement.model.Product;

/**
 * REST resource class responsible for CRUD operations on product entity This
 * resource class is for version v1
 * 
 * @author gjp
 */
@Path("v1/products")
public class ProductService {

	/**
	 * REST resource method to list all the available products
	 * 
	 * @return APPLICATION_JSON
	 * @author gjp
	 */
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Product> geProductList() {
		List<Product> productList = ProductDAO.getAllProducts();
		return productList;
	}

	/**
	 * REST resource method to get the details of the product
	 * 
	 * @param id
	 * @return
	 * @author gjp
	 */
	@GET
	@Path("/{id}")
	@Produces({ MediaType.APPLICATION_JSON })
	public Product getProduct(@PathParam("id") int id) {
		return ProductDAO.getProduct(id);
	}

	/**
	 * Method to add product
	 * 
	 * @param product
	 * @return APPLICATION_JSON
	 * @author gjp
	 */
	@POST
	@Produces({ MediaType.APPLICATION_JSON })
	public Product addProduct(Product product) {
		return ProductDAO.addProduct(product);
	}

	/**
	 * Method to update product details
	 * 
	 * @param product
	 * @return APPLICATION_JSON
	 * @author gjp
	 */
	@PUT
	@Produces({ MediaType.APPLICATION_JSON })
	public Product updateProduct(Product product) {
		return ProductDAO.updateProduct(product);
	}

	/**
	 * Method to delete certain product
	 * 
	 * @param id
	 * @author gjp
	 */
	@DELETE
	@Path("/{id}")
	@Produces({ MediaType.APPLICATION_JSON })
	public void deleteProduct(@PathParam("id") int id) {
		ProductDAO.deleteProduct(id);
	}

}
