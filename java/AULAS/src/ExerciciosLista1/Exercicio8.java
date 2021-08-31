package ExerciciosLista1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double precoFa,imposto1,imposto2,precoFinal;
		
		System.out.println("Digite o valor de fabrica do produto: ");
		precoFa = leia.nextDouble();
		
		imposto1 = (precoFa * .28);
		
		imposto2 = (precoFa * .45);
		
		precoFinal = (precoFa + imposto1 + imposto2);
		
		System.out.println("O custo do carro para o consumidor final é: " + precoFinal);
	}
}
