package Lista2Java;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		//variaveis
		int idade;
		
		//entradas
		System.out.println("Digite sua idade: ");
		idade = read.nextInt();
		
		//processamento//saida
		
		if(idade>=10 && idade<=14) 
		{
			System.out.printf("Sua idade é %d anos e voce é infantil!",idade);
		}
		else if(idade>14 && idade<=17)
		{
			System.out.printf("Sua idade é %d anos e voce é juvenil!",idade);
		}
		else if(idade>=18 && idade<=100)
		{
			System.out.printf("Sua idade é %d anos e voce é adulto!",idade);
		}
		else if(idade==0)
		{
			System.out.printf("Recem nascido!");
		}
		else if(idade<10)
		{
			System.out.printf("Sua idade é %d anos e voce é criança!",idade);
		}
	}

}
