package com.adri.pedidos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@EntityScan(basePackages = "com.adri.model")
@EnableJpaRepositories(basePackages = "com.adri.dao")
@SpringBootApplication(scanBasePackages = {"com.adri.service","com.adri.controller"})
public class PedidosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PedidosApplication.class, args);
	}

	@Bean
	public RestTemplate template(){
		return new RestTemplate();
	}

}
