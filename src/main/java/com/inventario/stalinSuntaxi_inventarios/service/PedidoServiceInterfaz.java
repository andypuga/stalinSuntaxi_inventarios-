package com.inventario.stalinSuntaxi_inventarios.service;

import java.util.List;

import com.inventario.stalinSuntaxi_inventarios.dtos.Pedido;

public interface PedidoServiceInterfaz {

	
	List<Pedido> findAll();
	Pedido save(Pedido pedido);
	Pedido findById(Integer idPedido);
	
}
