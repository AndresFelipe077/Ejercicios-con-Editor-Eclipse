package Logica;

import java.util.Iterator;
import java.util.Scanner;

public class Aprendiendo_Java {

	public static void main(String[] args) {
		
		//Obtener la suma de los primeros N números naturales positivos.
		SumaPrimerosNumerosFor();
		
		//Cantidad De numero enteros For
		//CantidadNumerosRango();
		
		//ARRAYS
		
		//PrimerArray();
		
		//Array con For, while y for-Each iterados
		//ForEachIteraciones();

		//Matriz multidimensional
		//matrizBidimensional();
		
		
		//matrizTridimensional();
		
		
	}
	
	
	static void SumaPrimerosNumerosFor()
	{
		int result = 0;
		int n;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa un número para \nsaber la suma de los números: ");
		n = entrada.nextInt();
		
		//Si el valor es menor a 0 se convertira en positivo
		if(n < 0)
		{
			n = -n;
		}
		
		for(int i = 1; i <= n;i++)
		{
			
			result = result + i;
			
		}//Fin for
		
		System.out.printf("La suma de los numeros es: %d\n", result);
		
		
		 // Variables
		/*
        int num, resultado;
        resultado = 0;

        // Crear Objeto de la Clase Scanner
        Scanner leer = new Scanner(System.in);

        // Ingresar Datos
        System.out.print("Número: ");
        num = leer.nextInt();

        // Solución
        for (int i = 1; i <= num; i++){
            resultado += i;
        }

        // Mostrar Datos
        System.out.println("");
        System.out.println("Suma: " + resultado);
		*/
		
	}
	
	static void CantidadNumerosRango()
	{
		/*
		Scanner entrada = new Scanner(System.in);
		
		int numInicial,numFinal,cantidadNums = 0;
		
		System.out.println("Escribe el primer número: ");
		numInicial = entrada.nextInt();
		System.out.println("Escribe el segundo número: ");
		numFinal = entrada.nextInt();
		
		
		for(int i = 0;i < numInicial && i < numFinal; i++)
		{
			
			cantidadNums = numFinal - numInicial;
			if(cantidadNums < 0)
			{
				cantidadNums = -cantidadNums;
			}
			
		}
		
		System.out.println(cantidadNums);
		*/
		// Variabels
		/*
        int numInicial, numFinal, cantidad;
        cantidad = 0;

        // Crear el objeto Scanner
        Scanner leer = new Scanner(System.in);

        // Ingresar Datos
        System.out.print("Número Inicial: ");
        numInicial = leer.nextInt();

        System.out.print("Número Final: ");
        numFinal = leer.nextInt();

        // Solución
        numInicial = numInicial + 1;
        numFinal = numFinal - 1;

        for (int i = numInicial; i <= numFinal; i++){
            cantidad += 1;
        }

        // Mostrar Datos
        System.out.println("");
        System.out.println("Cantidad: " + cantidad);
		
        */
	}
	
	static void PrimerArray()
	{
		
		String nombres [];
		
		nombres = new String[3]; // el 3 es la cantidad de datos a crear
		
		nombres[0] = "Andrés";
		
		nombres[1] = "Felipe";
		
		nombres[2] = "Alverto";
		
		//En la posición 2 el nombre es Alverto
		System.out.println(nombres[2]);
		
		//Pero aqui lo modificamos
		nombres[2] = "Chucho";
		
		System.out.println(nombres[2]);
		
		//Con length podemos ver la longitud del Array
		System.out.println("La cantidad de datos que hay son: " + nombres.length);
		
		
		//ARRAYS DEFINIDOS
		
		String numeros[] = {"a","b","c","d","e"};
		
		System.out.println(numeros[2]);
		
		//OTRA FORMA DE HACER ARRAYS
		String[] array = new String[3];
		
		
	}
	
	static void ForEachIteraciones()
	{
		String nombres[] = {"Alex","Felipe","Juan","Alejandra","Lucas"};
		
		//Con while
		int c = 0;
		while(c < nombres.length)
		{
			
			System.out.println(nombres[c]);
			c++;
			
		}//Fin while
		
		
		//Con For
		
		for(int i = 0; i < nombres.length; i++)
		{
			
			System.out.println(nombres[i] + " " + i);
			
		}//Fin for
		
		//Con For each
		
		for(String dato:nombres)
		{
			System.out.println(dato);
		}
		
		
		
	}
	
	static void matrizBidimensional()
	{
		
		/*int x[][] = new int[2][3];
		
		x[0][0] = 1;
		
		x[0][1] = 2;
		
		x[0][2] = 3;
		
		
		x[1][0] = 4;
		
		x[1][1] = 5;
		
		x[1][2] = 6;
		
		for(int[] matrizInterna:x)
		{
			for (int dato:matrizInterna) 
			{
				System.out.println(dato);
			}//Fin segundo For
		}//Fin primer For
		*/
		
		//Matriz
		int x[][] = {
				{1,2,3},
				{4,5,6},
				{7,8}, //Es casi lo mismo que de arriba
		};
		
		//For-each
		for(int[] matrizInterna:x)
		{
			for(int dato:matrizInterna)
			{
				System.out.println(dato);
			}
		}
		
		
	}
	
	static void matrizTridimensional()
	{
		
		int x[][][] = 
			{
				
					{
						{1,2,3},
						{4,5,6},
					},//Fin Primer Matriz
					{
						{-1,-2,-3},
						{-4,-5,-6},
					},//Fin Segunda Matriz
					
			};//Fin Matriz
		
		for(int[][] matriz2D:x) 
		{
			
			for(int[] matriz1D:matriz2D) 
			{
				
				for(int dato:matriz1D)//Aqui se recolecta y se recibe la información.
				{
					System.out.println(dato);
				}//Fin tercer For
				
			}//Fin segundo For
			
		}//Fin primer For
		
		
	}
	
	
}
