package com.inventario.stalinSuntaxi_inventarios.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Orden implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 138521745614847965L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
	private Integer id;
    @JoinColumn(name = "idCli", referencedColumnName = "id", insertable=false, updatable=false)
    @ManyToOne(optional = false)
	private Cliente idCli;
    @JoinColumn(name = "idTi", referencedColumnName = "id", insertable=false, updatable=false)
    @ManyToOne(optional = false)
	private Tienda idTi;
	@Column(name="subtotal", nullable=false)
	private BigDecimal subtotal;
	@Column(name="total", nullable=false)
	private BigDecimal total;
	private Date fecha= new Date();

	
	@OneToMany(mappedBy="idOrd")
	private List<Detalle> detalles = new ArrayList<>();

	public List<Detalle> getDetalles() {
		return detalles;
	}
	public void setDetalles(List<Detalle> detalles) {
		this.detalles = detalles;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Cliente getIdCli() {
		return idCli;
	}
	public void setIdCli(Cliente idCli) {
		this.idCli = idCli;
	}
	public Tienda getIdTi() {
		return idTi;
	}
	public void setIdTi(Tienda idTi) {
		this.idTi = idTi;
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
	
	
}
