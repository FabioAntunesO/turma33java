package entities;

public class Cachorro extends Animal
{
	public Cachorro(String nome, int idade) 
	{
		super(nome, idade);
		
	}

	public void correr()
	{
		System.out.println("Cachorro correndo....");
	}
	@Override// polimorfismo - peguei a referencia da classe mae (super) e alterei o conteudo no caso o som
	public void emitirSom()
	{
		System.out.println("au au au...");
	}
}
