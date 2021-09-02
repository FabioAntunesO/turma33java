package Lista3Java;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 
{

	public static void main(String[] args) 
	{
		/*
		 * Escrever um programa que receba vários números inteiros (positivos) no teclado.
		 *  E no final imprimir a média dos números múltiplos de 3. 
		 *  Para sair digitar 0(zero).(DO...WHILE)
		 */
		
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		int numero=0; 
		int contador=0;
		double media=0.0;
		double total=0.0;
		
		do 
		{
			System.out.println("Digite um numero positivo: ");
			numero = read.nextInt();
			
			if(numero>0 && (numero%3)==0)
			{
				//contador = contador + 1;
				contador++;
				total += numero;
				//total = total + numero;
			}
		}
		
		while(numero>0);
		
		if (contador>0)
		{
			media = (total / contador);
		}
		System.out.printf("A media dos numeros digitados (multiplos de 3) é: %.2f", media);
	}
}
