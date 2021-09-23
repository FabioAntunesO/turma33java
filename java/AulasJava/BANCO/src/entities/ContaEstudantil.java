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
			System.out.println("Amigo, você não pode fazer um empréstimo de R$ 0 reais!");
		}
		else if(emprestimoEstudantil < 0)
		{
			System.out.println("Você não pode fazer empréstimo de valores negativos!");
		}
		else if((this.limiteEstudantil - emprestimoEstudantil) < 0)
		{
			System.out.println("O valor de empréstimos não pode ultrapassar R$ 5.000!");
		}
		else
		{
			super.credito(emprestimoEstudantil);				
			this.limiteEstudantil -= emprestimoEstudantil;
			System.out.printf("Você solicitou um empréstimo de R$ %.2f porém "
							  + "seu Limite de Empréstimo é : R$ %.2f \n",
							  emprestimoEstudantil, this.limiteEstudantil);
		}
	}
}
