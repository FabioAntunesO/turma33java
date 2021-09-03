package Lista4Java;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		//variaveis
		int mat [][]  = new int[3][3];
		int total=0, totalDiagonal=0, x=0, y=0;
		
		//entradas/procesamentos
		for (int l=0;l<2;l++)
		{
			for (int c=0;c<2;c++)
			{
				System.out.printf("Digite um numero inteiro: ");
				mat[l][c] = read.nextInt();
						
				total = total + mat[l][c];
				if( l==c )
				{
					totalDiagonal = totalDiagonal +mat[l][c];
				}
			}
		}
		System.out.printf("A soma dos valores da matriz é: %d", total);
		System.out.printf("\nA soma dos valores da diagonal principal é: %d", totalDiagonal);
	}
}
