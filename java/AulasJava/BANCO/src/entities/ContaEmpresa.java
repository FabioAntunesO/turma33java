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
				System.out.println("Amigo, você não pode fazer um empréstimo de R$ 0 reais!");
			}
			else if(emprestimo < 0)
			{
				System.out.println("Você não pode fazer empréstimo de valores negativos!");
			}
			else if((this.emprestimoEmpresa - emprestimo) < 0)
			{
				System.out.println("O valor de empréstimos não pode ultrapassar R$ 10.000!");
			}
			else
			{
				super.credito(emprestimo);				
				this.emprestimoEmpresa -= emprestimo;
				System.out.printf("Você solicitou um empréstimo de R$ %.2f porém "
								  + "seu Limite de Empréstimo é : R$ %.2f \n",
								  emprestimo, this.emprestimoEmpresa);
			}
			
		}
	
}

