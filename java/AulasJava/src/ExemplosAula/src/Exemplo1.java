import java.util.Locale;
import java.util.Scanner;



public class Exemplo1 
{
	
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double base = 0;
        double altura = 0;
        double area = 0;
        
        System.out.println("Digite o valor da base do tri�ngulo: ");
        base = leia.nextDouble();
        System.out.println("");
        System.out.println("Digite o valor da altura do tri�ngulo: ");
        altura = leia.nextDouble();
        System.out.println("");
        
        if(base > 0 && altura >0) {
        	area = ((base * altura) / 2);
        			System.out.println("A �rea do tri�ngulo � " + area);
        }else {
        	System.out.println("N�o realizado, o valores s�o invalidos!");
        }

	}

}
