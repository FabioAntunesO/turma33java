package app;

import java.util.Scanner;

import entities.Conta;
import entities.ContaCorrente;

public class ProgramaTeste 
{

	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		
		ContaCorrente cli1 = new ContaCorrente(322, null, 0);// instanciar - usar - criar objeto 
		
		System.out.println("Digite o numero da conta: ");
		cli1.setnumero = read.nextInt();
		System.out.println("Digite o cpf da conta: ");
		cli1.cpf = read.next();
		
		cli1.numero = 1;
		cli1.cpf = "111.122.222-56";
		cli1.saldo = 0.0;
		cli1.ativo = true;
		
		System.out.println(cli1.numero);
		System.out.println(cli1.cpf);
		
		

	}

}
