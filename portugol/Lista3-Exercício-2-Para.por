/*2- Desenvolver um sistema que efetue a soma de todos os números ímpares que são  
 * múltiplos de três e que se encontram no conjunto dos números de 1 até 500.
*/

programa
{
	
	funcao inicio()
	{

	inteiro somaImpar=0, totalImpar=0
	const inteiro QTD = 500

	para (inteiro x = 1; x <= QTD; x++)
	{
		se ((x % 2 != 0) e (x % 3 == 0)) 
		{
			somaImpar = somaImpar + x
			escreva("\n",x)
		}	
	}
	escreva("\nA somatória de numeros impares de 1 a 500 é: ", somaImpar)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 220; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */