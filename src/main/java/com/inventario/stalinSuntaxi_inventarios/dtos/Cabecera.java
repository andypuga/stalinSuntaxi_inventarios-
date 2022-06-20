package com.inventario.stalinSuntaxi_inventarios.dtos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


public class Cabecera implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -6076394746938690883L;
	public Integer getCliente() {
		return cliente;
	}
	public void setCliente(Integer cliente) {
		this.cliente = cliente;
	}
	public Integer getTenda() {
		return Tenda;
	}
	public void setTenda(Integer tenda) {
		Tenda = tenda;
	}
	public BigDecimal getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	private Integer cliente;
	private Integer Tenda;
	private BigDecimal subtotal;
	private BigDecimal total;
	private Date fecha;

}
