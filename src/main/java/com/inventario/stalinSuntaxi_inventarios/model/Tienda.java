package com.inventario.stalinSuntaxi_inventarios.model;

import java.io.Serializable;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Tienda  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1774024614840379539L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    @Column(name="codigo_ti", nullable=false)
	private String codigoTi;
    @Column(name="nombre_ti", nullable=false)
	private String nombreTi;
	

	public Tienda(String codigoTi, String nombreTi) {
		super();
		this.codigoTi = codigoTi;
		this.nombreTi = nombreTi;
	}
	public Tienda() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCodigoTi() {
		return codigoTi;
	}
	public void setCodigoTi(String codigoTi) {
		this.codigoTi = codigoTi;
	}
	public String getNombreTi() {
		return nombreTi;
	}
	public void setNombreTi(String nombreTi) {
		this.nombreTi = nombreTi;
	}
	
}
