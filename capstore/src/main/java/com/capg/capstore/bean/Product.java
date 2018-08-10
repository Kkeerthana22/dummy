package com.capg.capstore.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	  private int product_id;
	@Column(name="product_name")
	  private String product_name;
	@Column(name="product_model")
	  private String product_model;
	@Column(name="product_price")
	  private double product_price;
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_model() {
		return product_model;
	}
	public void setProduct_model(String product_model) {
		this.product_model = product_model;
	}
	public double getProduct_price() {
		return product_price;
	}
	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int product_id, String product_name, String product_model, double product_price) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_model = product_model;
		this.product_price = product_price;
	}
	
}
