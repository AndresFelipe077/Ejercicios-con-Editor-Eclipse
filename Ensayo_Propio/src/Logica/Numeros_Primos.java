package Logica;

import java.util.Scanner;

public class Numeros_Primos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe un valor: ");
		int num = entrada.nextInt();
		int cont = 0;
		for(int i = 1; i <= num; i++)
		{
			
			if(num % i == 0)
			{
				cont++;
			}
			
			
		}//Fin for

		if(cont == 2)
		{
			
			System.out.println("Es primo");
			
		}
		else 
		{
			
			System.out.println("No es primo");
			
		}
		
		
	}//Fin main

}//Fin clase
