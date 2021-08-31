package ExerciciosLista1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 
{
	public static void main(String[] args) 
	{
		//variaveis
		Locale.setDefault(Locale.US); // perfumaria
		Scanner leia = new Scanner(System.in);
		double a,b,c,d,e,f,x,y;
		String nome;
		
		System.out.println("Leia o valor de a: ");
		nome = leia.next();
		System.out.println("Leia o valor de a: ");
		a = leia.nextDouble();
		System.out.println("Leia o valor de b: ");
		b = leia.nextDouble();
		System.out.println("Leia o valor de c: ");
		c = leia.nextDouble();
		System.out.println("Leia o valor de d: ");
		d = leia.nextDouble();
		System.out.println("Leia o valor de e: ");
		e = leia.nextDouble();
		System.out.println("Leia o valor de f: ");
		f = leia.nextDouble();
		
		x = ((c * e) - (b * f))/((a*e) - (b*d));
		
		y = ((a * f) - (c * d))/((a*e) - (b*d));
		
		System.out.println("O valor de x é " + x + " e o valor de y é " + y);
		
		System.out.printf("%s O valor de x=%.2f e o valor de y=%.2f ",nome,x,y);
		//%s - string
		//%d - int - numero inteiro
		//%f - [%.2f] - double - numero real
		leia.close();
	}
}
