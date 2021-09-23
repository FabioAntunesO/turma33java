package entities;

public class Terceiro extends Funcionario
{
	//Atributos
	private double adicional;
	
	//Construtor
	public Terceiro(String nome, String matricula) 
	{
		super(nome, matricula);
	}
	
	public Terceiro(String nome, String matricula, int horasTrabalhadas, double valorHora, double adicional) 
	{
		super(nome, matricula, horasTrabalhadas, valorHora);
		this.adicional = adicional;
	}

	//encapsulamentos
	public double getAdicional() 
	{
		return adicional;
	}
	
	public void setAdicional(double adicional) 
	{
		this.adicional = adicional;
	}
	
	// metodos
	@Override
	public double salario()
	{
		return (this.horasTrabalhadas * this.valorHora) + adicional;
	}
}

