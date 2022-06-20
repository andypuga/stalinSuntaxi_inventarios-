package com.inventario.stalinSuntaxi_inventarios.dtos;

import java.io.Serializable;
import java.util.List;

public class Pedido implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -700373438769954595L;
	
	
	private Cabecera cabecera;
	private List<Detalle> detalles;
	public Cabecera getCabecera() {
		return cabecera;
	}
	public void setCabecera(Cabecera cabecera) {
		this.cabecera = cabecera;
	}
	public List<Detalle> getDetalles() {
		return detalles;
	}
	public void setDetalles(List<Detalle> detalles) {
		this.detalles = detalles;
	}
	

}
