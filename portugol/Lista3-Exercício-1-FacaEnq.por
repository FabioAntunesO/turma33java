/*1- Faça um programa que mostre uma contagem na tela de 233 a 456, 
 * só que contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.
 */
programa
{
	funcao inicio()
	{
	//variaveis
		inteiro contador=5, contadorExc=3, x=233, y=456
			
	//entradas
	escreva(x)
	//processamentos
	faca 
	{	
		se (x >= 300 e x <= 400)
		{
			x = contadorExc + x
			escreva("\n",x)
		}
		senao 
		{
			x = contador + x
			escreva("\n",x)
		}
	}
	enquanto (x <= y)
	//saidas
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 164; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */