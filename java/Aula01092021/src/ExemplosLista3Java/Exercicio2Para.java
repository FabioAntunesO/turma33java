package ExemplosLista3Java;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2Para 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		/*
		*/
		
		int somaImpar=0;
		final int QTD = 500;
		
		for (int x=1; x<=QTD; x++)
		{
			if(((x%2) != 0) && (x % 3) == 0)
					{
						somaImpar = somaImpar + x;
						System.out.println(x);
					}
		}
		System.out.printf("A somatória de numeros impares de 1 a 500 é: %d ", somaImpar);
	}
}
