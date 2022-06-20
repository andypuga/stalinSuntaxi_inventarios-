package com.inventario.stalinSuntaxi_inventarios.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventario.stalinSuntaxi_inventarios.dtos.Prod;
import com.inventario.stalinSuntaxi_inventarios.model.Producto;
import com.inventario.stalinSuntaxi_inventarios.model.Stock;
import com.inventario.stalinSuntaxi_inventarios.model.Tienda;
import com.inventario.stalinSuntaxi_inventarios.repository.ProductoRepository;
import com.inventario.stalinSuntaxi_inventarios.repository.StockRepository;
import com.inventario.stalinSuntaxi_inventarios.repository.TiendaRepository;

@Service
public class ProductoServiceImp implements ProductoServiceInterface {

	@Autowired
	private ProductoRepository ProductoRepository;
	@Autowired
	private StockRepository stockRepository;

	@Autowired
	private TiendaRepository tiendaRepository;
	
	@Override
	public List<Prod> findAll() {
		List<Prod> prods  = new ArrayList<>();
		List<Stock> stockList = new ArrayList<>();// trae agurpado por idprod y sumado
		stockList= (List<Stock>) stockRepository.findAll();
		for (Stock stock : stockList) {
			Producto producto = new Producto();
			producto = ProductoRepository.findById(stock.getId()).get();
			prods.add(new Prod(producto.getId(),producto.getCodigoProd(), producto.getNombreProd(),producto.getPrecio(), stock.getStockSto()));
		}	
		
		return prods;
	}

	@Override
	public Prod save(Prod prod) {
		
		Producto producto = new Producto(prod.getCod(), prod.getName(), prod.getPrice());
		producto =ProductoRepository.save(producto);
		List<Tienda>  tiendas= new ArrayList<>();
		tiendas	 = 	(List<Tienda>) tiendaRepository.findAll();
		Integer stockTot = 0;
		for (Tienda tienda : tiendas) {
			Stock stock= new Stock(producto, tienda, 0);
			stock = stockRepository.save(stock);
			
		}
		prod.setId(producto.getId());
		prod.setStock(stockTot);
		
		return prod;
		
	}

	@Override
	public Prod updateStock(Integer stock, Integer idProd) {
		 List<Stock> listaStock = new ArrayList<>();
		 Producto  producto = new Producto();
		 try {
			 producto = ProductoRepository.findById(idProd).get();
			 listaStock = stockRepository.findByIdProd(producto);
			 Integer stockTot = 0; 
			 for (Stock stock2 : listaStock) {
				 stock2.setStockSto(stock2.getStockSto()+stock);
				 stockRepository.save(stock2);	
				 stockTot = stockTot+stock2.getStockSto();
			 }
			Prod prod = new Prod(idProd, producto.getCodigoProd(), producto.getNombreProd(), producto.getPrecio(), stockTot);
			return prod;
		} catch (Exception e) {
			e.printStackTrace();
			return new Prod();
		}

		 
	}







}
