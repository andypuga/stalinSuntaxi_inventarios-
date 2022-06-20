package com.inventario.stalinSuntaxi_inventarios.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Stock implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2248058163204723516L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    @JoinColumn(name = "idProd", referencedColumnName = "id", insertable=false, updatable=false)
    @ManyToOne(optional = false)
	private Producto idProd;
    @JoinColumn(name = "idTi", referencedColumnName = "id", insertable=false, updatable=false)
    @ManyToOne(optional = false)
	private Tienda idTi;
	@Column(name="stock_sto", nullable=false)
	private Integer stockSto;
	

	public Stock(Producto idProd, Tienda idTi, Integer stockSto) {
		super();
		this.idProd = idProd;
		this.idTi = idTi;
		this.stockSto = stockSto;
	}
	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Producto getIdProd() {
		return idProd;
	}
	public void setIdProd(Producto idProd) {
		this.idProd = idProd;
	}
	public Tienda getIdTi() {
		return idTi;
	}
	public void setIdTi(Tienda idTi) {
		this.idTi = idTi;
	}
	public Integer getStockSto() {
		return stockSto;
	}
	public void setStockSto(Integer stockSto) {
		this.stockSto = stockSto;
	}
	

}
