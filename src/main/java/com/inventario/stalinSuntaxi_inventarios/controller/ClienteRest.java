package com.inventario.stalinSuntaxi_inventarios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.inventario.stalinSuntaxi_inventarios.model.Cliente;
import com.inventario.stalinSuntaxi_inventarios.repository.ClienteRepository;

@RestController
public class ClienteRest {
	@Autowired 
	private ClienteRepository clienteRepository;
	
	  @GetMapping("/clientes")
	  public  List<Cliente> all() {
	    return (List<Cliente>) clienteRepository.findAll();
	  }
	  @GetMapping("/cliente/{id}")
	  public Cliente geClienteId(@PathVariable Integer id) {
		  return clienteRepository.findById(id).get();
	  }
	  @PostMapping("/cliente")
	  public Cliente newCliente(@RequestBody Cliente cliente) {
	    return clienteRepository.save(cliente);
	  }
	  @PutMapping("/cliente")
	  public Cliente updateCliente(@RequestBody Cliente cliente) {
	    return clienteRepository.save(cliente);
	  }
	  @DeleteMapping("/cliente/{id}")
	  public void deleteCliente(@PathVariable Integer id) {
		  Cliente cliente = new Cliente();
		  cliente = clienteRepository.findById(id).get();
		  clienteRepository.delete(cliente);
	  }
	  
	  

}
