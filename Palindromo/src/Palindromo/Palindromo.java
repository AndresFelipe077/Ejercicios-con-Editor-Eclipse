package Palindromo;

import java.util.Scanner;

public class Palindromo {
	
	public static void main(String []args)
	{
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe un palindromo: ");
		String cadena = entrada.nextLine();
		
		if(esPalindromo(cadena))
		{
			System.out.println("Es palindromo");
		}
		else 
		{
			System.out.println("No es palindromo");	
		}
		
	}
	
	static boolean esPalindromo(String cadena)
	{
		
		cadena = cadena.replace(" ", "");
		cadena = cadena.toLowerCase();
		
		StringBuilder cadenaInvertida = new StringBuilder();
		
		for (int i = cadena.length()-1;i >= 0;i--)
		{
			
			cadenaInvertida.append(cadena.charAt(i));
			
		}
		
		
		return cadena.equals(cadenaInvertida.toString());
		
	}
	

}
