package Lista3Java;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		/*
		 * Crie um programa que leia um n�mero do teclado at� que encontre
		 *  um n�mero igual a zero. No final, mostre a soma dos n�meros digitados.(DO...WHILE)
		 */
		
		//variaveis
		int numero=0,soma=0;
		
		//entradas/processamentos
		do
		{
			System.out.println("Digite um numero inteiro: ");
			numero = read.nextInt();
			soma = (soma + numero);
		}
		
		while (numero != 0);
		
		//saida
		System.out.printf("A soma dos n�meros digitados �: %d",soma);
	}
}
