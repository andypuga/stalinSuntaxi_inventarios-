package com.inventario.stalinSuntaxi_inventarios;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import com.inventario.stalinSuntaxi_inventarios.repository.TiendaRepository;

@SpringBootTest
@Sql({"/tienda.sql"})
class StalinSuntaxiInventariosApplicationTests {

	@Test
	void contextLoads() {
	}

	
    @Autowired
    private TiendaRepository tiendaRepository;

    @Test
    public void testLoadDataForTestClass() {
       System.out.println(tiendaRepository.findAll().toString());
    }
}
