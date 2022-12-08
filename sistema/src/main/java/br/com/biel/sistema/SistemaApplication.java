package br.com.biel.sistema;

import br.com.biel.sistema.controllers.OrderController;
import br.com.biel.sistema.models.Order;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

@SpringBootApplication
public class SistemaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaApplication.class, args);


		//System.out.println("ii");
	}

}
