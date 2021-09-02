package Lista3Java;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		/* Exercicio 3
		 * Solicitar a idade de várias pessoas e imprimir: 
		 * Total de pessoas com menos de 21 anos. 
		 * Total de pessoas com mais de 50 anos. 
		 * O programa termina quando idade for =-99. (WHILE)
		 */
		
		//variaveis
		
		int idade=0, totalMenos21=0, totalMais50=0;
		
		//entradas/processamentos
		
		while(idade>-99 || idade<-99)
		{
			System.out.println("Digite sua idade: ");
			idade = read.nextInt();
			
			if(idade < 21)
			{
				totalMenos21++;
			}
			else if(idade > 50)
			{
				totalMais50++;
				//totalMais50 = totalMais50 + idade;
			}
		}
		//saidas
		
		System.out.printf("\nO Total de pessoas com menos de 21 anos é: %d", totalMenos21);
		System.out.printf("\nO Total de pessoas com mais de 50 anos é: %d", totalMais50);
	}

}
