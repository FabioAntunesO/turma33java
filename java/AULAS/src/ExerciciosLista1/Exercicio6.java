package ExerciciosLista1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double x1,y1,x2,y2,d;
		
		System.out.println("Digite o valor de x1: ");
		x1 = leia.nextDouble();
		System.out.println("Digite o valor de y1: ");
		y1 = leia.nextDouble();
		System.out.println("Digite o valor de x2: ");
		x2 = leia.nextDouble();
		System.out.println("Digite o valor de y2: ");
		y2 = leia.nextDouble();
		
		d = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
		
		System.out.println("A distancia entre P1 e P2 é: "+ d);
	}
}
