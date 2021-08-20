programa
{
	
	funcao inicio()
	{

		inteiro idadePessoaEmDias,qtdAnos,qtdMeses,qtdDias

		escreva("Qual a sua idade em dias? ")
		leia (idadePessoaEmDias)

		qtdAnos = idadePessoaEmDias / 365
		escreva("\n Sua idade em Anos é: " + qtdAnos)

		qtdMeses = (idadePessoaEmDias % 365) / 30
		escreva("\n meses: " + qtdMeses)

		qtdDias = (qtdMeses % 365) % 30
		escreva ("\n dias: " + qtdDias)
		




	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 33; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */