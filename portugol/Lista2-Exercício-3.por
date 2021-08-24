programa
{
	
	
	funcao inicio()
	{
		real n1, n2, n3, n4, quadrado1, quadrado2, quadrado3, quadrado4, total

		escreva("Digite o 1º numero: ")
		leia(n1)
		escreva("Digite o 2º numero: ")
		leia(n2)
		escreva("Digite o 3º numero: ")
		leia(n3)
		escreva("Digite o 4º numero: ")
		leia(n4)

		quadrado1 = (n1 * n1)
		quadrado2 = (n2 * n2)
		quadrado3 = (n3 * n3)
		quadrado4 = (n4 * n4)

		se (quadrado3 >= 1000.00)
		{
			escreva ("O valor quadrado do 3º numero é: ", quadrado3)
		}
		
		senao 
		{
			escreva ("\nO valor quadrado do 1º numero é: ", quadrado1)
			escreva ("\nO valor quadrado do 2º numero é: ", quadrado2)
			escreva ("\nO valor quadrado do 3º numero é: ", quadrado3)
			escreva ("\nO valor quadrado do 4º numero é: ", quadrado4)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 750; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */