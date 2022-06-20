package com.inventario.stalinSuntaxi_inventarios.service;

import java.util.List;

import com.inventario.stalinSuntaxi_inventarios.dtos.Prod;

public interface ProductoServiceInterface {
	
	
	List<Prod> findAll();
	Prod save(Prod prod);
	Prod updateStock(Integer stock ,Integer idProd);

	
	
	

}
