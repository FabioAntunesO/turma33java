package Aplicacoes;

import java.util.Locale;


import Classes.E2Aviao;

public class Exercicio2AppAviao 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		
		E2Aviao aviao1 = new E2Aviao();
		
		aviao1.fabricante = "Boeing";
		aviao1.cor = "Cinza";
		aviao1.tamanho = "Grande Porte";
		aviao1.anoModelo = 2014;
		
		System.out.printf("O aviao da %s, na cor %s de %s tem %d anos de uso!", aviao1.fabricante, aviao1.cor, aviao1.tamanho, aviao1.VerificaIdadeAviao(2021));
		
		
	}

}
