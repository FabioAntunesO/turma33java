package ExerciciosLista1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int horas,min,segundos,seg;
		
		System.out.println("Digite a dura��o do evento da f�brica em segundos: ");
		segundos = leia.nextInt();
		
		horas = (segundos/ 3600);
				
		min = ((segundos % 3600) / 60);
				
		seg = ((segundos % 3600) % 60);
		
		System.out.println("A dura��o do evento na fabrica foi de " + horas + " horas " + min + " minutos e " + seg + " segundos");
	}

}
