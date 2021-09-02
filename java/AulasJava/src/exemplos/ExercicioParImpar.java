package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioParImpar 
{
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		int num1;
		
		System.out.println("Digite um numero inteiro positivo: ");
		num1 = read.nextInt();
		
		if(num1 % 2 == 1) 
		{
			System.out.printf("O número %d é impar!",num1);
		}
		else if(num1 == 0)
		{
			System.out.printf("Zero é neutro!");
		}
		else if(num1 % 2 == 0)
		{
			System.out.printf("O número %d é par!",num1);
		}
		else if(num1 < 0)
		{
			System.out.printf("Impossivel realizar, digite outro número!");
		}
	}
}