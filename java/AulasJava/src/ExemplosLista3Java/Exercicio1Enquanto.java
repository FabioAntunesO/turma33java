package ExemplosLista3Java;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1Enquanto {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		/*1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos 
		 * e apresente no final o total do somatório, a média e o total de valores lidos. 
		 * O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo 
		 * valores positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor 
		 * negativo
		 * 
		 */
		
		double num=0.0, soma=0.0, media=0.0, totalNum=0.0;
		
		while (num>=0)
		{
			System.out.println("Digite um numero positivo, caso seja negativo o programa irá interromper");
			num = read.nextDouble();
			
			if(num>0)
			{
				soma = (soma + num);
				
				totalNum++;
			}
		}
		media = (soma/totalNum);
		System.out.printf("Voce entrou com um numero negativo\nA somatória total é %.2f\nA média é %.2f\nO numero de entradas foi %.0f",soma,media,totalNum);
	}

}
