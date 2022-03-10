package com.libreria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibreriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibreriaApplication.class, args);
	}

}

//orden 
//1ro entidades sin relaciones
//2do hacer las relaciones
//3er hacer repositorios de cada entidad
//4to hacer servicios
//5to hacer controladores
