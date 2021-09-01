package Lista2Java;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

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
		
		if(num1==num2 && num1==num3)
		{
			System.out.printf("%d, %d, %d",num1, num2, num3); // todos numeros iguais
		}
		
		else if(num1>num2 && num2>num3)
		{
			System.out.printf("%d, %d, %d",num3, num2, num1);
		}
		else if(num1<=num2 && num2<=num3)
		{
			System.out.printf("%d, %d, %d",num1, num2, num3);
		}
		
		else if(num1<=num3 && num3<=num2 && num1<=num2)
		{
			System.out.printf("%d, %d, %d",num1, num3, num2);
		}
		
		else if(num2<=num1 && num2<=num3 && num1<=num3)
		{
			System.out.printf("%d, %d, %d",num2, num1, num3);
		}
		else if(num3<=num1 && num3<=num2 && num2<=num1)
		{
			System.out.printf("%d, %d, %d",num3, num2, num1);
		}
		else if(num1>=num2 && num1>=num3 && num3>=num2)
		{
			System.out.printf("%d, %d, %d",num2, num3, num1);
		}
		else if(num3<=num1 && num3<=num2 && num1<=num2)
		{
			System.out.printf("%d, %d, %d",num3, num1, num2);
		}
	}

}
