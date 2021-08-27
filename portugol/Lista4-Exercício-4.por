/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
 * e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, 
 * ou seja, diagonal principal.
 */

programa
{
	
	funcao inicio()
	{
		//variaveis
		inteiro mat[3][3], l, c=0, total=0, totalDiagonal=0
		//entradas/procesamentos
		para (l=0;l<=2;l++)
		{
			para (c=0;c<=2;c++)
			{
				escreva("Digite um número inteiro: ")
				leia(mat[l][c]) 
				total = total + mat[l][c]
				totalDiagonal = (mat[0][0] + mat[1][1] + mat[2][2])
			}
		}
		//saidas
		escreva ("\nA soma dos valores da matriz é: ", total)
		escreva ("\nA soma dos valores da diagonal principal é: ", totalDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 551; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {mat, 12, 10, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */