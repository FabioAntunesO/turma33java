package entities;

public abstract class Conta 
{
	//atributos
	private int numero;
	private String cpf;
	private double saldo;
	private boolean ativo;
	
	
	//construtor
	
	public Conta(int numero, String cpf) {
		super();
		this.numero = numero;
		this.cpf = cpf;
	}
	
	
	//construtor - sobrecarga (somente exemplo no caso do banco nao precisaria)
	
	public Conta(int numero, String cpf, boolean ativo) {
		super();
		this.numero = numero;
		this.cpf = cpf;
		this.ativo = ativo;
	}
	
	
	//encapsulamento - getters and setters - o programa s? tera acesso pelos getters e setters
	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCpf() {
		return cpf;
	}
	/*
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	*/
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}


	
	
	//metodos
	public void credito(double valor)
	{
		//saldo = saldo + valor;
		saldo += valor;
	}
	
	public void debito(double valor)
	{
		if (valor ==0)
		{
			System.out.println("Debido vazio, impossivel realizar...");
		}
		else if (valor <0)
		{
			System.out.println("Valor informado negativo, impossivel realizar...");
		}
		else if (valor > saldo)
		{
			System.out.println("Saldo insuficiente, impossivel realizar...");
		}
		else 
		{
			//saldo = saldo - valor;
			saldo -= valor;
		}
	}
	
	//seja o que Deus quiser...
	@Override
	public String toString()
	{
		return ("N?mero da Conta: "+ this.numero +
				"CPF: "+ this.cpf +
				"SALDO: "+ this.saldo); 			
	}
}
