import java.util.Locale;
import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double base1 = 0, base2=0;
        double altura1 = 0, altura2=0;
        double area1 = 0, area2 = 0;
        
        System.out.println("Digite o valor da base do 1� tri�ngulo: ");
        base1 = leia.nextDouble();
        System.out.println("");
        System.out.println("Digite o valor da altura do 1� tri�ngulo: ");
        altura1 = leia.nextDouble();
        System.out.println("Digite o valor da base do 2� tri�ngulo: ");
        base2 = leia.nextDouble();
        System.out.println("");
        System.out.println("Digite o valor da altura do 2� tri�ngulo: ");
        altura2 = leia.nextDouble();
        
        System.out.println("");
        
        if(base1 > 0 && altura1 >0) 
        {
        	area1 = ((base1 * altura1) / 2);
        			System.out.println("A �rea do tri�ngulo � " + area1);
        }
        else 
        {
        	System.out.println("N�o realizado, o valores s�o invalidos!");
        }
        
        
	}

}
