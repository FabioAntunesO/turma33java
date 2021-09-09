package Aplicacoes;

import java.util.Locale;

import Classes.E3ProdutoEletronico;

public class Exercicio3AppEletronico 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		
		E3ProdutoEletronico produto1 = new E3ProdutoEletronico();
		produto1.nome = "Playstation 5";
		produto1.categoria = "Video Game";
		produto1.memoria = "825gb";
		produto1.preco = 6.500;
		
		System.out.println("Aproveite a promoção "+produto1.categoria+" "+produto1.getNome()+ " com "+produto1.memoria+" de memória somente R$"+produto1.preco);

	}

}
