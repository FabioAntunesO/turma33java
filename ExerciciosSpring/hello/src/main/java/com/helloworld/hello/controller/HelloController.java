package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello")
public class HelloController 
{
	@GetMapping
	public String hello()
	{
		return "Habilidades e mentalidades utilizadas para este trabalho:"
				+ "\nPersistencia e Atenção aos detalhes";
	}
}
