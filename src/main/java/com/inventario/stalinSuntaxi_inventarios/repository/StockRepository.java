package com.inventario.stalinSuntaxi_inventarios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.inventario.stalinSuntaxi_inventarios.model.Producto;
import com.inventario.stalinSuntaxi_inventarios.model.Stock;

public interface StockRepository extends CrudRepository<Stock, Integer>{

	
	@Query( value = "SELECT SUM(S.STOCK_STO ) AS CANTIDAD, S.ID_PROD  FROM STOCK S GROUP BY S.ID_PROD ", nativeQuery = true)
	List<Object> findAllGroupByProducto();
	
	List<Stock> findByIdProd(Producto idProd);
}
