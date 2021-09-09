
public class Carro 

{
	public String marca;
	public String cor;
	public int ano;
	public boolean ligado;
	public int velocidade;
	
	public void ligar()
	{
		System.out.println("Carro Ligado!");
		ligado = true;
	}
	public void desligar()
	{
		System.out.println("Carro Desligado!");
		ligado = false;
	}
	public void acelerar()
	{
		System.out.println("Carro Acelerando!");
		if(ligado)
		{
			velocidade = velocidade + 1; //velocidade++
		}
	}
	public void freiar()
	{
		System.out.println("Carro freiando!");
		if(ligado)
		{
			velocidade = velocidade - 1; //velocidade--
		}
	}

}
