package Logica;
import java.util.*;

public class prueba1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe un número: ");
		int numero = entrada.nextInt();
		if(esPrimo(numero))
		{
			System.out.printf("El número %d es PRIMO!!!", numero);
		}
		else 
		{
		System.out.printf("El número %d NO es primo", numero);	
		}
		

	}
	
	static boolean esPrimo(int numero)
	{
		
		int contador = 0;
		int numeros[] = new int[numero];
		
		for(int i = 0; i < numeros.length; i++)
		{
			numeros[i] += 1;
		}//Fin for
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
		}//Fin for
		return contador == 0;
	}

}
