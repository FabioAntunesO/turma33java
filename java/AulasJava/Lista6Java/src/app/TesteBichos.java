package app;

import entities.Cachorro;
import entities.Cavalo;
import entities.Preguica;

public class TesteBichos {

	public static void main(String[] args) 
	{
		
		Cachorro dog1 = new Cachorro("Mancha", 2);
		Cavalo cav1 = new Cavalo("Pé-de-Pano", 7);
		Preguica pre1 = new Preguica("Flash", 5);
		
		System.out.println(dog1.toString());
		dog1.emitirSom();
		System.out.println(cav1.toString());
		cav1.emitirSom();
		System.out.println(pre1.toString());
		
	}

}
