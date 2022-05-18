package org.productmanagement.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Model class responsible for getters and setters on product entity (id, name,
 * price, currency)
 * 
 * @author gjp
 */
@XmlRootElement(name = "product")
@XmlAccessorType(XmlAccessType.FIELD)
public class Product {
	private int id;
	private String name;
	private double price;
	private String currency;

	
	/**
	 * This default constructor
	 */
	public Product() {

	}

	/**
	 * Parametrized constructor to support currency V2
	 * 
	 * @param id
	 * @param name
	 * @param price
	 * @param currency
	 */
	public Product(int id, String name, double price, String currency) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.currency = currency;
	}

	/**
	 * Parametrized constructor to support currency V1
	 * 
	 * @param id
	 * @param name
	 * @param price
	 * @param currency
	 */
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
}
