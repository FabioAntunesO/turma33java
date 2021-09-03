package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioEmAula 
{

	public static void main(String[] args) 
	{

		/*Faça um programa que crie um vetor por leitura com 5 valores 
		de pontuação de uma atividade e o escreva em seguida. Encontre após a maior 
		pontuação e a apresente.
		*/
		//variaveis
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		double pontos[] = new double[4];
		double maiorPontos=0;
		
		for (int x=0; x<pontos.length; x++)
		{
			System.out.printf("\nDigite o valor da nota: ");
			pontos[x] = read.nextDouble();
		}
		for(int x=0; x<pontos.length; x++)
		{
			System.out.print("\n"+pontos[x]);
		}
		
		for (int x=0; x<pontos.length; x++)
		{
			if (maiorPontos<pontos[x])
			{
				maiorPontos = pontos[x];
			}
		}
		System.out.println("\nA pontuação maior é: "+maiorPontos);
	}
}