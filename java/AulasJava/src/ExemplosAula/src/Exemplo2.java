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
        
        System.out.println("Digite o valor da base do 1º triângulo: ");
        base1 = leia.nextDouble();
        System.out.println("");
        System.out.println("Digite o valor da altura do 1º triângulo: ");
        altura1 = leia.nextDouble();
        System.out.println("Digite o valor da base do 2º triângulo: ");
        base2 = leia.nextDouble();
        System.out.println("");
        System.out.println("Digite o valor da altura do 2º triângulo: ");
        altura2 = leia.nextDouble();
        
        System.out.println("");
        
        if(base1 > 0 && altura1 >0) 
        {
        	area1 = ((base1 * altura1) / 2);
        			System.out.println("A área do triângulo é " + area1);
        }
        else 
        {
        	System.out.println("Não realizado, o valores são invalidos!");
        }
        
        
	}

}
