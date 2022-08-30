package com.service;

import javax.persistence.GeneratedValue;

import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.Id;

@Entity
public class Electronics {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String category;
	private double price;
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Electronics() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Electronics [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
	}
	public Integer getId1() {
		// TODO Auto-generated method stub
		return this.getId();
	}
	public String getName1() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}

