package Lista2Java;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		int num1,num2,num3;
		
		System.out.println("Digite o primeiro numero inteiro positivo: ");
		num1 = read.nextInt();
		System.out.println("Digite o segundo numero inteiro positivo: ");
		num2 = read.nextInt();
		System.out.println("Digite o terceiro numero inteiro positivo: ");
		num3 = read.nextInt();
		
		if(num1>num2 && num1>num3)
		{
			System.out.printf("O numero maior é: %d",num1);
		}
		
		if(num2>num1 && num2>num3)
		{
			System.out.printf("O numero maior é: %d",num2);
		}
		
		if(num3>num1 && num3>num2)
		{
			System.out.printf("O numero maior é: %d",num3);
		}
	}
}
