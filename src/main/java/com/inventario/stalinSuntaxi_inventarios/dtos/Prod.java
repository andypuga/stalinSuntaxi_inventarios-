package com.inventario.stalinSuntaxi_inventarios.dtos;

import java.io.Serializable;
import java.math.BigDecimal;

public class Prod implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3278837551549424100L;
	
	private Integer id;
	private String cod;
	private String name;
	private BigDecimal price;
	private Integer stock;
	
	
	

	
	public Prod() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Prod(Integer id, String cod, String name, BigDecimal price, Integer stock) {
		super();
		this.id = id;
		this.cod = cod;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}
	
	

}
