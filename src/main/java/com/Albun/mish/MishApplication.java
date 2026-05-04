package com.Albun.mish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MishApplication {

	public static void main(String[] args) {
		SpringApplication.run(MishApplication.class, args);

		System.out.println("\n--------------------------------------");
		System.out.println("¡TODO LISTO! El álbum está funcionando.");
		System.out.println("Abre tu navegador en: http://localhost:8084");
		System.out.println("--------------------------------------\n");
	}

}