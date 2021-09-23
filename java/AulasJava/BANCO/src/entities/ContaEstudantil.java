package entities;

public class ContaEstudantil extends Conta
{
	//atributos
	private double limiteEstudantil;
	//construtores
	public ContaEstudantil(int numero, String cpf, double limiteEstudantil) {
		super(numero, cpf);
		this.limiteEstudantil = limiteEstudantil;
	}
	//encapsulamento
	public double getLimiteEstudantil() {
		return limiteEstudantil;
	}
	public void setLimiteEstudantil(double limiteEstudantil) 
	{
		this.limiteEstudantil = limiteEstudantil;
	}
	
	//metodos
	public void usarEstudantil(double emprestimoEstudantil)
	{
		if (emprestimoEstudantil == 0)
		{
			System.out.println("Amigo, voc� n�o pode fazer um empr�stimo de R$ 0 reais!");
		}
		else if(emprestimoEstudantil < 0)
		{
			System.out.println("Voc� n�o pode fazer empr�stimo de valores negativos!");
		}
		else if((this.limiteEstudantil - emprestimoEstudantil) < 0)
		{
			System.out.println("O valor de empr�stimos n�o pode ultrapassar R$ 5.000!");
		}
		else
		{
			super.credito(emprestimoEstudantil);				
			this.limiteEstudantil -= emprestimoEstudantil;
			System.out.printf("Voc� solicitou um empr�stimo de R$ %.2f por�m "
							  + "seu Limite de Empr�stimo � : R$ %.2f \n",
							  emprestimoEstudantil, this.limiteEstudantil);
		}
	}
}
