package ExerciciosLista1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double a,b,c,d,r,s;
		
		System.out.println("Digite o primeiro numero: ");
		a = leia.nextDouble();
		System.out.println("Digite o segundo numero: ");
		b = leia.nextDouble();
		System.out.println("Digite o terceiro numero: ");
		c = leia.nextDouble();
		
		r = Math.pow((a + b),2);
		System.out.println("O valor de r é: " + r);
		
		s = Math.pow((b + c),2);
		System.out.println("O valor de s é: " + s);
		
		d = ((r + s) / 2);
		System.out.println("O valor de d é: " + d);
	}

}
