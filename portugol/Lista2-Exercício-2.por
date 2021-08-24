programa
{
	
	funcao inicio()
	{
		real codigoFunc, numHoras, salario, numHorasPadrao, numHorasExcedente, salarioTotal, salarioExcedente

		escreva ("Digite o código do funcionário: ")
		leia(codigoFunc)
		escreva ("Digite o numero de horas trabalhadas: ")
		leia(numHoras)

		salario = numHoras * 10.00
		numHorasPadrao = 50.00

		se (numHoras > numHorasPadrao)
		{
			numHorasExcedente = numHoras - numHorasPadrao
			
			salarioExcedente = numHorasExcedente * 20.00
		
	 		salarioTotal = (numHorasPadrao * 10.00) + salarioExcedente
	 	
	 		escreva("Funcionário ", codigoFunc, " o seu salário total é R$", salarioTotal, " o salário excedente é R$", salarioExcedente)
		}
		 
		senao se (numHoras <= numHorasPadrao)
		{
			escreva ("O seu salário é R$", salario)
		}
	 	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 303; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */