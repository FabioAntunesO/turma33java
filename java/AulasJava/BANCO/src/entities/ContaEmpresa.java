package entities;

public class ContaEmpresa extends Conta{
	
	// attribute
		private	double	emprestimoEmpresa;	
	// constructor
		public ContaEmpresa(int numero, String cpf, double emprestimoEmpresa) {
			super(numero, cpf);
			this.emprestimoEmpresa = emprestimoEmpresa;
		}
	// encapsulation
		public double getEmprestimoEmpresa() {
			return emprestimoEmpresa;
		}
		public void setEmprestimoEmpresa(double emprestimoEmpresa) {
			this.emprestimoEmpresa = emprestimoEmpresa;
		}
		
	// methods
		public void pedirEmprestimo(double emprestimo)
		{
			if (emprestimo == 0)
			{
				System.out.println("Amigo, voc� n�o pode fazer um empr�stimo de R$ 0 reais!");
			}
			else if(emprestimo < 0)
			{
				System.out.println("Voc� n�o pode fazer empr�stimo de valores negativos!");
			}
			else if((this.emprestimoEmpresa - emprestimo) < 0)
			{
				System.out.println("O valor de empr�stimos n�o pode ultrapassar R$ 10.000!");
			}
			else
			{
				super.credito(emprestimo);				
				this.emprestimoEmpresa -= emprestimo;
				System.out.printf("Voc� solicitou um empr�stimo de R$ %.2f por�m "
								  + "seu Limite de Empr�stimo � : R$ %.2f \n",
								  emprestimo, this.emprestimoEmpresa);
			}
			
		}
	
}

