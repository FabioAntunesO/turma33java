package com.helloworld2.hello2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorld2Controller 
{
	@GetMapping
	public String hello()
	{
		return "Os meus objetivos de aprendizagem para esta semana são:"
				+ "\nFixar o conhecimento adquirido em Spring e "
				+ "realizar exercicios para testar o conhecimento.";
	}
}
