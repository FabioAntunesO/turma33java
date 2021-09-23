package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

import entities.Time13092021;



public class CadTimes 
{

	public static void main(String[] args, Time13092021 Time) 
	{
		Scanner read = new Scanner(System.in);
		
		List<String> listaTimes = new ArrayList<>();
		List<Time13092021> listaTopem = new ArrayList<>();
		
		
		int x = 0;
		String auxNome;
		
		listaTimes.add("SPFC");
		listaTimes.add("PALMEIRAS");
		
		listaTimes.add(1, "SANTOS");
		
		listaTimes.add("CORINTHIANS");
		
		
		listaTopem.add(new Time13092021("SPFC"));
		listaTopem.add(new Time13092021("PALMEIRAS"));
		listaTopem.add(1, new Time13092021("SANTOS"));
		
		listaTopem.get(1).ganhaPontos('g');
		
		for (Time13092021 equipe : listaTopem)
		{
			System.out.println(equipe.getNome()+" pontos: "+equipe.getPontos());
		}
		
		
		//System.out.println(listaTimes.get(2).toLowerCase());
		
		
		
		
		for (String item : listaTimes) 
		{
			System.out.println("Times: "+x+"-"+item.toUpperCase());
			x++;
		}
		
		
		
		
	}

}
