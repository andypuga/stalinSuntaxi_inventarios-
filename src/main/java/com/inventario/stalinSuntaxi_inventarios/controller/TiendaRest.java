package com.inventario.stalinSuntaxi_inventarios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inventario.stalinSuntaxi_inventarios.dtos.Market;
import com.inventario.stalinSuntaxi_inventarios.service.TiendaInterface;

@RestController
public class TiendaRest {

	
	@Autowired 
	private TiendaInterface tiendaInterface;
	
	  @GetMapping("/tiendas")
	  public  List<Market> all() {
	    return tiendaInterface.findAll();
	  }
	

	  public @PostMapping("/tienda")
	  Market newEmployee(@RequestBody Market marked) {
	    return tiendaInterface.save(marked);
	  }
}
