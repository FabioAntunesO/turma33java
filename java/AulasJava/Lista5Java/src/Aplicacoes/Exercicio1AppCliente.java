package Aplicacoes;

import java.util.Locale;

import Classes.E1Cliente;

public class Exercicio1AppCliente 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		
		
		E1Cliente cliente1 = new E1Cliente();
		
		cliente1.nome = "João";
		cliente1.idade = 30;
		cliente1.cpf = "384511328";
		cliente1.negativado = false;
		
		
		 E1Cliente cliente2 = new E1Cliente();
		 
		 cliente2.nome = "Maria"; 
		 cliente2.idade = 27; 
		 cliente2.cpf = "395632235";
		 cliente2.negativado = false;
		 
		
		if(cliente1.negativado == true)
		{
			System.out.printf("Sua conta %s está negativa!", cliente1.nome);
		}
		
		else if(cliente1.negativado == false) 
		{
			System.out.printf("Sua conta %s está positiva!",cliente2.nome);
		}

	}

}
