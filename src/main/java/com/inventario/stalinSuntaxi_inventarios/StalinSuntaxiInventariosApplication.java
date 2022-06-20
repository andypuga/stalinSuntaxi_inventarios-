package com.inventario.stalinSuntaxi_inventarios;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.inventario.stalinSuntaxi_inventarios.model.Tienda;
import com.inventario.stalinSuntaxi_inventarios.repository.TiendaRepository;

@SpringBootApplication

public class StalinSuntaxiInventariosApplication {


    
    @Bean
    public CommandLineRunner demo(TiendaRepository repository) {
      return (args) -> {
  		Tienda tienda = new Tienda();
  		tienda.setCodigoTi("T001");
  		tienda.setNombreTi("Loja");
  		Tienda tienda2 = new Tienda();
  		tienda2.setCodigoTi("T002");
  		tienda2.setNombreTi("Quito");
  		Tienda tienda3 = new Tienda();
  		tienda3.setCodigoTi("T003");
  		tienda3.setNombreTi("Cuenca");
  		Tienda tienda4 = new Tienda();
  		tienda4.setCodigoTi("T004");
  		tienda4.setNombreTi("Machala");
  		repository.save(tienda);
  		repository.save(tienda2);
  		repository.save(tienda3);
  		repository.save(tienda4);

      };
    }
   
	public static void main(String[] args) {
		SpringApplication.run(StalinSuntaxiInventariosApplication.class, args);



		
		
	}

}
