/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade 
 * e o escreva em seguida. Encontre após a maior pontuação e a apresente. 
 */

programa
{
	
	funcao inicio()
	{
		//variaveis
		inteiro pontuacao[5], x, maiorPontuacao=0
		//entradas/procesamentos
		para (x=0; x<=4; x++)
		{
			escreva("Digite a pontuação: ")
			leia(pontuacao[x])
			escreva("\n")
		}
		para (x=0; x<=4; x++)
		{
			escreva("[", pontuacao[x],"]")

			se (pontuacao[x] > maiorPontuacao)
			{
				maiorPontuacao = pontuacao[x]
			}
		}
		//saidas
		escreva("\n")
		escreva("\nA maior pontuação foi: ", maiorPontuacao)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 398; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */