package com.inventario.stalinSuntaxi_inventarios.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity

@Table(name = "detalle")
public class Detalle implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3516997907509218668L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    @JoinColumn(name = "idProd", referencedColumnName = "id", insertable=false, updatable=false)
    @ManyToOne(optional = false)
	private Producto idProd;
    @JoinColumn(name = "idOrd", referencedColumnName = "id", insertable=false, updatable=false)
    @ManyToOne(optional = false)
	private Orden idOrd;
	@Column(name="cantidad", nullable=false)
	private Integer cantidad;
	@Column(name="total", nullable=false)
	private BigDecimal total;

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
	public Orden getIdOrd() {
		return idOrd;
	}
	public void setIdOrd(Orden idOrd) {
		this.idOrd = idOrd;
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

}
