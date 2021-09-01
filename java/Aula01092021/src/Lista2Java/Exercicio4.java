package Lista2Java;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		double num1;
		
		System.out.println("Digite um numero inteiro: ");
		num1 = read.nextInt();
		
		if(num1 % 2 == 1) 
		{
			num1 = Math.pow(num1, 2);
			System.out.printf("O número %f é impar!",num1);
		}
		else if(num1 == 0)
		{
			System.out.printf("Zero é neutro!");
		}
		else if(num1 % 2 == 0)
		{
			num1 = Math.sqrt(num1);
			System.out.printf("O número %f é par!",num1);
		}
		else if(num1 < 0)
		{
			System.out.printf("Impossivel realizar, digite outro número!");
		}
	}
}
