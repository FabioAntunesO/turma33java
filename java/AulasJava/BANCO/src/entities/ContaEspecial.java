package entities;

public class ContaEspecial extends Conta {
	
	//atributos
	private double limite;
	
	
	//construtor
	public ContaEspecial(int numero, String cpf, double limite) {
		super(numero, cpf);
		this.limite = limite;
	}

	//encapsulamento
	public double getLimite() {
		return limite;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	//metodos
	
	

}
