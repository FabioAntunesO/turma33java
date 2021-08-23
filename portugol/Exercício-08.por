programa
{
	
	funcao inicio()
	{
		real precoDeFabrica, imposto1, imposto2, precoFinal

		 escreva("Digite o valor de fabrica do produto: ")
		 leia(precoDeFabrica)

		 imposto1 = precoDeFabrica * .28

		 imposto2 = precoDeFabrica * .45

		 precoFinal = precoDeFabrica + imposto1 + imposto2

		 escreva("\nO custo do carro para o consumidor final é: " + precoFinal)

		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 370; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */