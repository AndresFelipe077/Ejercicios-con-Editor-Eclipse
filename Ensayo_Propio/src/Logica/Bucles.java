package Logica;

import java.util.Scanner;

public class Bucles {
	
	
	public static void main(String[]args) {
		
		/*
		int n = 1;
		while(n < 9)
		{
			
			System.out.println("Hola mundo");
			n++;
			
		}
		*/
		
		/*
		int n = 9;
		do
		{
			System.out.println("Hola mundo");
			n++;
			
		}while(n == 9);
		*/
		
		
		/*
		int n = 10;
		
		for(int i = 0; i < n;i++)
		{
			
			System.out.println("Alex");
			
		}
		*/
		
		/*
		int array[] = {1,2,3,4,5};
		String nombres[] = {"Andres","Felipe","Luis","Carlos","Samuel"};
		Double floatantes[] = {1.2,3.2,5.3,4.3,5.2};
		
		for(int i = 0;i < 5;i++)
		{
			
			System.out.println(array[i]);
			System.out.println(nombres[i]);
			System.out.println(floatantes[i]);
			
		}
		
		
		//For Each
		for(int dato:array)
		{
			
			System.out.println(dato);
			
			
		}
		*/
		
		/*
		for(int i = 0;i<10;i+=2)
		{
			
			System.out.println("El valor de la variable i es: " + i);
			
		}
		
		int n = 0;
		while(n!=9)
		{
			
			System.out.println("valor de la variable i es: ");
			
			
		}
		*/
		
		/*
		int cont = 0;
		int acu = 0;
		for(int i=0;i <=50;i+=2)
		{
			
			
			acu+=i;
			
			
		}
		System.out.println(cont);
		System.out.println(acu);*/
		
		
		
		/*
		
		//multiplos de 5 diga tingo y cuando diga 9 tango
		int mult5 = 5;
		int mult9 = 9;
		for(int i = 1;i < 100;i+=1)
		{
			
			if(i % 5 == 0)
			{
				
				System.out.println("tingo" + i);
				
			}
			
			if(i % 9 == 0)
			{
				
				System.out.println("tango" + i);
				
			}
			
			
		}
		
		
		System.out.println("Tabla de multiplicar del 7");
		for(int i = 1; i < 11;i++)
		{
			
			System.out.println("7 * " + i + " = " + i * 7);
			
			
		}
		*/
		
		
		/*
		//tabla del 1 al 10
		for(int i = 1;i <= 10;i++)
		{
		
			//Primer tabla
			//System.out.println(i + " * " + i + " = " + i * 1);
			System.out.println("TABLA DEL " + i);
			
			
			for(int k = 1;k <= 10; k++)
			{
				
				System.out.println(k + " * " + k + " = " + k * i);
				
				
			}// fin segundo for
			
			
		}//fin primer for
		
		
		*/
		
		
		primos();
		
		// numeros amigos
				
	}// fin main

	
	static void primos()
	{
		Scanner entrada = new Scanner(System.in);
		/*int num = 4;
		//System.out.println("Ingresa un numero");
		
		int cont = 0;
		int acumulador = 0;
		
		for(int i = 1; i <= num; i++)
		{
			
			
			if(num % i == 0)
			{
				
				cont++;
				
			}
			
		}
		
		if(cont == 2)
		{
			
			System.out.println("Es primo");
			
		}
		else
		{
			
			System.out.println("No es primo");
			
		}
		System.out.println("El numero de divisores es: " + cont);
		
		*/
		//Numeros amigos
		int num1 = 0, num2 = 0, cont = 0, acu = 0, acu2 = 0;
			
			
		
			
		
		
		
		
		
	}
	
	
}
