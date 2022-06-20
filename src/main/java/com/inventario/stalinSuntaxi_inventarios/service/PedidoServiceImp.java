package com.inventario.stalinSuntaxi_inventarios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventario.stalinSuntaxi_inventarios.dtos.Pedido;
import com.inventario.stalinSuntaxi_inventarios.repository.DetalleRepository;
import com.inventario.stalinSuntaxi_inventarios.repository.OrdenRepository;
import com.inventario.stalinSuntaxi_inventarios.repository.ProductoRepository;

@Service
public class PedidoServiceImp implements PedidoServiceInterfaz{
	
	@Autowired
	private OrdenRepository ordenRepository;
	@Autowired
	private DetalleRepository tetalleRepository;
	@Autowired 
	private TiendaInterface tiendaInterface;
	@Autowired
	private ProductoRepository productoRepository;
	@Override
	public List<Pedido> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pedido save(Pedido pedido) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pedido findById(Integer idPedido) {
		// TODO Auto-generated method stub
		return null;
	}

}
