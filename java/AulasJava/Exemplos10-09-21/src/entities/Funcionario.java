package entities;

public class Funcionario 
{
	//atributos
	private String nome;
	private String matricula;
	protected int horasTrabalhadas;
	protected double valorHora;
	
	//construtor
	public Funcionario(String nome, String matricula) 
	{
		super();
		this.nome = nome;
		this.matricula = matricula;
	}

	public Funcionario(String nome, String matricula, int horasTrabalhadas, double valorHora) 
	{
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}

	//encapsulamento - getters and setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	public double getValorHora() {
		return valorHora;
	}
	
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	//metodos
	public double salario() 
	{
		return (this.horasTrabalhadas * this.valorHora);
	}

	@Override
	public String toString() 
	{
		return "Funcionario [nome=" + nome + ", matricula=" + matricula + ", horasTrabalhadas=" + horasTrabalhadas
				+ ", valorHora=" + valorHora + "]";
	}
	
	
	
}

