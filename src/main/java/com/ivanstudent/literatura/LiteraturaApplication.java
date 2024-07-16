package com.ivanstudent.literatura;

import com.ivanstudent.literatura.library.Libreria;
import com.ivanstudent.literatura.repository.AutorRepository;
import com.ivanstudent.literatura.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraturaApplication implements CommandLineRunner {
	@Autowired
	private LibroRepository libroRepository;
	@Autowired
	private AutorRepository autorRepository;

	public static void main(String[] args) {
		SpringApplication.run(LiteraturaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Libreria libreria = new Libreria(libroRepository, autorRepository);
		libreria.consumo();
	}
}
