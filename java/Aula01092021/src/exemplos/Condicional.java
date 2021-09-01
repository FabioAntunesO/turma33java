package exemplos;

import java.util.Locale;
import java.util.Scanner;


public class Condicional 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		/*
		 * //printf
		//CLASSE String
		//cadeia = String %s
		//TIPO
		//inteiro = int %d
		//real = double %f = %.2f
		//caracter = char %c
		//logico = boolean %b
		 */
		
		//variaveis
		String nome;
		int anoNascimento,idade;
		
		//entradas
		System.out.println("Digite seu nome: ");
		nome = read.next();
		System.out.println("Digite seu ano de nascimento: ");
		anoNascimento = read.nextInt();
		
		//processamento
		idade = (2021 - anoNascimento);
		
		if(idade>45) 
		{
			System.out.printf("%s sua idade é %d anos e voce é (Cringe)velho!",nome,idade);
		}
		else if(idade>=18)
		{
			System.out.printf("%s sua idade é %d anos e voce é adulto!",nome,idade);
		}
		else if(idade>=13)
		{
			System.out.printf("%s sua idade é %d anos e voce é jovem!",nome,idade);
		}
		else if(idade==0)
		{
			System.out.printf("Recem nascido!");
		}
		
		//saida
		System.out.printf("%s sua idade é %d anos",nome,idade);
	}

}
