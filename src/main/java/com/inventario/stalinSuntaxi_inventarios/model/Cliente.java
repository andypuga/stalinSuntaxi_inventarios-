package com.inventario.stalinSuntaxi_inventarios.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4692315120883526148L;
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
	private Integer id;
    @Column(name="nombre_cli", nullable=false)
	private String nombreCli;
    @Column(name="identificacion_cli", nullable=false)
	private String identificacionCli;
    @Column(name="urlfoto_cli", nullable=false)
	private String urlfotoCli;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombreCli() {
		return nombreCli;
	}
	public void setNombreCli(String nombreCli) {
		this.nombreCli = nombreCli;
	}
	public String getIdentificacionCli() {
		return identificacionCli;
	}
	public void setIdentificacionCli(String identificacionCli) {
		this.identificacionCli = identificacionCli;
	}
	public String getUrlfotoCli() {
		return urlfotoCli;
	}
	public void setUrlfotoCli(String urlfotoCli) {
		this.urlfotoCli = urlfotoCli;
	}
	

}
