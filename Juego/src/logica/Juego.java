package logica;

import java.util.Scanner;

public class Juego {

	public static void main(String[] args) {
		
		jugar(10);

	}//Fin main

	static void jugar(int vidas)
	{
		
		int numeroRandom = (int)(Math.random() * 101);
		int numeroElegido = -1;
		
		Scanner entrada = new Scanner(System.in);
		
		while(numeroElegido != numeroRandom)
		{
			
			System.out.println("Ingrese un número entre 1 y 100");
			numeroElegido = entrada.nextInt();
			
			if(numeroRandom < numeroElegido)
			{
				System.out.println("El número más pequeño");
				vidas--;
			}
			else if (numeroRandom > numeroElegido) 
			{
				System.out.println("El número más grande");
				vidas++;
			}
			
			if(vidas == 0)
			{
				System.out.println("----------------");
				System.out.println("|  GAME OVER  |");
				System.out.println("----------------");
				
			}
			
			System.out.println("-----------------------------");
			System.out.printf("Te quedan %d vidas\n", vidas);
			System.out.println("-----------------------------");
			
		}//Fin while
		
		if(numeroElegido == numeroRandom)
		{
			System.out.println("**************************");
			System.out.println("FELICITACIONES GANASTE!!!");
			System.out.println("**************************");
			
		}
		
	}
	

}//Fin Juego