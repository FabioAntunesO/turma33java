package ExemplosLista3Java;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1FacaEnquanto 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);

		/*
		 *
		 */
		
		int contador=5, contadorExc=3, x=233, y=456;
		
		System.out.print(x);
		
		do 
		{
			if(x>= 300 && x<=400)
			{
				x = (contadorExc + x);
				System.out.printf("\n%d",x);
			}
			else 
			{
				x = (contador + x);
				System.out.printf("\n%d",x);
			}
		}
		while (x<=y);
	}
}