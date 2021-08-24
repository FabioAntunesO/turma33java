programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real peso, pesoPermitido, multa, pesoExcedente

		multa = 4.00
		pesoPermitido = 50.0
		
		
		escreva("Digite o peso dos tomates: ")
		leia(peso)

		pesoExcedente = peso - pesoPermitido
		
		
		se (peso > pesoPermitido) 
		{
			
			escreva("Peso execedente!")
			pesoExcedente = peso - pesoPermitido
			escreva("\nO valor de multa a ser pago é R$", multa * pesoExcedente, " e o peso excedente é ", pesoExcedente,"Kg")
			
		}
		senao se (peso <= pesoPermitido)
		{
			
			escreva("O peso dos tomates é ", peso,"Kg",", multa R$ ", multa = 0.00, " e o peso excedente é ", pesoExcedente = 0.00, "Kg")
				
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 685; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */