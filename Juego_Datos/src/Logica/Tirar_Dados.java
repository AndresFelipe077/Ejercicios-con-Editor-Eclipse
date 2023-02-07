package Logica;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Tirar_Dados {

	public static void main(String[] args) {
		
		TirarDados();
		
	
	}
	
	
	
	
	static void TirarDados()
	{
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe EMPEZAR para comenzar a jugar: ");
		
		
		String dado;
		dado = entrada.nextLine();
		
		if(dado == "a")
		{
			
			numeroRandom();
			
		}
		
		
	}//Fin Funcion
	
	static int numeroRandom()
	{
		int numeroRandom,valorMenor = 1,valorMayor = 6;
		return numeroRandom = (int)(Math.random() * valorMayor + valorMenor);
	}

}
