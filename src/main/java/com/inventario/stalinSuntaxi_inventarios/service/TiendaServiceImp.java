package com.inventario.stalinSuntaxi_inventarios.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventario.stalinSuntaxi_inventarios.dtos.Market;
import com.inventario.stalinSuntaxi_inventarios.model.Tienda;
import com.inventario.stalinSuntaxi_inventarios.repository.TiendaRepository;

@Service
public class TiendaServiceImp implements TiendaInterface{

	@Autowired
	private TiendaRepository tiendaRepository;

	@Override
	public List<Market> findAll() {
		
		List<Tienda> tiendas = new ArrayList<>();
		List<Market> markets = new ArrayList<>();
		try {
			tiendas=(List<Tienda>) tiendaRepository.findAll(); 
		} catch (Exception e) {
			e.printStackTrace();
			return markets;
		}
		
		
		for (Tienda tienda : tiendas) {
			markets.add(new Market(tienda.getCodigoTi(), tienda.getNombreTi()));
			
		}	
		
		return markets;
	}

	@Override
	public Market save(Market market) {
		
		Tienda tienda = new Tienda(market.getCod(), market.getName());
		
		try {
			tienda = tiendaRepository.save(tienda);
			return market;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
			// TODO: handle exception
		}
		
	}
	
	
}
