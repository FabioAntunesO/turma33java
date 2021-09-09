package entities;

public class Cavalo extends Animal 
{

	//construtor
	
	public Cavalo(String nome, int idade) 
	{
		super(nome, idade);
	}
	
	//metodo
	public void correr()
	{
		System.out.println("Cavalo correndo...");
	}
	@Override // polimorfismo - peguei a referencia da classe mae (super) e alterei o conteudo no caso o som
	public void emitirSom()
	{
		System.out.println("ircc ircc...");
	}
}
