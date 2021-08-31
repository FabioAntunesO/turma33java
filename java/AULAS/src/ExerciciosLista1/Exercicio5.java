package ExerciciosLista1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double nota1,nota2,nota3,nota1f,nota2f,nota3f,media;
		
		System.out.println("Digite sua 1ª nota: ");
		nota1 = leia.nextDouble();
		System.out.println("Digite sua 2ª nota: ");
		nota2 = leia.nextDouble();
		System.out.println("Digite sua 3ª nota: ");
		nota3 = leia.nextDouble();
		
		nota1f = (nota1 * 2);
		nota2f = (nota2 * 3);
		nota3f = (nota3 * 5);
		
		media = ((nota1f + nota2f + nota3f) / 3);
		
		System.out.println("Sua média final é: " + media);
	}

}
