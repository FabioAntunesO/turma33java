package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class CadNotas 
{

	public static void main(String[] args) 
	{
		//para limpar o teclado colocar "read.nextLine();"
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		String nome[] = {"Marcos", "Paulo", "Pedro", "José"};
		int notas[] = new int[4];
		
		System.out.print("Tamanho do vetor"+nome.length);
		
		for (int x=0; x<nome.length; x++)
		{
			System.out.println("Aluno: "+nome[x]+"informe a nota: ");
			notas[x] = read.nextInt();		
		}
	}

}
