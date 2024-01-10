package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("aprendizagem")
public class Aprendizado {
	
	@GetMapping
	public String aprendizagem () {
		return "Aprimorar o meu aprendizado em JAVA"
				+ "\nSpringBoot"
				+ "\nBanco de Dados";
	}

}
