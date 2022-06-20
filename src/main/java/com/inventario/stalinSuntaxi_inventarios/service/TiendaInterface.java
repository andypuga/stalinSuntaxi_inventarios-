package com.inventario.stalinSuntaxi_inventarios.service;

import java.util.List;

import com.inventario.stalinSuntaxi_inventarios.dtos.Market;


public interface TiendaInterface {

	List<Market> findAll();
	Market save(Market market);

	
	
}
