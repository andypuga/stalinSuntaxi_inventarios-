package com.inventario.stalinSuntaxi_inventarios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inventario.stalinSuntaxi_inventarios.dtos.Prod;
import com.inventario.stalinSuntaxi_inventarios.service.ProductoServiceInterface;

@RestController
public class ProductoRest {

	@Autowired
	private ProductoServiceInterface productoServiceInterface;

	  @GetMapping("/prods")
	  public  List<Prod> all() {
	    return productoServiceInterface.findAll();
	  }
	

	  public @PostMapping("/prod")
	  Prod newEmployee(@RequestBody Prod prod) {
	    return productoServiceInterface.save(prod);
	  }

	/*
	  
	  @GetMapping("/prods/{id}")
	  public Prod one(@PathVariable Integer id) {
	    
	    return productoServiceInterface.findById(id)
	      .orElseThrow(() -> new EmployeeNotFoundException(id));
	  }
*/
	  @PutMapping("/prods/{id}")
	  public  Prod  replaceEmployee(@RequestBody Integer stock, @PathVariable Integer id) {	    
	    if(stock>0)
		  return productoServiceInterface.updateStock(stock, id);
	    else
	    	return null;
	    
	  }
	      

}

