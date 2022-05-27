package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello")

public class HelloController {
	
		@GetMapping
		public String helloworld() {
				return "Hello";
		}
				
				@GetMapping("/bsm")
				public String bsm() {
					return "Mentalidade de Crecimento <br /> Persitência <br /> Responsabilidade Pessoal <br /> Orienção ao Futuro <br /> Comunicação <br /> Orientação ao Detalhe <br /> Proatividade <br />Trabalho em Equipe";
				}
				
				@GetMapping("/objetivo")
				public String objetivo() {
					return "Aprender sobre Spring tool suite <br /> Aprender sobre Insonia <br /> Criação de um blog";
		}

}
