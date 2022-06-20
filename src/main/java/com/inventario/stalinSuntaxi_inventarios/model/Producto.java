package com.inventario.stalinSuntaxi_inventarios.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Producto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1586471104549141668L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    @Column(name="codigo_prod", nullable=false)
	private String codigoProd;
    @Column(name="nombre_prod", nullable=false)
	private String nombreProd;
    @Column(name="precio_prod", nullable=false)
	private BigDecimal precio;
    
    
    

	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Producto( String codigoProd, String nombreProd, BigDecimal precio) {
		super();
		this.codigoProd = codigoProd;
		this.nombreProd = nombreProd;
		this.precio = precio;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCodigoProd() {
		return codigoProd;
	}
	public void setCodigoProd(String codigoProd) {
		this.codigoProd = codigoProd;
	}
	public String getNombreProd() {
		return nombreProd;
	}
	public void setNombreProd(String nombreProd) {
		this.nombreProd = nombreProd;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}		
}
