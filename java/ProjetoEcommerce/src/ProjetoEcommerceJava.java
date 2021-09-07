import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ProjetoEcommerceJava 
{
	static double valor[] = { 119.99, 799.99, 109.99, 380.99, 539.99, 649.99, 850.99, 999.99, 220.99, 950.99 };
	static double carrinho[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	static double estoque[] = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
	double valorTotal = 0.0, valorFinal = 0.0, valorImposto = 0.0, imposto = 0.00, juros = 0.0, taxaCartao = 0.0;
	int tipoPagamento = 0;
	static String produtosNome[] = { "Luminária de mesa", "Poltrona", "Abajur", "Estante", "Escrivaninha",
			"Cadeira de Escritório", "Cama", "Cadeira Gamer", "Mesa de centro", "Sofá" };
	static String codigo[] = { "G5-1", "G5-2", "G5-3", "G5-4", "G5-5", "G5-6", "G5-7", "G5-8", "G5-9", "G5-10" };

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		
		cabecalho();
		paginaPrincipal();

	}
	
	public static void paginaPrincipal() {

		Scanner leia = new Scanner(System.in);

		char resposta = 0;

		System.out.println("Olá, deseja comprar algo? ");
		System.out.println("Digite S/N: ");
		resposta = leia.next().charAt(resposta);
		if (resposta == 'S' || resposta == 's') {
			limpa();
			cabecalho();
			pular();
			System.out.print("Iremos te apresentar os nossos produtos!\n");
			//linha();
			menuCarrinho();
		} else if (resposta == 'N' || resposta == 'n') {
			cabecalho();
			despede();
			linha();
			pular();
			System.out.println("Até breve!!\n");
			System.exit(0);
			
		}

	}

	public static void menu() {
		Scanner leia = new Scanner(System.in);

		System.out.print("\n-------------------------------------------------------------------------------\n");
		System.out.print("\n\t\tLISTA DE PRODUTOS DISPONIVEIS\n\n");
		System.out.printf("CÓDIGO\tPRODUTO\t\t\t\t\tVALOR\t\tESTOQUE\n");

		for (int x = 0; x < 10; x++) {

			System.out.printf("%s\t %s \t R$ %.2f \t %f\n", codigo[x], produtosNome[x], valor[x], estoque[x]);
			
		}

	}

	public static void itensNoCarrinho() {
		System.out.println("CARRINHO DE COMPRAS\n");
		System.out.print("Item                    Un      VlrUn      VlrTotal\n");
		for (int i = 0; i < 10; i++) {
			if (carrinho[i] != 0) {
				System.out.print(produtosNome[i]);
				espacoNome(produtosNome[i]);
				System.out.print(carrinho[i] + "       " + valor[i] + "      " + (valor[i] * carrinho[i]) + "\n");
			}
		}
	}

	public static void menuCarrinho() {
		Scanner leia = new Scanner(System.in);

		int codigoLer = 1, quantidade = 0, localVetor = 0;
		String codigoCompleto = "";

		while (codigoLer != (-1)) {
			int v = 1;
			menu();
			System.out.print("\n");
			itensNoCarrinho();
			System.out.print("\nDigite o código do produto a ser adicionado ao carrinho" + "\n"
					+ "ou aperte '0' para encerrar compra: ");
			codigoCompleto = leia.next();

			do {
				for (int x = 0; x < 10; x++) {

					if (codigoCompleto.intern() == codigo[x] || codigoCompleto.intern() == "0") {
						localVetor = x;
						v = 0;
					}
				}
				if (v != 0) {
					System.out.print("Código Incorreto\n");
					System.out.print("Digite o código do produto a ser adicionado ao carrinho" + "\n"
							+ "ou aperte '0' para encerrar compra: ");
					codigoCompleto = leia.next();
				}
			} while (v != 0);

			// System.out.print(codigoCompleto+"\n");
			codigoLer = localVetor;
			// System.out.print(codigoLer);

			if (codigoCompleto.intern() == "0") {
				notaFiscal();

			} else if (codigoLer != -1 && estoque[codigoLer] <= 10) {
				System.out.print("Qual a quantidade?: ");
				try {
					quantidade = leia.nextInt();
				} catch (InputMismatchException erro1) {
					System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
					leia.nextLine();
				}
				while (quantidade < 0) {
					System.out.println("Quantidade negativa, Digite novamente: ");
					quantidade = leia.nextInt();
				}

				if (quantidade <= estoque[codigoLer]) {
					carrinho[codigoLer] = carrinho[codigoLer] + quantidade;
				} else {
					System.out.println("Desculpe, mas nosso estoque não possui essa quantidade\n");
					System.out.println("Quantidade disponivel em estoque: " + estoque[codigoLer]);

				}
			} else {
				break;
			}

		}

	}



	public static void notaFiscal() {

		Scanner leia = new Scanner(System.in);
		
		String nome = "Ricardo Oliveira"; // exemplo
		String CPF = "xxx.xxx.xxx-xx"; // exemplo
		
		double somatorio;
		double valorTotal = 0.0, valorFinal = 0.0, PorcentagemImposto = 0.09;
		double juros = 0.0, taxaCartao = 0.0;
		int tipoPagamento=0;

		formaPagamento();
		
		System.out.print("\n\t\t\t N O T A    F I S C A L\n");
		System.out.print("---------------------------------------------------------------------------\n");
		System.out.print("Itens \t\t\t\t  QtUnit \t VlUnit \t TotalUnit\n\n");

		for (int i = 0; i < 10; i++) {
			if (carrinho[i] != 0) {
				System.out.print(produtosNome[i]);
				somatorio = carrinho[i] * valor[i];
				System.out.printf("\t\t  " + carrinho[i] + "\t\t " + valor[i] + "\t\t " + "%.2f \n", somatorio);

			}
		}

		System.out.print("\n---------------------------------------------------------------------------\n");
		System.out.print(
				"Imposto:" + "\t\t\t\t\t\t\t " + "R$ " + (PorcentagemImposto + 3) + Math.round(PorcentagemImposto + (2)) + "\n");
		if (tipoPagamento == 1) { // OPÇÃO A VISTA: EXIBE O VALOR TOTAL COM 10% DE DESCONTO
			System.out.print("Desconto:\t\t\t\t\t\t\t R$ " + (valorTotal * 0.1 + (5))
					+ Math.round(valorTotal * 0.1 + (5)) + "\n");
		}

		if (tipoPagamento == 2) { // OPÇÃO 1X NO CARTAO DE CRÉDITO: EXIBE O VALOR TOTAL COM ACRÉSCIMO DE 10% DE JUROS
			System.out.print("Taxa:" + (taxaCartao + (5)) + Math.round(taxaCartao + (2)) + "\n");
		}

		if (tipoPagamento == 3) { // OPÇÃO 2X NO CARTAO DE CRÉDITO: EXIBE O VALOR TOTAL COM ACRÉSCIMO DE 15% DE JUROS
			System.out.print("Juros do cartao:" + (juros + (16)) + Math.round(juros + (2)) + "\n");
			System.out.print("Taxa:" + (taxaCartao + (5)) + Math.round(taxaCartao + (2)) + "\n\n");
		}

		System.out.print("---------------------------------------------------------------------------\n");
		System.out.printf("Total: \t\t\t\t\t\t\t\t R$ " + "%.2f \n", (calculaTotal(+2)));
		// System.out.print("\nTotal: \t\t\t\t\t\t\t\t R$ " + (valorFinal+(3)) +
		// Math.round(valorFinal+(2)) + "\n");
		System.out.print("---------------------------------------------------------------------------\n");
		System.out.printf("Cliente - %s", nome);
		System.out.printf("\t\t\t      CPF - %s\n", CPF);

		retiraItensEstoque();

		zeraCarrinho();

		
		String pressione = " ";
		System.out.print("\n\n\nPressione 'Enter' para voltar ao menu principal.");
		pressione = leia.next();
		
		paginaPrincipal(); 

	}

	public static double calculaTotal(int i) {

		double total = 0.0;
		for (i = 0; i < 10; i++) {
			total += carrinho[i] + valor[i];
		}

		return total;
	}

	public static void retiraItensEstoque() {

		double carrinho[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		double estoque[] = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };

		for (int i = 0; i < 10; i++) {
			estoque[i] -= carrinho[i];
		}

	}

	public static void zeraCarrinho() {

		double carrinho[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		for (int i = 0; i < 10; i++) {
			carrinho[i] = 0;
		}
	}

	public static void agradece() {
		System.out.println("Obrigada por comprar com a Devs de int[e]=riores!\n");
	}

	public static void despede() {
		System.out.println("Obrigada por vir à Devs de int[e]=riores!");
	}

	public static void cabecalho() {
		linha();
		nome();
		slogan();
		linha();
		pular();
	}

	public static void nome() {
		System.out.println("---Bem-vinde à Devs de int[e]=riores----");
	}
	
	public static void espacoNome(String y) {
		int h;
		h=25-y.length();
		for (int x =0; x<h;x++)
		System.out.print(" ");
		
	}

	public static void slogan() {
		System.out.println("-------Programando o seu conforto!------");
	}

	public static void linha() {
		System.out.println("----------------------------------------");
	}

	public static void pular() {
		System.out.println("\n");
	}

	public static void limpa() {
		for (int clear = 0; clear < 10; clear++) {
			System.out.println(" ");
		
		
	}
	}

	public static void desenhoQrCode() 
	{
		System.out.println("\n\nEmissão do seu QR Code ... \n");
		
		System.out.print("\t\t\t@@@@@@@@@@@  @@@@@@@@@@@\n");
		System.out.print("\t\t\t@@       @@  @@       @@\n");
		System.out.print("\t\t\t@@  @@@  @@  @@  @@@  @@\n");
		System.out.print("\t\t\t@@       @@  @@       @@\n");
		System.out.print("\t\t\t@@@@@@@@@@@  @@@@@@@@@@@\n");
		System.out.print("\t\t\t                        \n");
		System.out.print("\t\t\t@@@@@@@@@@@  @@@#    . @\n");
		System.out.print("\t\t\t@@       @@     ,@@@    \n");
		System.out.print("\t\t\t@@  @@@  @@  @@@%   @@@@\n");
		System.out.print("\t\t\t@@       @@  @@@%      @\n");
		System.out.print("\t\t\t@@@@@@@@@@@  @@@%   @@@@\n");
	}

	public static void formaPagamento() 
	{
		Scanner leia = new Scanner(System.in);
		
		int tipoPagamento=0;
		
		System.out.println("\nEscolha a forma de pagamento:");
		System.out.println("\n1 - Á vista - com 10% de Desconto!");
		System.out.println("\n2 - 1X No cartão de crédito - Acrécimo de 10% de Juros!");
		System.out.println("\n3 - 2X No cartão de crédito - Acrécimo de 15% de Juros!");
		tipoPagamento = leia.nextInt();
	}
}




   
   



	