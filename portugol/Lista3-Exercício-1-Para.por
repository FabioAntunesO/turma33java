/*1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00. 
*/
programa
{
	
	funcao inicio()
	{
		real salario, mediaSalario = 0.00, maiorSalario = 0.00, perSalario, totalSalario = 0.00, salarioMenor = 0.00
		inteiro numeroFilhos, mediaFilhos, totalFilhos = 0.00
		
		const inteiro QUANTIDADE = 20


		para(inteiro x = 1; x <= QUANTIDADE; x++)
		{
			escreva("\nParticipante ",x," digite o seu salário: ")
			leia(salario)
			escreva("\nParticipante ",x," digite quantos filhos voce tem: ")
			leia(numeroFilhos)
			totalFilhos = (totalFilhos + numeroFilhos)

			se (salario > maiorSalario) 
			{
				maiorSalario = salario
			}
			
			totalSalario = (totalSalario + salario)

			se (salario <= 100)
			{
				salarioMenor = (salarioMenor + 1)
			}
		}
		mediaSalario = (totalSalario / QUANTIDADE)
		escreva ("\nA média de salário da população é: ", mediaSalario)
		
		mediaFilhos = (totalFilhos / QUANTIDADE)
		escreva("\nA média de filhos da população é: ", mediaFilhos)

		escreva("\nO maior salario é: ", maiorSalario)

		perSalario = ((salarioMenor/ QUANTIDADE) * 100)
		escreva("\nO percentual de pessoas com salário menor que R$ 100,00 é: ", perSalario, "%")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1276; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */