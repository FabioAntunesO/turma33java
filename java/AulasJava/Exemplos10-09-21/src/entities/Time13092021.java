package entities;

public class Time13092021 
{
	//Atributos
	private String nome;
	private int pontos;

	//Construtores
	
	public Time13092021(String nome) 
	{
		super();
		this.nome = nome;
	}

	//Encapsulamentos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPontos() {
		return pontos;
	}
	/*
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	*/

	//Metodos
	public void ganhaPontos(char resultado)
	{
		//g-ganhou 3 pontos, e-ganhou 1 ponto, p-ganhou zero ponto
		if(resultado == 'g')
		{
			//this.pontos = this.pontos+3;
			this.pontos += 3;
			
		}
		else if (resultado == 'e')
		{
			this.pontos +=1;
		}
		else 
		{
			this.pontos +=0;
		}
	}
	//Sobrecarga/Sobrescrita
}
