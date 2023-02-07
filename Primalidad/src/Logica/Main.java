package Logica;
import java.awt.Container;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa un número: ");
		int numero = entrada.nextInt();
		
		if(EsPrimo(numero))
		{
			
			System.out.println("Numero primo");
			
		}//Fin if
		else
		{
			
			System.out.println("No es primo");
			
		}
	}
	
	
	static boolean EsPrimo(int numero)
	{
		
		int contador = 0;
		
		int numeros[] = new int[numero];
		for(int i = 0; i < numeros.length;i++)
		{
			
			numeros[i] += 1;
			
		}
		
		for(int i : numeros)
		{
			
			if(i == 1 || i == numero)
			{
				
				continue;
				
			}//Fin if
			
			if(numero % i == 0)
			{
				
				contador++;
				
			}//Fin if
			
			
		}
		
		return contador == 0;
		
		
	}

}
