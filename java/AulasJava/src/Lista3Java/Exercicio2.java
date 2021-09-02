package Lista3Java;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		double num=0, contadorPar=0,contadorImpar=0;
		
		for (int x=1; x<=3; x++)
		{	
			System.out.println("Digite um número: ");
			num = read.nextDouble();
		
			if(num % 2 == 0)
			{
				contadorPar++;
			}
			
			if(num % 2 == 1)
			{
				contadorImpar++;
			}
		}	
		System.out.printf("\nA quantidade total de numeros pares é: %.2f", contadorPar);
		System.out.printf("\nA quantidade total de numeros impares é: %.2f", contadorImpar);
	}
}
