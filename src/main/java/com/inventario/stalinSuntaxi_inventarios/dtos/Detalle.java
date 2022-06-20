package com.inventario.stalinSuntaxi_inventarios.dtos;

import java.io.Serializable;
import java.math.BigDecimal;



public class Detalle implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1359989111044070491L;
	private Integer producto;
	private Integer orden;
	private Integer cantidad;
	
	public Integer getProducto() {
		return producto;
	}
	public void setProducto(Integer producto) {
		this.producto = producto;
	}
	public Integer getOrden() {
		return orden;
	}
	public void setOrden(Integer orden) {
		this.orden = orden;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	private BigDecimal total;

}
