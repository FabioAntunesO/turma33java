package Classes;

public class E2Aviao 
{
	public String fabricante;
	public String cor;
	public String tamanho;
	public int	anoModelo;
	
	public int VerificaIdadeAviao(int anoAtual)
	{
		int idadeAviao;
		idadeAviao = anoAtual - anoModelo;
		return idadeAviao;
	}
	
}
