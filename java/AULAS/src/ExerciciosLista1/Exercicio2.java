package ExerciciosLista1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int idadePessoaEmDias,qtdAnos,qtdMeses,qtdDias;
		
		System.out.println("Qual a sua idade em dias? ");
		idadePessoaEmDias = leia.nextInt();
		
		qtdAnos = (idadePessoaEmDias / 365);
		System.out.println("Sua idade em Anos é: " + qtdAnos);
		
		qtdMeses = (idadePessoaEmDias % 365) / 30;
		System.out.println(qtdMeses + " meses");
		
		qtdDias = (qtdMeses % 365) % 30;
		System.out.println(qtdDias + " dias");
	}

}
