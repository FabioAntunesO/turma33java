programa
{
	inclua biblioteca Matematica
	funcao inicio()
	{
		real a, b, c, d, r, s

		escreva("Digite o primeiro numero: ")
		leia(a)
		escreva("Digite o segundo numero: ")
		leia(b)
		escreva("Digite o terçeiro numero: ")
		leia(c)

		r = Matematica.potencia((a + b),2)
		escreva("\nO valor de r é: " + r)
		
		s = Matematica.potencia((b + c),2)
		escreva("\nO valor de s é: " + s)

		d = (r + s)/2
		escreva("\nO valor de d é: " + d)

		

		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 415; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */