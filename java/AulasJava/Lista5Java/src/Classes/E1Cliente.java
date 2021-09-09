package Classes;

public class E1Cliente 
{
	public String nome;
	public int idade;
	public String cpf;
	public char pronome;
	
	public boolean negativado = false;
	
	//Lista o cliente
	public void listaCliente(){
		System.out.println(nome);
	}
	//Conta corrente negativa
	public void contaNegativa(){
		negativado = true;
	}
	//Conta corrente positiva
	public void contaPositiva(){
		negativado = false;
	}	
	
	public String tratamento(char codigo) {
		String resposta="";
		if (codigo == 'o') {
			resposta = "Senhor";
		}
		else if (codigo=='a') {
			resposta = "Senhora";
		}
		else if (codigo=='e') {
			resposta = "Senhore";
		} else {
			resposta = "Senhorx";
		}
		
		return resposta;
	}

}
