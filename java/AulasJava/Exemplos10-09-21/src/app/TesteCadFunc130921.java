package app;

import entities.Funcionario;
import entities.Terceiro;

public class TesteCadFunc130921 {

	public static void main(String[] args) 
	{
		Funcionario func1 = new Funcionario ("João", "01", 50, 10.00);
		Terceiro terc1 = new Terceiro("Maria", "15", 50, 10,10.25);
		
		
		System.out.println(func1.toString()+func1.salario());
		
		System.out.println(terc1.toString()+terc1.salario());
		

	}

}
