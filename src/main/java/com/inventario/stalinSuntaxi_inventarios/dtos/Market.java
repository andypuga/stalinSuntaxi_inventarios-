package com.inventario.stalinSuntaxi_inventarios.dtos;

import java.io.Serializable;

public class Market implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2498485356101904288L;


	
	private String cod;
	private String name;
	
	public Market(String cod, String name) {
		super();
		this.cod = cod;
		this.name = name;
	}
	public Market() {
		super();
		// TODO Auto-generated constructor stub
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
	

}
