package ExerciciosLista1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) 
	{
		//variaveis
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int anos, meses, dias, idadeDias;
		
		System.out.println("Qual a sua idade expressa em anos? ");
		anos = leia.nextInt();
		System.out.println("\nE Quantos meses? ");
		meses = leia.nextInt();
		System.out.println("\nE Quantos dias? ");
		dias = leia.nextInt();
		
		idadeDias = (anos * 365) + (meses * 30) + dias;
		
		System.out.println("Sua idade em dias é: " + idadeDias);
	}

}
