package Lista3Java;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 
{

	public static void main(String[] args) 
	{
		/* Exercicio 4
		 */
		
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		//variaveis
		final int PESSOAS=2;//Depois colocar 150
		int idade=0;
		char sexo=0; //(1-feminino / 2-masculino / 3-Outros)
		char opcao = 0;//(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva)
		int pessoasCalmas=0, mulheresNervosas=0, homensAgressivos=0,outrosCalmos=0;
		int pessoasNervosasMais40Anos=0, pessoasCalmasMenos18Anos=0;
		int contador=0;
		
		//entradas//processamentos
		while(contador<PESSOAS) 
		{
			contador++;
			System.out.println(+contador+"º Pessoa digite a sua idade:");
			idade = read.nextInt();
			System.out.println(+contador+"º Pessoa digite o seu sexo (1-feminino/ 2-masculino/ 3-Outros):");
			sexo = read.next().charAt(0);
			System.out.println(+contador+"º Pessoa digite uma opção: ");
			System.out.println("\n1-Sou uma pessoa calma: \n2-Sou uma pessoa nervosa: \n3-Sou uma pessoa agressiva");
			sexo = read.next().charAt(0);
		
			if(opcao=='1')
			{
				pessoasCalmas++;
			}
			if(sexo=='1' && opcao=='2')
			{
				mulheresNervosas++;
			}
			if(sexo=='2' && opcao=='3')
			{
				homensAgressivos++;
			}
			if(sexo=='3' && opcao=='1')
			{
				outrosCalmos++;
			}
			if(opcao=='2' && idade>40)
			{
				pessoasNervosasMais40Anos++;
			}
			if(opcao=='1' && idade<18)
			{
				pessoasCalmasMenos18Anos++;
			}
			
			System.out.println();
		
		}
		//saidas
		System.out.println("Total pessoas cadastradas: "+contador);
		System.out.println("Pessoas calmas: "+pessoasCalmas);
		System.out.println("Mulheres nervosas: "+mulheresNervosas);
		System.out.println("Homens Agressivos: "+homensAgressivos);
		System.out.println("Outros calmos: "+outrosCalmos);
		System.out.println("Pessoas nervosas com mais de 40 anos: "+pessoasNervosasMais40Anos);
		System.out.println("Pessoas calmas com menos 18: "+pessoasCalmasMenos18Anos);
	}
}
