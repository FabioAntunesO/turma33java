
programa
{
	
	funcao inicio()
	{
	 //variaveis
	 inteiro numero=0
	 inteiro contador=1
	 inteiro total=0
	 
	 //entradas
	 escreva("Digite um numero inteiro positivo :")
	 leia(numero)
	 //processamentos
	 faca {
		escreva(contador)
		se (contador<numero)
		{
			escreva("+")	
		}
		
		total = total + contador//totalizador
		contador = contador + 1
		
	 	} 
	 enquanto (contador<=numero)
	 //saidas
	 escreva("=",total)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 388; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */