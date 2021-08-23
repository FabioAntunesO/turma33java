programa
{
	
	funcao inicio()
	{

		real nota1, nota2, nota3, nota1f, nota2f, nota3f, media 

	
		escreva ("\nDigite sua 1ª nota: ")
		leia(nota1)
		escreva ("\nDigite sua 2ª nota: ")
		leia(nota2)
		escreva ("\nDigite sua 3ª nota: ")
		leia(nota3)

		nota1f = nota1 * 2
		nota2f = nota2 * 3
		nota3f = nota3 * 5
		
		media = (nota1f + nota2f + nota3f) / 3

		escreva("\nSua média final é: " + media)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 411; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */